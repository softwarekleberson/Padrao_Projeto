package br.com.loja.comand;

import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private Orcamento orcamento;
	private LocalDateTime data;
	
	public Pedido(String cliente, Orcamento orcamento, LocalDateTime data) {
		
		this.cliente = cliente;
		this.orcamento = orcamento;
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	
	
}
