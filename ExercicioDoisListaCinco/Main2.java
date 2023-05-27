import java.util.Scanner;
public class Main2{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        PorcentagemProduto ProdutoComPorcentagem = new PorcentagemProduto();
        
        System.out.println("Calculadora de porcentagem.");
        System.out.println("Digite o valor do produto: ");
        ProdutoComPorcentagem.setValor(scanner.nextDouble());

        System.out.println("O resultado do cálculo da porcentagem é: " + ProdutoComPorcentagem.calcular(ProdutoComPorcentagem.getValor()));

        scanner.close();

    }
}