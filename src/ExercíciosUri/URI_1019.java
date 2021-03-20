import java.util.Scanner;

public class URI_1019 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);

        int tempoDuracaoSegundos = teclado.nextInt();
        
        int horas = tempoDuracaoSegundos / 3600;
        tempoDuracaoSegundos = tempoDuracaoSegundos % 3600;
        
        int minutos = tempoDuracaoSegundos / 60;
        tempoDuracaoSegundos = tempoDuracaoSegundos % 60;

        int segundos = tempoDuracaoSegundos;

        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
}
