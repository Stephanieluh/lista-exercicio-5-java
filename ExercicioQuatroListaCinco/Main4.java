package ExercicioQuatroListaCinco;

import java.util.Scanner;
public class Main4{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        MediaAritmetica mediaA = new MediaAritmetica();
        MediaHarmonica mediaH = new MediaHarmonica();
        MediaGeometrica mediaG = new MediaGeometrica();

        System.out.println("Calculadora de Média Aritmetica, Harmonica e Geométrica.");
        System.out.println("Digite o primeiro número: ");
        mediaA.setNumeroUm(scanner.nextDouble());
        mediaH.setNumeroUm(scanner.nextDouble());
        mediaG.setNumeroUm(scanner.nextDouble());

        System.out.println("Digite o segundo número: ");
        mediaA.setNumeroDois(scanner.nextDouble());
        mediaH.setNumeroDois(scanner.nextDouble());
        mediaG.setNumeroDois(scanner.nextDouble());

        System.out.println("Digite o terceiro número: ");
        mediaA.setNumeroTres(scanner.nextDouble());
        mediaH.setNumeroTres(scanner.nextDouble());
        mediaG.setNumeroTres(scanner.nextDouble());
        
        double resultadoMA = mediaA.calcularMA(mediaA.getNumeroUm(), mediaA.getNumeroDois(), mediaA.getNumeroTres());
        System.out.printf("\nO resultado da média aritmetica é: %.2f" , resultadoMA);

        double resultadoMH = mediaH.calcularMH(mediaH.getNumeroUm(), mediaH.getNumeroDois(), mediaH.getNumeroTres());
        System.out.printf("\nO resultado da média harmonica é: %.2f" , resultadoMH);

        double resultadoMG = mediaG.calcularMG(mediaG.getNumeroUm(), mediaG.getNumeroDois(), mediaG.getNumeroTres());
        System.out.printf("\nO resultado da média geométrica é: %.2f" , resultadoMG);

        scanner.close();
       

    }
}
