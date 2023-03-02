package examen;

public class Persona {
	private String nif;

	public Persona(String nif) {
		this.nif = nif;
	}

	public String toString() {
		return "Persona con nif: " + nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String n) {
		this.nif = n;
	}

}

class Alumno extends Persona {
	protected int nia;

	public Alumno(int nia, String nif) {
		super(nif);
		this.nia = nia;
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int n) {
		this.nia = n;
	}

	@Override
	public String toString() {
		return "Alumno: " + super.getNif() + " con NIA: " + nia;
	}

}

interface Evaluable {
	public Strin g() {
		return "n";
	}
	
	

}

















