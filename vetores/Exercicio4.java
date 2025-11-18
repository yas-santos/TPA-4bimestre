import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, j=0, ultimo = 0;

		int a[] = new int[10];
		
		
		for ( i = 0; i < 10; i++) {
			System.out.println("Insira o "+(i + 1)+" do vetor A: ");
			a[i] = ler.nextInt();
			}
			
		for ( i = 0; i < 10; i++) {
			ultimo = a[i];
			
			System.out.print("\nPares de 0 até " + ultimo + ": ");
			
			for (j = 0; j <= ultimo; j++) {
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			
		}
		
		ler.close();
	}

}
