import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0;
		
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Insira o "+(i + 1)+" número do vetor A: ");
			a[i] = ler.nextInt();
			
		}
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Insira o "+(i + 1)+" número do vetor B: ");
			b[i] = ler.nextInt();
			
		}
		
		for ( i = 0; i < 10; i++) {
			
			if ( a[i] > b[i] ) {
				
				c[i] = 1;
				
			} else if ( a[i] == b[i] ) {
				
				c[i] = 0;
				
			} else {
				
				c[i] = -1;
				
			}
		}
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Vetor A: " + a[i]);
			
		}
		
		System.out.println();
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Vetor B: " + b[i]);
			
		}
		
		System.out.println();
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Vetor C: " + c[i]);
			
		}
		
		
		ler.close();
	}

}
