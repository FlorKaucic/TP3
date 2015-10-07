package principal;

import funcion.FuncionCompuesta;
import funcion.operaciones.*;
import funcion.operandos.*;

public class Main {

	public static void main(String[] args) {
		
		FuncionCompuesta fc = new FuncionCompuesta();
		fc.agregar(new Suma(new Multiplicacion(new Numero(4),new Logaritmo(new Numero(5))),new Numero(9)));
		System.out.println(fc.calcular());
		System.out.println(fc.remover());
		System.out.println(fc.remover());
		System.out.println(fc.calcular());
		
	}

}
