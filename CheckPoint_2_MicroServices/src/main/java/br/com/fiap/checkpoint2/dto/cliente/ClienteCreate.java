package br.com.fiap.checkpoint2.dto.cliente;

public class ClienteCreate {

	private String nome, inscricao_federal, cep;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return inscricao_federal;
	}

	public void setCpf(String cpf) {
		this.inscricao_federal = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
