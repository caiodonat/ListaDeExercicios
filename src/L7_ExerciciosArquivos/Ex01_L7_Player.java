package L7_ExerciciosArquivos;

import java.util.List;

public class Ex01_L7_Player {
    public static void main(String[] args){
        Ex01_L7 myEx07 = new Ex01_L7();
        String[] listaNovoFile = {"ola1", "ola2", "ola3"};
        String diretorioFile1;
        String diretorioFile2;
        try {
            diretorioFile1 = "arquivo1.txt";
            diretorioFile2 = "arquivo2.txt";

            List<String> arquivo1 =myEx07.lerFile(diretorioFile1);


            /*

            for (String linha : linhas){
                System.out.println(linha);
            }
             */
            //myEx07.deletarFile("arquivo");



        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
