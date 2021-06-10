package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        System.out.println("Em qual turma vc estuda?\nM-Matutino, V-Vespertino ou N-Noturno");
        Scanner myObj = new Scanner(System.in);
        char letraTurno = myObj.next().charAt(0);
        switch (letraTurno){
            case 'v': {
                System.out.println("Bom Dia!");
            }break;

            case 'm': {
                System.out.println("Boa Tarde!");
            }break;

            case 'n': {
                System.out.println("Boa Noite!");
            }break;

            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
