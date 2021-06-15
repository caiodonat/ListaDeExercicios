package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex17_L1 {
    public static void main(String[] args) {int metrosLitros = 6;
        int lataLitros = 18;
        float valorLata = 80.00f;
        float galaoLitros = 3.60f;
        float valorGalao = 25.00f;
        int latasC = 0;
        int galaoC = 0;

        System.out.println("Quantos metros quadrados deseja pintar?");
        Scanner myObj = new Scanner(System.in);
        float areaQuad = myObj.nextFloat();
        float litrosC = areaQuad/metrosLitros;

        do {
            if (lataLitros < litrosC) {
                latasC++;
                litrosC = litrosC - lataLitros;
            } else if (lataLitros > litrosC) {
                galaoC++;
                litrosC = litrosC - galaoLitros;
            }
        }while (litrosC > 0);

        System.out.println("Latas necessarias: " + latasC);
        System.out.println("Galoes necessarios: " + galaoC);
        System.out.println("Total pela tinta: R$ " + ((latasC * valorLata) + (galaoC * valorGalao)));
    }
}
