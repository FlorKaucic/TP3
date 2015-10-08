package funcion;

import java.util.LinkedList;
import java.util.function.Function;

public class FuncionCompuesta implements Funcion {
	LinkedList<Funcion> func = new LinkedList<Funcion>();
	Function<LinkedList<Funcion>, Double> operacion;
	
	public void agregar(Funcion f){
		func.add(f);
	}
	
	public void agregarOperacion(Function<LinkedList<Funcion>, Double> operacion){
		this.operacion = operacion;
	}
	
	public Funcion remover(){
		return func.pollLast();
	}
	
	public double calcular(){
//		double sum = 0;
//		for(Funcion f: func)
//			sum += f.calcular();
//		return sum;
		return this.operacion.apply(this.func);
	}

}
