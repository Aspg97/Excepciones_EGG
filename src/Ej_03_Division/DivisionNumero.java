package Ej_03_Division;

import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
*/

public class DivisionNumero {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n1,n2;
		try {
			System.out.println("Ingrese el primer numero");
			n1 = Integer.parseInt(leer.nextLine());
			System.out.println("ingres el segundo numero");
			n2 = Integer.parseInt(leer.nextLine());
			 System.out.println("El resultado es: "+n1/n2);
		} catch (NumberFormatException e) {
			System.out.println("Ha ocurrido un error");
			throw e;
		}
	}

}
