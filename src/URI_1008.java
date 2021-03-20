import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");
        int numeroFuncionario = teclado.nextInt();
        int numeroHorasTrabalhadas = teclado.nextInt();
        double valorHoraTrabalhada = teclado.nextDouble();
        double salario = numeroHorasTrabalhadas * valorHoraTrabalhada;
        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.println("SALARY = U$ "+numero.format(salario));
        teclado.close();
    }
}
