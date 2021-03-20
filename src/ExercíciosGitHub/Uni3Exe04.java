import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe04 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double media = (nota1 * 5) + (nota2 * 3) + (nota3 * 2)/10;
        System.out.println("Média: "+numero.format(media));
        teclado.close();
    }
}
