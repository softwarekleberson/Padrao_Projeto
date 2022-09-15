package br.com.loja.desconto.chaainofresponsability;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CompraComMaisDeCincoItems extends Desconto{

	public CompraComMaisDeCincoItems(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidade() > 5) {
			return orcamento.getOrcamento().multiply(new BigDecimal("0.10"));
		}
		
		return proximo.calcular(orcamento);
	}

}
