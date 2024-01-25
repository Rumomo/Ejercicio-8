package actividadOctava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		NumAleatorios aleatorio = new NumAleatorios();
		do{
			System.out.println("1-> Imprimir el mayor valor del array.");
			System.out.println("2-> Imprimir el menor valor del array. ");
			System.out.println("3-> Calcular la media de todos los valores del array.");
			System.out.println("4-> Imprimir todos los valores del array.");
			System.out.println("0-> Salir");
			System.out.println("---------------------------------------------------------");
			System.out.println("Seleccione una opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: {
				break;			
			}
			case 1: {
				aleatorio.mayor();
				break;			
			}
			case 2: {
				aleatorio.menor();
				break;			
			}
			case 3: {
				aleatorio.calcularMedia();
				break;			
			}
			case 4: {
				aleatorio.imprimirValores();
				
				break;			
			}
				
			}
			
		}while(opcion != 0);
	}

}
