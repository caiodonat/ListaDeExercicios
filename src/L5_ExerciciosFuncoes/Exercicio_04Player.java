package L5_ExerciciosFuncoes;

/*
1.solicito um numero real (numero negativo;-1,-123 && fação numerica; 1/3, -1/3)
2.chamo o metodo (positivoOuNegativo) com "numero real" como parametro
3.faço (dentro do metodo) a comparacao ("numero real" > 0 = positivo | "numero real" < 0 = negativo | "numero real" == 0 = 0)
 */

import L5_ExerciciosFuncoes.Ex_04_L5_Core;

import java.util.Scanner;

public class Exercicio_04Player {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Ex_04_L5_Core exer04 = new Ex_04_L5_Core();

        System.out.print("Digite um \"numero real\"; ");
        float numeroDigitado = myScanner.nextFloat();

        exer04.Ex_04_L5_Core(numeroDigitado);

        System.out.printf("Numero è %s", exer04.getMensagemFinal());
    }
}
