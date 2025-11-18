import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		int pares = 0, i, j;
		
		int[] a = new int[20];
		int[] b = new int[20];
		
		for(i=0 ; i < 20; i++) {
			System.out.println("Insira o "+(i+1)+" número do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i=0 ; i<20 ; i++) {
			if (a[i] % 2 == 0) {
				b[pares] = a[i];
				pares++;
			}
		}
		
		for(i=0 ; i<20 ; i++) {
			if (a[i] % 2 != 0) {
				b[pares] = a[i];
				pares++;
			}
		}
		
		System.out.print("[");
		
		for(j=0; j<20 ; j++) {
			System.out.print(b[j]);
			if (j < 19) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		
		ler.close();
	}

}
