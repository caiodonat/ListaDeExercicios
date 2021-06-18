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

    public void criarFile(String nameFile) throws IOException {
        File myFile = new File(nameFile + ".txt");
        myFile.createNewFile();
        this.nameFileP = nameFile;
    }

    public void escreverEmFile(String texto) throws  IOException{
        FileWriter myWritter = new FileWriter(this.nameFileP + ".txt");
        myWritter.write(texto);
        myWritter.close();
    }

    public void deletarFile(String diretorioDoArquivo) throws IOException{
        File myFile = new File(diretorioDoArquivo + ".txt");
        myFile.delete();
    }

    public List<String> lerFile(String diretorioDoArquivo) throws IOException{
        Path caminho = Paths.get(diretorioDoArquivo + ".txt");
        List<String> linhas = Files.readAllLines(caminho);
        return linhas;
    }

}
