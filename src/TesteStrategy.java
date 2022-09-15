import java.math.BigDecimal;

import br.com.loja.imposto.strategy.CalculadoraImposto;
import br.com.loja.imposto.strategy.Icms;
import br.com.loja.imposto.strategy.Iss;
import br.com.loja.orcamento.Orcamento;

public class TesteStrategy {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),10);
		CalculadoraImposto calcular = new CalculadoraImposto();
		System.out.println(calcular.calculadora(orcamento, new Iss()));
	
	}
}
