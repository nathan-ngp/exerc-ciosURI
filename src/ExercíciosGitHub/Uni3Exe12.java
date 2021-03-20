import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        String nomeFuncionario = teclado.next();
        System.out.println("Nome Funcionário: "+ nomeFuncionario);
        double horasTrabalhadas = teclado.nextDouble();
        int numeroDependentes = teclado.nextInt();

        double salarioBruto = (10 * horasTrabalhadas) + (60 * numeroDependentes);
        System.out.println("Salário Bruto: "+ salarioBruto);

        double descontos = (salarioBruto * 0.085) + (salarioBruto * 0.05);
        double salarioLiquido = salarioBruto - descontos;
        System.out.println("Salário Líquido: "+ salarioLiquido);


        teclado.close();
    }
}

/*
Nathan
5 * 10 = 50 horasTrabalhadas
2 * 60 = 120 dependentes
170 = salarioBruto

170 * 0,085 = 14,45
170 * 0,05 = 8,5
22,95
147,05
*/