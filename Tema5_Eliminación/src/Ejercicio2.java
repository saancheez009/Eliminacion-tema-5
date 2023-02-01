import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	//Creamos una función llamada esPrimo
	static boolean esPrimo(int tabla) {
		
		boolean result=true;
		if(tabla>0) {
			for(int i=2; i<=tabla/2; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
				//Sie el resto de la división de n entre i es igual a 0, el número no es primo, por tanto result es igual a false
				if ( tabla%i==0) {
					result=false;
				}
			}
			
	 }
		return result; //Devolvemos el resultado.
	}

	public static void main(String[] args) {
		int tabla[] = new int[10];
		int indiceBorrar=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<tabla.length;i++) {
		System.out.println("Por favor introduzca 10 números");
		tabla[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(tabla));
		
		while (indiceBorrar < tabla.length) {

			if (!esPrimo(tabla[indiceBorrar])) {
				System.arraycopy(tabla, indiceBorrar + 1, tabla, indiceBorrar, tabla.length - indiceBorrar - 1);

				tabla = Arrays.copyOf(tabla, tabla.length - 1);

				
			} else {
				indiceBorrar++;
			} // fin del if
		}
		System.out.println(Arrays.toString(tabla));
	}

}
