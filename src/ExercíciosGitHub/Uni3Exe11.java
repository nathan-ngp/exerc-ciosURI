import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite a temperatura em ºF");
        double fah = teclado.nextDouble();

        double celsius = (fah - 32) * 5/9;

        System.out.println(fah+"ºF: "+celsius+"ºC");

        teclado.close();
    }
}
