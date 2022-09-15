package br.com.loja.orcamento.state;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento{

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getOrcamento().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) throws DomainExcecao {
		orcamento.setSituacao(new Finalizado());
	}

}
