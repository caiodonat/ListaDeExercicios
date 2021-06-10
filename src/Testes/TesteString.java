package Testes;

import java.util.Scanner;

public class TesteString {
    public static void main(String[] args) {

        String variavel1 = "ab";
        String st1 = variavel1.intern();

        String variavel2 = "Ab";
        String st2 = variavel2.intern();

        variavel1 = "ab1";

        System.out.println(st1);
        System.out.println(st2);
        if (st1 == st2){
            System.out.print("Deu certo");
        }

        /*
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Digite.");
        String comando = myScanner.nextLine();
        System.out.print(comando);
        //System.out.print("Funciona?");
         */
    }
}
