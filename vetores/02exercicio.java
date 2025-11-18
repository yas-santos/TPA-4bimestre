package vetores.TPA;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int i = 0, tabuada;
        
        int a[] = new int[5];
        
        for(i = 0; i < 5; i++) {
            System.out.println("Insira o "+(i+1)+" número do vetor A: ");
            a[i] = ler.nextInt();
        }
        
        System.out.println(" ");
        System.out.println("Tabuada dos números inteiros do vetor A: ");
        System.out.println(" ");
        
        for(i = 0; i <= 10; i++) {
            tabuada = a[0] * i;
            System.out.println (a[0] + " x " + i + " = " + tabuada);
        }
        
        System.out.println(" ");
        
        for(i = 0; i <= 10; i++) {
            tabuada = a[1] * i;
            System.out.println (a[1] + " x " + i + " = " + tabuada);
        }
        
        System.out.println(" ");
        
        for(i = 0; i <= 10; i++) {
            tabuada = a[2] * i;
            System.out.println (a[2] + " x " + i + " = " + tabuada);
        }
        
        System.out.println(" ");
        
        for(i = 0; i <= 10; i++) {
            tabuada = a[3] * i;
            System.out.println (a[3] + " x " + i + " = " + tabuada);
        }
        
        System.out.println(" ");
        
        for(i = 0; i <= 10; i++) {
            tabuada = a[4] * i;
            System.out.println (a[4] + " x " + i + " = " + tabuada);
        }
        
        ler.close();
    }
}
