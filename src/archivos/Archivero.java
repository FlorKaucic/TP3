package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import funcion.*;
import funcion.operaciones.*;
import funcion.operandos.*;

public class Archivero {
	public void leerArchivo(String ruta, FuncionCompuesta fn) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String[] data = br.readLine().split(" ");
			for (int i = 0; i < data.length; i++) {
				if (esOperador(data[i])) {
					//lo que hace si es operador
				} else if (esIncognita(data[i])) {
					//lo que hace si es incognita
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

	private boolean esOperador(String data) {
		String[] ops = {"+","-","/","*","ln"};
		for(String op : ops)
			if(data.equals(op))
				return true;
		return false;
	}

	private boolean esIncognita(String data) {
		String[] incs = {"x", "y", "z"};
		for(String inc : incs)
			if(data.equals(inc))
				return true;
		return false;
	}
}
