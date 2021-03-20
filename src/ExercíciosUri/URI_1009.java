import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");
        String nomeVendedor = teclado.next();
        double salarioFixoVendedor = teclado.nextDouble();
        double totalVendasEfetuadas = teclado.nextDouble();
        double salario = salarioFixoVendedor + (totalVendasEfetuadas * 0.15);
        System.out.println("TOTAL = R$ "+numero.format(salario));

        teclado.close();
    }
}