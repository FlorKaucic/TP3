package funcion.operaciones;

import funcion.Funcion;

public class Potencia implements Funcion {
	Funcion valor1;
	Funcion valor2;

	public Potencia(Funcion valor1, Funcion valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public double calcular() {
		double pot = valor1.calcular();
		for(int i = 1; i < valor2.calcular(); i++)
			pot *= valor1.calcular();
		return pot;
	}

	@Override
	public String toString() {
		return "(" + valor1 + " ^ " + valor2 + ")";
	}

}
