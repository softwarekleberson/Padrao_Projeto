package br.com.loja.orcamento.state;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) throws DomainExcecao {
		throw new DomainExcecao("Orcamento reprovado, não pode ter desconto");
	}
	
	@Override
	public void finalizar(Orcamento orcamento) throws DomainExcecao {
		orcamento.setSituacao(new Finalizado());
	}

}
