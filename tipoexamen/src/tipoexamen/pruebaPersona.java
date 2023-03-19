package tipoexamen;

import java.util.Arrays;

public class pruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona1 grupo[] = new Persona1[2];

		grupo[0] = new Persona1("88888");
		grupo[1] = new Alumno3( "Alu1234",123);
		/*
		Persona1 p[] = new Alumno3[3];
		p[0]= new Alumno3("blo",1237);
		p[1]= new Alumno3("aaa1",1236);
		p[2]= new Alumno3("coof",1235);
		*/
		Arrays.sort(grupo);
		
		//Arrays.sort(p);
		for (int i = 0; i < grupo.length; i++) {
			System.out.println(grupo[i]);
		}

	}

}
