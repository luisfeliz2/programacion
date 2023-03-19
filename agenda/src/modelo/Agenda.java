package modelo;

public class Agenda {
	protected static final int TAMAÑO_POR_DEFECTO = 100;
	
	protected ListaEstática contactos; // A sustituir por una lista
	protected int numElementos;
	
	public Agenda(int tamaño) {
		contactos = new ListaEstática();
		
	}
	
	public Agenda() { this(TAMAÑO_POR_DEFECTO); }
	
	public int numContactos() {
		return numElementos;
	}
	
	public boolean vacía() {
		return (numElementos==0);
	}
	
	public String listaContactos() {
		StringBuilder res = new StringBuilder();
		for (int i=0; i<contactos.length; i++) {
			if (contactos[i]== null) break;
			// Muestra posiciones de 1 a numelementos
			res.append(i+1);
			res.append(": ");
			res.append(contactos[i]);
			res.append("\n");
		}
		return res.toString();
	}
	
	public boolean añadeContacto(Contacto c) {
		if (numElementos == contactos.length) return false;
		contactos[numElementos++] = c;
		return true;
	}
	
	public boolean borraContacto(int posición) {
		if (posición>=0 && posición < numElementos) {
		 // desplaza todos los elementos de índices mayores hacia abajo una posición desde pos
		 for (int i=posición; i<numElementos-1;i++) {
			 contactos[posición] = contactos[posición+1];
		 }
		 contactos[--numElementos] = null;
		 return true;
		}
		return false;
	}
	
	public boolean reemplazaContacto(int posición, Contacto c) {
		if (posición>=0 && posición < numElementos) {
			contactos[posición] = c;
			return true;
		}
		return false;
	}
	
	public Contacto getContacto(int posición) {
		if (posición>=0 && posición < numElementos) {
			return contactos[posición];
		}
		return null;
	}
	
	// busca contacto devolviendo la posición donde lo encuentra o -1
	public int buscaContacto (Contacto c) {
		// TODO
		return -1;
	}

}
