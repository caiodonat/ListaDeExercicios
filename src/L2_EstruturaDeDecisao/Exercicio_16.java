package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        double[] numerosEqua = new double[3];
        char[] letrasEqua = {'A', 'B', 'C'};
        double delta, resultado1, resultado2 = 0;

        for (int i=0; i< numerosEqua.length; i++){
            System.out.println("Dite o valor de " + letrasEqua[i]);
            Scanner myObj = new Scanner(System.in);
            numerosEqua[i] = myObj.nextFloat();
            if (numerosEqua[0] == 0){
                System.out.println("A equação não é do segundo grau");
                break;
            }
        }//ax²+bx+c

        delta = (Math.pow(numerosEqua[1], 2)) - (4 * numerosEqua[0] * numerosEqua[2]);
        if (delta < 0){
            System.out.println("A equação não possui raizes reais");
        }else if (delta == 0){
            resultado1 = ((numerosEqua[1] * (-1)) + Math.sqrt(delta)) / 2 * numerosEqua[0];
            System.out.println("a equação possui apenas uma raiz real: " + resultado1);
        }else if (delta > 0){
            resultado1 = ((numerosEqua[1] * (-1)) + Math.sqrt(delta)) / 2 * numerosEqua[0];
            resultado2 = ((numerosEqua[1] * (-1)) - Math.sqrt(delta)) / 2 * numerosEqua[0];
            System.out.println("A equação possui duas raiz reais: " + resultado1 + ", " + resultado2);
        }
    }
}
