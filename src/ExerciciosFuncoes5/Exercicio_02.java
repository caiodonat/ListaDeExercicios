package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_02 {

    static void repeticao(int numRepeticoes){
        for (int i=0; i<numRepeticoes; i++){
            for (int j=0; j<(i+1); j++){
                System.out.print((j+1) + " ");
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
