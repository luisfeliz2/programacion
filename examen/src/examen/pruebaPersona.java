package examen;

public class pruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona grupo[] = new Persona[2];

		grupo[0] = new Persona("88888");
		grupo[1] = new Alumno(0000, "Alu1234");

		for (int i = 0; i < grupo.length; i++) {
			System.out.println(grupo[i]);
		}

	}

}
