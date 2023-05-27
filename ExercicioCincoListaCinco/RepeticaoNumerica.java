package ExercicioCincoListaCinco;

public class RepeticaoNumerica {

    private int numeroDeRepeticoes;
    public int n = 1;

    public int getNumeroDeRepeticoes(){
    return numeroDeRepeticoes;
    }
    public void setNumeroDeRepeticoes(int numeroDeRepeticoes){
    this.numeroDeRepeticoes = numeroDeRepeticoes;
    }
    public int repeticao(int numeroVezes){
        do{
            System.out.println(" " + numeroDeRepeticoes );
            n++;
        }while(n < numeroDeRepeticoes);
        return numeroDeRepeticoes;

    }
}
