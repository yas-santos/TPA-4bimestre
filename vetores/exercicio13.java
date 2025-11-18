package vetores.TPA;

import java.util.Scanner;

public class exercicio13 {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int i, j, palindromo = 1;

	        int a[] = new int[10];

	     
	        for (i = 0; i < 10; i++) {
	            System.out.println("Insira o " + (i + 1) + " número do vetor A: ");
	            a[i] = ler.nextInt();
	        }

	        
	        j = 9; 

	        for (i = 0; i < 5; i++) {  
	            if (a[i] != a[j]) {
	                palindromo = 0; 
	            }
	            j--; 

	        if (palindromo == 1) {
	            System.out.println("\nO vetor A é um palíndromo.");
	        } else {
	            System.out.println("\nO vetor A NÃO é um palíndromo.");
	        }

	        ler.close();
	    }

	 }
}
