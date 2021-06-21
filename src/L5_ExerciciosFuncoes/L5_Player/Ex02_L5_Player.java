package L5_ExerciciosFuncoes.L5_Player;

import L5_ExerciciosFuncoes.Ex01_L5;
import L5_ExerciciosFuncoes.Ex02_L5;

import java.util.Scanner;

public class Ex02_L5_Player {
    public static void main(String[] args) {
        Scanner myScr = new Scanner(System.in);
        int numeroDeRepeticoes = myScr.nextInt();
        Ex02_L5 ex02_L5 = new Ex02_L5();
        String estruturaS = ex02_L5.montarEstrutura(numeroDeRepeticoes);
        System.out.print(estruturaS);
    }
}
