package logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ManejoArchivo {
	public void leerArchivo(String ruta, Funcion fn) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			String linea;
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String cadena;
			int tam = 0;
			if ((linea = br.readLine()) != null)
				cadena = linea;				
			
			
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
}
