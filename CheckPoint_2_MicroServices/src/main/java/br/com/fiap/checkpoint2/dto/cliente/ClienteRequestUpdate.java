package br.com.fiap.checkpoint2.dto.cliente;

public class ClienteRequestUpdate {

	private Long codigo_cliente;
	
	private String nome, inscricao_federal, cep;

	public Long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getinscricao_federal() {
		return inscricao_federal;
	}

	public void setinscricao_federal(String inscricao_federal) {
		this.inscricao_federal = inscricao_federal;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
