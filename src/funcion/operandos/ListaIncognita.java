package funcion.operandos;

public class ListaIncognita {
	private ListaIncognita(int tam) {
		this.valor = new double[tam];
	}

	private static ListaIncognita lista = null;
	private double[] valor;
	private static final String[] nombre = { "x", "y", "z" };

	public static ListaIncognita getIncognita(int tam) {
		if (lista == null) {
			lista = new ListaIncognita(tam);
		}
		return lista;
	}

	public void setValor(int i, double valor) {
		this.valor[i] = valor;
	}

	public double getValor(int i) {
		return valor[i];
	}

	public String getNombre(int i) {
		return nombre[i];
	}

	public static int getIndice(String n) {
		for (int i = 0; i < nombre.length; i++)
			if (nombre[i].equals(n))
				return i;
		return -1;
	}
}
