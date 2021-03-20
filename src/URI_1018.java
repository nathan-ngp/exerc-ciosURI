import java.util.Scanner;

public class URI_1018 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        
        int valor = teclado.nextInt();
        System.out.println(valor);
        
        int qtdNotas100 = valor/100;
        valor = valor % 100;

        int qtdNotas50 = valor/50;
        valor = valor % 50;

        int qtdNotas20 = valor/20;
        valor = valor % 20;

        int qtdNotas10 = valor/10;
        valor = valor % 10;

        int qtdNotas5 = valor/5;
        valor = valor % 5;

        int qtdNotas2 = valor/2;
        valor = valor % 2;

        int qtdNotas1 = valor/1;
        valor = valor % 1;


        System.out.println(qtdNotas100+" nota(s) de R$ 100,00");
        System.out.println(qtdNotas50+" nota(s) de R$ 50,00");
        System.out.println(qtdNotas20+" nota(s) de R$ 20,00");
        System.out.println(qtdNotas10+" nota(s) de R$ 10,00");
        System.out.println(qtdNotas5+" nota(s) de R$ 5,00");
        System.out.println(qtdNotas2+" nota(s) de R$ 2,00");
        System.out.println(qtdNotas1+" nota(s) de R$ 1,00");

        teclado.close();
    }
}
