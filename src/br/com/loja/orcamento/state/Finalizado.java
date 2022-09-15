package br.com.loja.orcamento.state;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento{

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) throws DomainExcecao {
		throw new DomainExcecao("Orcamento Finalizado");
	}

}
