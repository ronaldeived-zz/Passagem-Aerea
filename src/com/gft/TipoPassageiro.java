package com.gft;

import com.gft.services.CalculadoraPrecoPassagem;
import com.gft.services.PrecoPassagemGold;
import com.gft.services.PrecoPassagemSilver;

public enum TipoPassageiro {
	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());
	
	CalculadoraPrecoPassagem calculadoraPrecoPassagem;
	
	private TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}

	public CalculadoraPrecoPassagem getCalculadoraPrecoPassagem() {
		return calculadoraPrecoPassagem;
	}
}
