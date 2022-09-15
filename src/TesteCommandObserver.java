import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.comand.GerarPedidioHandler;
import br.com.loja.comand.GerarPedido;
import br.com.loja.comand.observer.MandarEmailPedido;
import br.com.loja.comand.observer.SalvarPedidoNoBanco;

public class TesteCommandObserver {

	public static void main(String[] args) {
		
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GerarPedido pedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
		GerarPedidioHandler handeler = new GerarPedidioHandler(Arrays.asList(
				new MandarEmailPedido(),
				new SalvarPedidoNoBanco()));
		
		handeler.executa(pedido);
	}
}
