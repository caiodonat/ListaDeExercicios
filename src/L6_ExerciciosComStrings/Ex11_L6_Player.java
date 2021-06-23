package L6_ExerciciosComStrings;

import java.io.IOException;
import java.util.Scanner;

public class Ex11_L6_Player {
    public static void main(String[] args) throws IOException {
        char letraDigitada;
        boolean finalizouPalavra = false,
                perdeuPalavra = false,
                finalizouJogo = false;

        Ex11_L6 ex11_L6 = new Ex11_L6();
        String diretorioListaPalavras = "/home/caio/Documents/GitHub/ListaDeExercicios/src/L6_ExerciciosComStrings/listaPalavras.txt";
        ex11_L6.selecionarPalavra(diretorioListaPalavras);
        ex11_L6.montarLetrasJaDigitadasSplitChar();
        ex11_L6.montarPalvraDescobertaSplit();
        Scanner myScn = new Scanner(System.in);


        while (!(ex11_L6.verificarChancesRestantes() || ex11_L6.verificarLetrasRestantes())){
            System.out.println("Digite uma letra");
            do {
                System.out.printf("Letras ja digitadas: %s", ex11_L6.letrasJaDigitadas());
                ex11_L6.montarPalvraDescobertaSplit();
                letraDigitada = myScn.next().charAt(0);
                if (ex11_L6.verificarSeLetraJaFoiDigitada(letraDigitada)){
                    System.out.println("Letra ja foi digitada anteriormente, digite outra letra");
                }
            }while (ex11_L6.verificarSeLetraJaFoiDigitada(letraDigitada));
            ex11_L6.adicionarLetrasJaDigitadas(letraDigitada);


            if (ex11_L6.verificarLetra(letraDigitada)){
                ex11_L6.atualizarEstrutura(letraDigitada);

            }



            if (finalizouPalavra){
                System.out.print("Parabens, voce Ganhou");
                finalizouJogo = true;
            }
            if (perdeuPalavra){
                System.out.print("Que pena, voce Perdeu");
                finalizouJogo = true;
            }
        }


    }


}
