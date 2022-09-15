package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.DomainExcecao;
import br.com.loja.orcamento.state.EmAnalise;
import br.com.loja.orcamento.state.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal orcamento;
	private int quantidade;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal orcamento, int quantidade) {
		this.orcamento =  orcamento;
		this.quantidade = quantidade;
		this.situacao = new EmAnalise();
		
	}
	
	public void aplicarDescontoExtra() throws DomainExcecao {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.orcamento = this.orcamento.subtract(valorDescontoExtra);
	}
	
	public void aprovar() throws DomainExcecao {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() throws DomainExcecao {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() throws DomainExcecao {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getOrcamento() {
		return orcamento;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
}
