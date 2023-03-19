package modelo;

import java.util.Arrays;

public class ListaEstática implements Lista {
	protected static final int DEFAULT_SIZE = 100;
	protected Object[] lista;
	protected int numElementos;
	
	public ListaEstática(int maxSize) {
		lista = new Object[maxSize];
		numElementos = 0;
	}
	
	public ListaEstática() {
		this(DEFAULT_SIZE);
	}
	
	@Override
	public String toString() {
		// return Arrays.toString(lista);
		String res = "[";
		for (int i=0; i<numElementos;i++) {
			res+=lista[i];
			if (i!=(size()-1)) {
				res+=",";
			}
		}
		res += "]";
		return res;
	} // toString
	
	@Override
	public int size() {
		return numElementos;
	}

	@Override
	public Object insert(int pos, Object obj) {
		if (size() == lista.length) return null;
		if (pos<0 || pos>size()) return null;
		for (int i=size(); i>=pos+1; i--) {
			lista[i] = lista[i-1];
		}
		lista[pos] = obj;
		numElementos++;
		return obj;
	} // insert

	@Override
	public Object get(int pos) {
		if (pos<0 || pos>=size()) return null;
		return lista[pos];
	} // get

	@Override
	public Object remove(int pos) {
		if (pos<0 || pos>=size()) return null;
		Object res = lista[pos];
		for (int i=pos; i<(numElementos-1);i++) {
			lista[i] = lista[i+1];
		}
		numElementos--;
		lista[numElementos] = null;
		return res;
	} // remove

	@Override
	public Object append(Object obj) {
		return insert(size(),obj);
	}

} // ListaEstática
