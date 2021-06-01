package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        double [][][] lojasProdutos = new double[4][3][2];//lojasProdutos[P][L]
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                System.out.println("Qual o valor do pruduto " + (j+1) + ", na Loja " + (i+1));
                Scanner myObj = new Scanner(System.in);
                lojasProdutos [j][i][0] = myObj.nextFloat();
            }
        }

        System.out.println();
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                for (int q=0; q<3; q++) {
                    lojasProdutos[i][j][1] = lojasProdutos[i][j][0] > lojasProdutos[i][q][0] ? lojasProdutos[i][j][1] + 1 : lojasProdutos[i][j][1];
                }
            }
        }

        for (int i=0; i<3; i++){//[P][L]
            System.out.println("Produtos na Loja " + (i+1) + ": ");
            for (int j=0; j<4; j++){
                if (lojasProdutos[j][i][1] == 0){
                    System.out.println("Produto " + (j+1) + ", Barato: R$" + lojasProdutos[j][i][0]);
                }else {
                    System.out.println("Produto " + (j+1) + ", Caro: R$" + lojasProdutos[j][i][0]);
                }
            }
        }
    }
}
