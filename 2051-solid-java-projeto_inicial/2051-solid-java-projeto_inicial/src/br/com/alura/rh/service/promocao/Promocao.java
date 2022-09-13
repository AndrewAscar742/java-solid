package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class Promocao {
	
	public void promoverFun(Funcionario fun, boolean metaBatida) {
		Cargo cargoAtual = fun.getDados().getCargo();
		
		if(Cargo.GERENTE == cargoAtual)
			throw new ValidacaoException("Gerente não pode ser mais promovido");
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			fun.promoverCargo(novoCargo);
		}else{
			throw new ValidacaoException("A meta não foi batida");
		}
		
	}
}
