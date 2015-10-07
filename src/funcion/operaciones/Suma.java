package funcion.operaciones;

import funcion.Funcion;

public class Suma implements Funcion {
	Funcion valor1;
	Funcion valor2;
	
	// FIX TEMPORAL, HAY QUE ARREGLARLO
	
	
	@Override
	public double calcular() {
		return valor1.calcular() + valor2.calcular();
	}

}
