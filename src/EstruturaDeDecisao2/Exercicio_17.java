package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        System.out.println("Qual ano?");
        Scanner myObj = new Scanner(System.in);
        int anoDigitado = myObj.nextInt();
        int tudoCerto = 0;
        int anoDezena = (anoDigitado % 100);

        if (anoDezena == 0){
            System.out.println("Dezena = '00'");
            float anoPor400Float = anoDigitado;
            int anoPor400Int = anoDigitado;

            if ((anoPor400Float / 400) == (anoPor400Int / 400)){
                tudoCerto++;
                System.out.println("Dezena divisivel por 400");
            }else {
                System.out.println("Dezena NAO divisivel por 400");
            }

        }else if(anoDezena != 0){
            System.out.println("Dezena != '00'");
            float anoPor4Float = anoDigitado;
            int anoPor4Int = anoDigitado;

            if ((anoPor4Float / 4) == (anoPor4Int / 4)){
                System.out.println("Ano divisivel por 4");
                tudoCerto++;
            }else {
                System.out.println("Ano NAO divisivel por 4");
            }
        }

        float anoDAnoPor4Float = anoDigitado;
        int anoDAnoPor4Int = anoDigitado;

        if ((anoDAnoPor4Float / 4) == (anoDAnoPor4Int / 4)){
            tudoCerto++;
            System.out.println("Ano divisivel por 4");
        }else {
            System.out.println("Ano NAO divisivel por 4");
        }

        float anoDDezenaPor4Float = anoDezena;
        int anoDDezenaPor4Int = anoDezena;

        if ((anoDDezenaPor4Float / 4) == (anoDDezenaPor4Int / 4)){
            System.out.println("Dezena divisivel por 4");
            tudoCerto++;
        }else {
            System.out.println("Dezena NAO divisivel por 4");
        }


        //Verificação final dos teste
        System.out.println("\n" + tudoCerto);
        if (tudoCerto == 3){
            System.out.println(anoDigitado + " è um ano bissexto");
        }else {
            System.out.println(anoDigitado + " NAO è um ano bissexto");
        }
    }
}
