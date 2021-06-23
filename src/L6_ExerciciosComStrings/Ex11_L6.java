package L6_ExerciciosComStrings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex11_L6 {
    private char[] palavraOrigialSplit;
    private char[] palavraDescobertaSplit;
    private char[] letrasJaDigitadasSplitChar;
    private int chancesRestantes;
    private int letrasRestantes;
    private StringBuilder letrasJaDigitadasSB = new StringBuilder();

    public void selecionarPalavra(String diretorioFile) throws IOException {
        Path caminho = Paths.get(diretorioFile);
        List<String> palavras = Files.readAllLines(caminho);
        int random = (int) (Math.random()*palavras.size());
        String palavraString = palavras.get(random);
        palavraString.getChars(0, palavraString.length(), this.palavraOrigialSplit, 0);
        this.letrasRestantes = this.palavraOrigialSplit.length;
        this.chancesRestantes = this.palavraOrigialSplit.length;
    }

    public boolean verificarLetra(char letraDigitada){
        for (char letraArray : this.palavraOrigialSplit) {
            if (letraArray == letraDigitada) {
                this.letrasRestantes--;

                return true;
            }
        }
        return false;
    }

    public boolean verificarLetrasRestantes(){
        if (this.letrasRestantes == 0){
            return true;
        }
        return false;
    }

    public boolean verificarChancesRestantes(){
        if (this.chancesRestantes == 0){
            return true;
        }
        return false;
    }

    public void menosChancesRestantes(){
        this.chancesRestantes--;
    }

    public void atualizarLetrasRestantes(){//finalizar
        this.letrasRestantes = this.palavraOrigialSplit.length - this.palavraDescobertaSplit
    }

    public void adicionarLetrasJaDigitadas(char letraDigitada){
        this.letrasJaDigitadasSB.append(letraDigitada).append(", ");
    }

    public String letrasJaDigitadas(){
        return String.valueOf(this.letrasJaDigitadasSB);
    }

    public boolean verificarSeLetraJaFoiDigitada(char letraDigitada){
        for (char letraArray : this.letrasJaDigitadasSplitChar) {
            if (letraArray == letraDigitada) {
                return true;
            }
        }
        return false;
    }

    public void montarLetrasJaDigitadasSplitChar(){
        String letrasJaDigitadasS = String.valueOf(this.letrasJaDigitadasSB).replaceAll(", ", "");
        letrasJaDigitadasS.getChars(0, letrasJaDigitadasS.length(), this.letrasJaDigitadasSplitChar, 0);
    }

    public void montarPalvraDescobertaSplit() {

        for (int i = 0; i<this.palavraOrigialSplit.length; i++){

            for (char letrasO : this.palavraOrigialSplit){
                for (char letrasD : this.letrasJaDigitadasSplitChar){
                    if (letrasO == letrasD){
                        System.out.print(letrasO);
                    }else{
                        System.out.print("_");
                    }
                }
            }

        }
    }

    public void atualizarEstrutura(char letraDigitada){


    }
}
