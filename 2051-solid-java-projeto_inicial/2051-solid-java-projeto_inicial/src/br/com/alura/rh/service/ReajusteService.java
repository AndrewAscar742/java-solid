package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	private List<ReajusteServiceInterface> validacoes;
	
	public ReajusteService(List<ReajusteServiceInterface> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalario(Funcionario f, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(f, aumento));
		
		BigDecimal salarioReajustado = f.getDados().getSalario().add(aumento);
		f.atualizarSalario(salarioReajustado);
		
	}
}
