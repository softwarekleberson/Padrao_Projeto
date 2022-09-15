package br.com.loja.desconto.chaainofresponsability;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class ValorDaCompraMaiorQueQunhentosReais extends Desconto{

	public ValorDaCompraMaiorQueQunhentosReais(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getOrcamento().compareTo(new BigDecimal("500"))>0) {
			return orcamento.getOrcamento().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}

}
