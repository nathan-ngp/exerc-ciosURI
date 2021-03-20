import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args)throws Exception{
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor do produto:");
        double valorProduto = teclado.nextDouble();
        double valorDesconto = valorProduto * 0.12;
        double valorTotal = valorProduto - valorDesconto;
        System.out.println("O valor do desconto é de R$ "+valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ "+valorTotal);
        teclado.close();
    }
}
