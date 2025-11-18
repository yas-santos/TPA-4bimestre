package vetores.TPA;

import java.util.Scanner;

public class exercicio3 {
	 public static void main(String[] args) {
	        
	        Scanner ler = new Scanner(System.in);
	        int x, j, numero, i;  
	        
	        int a[] = new int[10];
	        
	        for(x = 0; x < 10; x++) {
	            System.out.println("Insira o " + (x+1) + "º número do vetor A: ");
	            a[x] = ler.nextInt();
	        }
	        
	        System.out.println(" ");
	        System.out.println("Verificação de números primos do vetor A:");
	        System.out.println(" ");
	        
	        for(x = 0; x < 10; x++) {
	            
	            numero = a[x];
	            i = 0; 
	            
	            for(j = 1; j <= numero; j++) {
	                if(numero % j == 0) {
	                    i++; 
	                }
	            }
	            
	            if(i == 2) {
	                System.out.println(numero + " é primo");
	            } else {
	                System.out.println(numero + " não é primo");
	            }
	            
	            System.out.println(" ");
	        }
	        
	        ler.close();
	    }

}
