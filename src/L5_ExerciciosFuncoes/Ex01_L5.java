package L5_ExerciciosFuncoes;

public class Ex01_L5 {
    private int cor = 30;
    public String montarEstrutura(int numerosDeRepeticoes){
        StringBuilder estruturaS = new StringBuilder();
        for (int i = 0; i <= (numerosDeRepeticoes -1); i++){
            for (int j = 0; j < i+1; j++){
                String SCI = "\u001B[";
                if (i+1<10){
                    estruturaS.append(SCI).append(cor).append("m").append(0).append(i + 1).append(SCI).append("m ");
                }else {
                    estruturaS.append(SCI).append(cor).append("m").append(i + 1).append(SCI).append("m ");
                }
                cor++;
                if (cor>37){
                    cor=30;
                }
            }
            estruturaS.append("\n");
        }
        return String.valueOf(estruturaS);
    }
}
