package L7_ExerciciosArquivos;

import java.io.File;
import java.util.List;

public class Ex01_L7_Player {
    public static void main(String[] args){
        Ex01_L7 myEx07 = new Ex01_L7();
        try {
            //myEx07.criarFile("arquivo");
            //myEx07.escreverEmFile("Ola arquivo.txt");
            List<String> linhas =myEx07.lerFile("arquivo");

            for (String linha : linhas){
                System.out.println(linha);
            }
            //myEx07.deletarFile("arquivo");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
