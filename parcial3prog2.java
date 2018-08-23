package parcialprog1;
import java.util.Scanner;


public class parcial3prog2 {

   private static Scanner sc;

			public static void main(String[] args) {
		 
		        sc = new Scanner(System.in);
		        
		        System.out.println("Introduce un numero");
		        int n = sc.nextInt();
		 
		        if (n <= 1) {
		            System.out.println("El numero " + n + " no es primo");
		        } else {
		 
		            int raiz = (int) Math.sqrt(n);
		            int contador = 0;
		 
		            for (int i = raiz; i > 1; i--) {
		                if (n % i == 0) {
		                    contador++;


	}

}

		    	}
		    	}
		    	}