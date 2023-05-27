package ExercicioOitoListaCinco;

import java.util.Scanner;
public class Main8{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ProgramaSomaImposto somar = new ProgramaSomaImposto();

        System.out.println("Algoritmo de repetição numerica.");
        System.out.println("Digite a taxa de imposto em porcentagem: ");
        somar.setQuantiaDeImposto(scanner.nextDouble());

        System.out.println("Digite o valor do produto: ");
        somar.setCustoDoItem(scanner.nextDouble());

        double resultado = somar.somaImposto(somar.getQuantiaDeImposto(), somar.getCustoDoItem());
        System.out.println("O valor do produto para vendas é: " + resultado);

        scanner.close();

    }
}
