package modelo;

/***
 * Interfaz para estructuras de tipo Lista que mantienen varios elementos
 * en posiciones determinadas
 * @author jpuche
 *
 */
public interface Lista {
	public int size();
	public Object insert(int pos, Object obj);
	public Object get(int pos);
	public Object remove(int pos);
	public Object append(Object obj);
	/*
	public Object set(int pos, Object obj);
	
	public boolean isEmpty();
	*/	
} // Lista
