package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex03_L1 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        System.out.println("Digite 2 numeros para que sejam somados");
        Scanner myObj = new Scanner(System.in);
        for (int i=0; i< numeros.length; i++) {
            numeros[i] = myObj.nextInt();
        }
        int nResultante = numeros[0] + numeros[1];
        System.out.println("Resultado da soma: " + nResultante);
    }
}
