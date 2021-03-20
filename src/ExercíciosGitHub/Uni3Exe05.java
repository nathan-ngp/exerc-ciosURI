import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe05 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        System.out.println("Digite a quantidade de frangos existentes:");
        int qtdFrangos = teclado.nextInt();
        double gastoTotal = qtdFrangos * (4 + 7);
        System.out.println("Quantidade gasta: R$ "+numero.format(gastoTotal));

        teclado.close();
    }
}