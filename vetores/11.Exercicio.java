import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, x, posicao = -1;
		
		int a[] = new int[10];
		
		for ( i = 0; i < 10; i++ ) {
			
			System.out.println("Insira  o "+(i + 1)+" número do vetor A: ");
			a[i] = ler.nextInt();
			
		}
		
		System.out.println("Insira o valor de X: ");
		x = ler.nextInt();
		
		for ( i = 0; i < 10; i++ ) {
			
			if ( a[i] == x ) {
				
				posicao = i;
				
			} 
		}
		
		if ( posicao != -1 ) {
			
			System.out.println("X está inserido em A na posição " + posicao + ".");
			System.out.println("X = " + x + ", " + "A[" + posicao + "] " + "= "+ x);
			
		}
		
		if ( posicao == -1 ) {
			
			System.out.println("X não está em A.");
			
		}
		
		
		ler.close();

	}

}
