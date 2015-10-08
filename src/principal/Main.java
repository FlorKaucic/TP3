package principal;

import archivos.Archivero;
import funcion.FuncionCompuesta;
import funcion.Operaciones;
import funcion.operandos.ListaIncognitas;
import funcion.operandos.Numero;

public class Main {

	public static void main(String[] args) {
//		FuncionCompuesta fc = new FuncionCompuesta();
//		double[][] val = Archivero.leer("Entradas/entrada.in", fc);
//		double[] res = new double[val.length];
//		ListaIncognitas x = ListaIncognitas.getIncognita(0);
//		for(int i = 0; i<val.length;i++){
//			for(int j = 0; j<val[0].length; j++)
//				x.setValor(j, val[i][j]);
//			res[i] = fc.calcular();
//			System.out.println(res[i]);
//		}
//		System.out.println(fc.remover());
//		Archivero.escribir("Salidas/salida.out", res);
		
		FuncionCompuesta fc = new FuncionCompuesta();
		fc.agregar(new Numero(5));
		fc.agregar(new Numero(4));
		fc.agregarOperacion(Operaciones::Suma);
		System.out.println(fc.calcular());
		fc.agregarOperacion(Operaciones::Resta);
		System.out.println(fc.calcular());
		fc.agregarOperacion(Operaciones::Multiplicacion);
		System.out.println(fc.calcular());
		fc.agregarOperacion(Operaciones::Division);
		System.out.println(fc.calcular());
		fc.agregarOperacion(Operaciones::Logaritmo);
		System.out.println(fc.calcular());
		fc.agregarOperacion(Operaciones::Potencia);
		System.out.println(fc.calcular());
	}

}
