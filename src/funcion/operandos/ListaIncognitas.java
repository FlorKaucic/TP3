package funcion.operandos;

public class ListaIncognitas {
	private ListaIncognitas(int tam) {
		this.valor = new double[tam];
	}

	private static ListaIncognitas lista = null;
	private double[] valor;
	private static final String[] nombre = { "x", "y", "z" };

	public static ListaIncognitas getIncognita(int tam) {
		if (lista == null) {
			lista = new ListaIncognitas(tam);
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
