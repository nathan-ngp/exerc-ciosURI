import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        double comprimento = teclado.nextDouble();
        double altura = teclado.nextDouble();

        double parede = altura * comprimento;

        double custo = (parede/9) * 12.5;

        System.out.println("Custo Total: "+custo);

        teclado.close();
    }
}

/*
5 * 4 = 20
20/9 = 2,22222
2,22 * 12.5 = 27,777778
*/
