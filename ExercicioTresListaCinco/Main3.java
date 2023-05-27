import java.util.Scanner;
public class Main3{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Transformando grausC = new Transformando();

        System.out.println("Algoritmo para transformar graus fahrenheit em graus celsius.");
        System.out.println("Digite a temperatura em graus fahrenheit: ");
        grausC.setGrausF(scanner.nextDouble());

        double resultado = grausC.calcular(grausC.getGrausF());
        System.out.printf("\nA temperatura encontrada em graus celsius foi: %.2f" , resultado);

        scanner.close();
    }
}