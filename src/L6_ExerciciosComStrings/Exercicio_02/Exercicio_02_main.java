package L6_ExerciciosComStrings.Exercicio_02;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Exercicio_02_main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Digite seu nome%n");
        String nomeUsuario = myScanner.nextLine();

        StringBuilder nomeUBulder = new StringBuilder();
        nomeUBulder.append(nomeUsuario).reverse();
        String nomeURevers = String.valueOf(nomeUBulder);

        System.out.printf(nomeURevers);
    }
}
