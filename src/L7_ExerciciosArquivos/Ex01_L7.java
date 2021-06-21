package L7_ExerciciosArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex01_L7 {
    private String nameFileP;

    public void criarFile(String diretorioFile) throws IOException {
        File myFile = new File(diretorioFile);
        myFile.createNewFile();
        this.nameFileP = diretorioFile;
    }

    public void escreverEmFile(String texto, String diretorioFile) throws  IOException{
        FileWriter myWritter = new FileWriter(diretorioFile);
        myWritter.write(texto);
        myWritter.close();
    }

    public void escreverEmFileArray(String[] array, String diretorioFile) throws IOException {
        FileWriter myWritter = new FileWriter(diretorioFile);
        for (String linha : array){
            myWritter.write(linha + "\n");
        }
        myWritter.close();
    }

    public void deletarFile(String diretorioFile) throws IOException{
        File myFile = new File(diretorioFile );
        myFile.delete();
    }

    public List<String> lerFile(String diretorioFile) throws IOException{
        Path caminho = Paths.get(diretorioFile);
        List<String> linhas = Files.readAllLines(caminho);
        return linhas;
    }

    public void closeFile(String diretorioFile) throws IOException{
        FileWriter myWritter = new FileWriter(diretorioFile);
        myWritter.close();
    }
}
