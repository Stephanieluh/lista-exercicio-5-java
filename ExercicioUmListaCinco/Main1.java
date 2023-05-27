import java.util.Scanner;

public class Main1{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        MediaAritmetica media = new MediaAritmetica();

        System.out.println("Calculadora da Média Aritmetica.");
        System.out.println("Digite o primeiro número: ");
        media.setNumeroUm(scanner.nextDouble());

        System.out.println("Digite o segundo número: ");
        media.setNumeroDois(scanner.nextDouble());
        
        System.out.println("O resultado da média aritmetica é: " + media.calcular(media.getNumeroUm(), media.getNumeroDois()));

        scanner.close();
       

    }
}
