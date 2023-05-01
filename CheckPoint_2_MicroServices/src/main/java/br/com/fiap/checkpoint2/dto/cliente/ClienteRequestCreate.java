package br.com.fiap.checkpoint2.dto.cliente;

public class ClienteRequestCreate {

	private String nome, inscricao_federal, cep;

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
