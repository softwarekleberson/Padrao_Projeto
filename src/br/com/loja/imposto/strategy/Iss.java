package br.com.loja.imposto.strategy;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class Iss implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getOrcamento().multiply(new BigDecimal("0.2"));
	}

}
