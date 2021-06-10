package L5_ExerciciosFuncoes;

import java.util.Scanner;
/*
1.numero de linhas NAO pode ser maior que o numero digitado
//a quantidade de numeros (colunas) em cada linhas nao pode utrapassar o numero da linha (C nunca pode chegar ser maio que L, C<L)

L = Linha | C = Coluna
  |1C|2C|3C
1L|01.
2L|02.02.
3L|03.03.03.

a logica é essa: o numero que sera exibido é o numero da linha,
 */
public class Exercicio_01 {

    public void repeticao(int numRepeticoes){
        for (int i=0; i<numRepeticoes; i++){//Variavel 'i' equivale ao numero de linhas (i = L)
            for (int j=0; j<(i+1); j++){//Variavel 'j' equivale ao numero de colunas (j = C)
                System.out.print((i+1) + " ");//ja que i=0, é necessario somar +1 para que o numero exibido
                // seja coerente ao numero da linha
            }//se usa 'print', NAO 'println', pois o 'ln' indica quebra de linha, mas so queremos que haja
            // quebra de linha quando a quantidade de numeros exibidos na linha for igual ao numero da linha (i == j)
            System.out.println();
        }
    }

    public void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o numero de repetições");
        int numRepeti = myObj.nextInt();
        repeticao(numRepeti);
    }
}
