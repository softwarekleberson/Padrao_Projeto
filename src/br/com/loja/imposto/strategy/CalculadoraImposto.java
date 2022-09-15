package br.com.loja.imposto.strategy;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraImposto {

	public BigDecimal calculadora(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
