import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, j=0, controle=0, contagem=0;

		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for ( i = 0; i < 10; i++ ) {
			System.out.println("Insira o "+(i + 1)+" número do vetor A: ");
			a[i] = ler.nextInt();
		}
		for ( i = 0; i < 10; i++ ) {
			
			System.out.println("Insira o "+(i + 1)+" número do vetor B: ");
			b[i] = ler.nextInt();
		
		}
		
		for ( i = 0; i < 10; i++ ) {
			contagem = 0;
			
			for ( j = 0; j < 10; j++ ) {
				
				if (a[i] == b[j]) {
					
					contagem++;
					
				}
			}
			
			if (contagem == 0) {
				
				c[controle] = a[i];
				controle++;
				
			}
		}
		
		 	System.out.println("\nDiferença entre A e B (A - B): ");
		 	
		    for (i = 0; i < controle; i++) {
	            System.out.print(c[i] + " ");
	        }	       
	
	        ler.close();
	}
}
