import java.util.Scanner;

public class estruturaDeRepeticao {
    public static void main(String[] args){
        System.out.println("Seja muito bem vindo ha nossa 3 lista de exercicios,\nQual exemplo vc deseja reproduzir?");
        Scanner numeroDigitado = new Scanner(System.in);
        int myExemplos = numeroDigitado.nextInt();

        switch (myExemplos){
            case 1: {
                boolean numDigBoolean = false;

                do {
                    System.out.println("Digite uma nota entre 0 ate 10;");
                    Scanner myObj = new Scanner(System.in);
                    int numDig = myObj.nextInt();

                    for (int i=0; i>10; i++){
                        System.out.println(i);
                        if (numDig == i){
                            System.out.println("Valor valido, parabens.");
                        }
                    }
                    System.out.println("Numero Invalido, por favor tente novamente.");
                } while (numDigBoolean);

            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + myExemplos);
        }
    }
}
