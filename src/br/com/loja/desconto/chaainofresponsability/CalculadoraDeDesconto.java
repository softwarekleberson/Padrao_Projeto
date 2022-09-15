package br.com.loja.desconto.chaainofresponsability;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new CompraComMaisDeCincoItems
							(new ValorDaCompraMaiorQueQunhentosReais(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
