package funcion.operandos;

import funcion.Funcion;

public class Incognita implements Funcion {
	private int indice;
	
	public Incognita(String nombre){
		this.indice = ListaIncognita.getIndice(nombre);
	}
	
	@Override
	public double calcular() {
		return ListaIncognita.getIncognita(1).getValor(this.indice);
	}

	@Override
	public String toString(){
		return ListaIncognita.getIncognita(1).getNombre(this.indice);
	}
}