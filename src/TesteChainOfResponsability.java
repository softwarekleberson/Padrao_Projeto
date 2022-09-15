import java.math.BigDecimal;

import br.com.loja.desconto.chaainofresponsability.CalculadoraDeDesconto;
import br.com.loja.orcamento.Orcamento;

public class TesteChainOfResponsability {
	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento segundo = new Orcamento(new BigDecimal("400"), 6);
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}
}
