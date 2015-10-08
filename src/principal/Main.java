package principal;

import archivos.Archivero;
import funcion.FuncionCompuesta;
import funcion.operandos.ListaIncognitas;

public class Main {

	public static void main(String[] args) {
		FuncionCompuesta fc = new FuncionCompuesta();
		double[][] val = Archivero.leer("Entradas/entrada.in", fc);
		double[] res = new double[val.length];
		ListaIncognitas x = ListaIncognitas.getIncognita(0);
		for(int i = 0; i<val.length;i++){
			for(int j = 0; j<val[0].length; j++)
				x.setValor(j, val[i][j]);
			res[i] = fc.calcular();
			System.out.println(res[i]);
		}
		System.out.println(fc.remover());
		Archivero.escribir("Salidas/salida.out", res);
	}

}
