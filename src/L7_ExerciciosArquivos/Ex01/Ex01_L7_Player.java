package L7_ExerciciosArquivos.Ex01;

import java.util.List;

public class Ex01_L7_Player {
    public static void main(String[] args){
        Ex01_L7 ex01_L7 = new Ex01_L7();
        String[] listaNovoFile = {"ola1", "ola2", "ola3"};
        String diretorioFile1;
        String diretorioFile2;
        try {
            diretorioFile1 = "/home/caio/Documents/GitHub/ListaDeExercicios/src/L7_ExerciciosArquivos/Ex01_L7_TXT.txt";
            diretorioFile2 = "/home/caio/Documents/GitHub/ListaDeExercicios/src/L7_ExerciciosArquivos/Ex01_L7_TxtSaida.txt";

            List<String> arquivo1 = ex01_L7.lerFile(diretorioFile1);

            StringBuilder ipValidos = new StringBuilder();
            ipValidos.append("[Endereços válidos:]\n");

            StringBuilder ipInvalidos =  new StringBuilder();
            ipInvalidos.append("[Endereços inválidos:]\n");

            for (String linha : arquivo1){
                if (ex01_L7.intSplit(linha)){
                    ipValidos.append(linha).append("\n");
                }else {
                    ipInvalidos.append(linha).append("\n");
                }
            }
            String ipSaida = (ipValidos + "\n" + ipInvalidos);

            //ex01_L7.criarFile(diretorioFile2);

            ex01_L7.escreverEmFile(ipSaida, diretorioFile2);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
