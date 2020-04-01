package com.gft.services;

import com.gft.Voo;

public class PrecoPassagemSilver implements CalculadoraPrecoPassagem {

	@Override
	public double calcular(Voo voo) {
		if (voo.getPreco() > 700.0) {
			return calcularValorAcimaDoLimite(voo);
		}
		return calcularValorAbaixoDoValor(voo);
	}

	private double calcularValorAbaixoDoValor(Voo voo) {
		return voo.getPreco() * 0.94;
	}

	private double calcularValorAcimaDoLimite(Voo voo) {
		return voo.getPreco() * 0.9;
	}

}
