import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estruturaSequencial {

    public static void end(){
        System.out.println("* * * * * * * * * * * *");
    }

    public static void main(String[] args) {
        System.out.println("Digite o numero exemplo a ser executado.");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();

        switch (exemploRequerido) {

            case 1: {
                System.out.println("* * * Exemplo 01 * * *\n");

                System.out.println("Alo Mundo");

                end();
            }
                break;

            case 2: {
                System.out.println("\n* * * Exemplo 02 * * *\n");

                System.out.println("Digite um numero para ser exibido");
                Scanner myObj = new Scanner(System.in);
                int userName = myObj.nextInt();
                System.out.println("O número informado foi: " + userName);

                end();
            }
                break;

            case 3: {
                System.out.println("* * * Exemplo 03 * * *\n");

                System.out.println("Digite 2 numeros para que sejam somados");
                Scanner myObj = new Scanner(System.in);
                int numero1 = myObj.nextInt();
                int numero2 = myObj.nextInt();
                int nResultante = numero1 + numero2;
                System.out.println("Resultado da soma: " + nResultante);
                end();
            }
                break;

            case 4: {
                System.out.println("* * * Exemplo 04 * * *\n");

                System.out.println("Digite as 4 notas bimestrais");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                float numero2 = myObj.nextFloat();
                float numero3 = myObj.nextFloat();
                float numero4 = myObj.nextFloat();
                float nResultante = (numero1 + numero2 + numero3 + numero4) / 4;
                System.out.println("Media dos quatro bimestres: " + nResultante);
                end();
            }
                break;

            case 5: {
                System.out.println("Digite a distancia em metros, para ser comvertida em centimetros");
                Scanner myObj = new Scanner(System.in);
                float metros = myObj.nextFloat();
                float centimetros = metros * 100;
                System.out.println("A distancia em metros e: " + centimetros);

                end();
            }
                break;

            case 6: {
                System.out.println("Digite o raio do circulo");
                Scanner myObj = new Scanner(System.in);
                float raio = myObj.nextFloat();
                double area = Math.PI * (raio * raio);
                System.out.println("Area do circulo: " + area);

                end();
            }
                break;

            case 7: {
                System.out.println("Digite o altura do quadrado");
                Scanner myObj = new Scanner(System.in);
                float altura = myObj.nextFloat();
                double areaQuadrada = 2 * (altura * altura);
                System.out.println("O dobro da area do quadrado: " + areaQuadrada);

                end();
            }
                break;

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

                end();
            }
                break;

            case 9: {
                System.out.println("Temperatura em Fahrenheit");
                Scanner myObj = new Scanner(System.in);
                float tempFah = myObj.nextFloat();
                float tempCel = 5 * ((tempFah-32) / 9);
                System.out.println("temperatura em graus Celsius: " + tempCel);
                end();
            }
                break;

            case 10: {
                System.out.println("Temperatura em graus Celcius");
                Scanner myObj = new Scanner(System.in);
                float tempCel = myObj.nextFloat();
                float tempFah = (tempCel * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + tempFah);
                end();
            }
                break;
        }
    }
}