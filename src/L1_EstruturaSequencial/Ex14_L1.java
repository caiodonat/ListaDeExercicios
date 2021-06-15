package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex14_L1 {
    public static void main(String[] args) {System.out.println("Quantos quilos de peixe?");
        Scanner myObj = new Scanner(System.in);
        float quilosP = myObj.nextFloat();
        if (quilosP > 50){
            float excesso = (quilosP - 50);
            System.out.println(excesso + " Kg, multa de R$ " + (excesso*4));
        }else{
            System.out.println("Nao havera multa em sua mercadoria.");
        }

    }
}
