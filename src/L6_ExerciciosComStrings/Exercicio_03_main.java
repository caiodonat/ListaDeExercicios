package L6_ExerciciosComStrings;

public class Exercicio_03_main {
    public static void main(String[] args) {

        java.util.Scanner myScanner = new java.util.Scanner(System.in);
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
