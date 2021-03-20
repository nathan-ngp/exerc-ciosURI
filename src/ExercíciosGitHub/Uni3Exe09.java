import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Exe09 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        System.out.println("Digite o raio:");
        double raio = teclado.nextDouble();

        System.out.println("Digite o altura:");
        double altura = teclado.nextDouble();

        double volume = Math.PI * (raio * raio) * altura;

        System.out.println("Volume: "+numero.format(volume)+"L");

        teclado.close();
    }
}