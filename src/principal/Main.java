package principal;

import funcion.FuncionCompuesta;
import funcion.operandos.Numero;

public class Main {

	public static void main(String[] args) {
		
		FuncionCompuesta fc = new FuncionCompuesta();
		fc.agregar(new Numero(5));
		fc.agregar(new Numero(6));
		fc.agregar(new Numero(3));
		System.out.println(fc.calcular());
		System.out.println(fc.remover());
		System.out.println(fc.remover());
		System.out.println(fc.remover());
		System.out.println(fc.remover());
		System.out.println(fc.calcular());
		
	}

}
