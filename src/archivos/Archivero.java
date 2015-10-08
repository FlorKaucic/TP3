package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import funcion.*;
import funcion.operaciones.*;
import funcion.operandos.*;

public class Archivero {
	public void leer(String ruta, FuncionCompuesta fn, ListaIncognitas[] inc, double[] val) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String[] data = br.readLine().split(" ");
			String linea;
			for (int i = 0; i < data.length; i++) {
				if (esOperador(data[i])) {
					Funcion func;
					Funcion v1 = fn.remover();
					if (data[i].equals("ln"))
						func = new Logaritmo(v1);
					else {
						Funcion v2 = fn.remover();
						if (data[i].equals("+"))
							func = new Suma(v2, v1);
						else if (data[i].equals("-"))
							func = new Resta(v2, v1);
						else if (data[i].equals("/"))
							func = new Division(v2, v1);
						else
							func = new Multiplicacion(v2, v1);
					}
					fn.agregar(func);
				} else if (esIncognita(data[i])) {
					
				} else {
					fn.agregar(new Numero(Double.parseDouble(data[i])));
				}
			}

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
	}
	
	public void escribir(String ruta, double[] val) {
		
	}

	private boolean esOperador(String data) {
		String[] ops = { "+", "-", "/", "*", "ln" };
		for (String op : ops)
			if (data.equals(op))
				return true;
		return false;
	}

	private boolean esIncognita(String data) {
		String[] incs = { "x", "y", "z" };
		for (String inc : incs)
			if (data.equals(inc))
				return true;
		return false;
	}
}
