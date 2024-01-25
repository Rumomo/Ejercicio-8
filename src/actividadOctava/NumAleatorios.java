package actividadOctava;

public class NumAleatorios {
	private int  aleatorio[] = new int[20];
	
	public NumAleatorios() {
		for(int i = 0; i < aleatorio.length ; i++) {
			aleatorio[i]= (int) (Math.random()*10+1);
		}
	}
	public void mayor() {
	    int mayor = aleatorio[0];
	    for (int i = 1; i < aleatorio.length; i++) {
	        if (mayor < aleatorio[i]) {
	            mayor = aleatorio[i];
	        }
	    }
	    System.out.println("El mayor es " + mayor);
	}

	public void menor() {
	    int menor = aleatorio[0];
	    for (int i = 1; i < aleatorio.length; i++) {
	        if (menor > aleatorio[i]) {
	            menor = aleatorio[i];
	        }
	    }
	    System.out.println("El menor es " + menor);
	}
	public void calcularMedia() {
		int suma = 0;
		for(int i = 0; i < aleatorio.length ; i++) {
				suma += aleatorio[i];
		}
		
		int media = suma / aleatorio.length;
		
		System.out.println("La media es " + media);
	}
	
	public void imprimirValores() {
		
		for(int i = 0; i < aleatorio.length; i++) {
				System.out.print(aleatorio[i] + ", ");
		}
		System.out.println("");
	}
}
	
