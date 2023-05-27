package ExercicioQuatroListaCinco;

public class MediaGeometrica {

    private double numeroUm;
    private double numeroDois;
    private double numeroTres;

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
    public double getNumeroTres(){
    return numeroTres;
    }
    public void setNumeroTres(double numeroTres){
    this.numeroTres = numeroTres;
    }
    public double calcularMG(double num1, double num2, double num3){
    double calcularMG = Math.cbrt(numeroUm * numeroDois * numeroTres);
    return calcularMG;
    }
    
}
