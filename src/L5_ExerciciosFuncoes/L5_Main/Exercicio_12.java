package L5_ExerciciosFuncoes.L5_Main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = myScanner.nextLine();

        String[] palavraSplit = palavra.split("");

        for (String letras : palavraSplit){
            System.out.print(letras);
        }

        /*
        for (int i=0; i< palavraSplit.length; i++){
            System.out.println(palavraSplit[i]);
        }
         */
    }
}
