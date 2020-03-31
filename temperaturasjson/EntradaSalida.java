package autobusesxml;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	public static void devolverPovincias(ArrayList<Provincia> lista_provincias) {
		for (Provincia p : lista_provincias) {
			System.out.println(p);
		}
		
	}

	public static int pedirnProvincia() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digame el numero de la pronvincia:");
		int a=sc.nextInt();
		return a;
	}

}
