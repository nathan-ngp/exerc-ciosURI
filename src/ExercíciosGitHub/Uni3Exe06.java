import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe06 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        System.out.println("Digite o peso do prato montado:");
        double valorPrato = teclado.nextDouble() - 0.75;
        double valorPagar = valorPrato * 25;
        System.out.println("O valor total do prato é: R$ "+numero.format(valorPagar));

        teclado.close();
    }
}
