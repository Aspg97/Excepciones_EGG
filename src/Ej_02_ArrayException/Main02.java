package Ej_02_ArrayException;

/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/

public class Main02 {

	public static void main(String[] args){
		int numeros [] = new int[5];
		try {
			for(int i = 0 ; i < 6 ; i++) {
				numeros[i] = i+1;
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No hay como llenar");
			throw e;
		}
	}

}
