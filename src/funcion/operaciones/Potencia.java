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
		double sum = 0;
		for(int i = 0; i < valor2.calcular(); i++)
			sum += valor1.calcular();
		return sum;
	}

	@Override
	public String toString() {
		return "(" + valor1 + " ^ " + valor2 + ")";
	}

}
