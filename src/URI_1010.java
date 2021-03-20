import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1010 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        int codigopeca1 = teclado.nextInt();
        int numeroPecas1 = teclado.nextInt();
        double valorPeca1 = teclado.nextDouble();
        
        int codigopeca2 = teclado.nextInt();
        int numeroPecas2 = teclado.nextInt();
        double valorPeca2 = teclado.nextDouble();

        double valorTotal = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);

        System.out.println("VALOR A PAGAR: R$ "+numero.format(valorTotal));

        teclado.close();
    }
}
