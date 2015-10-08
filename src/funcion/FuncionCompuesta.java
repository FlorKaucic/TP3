package funcion;

import java.util.LinkedList;
import java.util.function.Function;

public class FuncionCompuesta implements Funcion {
	LinkedList<Funcion> func = new LinkedList<Funcion>();
	Function<LinkedList<Funcion>, Double> operacion;

	public void agregar(Funcion f) {
		func.add(f);
	}

	public void agregarOperacion(Function<LinkedList<Funcion>, Double> operacion) {
		this.operacion = operacion;
	}

	public Funcion remover() {
		return func.pollLast();
	}

	public double calcular() {
		return this.operacion.apply(this.func);
	}
}
