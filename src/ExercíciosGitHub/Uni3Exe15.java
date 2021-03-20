import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        int valor1 = teclado.nextInt();
        int valor = 0;

        valor = valor1/100;
        System.out.println("Centenas: "+valor);
        valor1 = valor1 % 100;
        
        valor = valor1/10;
        System.out.println("Dezenas: "+valor);
        valor1 = valor1 % 10;     
        
        valor = valor1/1;
        System.out.println("Unidades: "+valor);
        valor1 = valor1 % 1;     

        teclado.close();
    }
}
