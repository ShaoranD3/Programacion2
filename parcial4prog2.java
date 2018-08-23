package parcialprog1;
import java.util.Scanner;
public class parcial4prog2 {


      	 
      		private static Scanner sn;

			public static void main(String[] args) {
      		  
      		       int n = 0;
      	        int me = 0;
      	        int ma = 0;
      	        int s = 0, sp = 0, sne = 0;
      	        double md = 0;
      	     int i = 0;
      	        int cont = -1;
      	        
				
      	     sn = new Scanner(System.in);
      	  
	            do{ 
      		            if (me != 0 && ma != 0) {
      		                if (n > ma) {
      		                    ma = n;
      		                }
      		                if (n < me) {
      		                    me = n;
      		               } 
      		         }  else {
      		                me = n;
      		                ma = n;
      		            }
      		            
      		         s+=n;
      		         
      		         if(n>=0){
      	                sp+=n;
      	            }else{
      	                sne+=n;
      	            }
	            
      	           cont++;
      	        i++;
      	           System.out.print( i+ " Ingrese un numero: ");
	       		n = sn.nextInt();
	            
	            } while(n!=-1);
      	 
	            md = (double) s / cont;
      		
      	        
      	        System.out.println("El menor numero ingresado fue: "+me);
      	     System.out.println("El mayor numero ingresado fue: "+ma);
      	   System.out.println("La suma de los numeros positivos es: "+sp);
      	        System.out.println("La suma de todos los numeros es: "+s);
      	        
      	     System.out.println("La media de la primera suma es: "+md);
      	        System.out.println("La suma de los numeros negativos es: "+sne);
      	      
      		
      	 
      		}

	}


