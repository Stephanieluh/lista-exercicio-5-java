package ExercicioNoveListaCinco;

public class Reverso {

    private String numero;

    public String getNumero(){
    return numero;
    }
    public void setNumero(String numero){
    this.numero = numero;
    }
    public void inverter(){
    String[] novoNumero = numero.split("");
    for (int i = novoNumero.length - 1; i >= 0; i --){
    System.out.print(novoNumero[i]);
    }

    }
}
