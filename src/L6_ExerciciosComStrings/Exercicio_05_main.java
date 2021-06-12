package L6_ExerciciosComStrings;

import java.util.Scanner;

public class Exercicio_05_main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = myScanner.nextLine();

        String[] palavraSplit = palavra.toUpperCase().split("");

        for (int i=palavraSplit.length; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print(palavraSplit[j]);
            }
            System.out.println();
        }

    }
}
