package colecciones;
import java.util.*;
public class CuentasUsuarios {

	public static void main(String[] args) {
	
		
		Cliente cl1 = new Cliente ("Antonio Banderas","00001",200000);
		Cliente cl2 = new Cliente ("Rafael Nadal","00002",250000);
		Cliente cl3 = new Cliente ("Penelope Cruz","00003",300000);
		Cliente cl4 = new Cliente ("julio Iglesia","00004",500000);
		Cliente cl5 = new Cliente ("julio Iglesia","00009",500000);
		
		Set <Cliente> ClientesBanco = new HashSet<Cliente>();
		
		ClientesBanco.add(cl1);
		
		ClientesBanco.add(cl2);
		
		ClientesBanco.add(cl3);
		
		ClientesBanco.add(cl4);
		ClientesBanco.add(cl5);
		
		for (Cliente cliente : ClientesBanco) {
			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "
					+" "+ cliente.getSaldo());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main

}//CuentasUsuarios
