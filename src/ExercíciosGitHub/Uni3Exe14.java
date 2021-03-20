import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        double distanciaPercorrida = teclado.nextDouble();
        double tempoGasto = teclado.nextDouble();

        double vm = distanciaPercorrida/tempoGasto;
        double combustível = distanciaPercorrida/12;

        System.out.println("Velocidade Média: "+vm);
        System.out.println("Combustível gasto: "+combustível);

        teclado.close();
    }
}
/*
vm = 100 (distancia) / 2 (tempogasto) = 50
comb = 100/12 = 8.3
*/