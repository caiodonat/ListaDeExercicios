package L5_ExerciciosFuncoes;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        String numeroInteiro = String.valueOf(myScanner.nextInt());
        String[] quantidadeDeDigitos = numeroInteiro.split("");
        System.out.println("Quantidade de digitos do numedo informado: " + quantidadeDeDigitos.length);
    }
}
