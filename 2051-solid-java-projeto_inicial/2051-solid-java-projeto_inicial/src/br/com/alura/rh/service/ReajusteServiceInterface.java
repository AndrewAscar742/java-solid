package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ReajusteServiceInterface {
	
	void validar(Funcionario func, BigDecimal salario);
}
