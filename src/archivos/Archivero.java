package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import funcion.*;
import funcion.operandos.*;

public class Archivero {
	public static double[][] leer(String ruta, FuncionCompuesta fn) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		double[][] val = null;
		try {
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String[] data = br.readLine().split(" ");
			String linea = br.readLine();
			int num = Integer.parseInt(linea.split(" ")[0]);
			int tam = Integer.parseInt(linea.split(" ")[1]);
			val = new double[tam][num];
			for (int j = 0; j < tam; j++) {
				linea = br.readLine();
				for (int k = 0; k < num; k++) {
					val[j][k] = Double.parseDouble(linea.split(" ")[k]);
				}
			}
			for (int i = 0; i < data.length - 1; i++) {
				if (esOperador(data[i])) {
					FuncionCompuesta func = new FuncionCompuesta();
					Funcion v1 = fn.remover();
					agregarOp(data[i], func);
					if (!data[i].equals("ln"))
						func.agregar(fn.remover());
					func.agregar(v1);
					fn.agregar(func);
				} else if (esIncognita(data[i])) {
					fn.agregar(new Incognita(data[i]));
				} else {
					fn.agregar(new Numero(Double.parseDouble(data[i])));
				}
			}
			agregarOp(data[data.length - 1], fn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return val;
	}

	public static void escribir(String ruta, double[] res) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(ruta);
			pw = new PrintWriter(fw);
			pw.println(res.length);
			for (int i = 0; i < res.length; i++)
				pw.println((int) res[i]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void agregarOp(String data, FuncionCompuesta fn){
		if (data.equals("ln"))
			fn.agregarOperacion(Operacion::Logaritmo);
		else {
			if (data.equals("+"))
				fn.agregarOperacion(Operacion::Suma);
			else if (data.equals("-"))
				fn.agregarOperacion(Operacion::Resta);
			else if (data.equals("/"))
				fn.agregarOperacion(Operacion::Division);
			else if (data.equals("*"))
				fn.agregarOperacion(Operacion::Multiplicacion);
			else
				fn.agregarOperacion(Operacion::Potencia);
		}
	}

	private static boolean esOperador(String data) {
		String ops = "+-/*^ln";
		return ops.contains(data);
	}

	private static boolean esIncognita(String data) {
		String incs = "xyz";
		return incs.contains(data);
	}
}
