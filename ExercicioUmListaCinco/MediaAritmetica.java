public class MediaAritmetica {

    private double numeroUm;
    private double numeroDois;

    public double getNumeroUm(){
    return numeroUm;
    }
    public void setNumeroUm(double numeroUm){
    this.numeroUm = numeroUm;
    }
    public double getNumeroDois(){
    return numeroDois;
    }
    public void setNumeroDois(double numeroDois){
    this.numeroDois = numeroDois;
    }
    public double calcular(double num1, double num2){
    double calculo = (num1 + num2) / 2;
    return calculo;
    }

}
