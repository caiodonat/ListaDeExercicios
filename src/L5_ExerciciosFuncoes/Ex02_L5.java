package L5_ExerciciosFuncoes;

public class Ex02_L5 {
    public String montarEstrutura(int numerosDeRepeticoes){
        StringBuilder estruturaS = new StringBuilder();
        for (int i = 0; i <= (numerosDeRepeticoes -1); i++){
            for (int j = 0; j < i+1; j++){
                estruturaS.append(j + 1).append(" ");
            }
            estruturaS.append("\n");
        }
        return String.valueOf(estruturaS);
    }

}
