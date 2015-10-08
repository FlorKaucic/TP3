package principal;

import funcion.FuncionCompuesta;
import funcion.operaciones.*;
import funcion.operandos.*;

public class Main {

	public static void main(String[] args) {
		FuncionCompuesta fc = new FuncionCompuesta();
		fc.agregar(
				new Suma(
						new Multiplicacion(new Numero(4),
								new Logaritmo(
										new Division(
												new Numero(5), 
												new Incognita("x")
												))),
						new Numero(9)
				));
		ListaIncognitas.getIncognita(0).setIncognita(0, 3);
		System.out.println(fc.calcular());
		System.out.println(fc.remover());
		System.out.println(fc.remover());
		System.out.println(fc.calcular());

	}

}
