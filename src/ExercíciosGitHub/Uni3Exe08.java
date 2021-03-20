import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");
    
        System.out.println("Digite o número de dólares entregues:");
        double dolarsEntregue = teclado.nextDouble();
        double reais = dolarsEntregue * 5.56;
        System.out.println("O valor à ser entregue em reais é: R$:"+ numero.format(reais));
    
        teclado.close();
    }
}
