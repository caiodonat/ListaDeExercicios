package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        System.out.println("Digite a primeira notas parciais");
        Scanner lNotaParc1 = new Scanner(System.in);
        float notaParc1 = lNotaParc1.nextFloat();

        System.out.println("Digite a segunda notas parciais");
        Scanner lNotaParc2 = new Scanner(System.in);
        float notaParc2 = lNotaParc2.nextFloat();

        float media = (notaParc1 + notaParc2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else  if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}
