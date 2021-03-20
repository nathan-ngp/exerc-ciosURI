import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe03 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");
        
        System.out.println("Digite o valor da gasolina:");
        double valorGasosa = teclado.nextDouble();
        System.out.println("Digite o valor do pagamento:");
        double valorPago = teclado.nextDouble();

        System.out.println("Litros colocados: "+numero.format(valorPago/valorGasosa));
        teclado.close();
    }
}
