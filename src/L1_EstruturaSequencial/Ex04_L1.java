package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex04_L1 {
    public static void main(String[] args) {
        float[] numeros = new float[4];
        float nResultante = 0;
        System.out.println("Digite as 4 notas bimestrais");
        for (int i=0; i< numeros.length; i++){
            Scanner myObj = new Scanner(System.in);
            numeros[i] = myObj.nextFloat();
            nResultante =+ numeros[i];
        }
        System.out.println("Media dos quatro bimestres: " + nResultante);
    }
}
