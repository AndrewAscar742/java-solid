package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidarReajusteData implements ReajusteServiceInterface{

	@Override
	public void validar(Funcionario func, BigDecimal salario) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataFunc = func.getDataUltimoReajuste();
		long data = ChronoUnit.MONTHS.between(dataAtual, dataFunc);
		if(data > 6)
			throw new ValidacaoException("O reajuste só pode ser feito de 6 em 6 meses");
		
	}
	
}
