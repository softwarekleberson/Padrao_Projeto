package br.com.loja.comand;

import java.time.LocalDateTime;
import java.util.List;

import br.com.loja.comand.observer.AcaoAposGerarPedido;
import br.com.loja.orcamento.Orcamento;

public class GerarPedidioHandler {

	private List<AcaoAposGerarPedido> acaoAposGerarPedidos;
	
	
	public GerarPedidioHandler(List<AcaoAposGerarPedido> acaoAposGerarPedidos) {
		this.acaoAposGerarPedidos = acaoAposGerarPedidos;
	}


	public void executa(GerarPedido dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());
				
		this.acaoAposGerarPedidos.forEach(a ->a.executarPedido(pedido));
	}
}
