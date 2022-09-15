package br.com.loja.imposto.strategy;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
