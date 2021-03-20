import java.util.Scanner;
// import java.text.DecimalFormat;
// import java.lang.Math;

public class Uni3Exe01 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor da base do terreno:");
        double base = teclado.nextDouble();
        System.out.println("Digite o valor da altura do terreno:");
        double altura = teclado.nextDouble();

        System.out.println("Área do terreno: "+base*altura);
        teclado.close();
    }
}