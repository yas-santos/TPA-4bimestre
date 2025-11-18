import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, j=1, fatorial;
		
		int a[] = new int[15];
		int b[] = new int[15];
		
		for (i = 0; i < 15; i++) {
			
			System.out.println("Insira o "+(i + 1)+" número do vetor A: ");
			a[i] = ler.nextInt();
			
		}
		
		for (i = 0; i < 15; i++) {
			
			fatorial = 1;
			
			for (j = 1; j <= a [i]; j++) {
				fatorial = fatorial * j;
			}
			
			b[i] = fatorial;
			
		}
		
		for (i = 0; i < 15; i++) {
			
			System.out.println("Número: "+ a[i] + "!" + " = " + "Fatorial: " + b[i]);
			
		}
		
		ler.close();
	}

}
