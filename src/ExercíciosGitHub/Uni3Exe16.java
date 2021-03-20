import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        double valor1 = teclado.nextInt();
        int valor = 0;

        valor = (int) valor1/100;
        System.out.println("Notas R$100: "+valor);
        valor1 = valor1 % 100;
        
        valor = (int) valor1/10;
        System.out.println("Notas R$10: "+valor);
        valor1 = valor1 % 10;     
        
        valor = (int) valor1/1;
        System.out.println("Notas R$1: "+valor);
        valor1 = valor1 % 1;  

        teclado.close();
    }
}
