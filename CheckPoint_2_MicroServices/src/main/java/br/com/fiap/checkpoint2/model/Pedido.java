package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero_pedido;
	private Long codigo_cliente;
	private LocalDate data_pedido;
	
	
	public Long getnumero_pedido() {
		return numero_pedido;
	}
	public void setnumero_pedido(Long numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
	public Long getcodigo_cliente() {
		return codigo_cliente;
	}
	public void setcodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public LocalDate getdata_pedido() {
		return data_pedido;
	}
	public void setdata_pedido(LocalDate data_pedido) {
		this.data_pedido = data_pedido;
	}
	
 
	
	
}
