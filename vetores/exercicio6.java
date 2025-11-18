package vetores.TPA;

public class exercicio6 {
    public static void main(String[] args) {
        
        int i = 0;
        int a[] = new int[11];
        int valor = 1;  
        
        for(i = 0; i < 11; i++) {
            a[i] = valor;  
            System.out.println("A[" + i + "] = " + a[i]);
            
            valor = valor * 2; 
        }
    }


}
