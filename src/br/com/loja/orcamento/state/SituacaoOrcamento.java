package br.com.loja.orcamento.state;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento) throws DomainExcecao;
	
	public void aprovar(Orcamento orcamento) throws DomainExcecao {
		throw new DomainExcecao("Orcamento não pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) throws DomainExcecao {
		throw new DomainExcecao("Orcamento não pode ser reprovado");
	}
	
	public void finalizar(Orcamento orcamento) throws DomainExcecao {
		throw new DomainExcecao("Orcamento não pode ser finalizado");
	}
}
