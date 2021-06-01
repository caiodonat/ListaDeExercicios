package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        float[] notas = new float[2];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno no " + (i + 1) + " trimestre");
            Scanner myObj = new Scanner(System.in);
            notas[i] = myObj.nextFloat();
        }
        float notaMedia = (notas[0] + notas[1]) / 2;
        //System.out.println("notaMedia: "+ notaMedia);


        int notaEUALetra = (int) notaMedia;
        //System.out.println("notaEUALetra: " +notaEUALetra);

        switch (notaEUALetra) {
            case 10: {
                System.out.print("S");
                break;
            }
            case 9: {
                System.out.print("A");
                break;
            }
            case 8: {
                System.out.print("B");
                break;
            }
            case 7: {
                System.out.print("C");
                break;
            }
            case 6: {
                System.out.print("D");
                break;
            }
            case 5: {
                System.out.print("E");
                break;
            }
            case 4: {
                System.out.print("F");
                break;
            }

        }

        int notaEUASimbolo = (int) ((notaMedia* 100) % 100);
        //System.out.println("notaEUASimbolo: " + notaEUASimbolo);

        if (notaEUASimbolo>=70){
            System.out.println("+");
        }else if(notaEUASimbolo>=45){
            System.out.println("");
        }else if(notaEUASimbolo>=0){
            System.out.println("-");
        }
    }
}
