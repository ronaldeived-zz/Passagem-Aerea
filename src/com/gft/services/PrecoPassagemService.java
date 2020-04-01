package com.gft.services;

import com.gft.Passageiro;
import com.gft.TipoPassageiro;
import com.gft.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		return passageiro.getTipo().getCalculadoraPrecoPassagem().calcular(voo);
	}
}
