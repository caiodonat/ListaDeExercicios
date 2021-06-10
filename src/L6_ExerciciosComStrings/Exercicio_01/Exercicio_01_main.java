package L6_ExerciciosComStrings.Exercicio_01;

import java.util.Scanner;

public class Exercicio_01_main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Digite a primeira String%n");
        String primeiraString = myScanner.nextLine();

        System.out.printf("Digite a segunda String%n");
        String segundaString = myScanner.nextLine();

        //"Menu"
        System.out.printf("Comparando as duas String%n");
        System.out.printf("Primeira String: %s%n", primeiraString);
        System.out.printf("Segunda String: %s%n", segundaString);

        System.out.printf("Tamanha de \"%s\": %d caracteres%n", primeiraString, primeiraString.length());
        System.out.printf("Tamanha de \"%s\": %d caracteres%n", segundaString, segundaString.length());

        if (primeiraString.length() != segundaString.length()){
            System.out.printf("As duas strings são de tamanhos diferentes.%n");
        }else {
            System.out.printf("As duas strings são de tamanhos iguais.%n");
        }

        if (primeiraString.intern().equals(segundaString.intern())){
            System.out.printf("As duas strings possuem conteúdo iguais.%n");
        }else {
            System.out.printf("As duas strings possuem conteúdo diferente.%n");
        }
    }
}
