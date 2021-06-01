package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        float[] numeros = new float[2];
        System.out.println("digite dois numeros");
        for (int i=0; i<numeros.length; i++){
            Scanner myObj = new Scanner(System.in);
            numeros[i] = myObj.nextFloat();
        }
        float resultado = Math.max(numeros[0],numeros[1]);
        System.out.println("Maior numero é: " + resultado);
    }
}
