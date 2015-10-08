package funcion;

import java.util.LinkedList;

public class Operacion {
	public static double Suma(LinkedList<Funcion> v) {
		return v.get(0).calcular() + v.get(1).calcular();
	}

	public static double Resta(LinkedList<Funcion> v) {
		return v.get(0).calcular() - v.get(1).calcular();
	}

	public static double Division(LinkedList<Funcion> v) {
		return v.get(0).calcular() / v.get(1).calcular();
	}

	public static double Multiplicacion(LinkedList<Funcion> v) {
		return v.get(0).calcular() * v.get(1).calcular();
	}

	public static double Potencia(LinkedList<Funcion> v) {
		return Math.pow(v.get(0).calcular(), v.get(1).calcular());
	}

	public static double Logaritmo(LinkedList<Funcion> v) {
		return Math.log(v.get(0).calcular());
	}
}
