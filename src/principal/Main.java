package principal;

import java.io.File;

import archivos.Archivero;
import funcion.FuncionCompuesta;
import funcion.operandos.ListaIncognitas;

public class Main {

	public static void main(String[] args) {
		File folder = new File("Entradas");
		File[] listOfFiles = folder.listFiles();
		int cant = listOfFiles.length;
		folder = new File("Salidas");
		folder.mkdir();
		FuncionCompuesta fc;
		
		for (int f = 0; f < cant; f++) {
			String name = new String(listOfFiles[f].getName());
			fc = new FuncionCompuesta();
			double[][] val = Archivero.leer("Entradas/"+name, fc);
			double[] res = new double[val.length];
			ListaIncognitas x = ListaIncognitas.getIncognita(0);
			for (int i = 0; i < val.length; i++) {
				for (int j = 0; j < val[0].length; j++)
					x.setValor(j, val[i][j]);
				res[i] = fc.calcular();
				System.out.println(res[i]);
			}
			System.out.println(fc.remover());
			Archivero.escribir("Salidas/"+name.substring(0, name.length()-2)+"out", res);
		}
	}

}
