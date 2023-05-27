package ExercicioSeteListaCinco;

import java.util.Scanner;
public class Main7{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FuncaoArgumentativa argumento = new FuncaoArgumentativa();
        
        System.out.println("Algoritmo de comparação do argumento.");

        System.out.print("= " + argumento.resultado(argumento.getNota()));

        scanner.close();
        
    }
}
