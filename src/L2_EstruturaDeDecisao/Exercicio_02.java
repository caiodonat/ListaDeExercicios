package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        System.out.println("Digite um numero");
        Scanner myObj = new Scanner(System.in);
        float numero1 = myObj.nextFloat();
        if (numero1 > 0) {
            System.out.println(numero1 + ", è Positivo");
        } else {
            System.out.println(numero1 + ", è Negativo");
        }
    }
}
