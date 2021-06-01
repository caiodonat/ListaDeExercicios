package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        System.out.println("Escolha entre 'M' ou 'F'");
        Scanner myObj = new Scanner(System.in);
        char letraSx = myObj.next().charAt(0); //metodo para agregar á variaveis tipo "Char"
        if (letraSx == 'M' || letraSx == 'm') {
            System.out.println("Masculino");
        } else if (letraSx == 'F' || letraSx == 'f') {
            System.out.println("Feminino");
        } else {
            System.err.println("Sexo inválido");
        }
    }
}
