package br.com.loja.orcamento.state;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getOrcamento().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) throws DomainExcecao {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainExcecao {
		orcamento.setSituacao(new Reprovado());
	}

}
