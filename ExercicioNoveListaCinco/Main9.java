package ExercicioNoveListaCinco;

import java.util.Scanner;
public class Main9{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Reverso invercao = new Reverso();

        System.out.println("Digite um valor: ");
        invercao.setNumero(scanner.next());
        
        invercao.inverter();

        scanner.close();

    }
}
    
        