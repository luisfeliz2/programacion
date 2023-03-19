package colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l1 = new Libro("lklk","luis",24);
		Libro l2 = new Libro("lklk","luis",24);
		
	
		l2=l1;
		if(l1.equals(l2)) {
			System.out.println("Es el mismo libro");
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
		}else {
			System.out.println("No es el mismo libro");
			
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
		}
		

	}

}
