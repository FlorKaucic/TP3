package funcion;

import java.util.LinkedList;

public class FuncionCompuesta implements Funcion {
	LinkedList<Funcion> func = new LinkedList<Funcion>();
	
	public void agregar(Funcion f){
		func.add(f);
	}
	
	public Funcion remover(){
		return func.pollLast();
	}
	
	public double calcular(){
		double sum = 0;
		for(Funcion f: func)
			sum += f.calcular();
		return sum;
	}
}
