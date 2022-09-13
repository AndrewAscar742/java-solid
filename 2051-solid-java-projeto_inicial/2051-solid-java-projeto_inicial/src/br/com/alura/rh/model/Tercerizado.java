package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado {
	
	private DadosPessoais dados;
	private String empresa;
	
	public Tercerizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		dados = new DadosPessoais(nome, cpf, cargo, salario);
		setEmpresa(empresa);
	}
	
	public DadosPessoais getDados() {
		return dados;
	}

	public void setDados(DadosPessoais dados) {
		this.dados = dados;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	
	
}
