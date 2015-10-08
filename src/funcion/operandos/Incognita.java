package funcion.operandos;

import funcion.Funcion;

public class Incognita implements Funcion {
	private int indice;
	
	public Incognita(String nombre){
		this.indice = ListaIncognitas.getIndice(nombre);
	}
	
	@Override
	public double calcular() {
		return ListaIncognitas.getIncognita(1).getValor(this.indice);
	}

	@Override
	public String toString(){
		return ListaIncognitas.getIncognita(1).getNombre(this.indice);
	}
}