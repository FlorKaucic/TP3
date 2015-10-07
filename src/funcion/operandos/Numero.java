package funcion.operandos;

import funcion.Funcion;

public class Numero implements Funcion {
	private double value;
	
	public Numero(double value){
		this.value = value;
	}
	
	@Override
	public double calcular() {
		return value;
	}

	@Override
	public String toString(){
		return String.valueOf(this.value);
	}
}
