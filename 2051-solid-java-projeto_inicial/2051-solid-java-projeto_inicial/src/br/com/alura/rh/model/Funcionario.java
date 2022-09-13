package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {
	
	private DadosPessoais dados;
	private LocalDate dataUltimoReajuste;

	public DadosPessoais getDados() {
		return dados;
	}

	public void setDados(DadosPessoais dados) {
		this.dados = dados;
	}

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dados = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dados.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}


	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promoverCargo(Cargo novoCargo) {
		this.dados.setCargo(novoCargo); 
		
	}

}
