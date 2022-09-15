package br.com.loja.comand.observer;

import br.com.loja.comand.Pedido;

public class MandarEmailPedido implements AcaoAposGerarPedido{

	@Override
	public void executarPedido(Pedido pedido) {
		System.out.println("Email enviado : " + pedido.getCliente());
	}

}
