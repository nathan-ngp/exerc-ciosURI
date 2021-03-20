import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1012 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.000");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        double areaTriangulo = A*C/2;
        double areaCirculo = (C*C)*3.14159;
        double areaTrapezio = (A + B)*C/2;
        double areaQuadrado = B*B;
        double areaRetangulo = A*B;

        System.out.println("TRIANGULO: "+numero.format(areaTriangulo));
        System.out.println("CIRCULO: "+numero.format(areaCirculo));
        System.out.println("TRAPEZIO: "+numero.format(areaTrapezio));
        System.out.println("QUADRADO: "+numero.format(areaQuadrado));
        System.out.println("RETANGULO: "+numero.format(areaRetangulo));

        teclado.close();
    }
}