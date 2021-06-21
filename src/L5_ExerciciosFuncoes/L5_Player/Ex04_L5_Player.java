package L5_ExerciciosFuncoes.L5_Player;

/*
1.solicito um numero real (numero negativo;-1,-123 && fação numerica; 1/3, -1/3)
2.chamo o metodo (positivoOuNegativo) com "numero real" como parametro
3.faço (dentro do metodo) a comparacao ("numero real" > 0 = positivo | "numero real" < 0 = negativo | "numero real" == 0 = 0)
 */

import L5_ExerciciosFuncoes.Ex04_L5;

import java.util.Scanner;

public class Ex04_L5_Player {

    public static void main(String[] args) {
        Ex04_L5 exer04 = new Ex04_L5();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Digite um \"numero real\"; ");
        float numeroDigitado = myScanner.nextFloat();

        exer04.Ex_04_L5_Core(numeroDigitado);

        System.out.printf("Numero è %s", exer04.getMensagemFinal());
    }
}
