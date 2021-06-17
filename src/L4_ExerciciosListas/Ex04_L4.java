package L4_ExerciciosListas;

import java.util.Scanner;

public class Ex04_L4 {
    public static void main3(String[] args) {
        char[] letrasScanner = new char[10];
        char[] letrasVogais = {'a', 'e', 'i', 'o', 'u'};
        int vogaisSoma = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Escreva uma sequancia de letras (Ex: abcde...)");
        String sequanciaLetras = myScanner.nextLine();

        for(int i=0; i<letrasScanner.length; i++){
            letrasScanner[i] = myScanner.next().charAt(0);
        }
        for (int i=0; i<letrasScanner.length; i++){
            for (int j=0; j<5; j++){
                if (letrasScanner[i] == letrasVogais[j]) {
                    letrasScanner[i] = ' ';//Ganbiara
                    vogaisSoma++;
                }
            }
        }
        for (int i=0; i<letrasScanner.length; i++){
            if (letrasScanner[i] != ' ') {
                System.out.print(letrasScanner[i] + ", ");
            }
        }
        System.out.println("Total de Consoantes: " + (10-vogaisSoma));
    }

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Escreva uma sequancia de letras (Ex: abcde...)");
        String sequanciaLetras = myScanner.nextLine();

        String sequanciaLetrasSemVogais = sequanciaLetras.replaceAll("[aeiou]","");

        if (sequanciaLetras.length() != sequanciaLetrasSemVogais.length()){
            System.out.printf("1: %d, 2: %d", sequanciaLetras.length(), sequanciaLetrasSemVogais.length());
        }else{
            System.out.println("deu ruim");
        }
    }
}
