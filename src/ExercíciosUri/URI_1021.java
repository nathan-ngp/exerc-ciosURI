import java.util.Scanner;

public class URI_1021 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        double valor1 = teclado.nextDouble();
        int valor = 0;
        
        System.out.println("NOTAS:");

        valor = (int) valor1/100;
        System.out.println(valor+" nota(s) de R$ 100.00");
        valor1 = valor1 % 100;

        valor = (int) valor1/50;
        System.out.println(valor+" nota(s) de R$ 50.00");
        valor1 = valor1 % 50;

        valor = (int) valor1/20;
        System.out.println(valor+" nota(s) de R$ 20.00");
        valor1 = valor1 % 20;

        valor = (int) valor1/10;
        System.out.println(valor+" nota(s) de R$ 10.00");
        valor1 = valor1 % 10;

        valor = (int) valor1/5;
        System.out.println(valor+" nota(s) de R$ 5.00");
        valor1 = valor1 % 5;

        valor = (int) valor1/2;
        System.out.println(valor+" nota(s) de R$ 2.00");
        valor1 = valor1 % 2;

        valor1 = valor1 * 100;
    
        System.out.println("MOEDAS:");

        valor = (int) valor1/100;
        System.out.println(valor+" moeda(s) de R$ 1.00");
        valor1 = valor1 % 100;
        
        valor = (int) valor1/50;
        System.out.println(valor+" moeda(s) de R$ 0.50");
        valor1 = valor1 % 50;

        valor = (int) valor1/25;
        System.out.println(valor+" moeda(s) de R$ 0.25");
        valor1 = valor1 % 25;

        valor = (int) valor1/10;
        System.out.println(valor+" moeda(s) de R$ 0.10");
        valor1 = valor1 % 10;

        valor = (int) valor1/5;
        System.out.println(valor+" moeda(s) de R$ 0.05");
        valor1 = valor1 % 5;

        valor = (int) valor1/1;
        System.out.println(valor+" moeda(s) de R$ 0.01");
        valor1 = valor1 % 1;

        teclado.close();
    }
}
