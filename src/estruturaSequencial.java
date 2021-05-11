import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estruturaSequencial {

    public static void main(String[] args) {
        System.out.println("Digite o numero exemplo a ser executado.");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();

        switch (exemploRequerido) {

            case 1: {
                System.out.println("Alo Mundo");
            }
            case 2: {
                System.out.println("Digite um numero para ser exibido");
                Scanner myObj = new Scanner(System.in);
                int userName = myObj.nextInt();
                System.out.println("O número informado foi: " + userName);
            }
            case 3: {
                int[] numeros = new int[3];
                System.out.println("Digite 2 numeros para que sejam somados");
                Scanner myObj = new Scanner(System.in);
                for (int i=0; i< numeros.length; i++) {
                    numeros[i] = myObj.nextInt();
                }
                int nResultante = numeros[0] + numeros[1];
                System.out.println("Resultado da soma: " + nResultante);
            }
            case 4: {
                float[] numeros = new float[4];
                float nResultante = 0;
                System.out.println("Digite as 4 notas bimestrais");
                for (int i=0; i< numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextFloat();
                    nResultante =+ numeros[i];
                }
                System.out.println("Media dos quatro bimestres: " + nResultante);
            }
            case 5: {
                System.out.println("Digite a distancia em metros, para ser comvertida em centimetros");
                Scanner myObj = new Scanner(System.in);
                float metros = myObj.nextFloat();
                float centimetros = metros * 100;
                System.out.println("A distancia em metros e: " + centimetros);
            }
            case 6: {
                System.out.println("Digite o raio do circulo");
                Scanner myObj = new Scanner(System.in);
                float raio = myObj.nextFloat();
                double area = Math.PI * (raio * raio);
                System.out.println("Area do circulo: " + area);
            }
            case 7: {
                System.out.println("Digite o altura do quadrado");
                Scanner myObj = new Scanner(System.in);
                float altura = myObj.nextFloat();
                double areaQuadrada = 2 * (altura * altura);
                System.out.println("O dobro da area do quadrado: " + areaQuadrada);
            }
            case 8: {
                System.out.println("quanto você ganha por hora e o número de horas trabalhadas no mês?");
                Scanner myObj = new Scanner(System.in);
                float ganhoPHora = myObj.nextFloat();
                float Horas = myObj.nextFloat();
                double ganhoMes = ganhoPHora * Horas;

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM");
                String formattedDate = myDateObj.format(myFormatObj);

                System.out.println("Voce ganhara no mes de " + formattedDate + " o valor de: " + ganhoMes);
            }
            case 9: {
                System.out.println("Temperatura em Fahrenheit");
                Scanner myObj = new Scanner(System.in);
                float tempFah = myObj.nextFloat();
                float tempCel = 5 * ((tempFah-32) / 9);
                System.out.println("temperatura em graus Celsius: " + tempCel);
            }
            case 10: {
                System.out.println("Temperatura em graus Celcius");
                Scanner myObj = new Scanner(System.in);
                float tempCel = myObj.nextFloat();
                float tempFah = (tempCel * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + tempFah);
            }
        }
    }
}