package funcion.operaciones;

import funcion.Funcion;

public class Logaritmo implements Funcion {
	Funcion valor;

	public Logaritmo(Funcion valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return Math.log(valor.calcular());
	}

	@Override
	public String toString() {
		return "ln(" + this.valor + ")";
	}
}
