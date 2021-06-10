package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        System.out.println("Digite uma letra");
        Scanner myObj = new Scanner(System.in);
        char letra = myObj.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + ", É uma vogal");
        } else {
            System.err.println(letra + ", É uma consoante");
        }
    }
}
