package colecciones;

import java.util.Objects;

public class Libro {
	
	private String titulo,autor;
	private int ISBN;
	public Libro(String titulo, String autor, int iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		return "Libro titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN ;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof Libro) {
			Libro other = (Libro) obj;
			
			if(this.ISBN == other.ISBN)
				return true;
			
		}else {
			return false;
		}
		return false;
		
	}
	*/
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}
	
	
	

}
