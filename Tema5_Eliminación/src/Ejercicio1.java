import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[] = new int[20];
		int indiceBorrar = 0;

		/*
		 * if(tabla[i]%2!=0) {
		 * 
		 * indiceBorrar=Arrays.binarySearch(tabla, tabla[i]);
		 */
		
		//Se rellena el array con números aleatorios del 0 al 100 mediante un for 
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		
		//Mostramos la tabla original generada pra luego compararla con la tabla generada sin los números impares.
		
		System.out.println("Tabla original " + Arrays.toString(tabla));
		
		//Creamos un while en el que indicamos que mientras que el indiceBorrar sea 0, menor que la longitud de la tabla se cumplirá todo lo que lleva dentro

		while (indiceBorrar < tabla.length) {

			if (tabla[indiceBorrar] % 2 != 0) {
				System.arraycopy(tabla, indiceBorrar + 1, tabla, indiceBorrar, tabla.length - indiceBorrar - 1);

				tabla = Arrays.copyOf(tabla, tabla.length - 1);

				
			} else {
				indiceBorrar++;
			} // fin del if
		}
		System.out.println(Arrays.toString(tabla));
	
	
	}

	
}
