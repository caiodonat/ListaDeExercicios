package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex16_L1 {
    public static void main(String[] args) {int metrosLitros = 3;
        int lataLitros = 18;//3m - 1l
        float valorLata = 80f;// 9m - 3l
        int latasC = 1;

        System.out.println("Quantos metros quadrados deseja pintar?");
        Scanner myObj = new Scanner(System.in);
        float areaQuad = myObj.nextFloat();
        for (float litrosC =  (areaQuad/metrosLitros); litrosC>18; litrosC=(litrosC-18)){
            latasC = latasC + 1;
        }
        System.out.println("Latas necessarias: " + latasC + "\nTotal pela tinta: R$" + (latasC * valorLata));
    }
}
