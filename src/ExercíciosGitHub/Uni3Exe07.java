import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe07 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");
        
        System.out.println("Digite a quantidade de latas de 350ml foram compradas:");
        int qtdLata350 = teclado.nextInt();
        System.out.println("Digite a quantidade de latas de 600ml foram compradas:");
        int qtdGarrafa600 = teclado.nextInt();
        System.out.println("Digite a quantidade de latas de 2L foram compradas:");
        int qtdGarrafa2L = teclado.nextInt();
        
        double qtdLitrosTotal = (qtdLata350 * 0.35) + (qtdGarrafa600 * 0.6) + (qtdGarrafa2L * 2);

        System.out.println("Litros Totais: "+numero.format(qtdLitrosTotal)+"L");

        teclado.close();
    }
}

