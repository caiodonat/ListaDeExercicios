package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        System.out.println("Digite 3 numeros");
        Scanner myObj = new Scanner(System.in);
        float num1 = myObj.nextFloat();
        float num2 = myObj.nextFloat();
        float num3 = myObj.nextFloat();

        float numMaior1e2 = Math.max(num1, num2);
        float numMaiorF = Math.max(numMaior1e2, num3);

        float numMenor1e2 = Math.min(num1, num2); //Math.min(numeroA, numeroB) retorna o menor numero.
        float numMenorF = Math.min(numMenor1e2, num3);

        System.out.println(numMaiorF + ", é o Maior numero");
        System.out.println(numMenorF + ", é o Menor numero");
    }
}
