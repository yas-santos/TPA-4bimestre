package vetores.TPA;

import java.util.Scanner;

public class exercicio5 {
	   public static void main(String[] args) {
	        Scanner ler = new Scanner (System.in);
	        int i = 0, j = 1, ultimo;
	        
	        int a[] = new int[10];
	        
	        for (i = 0; i < 10; i++) {
	            System.out.println("Insira o " + (i + 1) + " número do vetor A: ");
	            a[i] = ler.nextInt();
	        }
	        
	        for(i = 0; i < 10; i++) {
	            
	            ultimo = a[i];
	            
	            System.out.print("\nDivisores de " + ultimo + ": ");
	            
	            for (j = 1; j <= ultimo; j++) {
	                if(a[i] % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }
	        }
	        
	        ler.close();
	    }
	

}
