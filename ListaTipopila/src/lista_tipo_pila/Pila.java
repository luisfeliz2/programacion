package lista_tipo_pila;

public class Pila {

	private Nodo UltimoValorIngresado;
	int tamanyo = 0;
	String Lista ="";
	
	
	public Pila() {
		UltimoValorIngresado = null;
		tamanyo =0;
		
	}
	
	public boolean PilaVacia() {
		return UltimoValorIngresado == null;
	}
	
	public void InsertarNodo(int nodo) {
		Nodo nuevo_nodo = new Nodo(nodo);
		nuevo_nodo.siguiente = UltimoValorIngresado;
		UltimoValorIngresado = nuevo_nodo;
		tamanyo++;
	}
	
	public int EliminarNodo() {
		int aux = UltimoValorIngresado.informacion;
		UltimoValorIngresado=UltimoValorIngresado.siguiente;
		tamanyo--;
		return aux;
	}
	
	public int MostrarUltimoValorIngresado() {
		return UltimoValorIngresado.informacion;
	}
	
	public int tamanyoPila() {
		return tamanyo;
	}
	
	public void vaciarPila() {
		
		while (!PilaVacia()) {
			EliminarNodo();
		}
	}
	
	public void MostrarValores() {
		Nodo recorrido = UltimoValorIngresado;
		
		while(recorrido != null ) {
			Lista += recorrido.informacion + "\n";
			recorrido =recorrido.siguiente;
		}
		
		System.out.println(Lista);
		
	}
	
	
	
	
}
