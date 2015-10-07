package funcion.operandos;

import funcion.Funcion;

public class Incognita implements Funcion {
	private Incognita(String nombre) {
		this.nombre = nombre;
	}

	private static Incognita INSTANCE = null;
	private double valor;
	private String nombre;

	public static Incognita getIncognita(String nombre) {
		if (INSTANCE == null) {
			INSTANCE = new Incognita(nombre);
		}
		return INSTANCE;
	}

	public void setIncognita(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return valor;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
