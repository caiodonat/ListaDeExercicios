package L5_ExerciciosFuncoes;

import java.util.Scanner;
/*
L = Linha | C = Coluna
  |1C|2C|3C
1L|01.
2L|01.02.
3L|01.02.03.

nesse caso o numero exibido começa com 1, e vai ate o numero da linha; linha 1 = 01, linha 2 = 01.02, linha 3 = 01.02.03
 */
public class Exercicio_02 {

    static void repeticao(int numRepeticoes){
        for (int i=0; i<numRepeticoes; i++){
            for (int j=0; j<(i+1); j++){//o 'J' sempre começa com 1 ((j=0) + 1)
                System.out.print((j+1) + " ");//inves de exibir o I exibimos o J
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o numero de repetições");
        int numRepeti = myObj.nextInt();
        repeticao(numRepeti);
    }
}
