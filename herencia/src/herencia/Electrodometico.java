package herencia;

public class Electrodometico {

	private int identificador,stock,precioBase,peso;
	private String color;
	
	private enum Consumo{A,F};
	private Consumo consumos;
	
	public void setColor() {
		this.color="blanco";
		
	}
}
