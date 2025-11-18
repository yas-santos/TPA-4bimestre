package vetores.TPA;

import java.util.Scanner;

public class exercicio12 {
	
	  public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        
	        int fila[] = new int[10];
	        int fim = 0;
	        int i;

	        for (i = 0; i < 10; i++) {
	            System.out.println("Digite a senha para entrar na fila da merenda:");
	            fila[fim] = ler.nextInt();
	            fim++;
	        }
	        
	        System.out.println("\nPrimeiro aluno atendido: " + fila[0]);

	        for (i = 0; i < fim - 1; i++) {
	            fila[i] = fila[i + 1];
	        }

	        fim--; 
	        
	        System.out.println("\nFila após atender um aluno:");
	        for (i = 0; i < fim; i++) {
	            System.out.print(fila[i] + " ");
	        }

	        ler.close();
	    }

}
