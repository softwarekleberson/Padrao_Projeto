package br.com.loja.comand.observer;

import br.com.loja.comand.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido{

	@Override
	public void executarPedido(Pedido pedido) {
		System.out.println("Salvando pedido");
	}

}
