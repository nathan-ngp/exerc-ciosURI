import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe10 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o comprimento do primeiro cateto:");
        double comprimentoCateto1 = teclado.nextDouble();
        System.out.println("Digite o comprimento do segundo cateto:");
        double comprimentoCateto2 = teclado.nextDouble();
        
        double calculo = Math.pow(comprimentoCateto1, 2) + Math.pow(comprimentoCateto2, 2); 
        double hipotenusa = Math.pow(calculo, 2);
    
        System.out.println("Hipotenusa: "+hipotenusa);

        teclado.close();
    }
}
