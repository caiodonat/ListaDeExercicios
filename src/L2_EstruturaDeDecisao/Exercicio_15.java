package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        float[] lados = new float[3];
        int ladosIguais = 0;

        for (int i=0;  i<lados.length; i++){
            System.out.println("Tamanho do lado numero " + (i+1));
            Scanner myObj = new Scanner(System.in);
            lados[i] = myObj.nextFloat();
        }
        for (int i=0;  i<lados.length; i++){
            for (int j=0;  j<lados.length; j++){

                if (j == i){
                }else if (j != i){
                    if (lados[i] == lados[j]) {
                        ladosIguais++;
                    }
                }
            }
        }
        switch (ladosIguais){
            case 0: {
                System.out.println("Triângulo Escaleno");
                break;
            }
            case 2: {
                System.out.println("Triângulo Isósceles");
                break;
            }
            case 6: {
                System.out.println("Triângulo Equilátero");
                break;
            }
        }
        System.out.println(ladosIguais);//0Ig= 0, 2Ig= 2, 3Ig = 6.
    }
}
