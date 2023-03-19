package tipoexamen;

public class Persona1 {
	private String nif;

	public Persona1(String nif) {
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

class Alumno3 extends Persona1 implements Evaluable, Comparable<Alumno3> {
	protected int nia;

	public Alumno3(String nif, int nia) {
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

	@Override
	public double evaluar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Alumno3 o) {
		// TODO Auto-generated method stu
		// if(this.getNif() != o.getNif());
		return this.getNif().compareTo(o.getNif());
	}

	

}

interface Evaluable {
	public double evaluar();

}

class BolsaSorpresa {

	protected Object[] objetos;

	protected int tamaño;

	public BolsaSorpresa(int maxSize) {

	}

	public boolean isEmpty() {
		return false;
	}

	public boolean isFull() {
		return false;
		
	}

	public Object getRandom() {
		return false;
	}

	public boolean put(Object obj) {
		return false;
	}

} // BolsaSorpresa
