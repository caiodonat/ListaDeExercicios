package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        float[] numDigitados = new float[3];
        for (int i = 0; i< numDigitados.length; i++){
            System.out.println((i+1) + " numero");
            Scanner myObj = new Scanner(System.in);i
            numDigitados[i] = myObj.nextFloat();
        }
        somaNumeros(numDigi1, numDigitados[1], numDigitados[2]);
    }

    private static void somaNumeros(float numDigitado, float numDigitado1, float numDigitado2) {

    }
}
