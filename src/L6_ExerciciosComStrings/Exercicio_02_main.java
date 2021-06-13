package L6_ExerciciosComStrings;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Exercicio_02_main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeUsuario = myScanner.nextLine();

        StringBuilder nomeUBulder = new StringBuilder();
        nomeUBulder.append(nomeUsuario).reverse();
        String nomeURevers = String.valueOf(nomeUBulder);

        System.out.print(String.valueOf(nomeUBulder));
    }
}
