package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("primeiro numero");
        float numDigit1 = myObj.nextFloat();

        System.out.println("Segundo numero");
        float numDigit2 = myObj.nextFloat();

        System.out.println("Terceiro numero");
        float numDigit3 = myObj.nextFloat();

        System.out.println(somaNumeros(numDigit1, numDigit2, numDigit3));
    }

    static float somaNumeros(float num1, float num2, float num3) {

        return (num1 + num2 + num3);
    }
}
