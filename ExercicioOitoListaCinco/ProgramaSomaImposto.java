package ExercicioOitoListaCinco;

public class ProgramaSomaImposto{

    private double quantiaDeImposto;
    private double custoDoItem;

    public double getQuantiaDeImposto() {
        return quantiaDeImposto;
    }
    public void setQuantiaDeImposto(double quantiaDeImposto) {
        this.quantiaDeImposto = quantiaDeImposto;
    }
    public double getCustoDoItem() {
        return custoDoItem;
    }
    public void setCustoDoItem(double custoDoItem) {
        this.custoDoItem = custoDoItem;
    }
    public double somaImposto(double taxaImposto, double custo){
        double soma = custo + (custo * (taxaImposto / 100) );
        return soma;
    }

    
}