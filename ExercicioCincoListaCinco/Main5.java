package ExercicioCincoListaCinco;

import java.util.Scanner;
public class Main5{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        RepeticaoNumerica repetir = new RepeticaoNumerica();
        
        System.out.println("Algoritmo de repetição numerica.");
        System.out.println("Digite o número de repetições: ");
        repetir.setNumeroDeRepeticoes(scanner.nextInt());

        System.out.println(" " + repetir.repeticao(repetir.getNumeroDeRepeticoes()));

        scanner.close();
        
    }
}