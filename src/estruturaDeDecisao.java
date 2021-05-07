import java.util.Scanner;

public class estruturaDeDecisao {

    public static void main(String[] args){
        System.out.println("Digite o numero exemplo a ser executado");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();

        switch (exemploRequerido) {
            case 1 -> {
                System.out.println("digite dois numeros");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                float numero2 = myObj.nextFloat();
                float resultado = Math.max(numero1, numero2);
                System.out.println("Maior numero é: " + resultado);
            }
            case 2 -> {
                System.out.println("Digite um numero");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                if (numero1 > 0) {
                    System.out.println(numero1 + ", è Positivo");
                } else {
                    System.out.println(numero1 + ", è Negativo");
                }
            }
            case 3 -> {
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
            case 4 -> {
                System.out.println("Digite uma letra");
                Scanner myObj = new Scanner(System.in);
                char letra = myObj.next().charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + ", É uma vogal");
                } else {
                    System.err.println(letra + ", É uma consoante");
                }
            }
            case 5 -> {

            }
        }
    }
}
