package L6_ExerciciosComStrings;

import java.util.Scanner;

public class Exercicio_03_main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = myScanner.nextLine();

        String[] palavraSplit = palavra.toUpperCase().split("");

        for (String letras : palavraSplit){
            System.out.println(letras);
        }

        /*
        for (int i=0; i< palavraSplit.length; i++){
            System.out.println(palavraSplit[i]);
        }
         */
    }
}
