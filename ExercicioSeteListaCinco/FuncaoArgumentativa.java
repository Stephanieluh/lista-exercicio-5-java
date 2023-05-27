package ExercicioSeteListaCinco;

public class FuncaoArgumentativa {

    private int nota = 10;

    public int getNota(){
    return nota;
    }
    public int resultado(int nota){
    System.out.println("O resultado da comparação do argumento é: ");
    if(nota > 0){
        System.out.println("P (Positivo)");
    }else{
        System.out.println("N (Negativo)");
    }
    return nota;
    }
    
}
