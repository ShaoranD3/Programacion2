package parcialprog1;

		import java.util.Scanner;

		public class parcial1prog2 {

		    private static Scanner sc;

			public static void main(String[] args) {
		    	 sc = new Scanner(System.in);
		        
		        double c, producto;
		        double IVA = 0.21;
		        
		        System.out.println("introduzca el precio del producto");
		       c = sc.nextDouble();
		        
		        producto = c + c * IVA;
		         System.out.println("Precio + el IVA es: " +producto);
		        
		    }


	}


