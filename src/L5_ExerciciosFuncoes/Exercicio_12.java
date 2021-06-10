package L5_ExerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
    /*
    Scanner, String[], toUpperCase(Locale.ROOT), split(""), foreach
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = myScanner.nextLine();

        String[] palavraSplit = palavra.toUpperCase().split("");

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
