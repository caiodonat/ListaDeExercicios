package ExerciciosFuncoes5;

/*
1.solicito um numero real (numero negativo;-1,-123 && fação numerica; 1/3, -1/3)
2.chamo o metodo (positivoOuNegativo) com "numero real" como parametro
3.faço (dentro do metodo) a comparacao ("numero real" > 0 = positivo | "numero real" < 0 = negativo | "numero real" == 0 = 0)
 */

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        System.out.println("Digite um numero");//1 - Começo
        Scanner myScanner = new Scanner(System.in);
        float numeroDigitado = myScanner.nextFloat();//1 - Fim
        positivoOuNegativo(numeroDigitado);//2
    }

    private static void positivoOuNegativo(float numeroDigitado) {
        if (numeroDigitado > 0){//3 -Começo
            System.out.println("Numero Positivo");
        }else if (numeroDigitado < 0){
            System.out.println("Numero Negativo");
        }else {
            System.out.println("Numero = 0");
        }//3 - Fim
    }
}
