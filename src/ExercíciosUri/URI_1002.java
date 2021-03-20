import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.0000");
        double raio = teclado.nextDouble();
        final double n = 3.14159;
        double area = n * (raio * raio);
        System.out.println("A="+numero.format(area));
        teclado.close();
    }
}
