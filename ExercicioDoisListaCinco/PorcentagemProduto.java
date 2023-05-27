public class PorcentagemProduto{

    private double valor;
    
    
        public double getValor(){
        return valor;
        }
        public void setValor(double valor){
        this.valor = valor;
        }
        public double calcular(double num1){
        double calculo = num1 * 0.1;
        double resultado = num1 + calculo;
        return resultado;
        }
}