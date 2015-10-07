package funcion.operaciones;

import funcion.Funcion;

public class Resta implements Funcion {
	Funcion valor1;
	Funcion valor2;

	public Resta(Funcion valor1, Funcion valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public double calcular() {
		return valor1.calcular() - valor2.calcular();
	}

	@Override
	public String toString() {
		return "(" + valor1 + " - " + valor2 + ")";
	}

}
