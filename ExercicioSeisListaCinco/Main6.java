package ExercicioSeisListaCinco;

import java.util.Scanner;
public class Main6{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SomaDosArgumentos soma = new SomaDosArgumentos();
        
        System.out.println("Algoritmo de soma de argumentos.");

        int resultado = soma.somar(soma.getNumeroUm(), soma.getNumeroDois(), soma.getNumeroTres());
        System.out.println("O resultado da soma é: " + resultado);

        scanner.close();
        
    }
}