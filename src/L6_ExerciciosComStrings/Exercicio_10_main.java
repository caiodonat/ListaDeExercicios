package L6_ExerciciosComStrings;

import java.util.Scanner;

public class Exercicio_10_main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numeto ate 99");
        int numeroDigitado = myScanner.nextInt();
        if (numeroDigitado <= 10){
            System.out.println(unidade(numeroDigitado));
        }else if (numeroDigitado >= 11 && numeroDigitado <= 19){
            System.out.println(dezenaDez(numeroDigitado));
        }else if (numeroDigitado >= 20){
            System.out.print(dezena(numeroDigitado / 10) + " e ");
            System.out.println(unidade(numeroDigitado % 10));
        }
    }

    private static String dezenaDez(int numero) {
        String String;
        switch (numero){
            case 11 -> {
                String = "Onze";
            }
            case 12 -> {
                String = "Doze";
            }
            case 13 -> {
                String = "Treze";
            }
            case 14 -> {
                String = "Quatorze";
            }
            case 15 -> {
                String = "Quinze";
            }
            case 16 -> {
                String = "Dezeseis";
            }
            case 17 -> {
                String = "Dezessete";
            }
            case 18 -> {
                String = "Dezoito";
            }
            case 19 -> {
                String = "Dezenove";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return String;
    }

    private static String dezena(int numero) {
        String string;
        switch (numero){
            case 2 -> {
                string = "Vinte";
            }
            case 3 -> {
                string = "Trinta";
            }
            case 4 -> {
                string = "Quarenta";
            }
            case 5 -> {
                string = "Cinquenta";
            }
            case 6 -> {
                string = "Sesenta";
            }
            case 7 -> {
                string = "Setenta";
            }
            case 8 -> {
                string = "Oitenta";
            }
            case 9 -> {
                string = "Noventa";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return string;
    }

    private static String unidade(int numero) {
        String string;
        switch (numero){
            case 1 -> {
                string = "um";
            }
            case 2 -> {
                string = "dois";
            }
            case 3 -> {
                string = "tres";
            }
            case 4 -> {
                string = "Quatro";
            }
            case 5 -> {
                string = "Cinco";
            }
            case 6 -> {
                string = "Seis";
            }
            case 7 -> {
                string = "Sete";
            }
            case 8 -> {
                string = "Oito";
            }
            case 9 -> {
                string = "Nove";
            }
            case 10 -> {
                string = "Dez";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return string;
    }
}
