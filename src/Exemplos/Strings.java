package Exemplos;

public class Strings {
    public static void main(String[] args) {
        replaceAll();
    }

    public static void trim() {//Remove os 'espaços em branco' do inicio e do fim (mas no meio) da String
        String fraseString = "  Ola, Mundo.  ";
        System.out.printf(fraseString);
        System.out.printf("Quantidade de caracteres: %s%n", fraseString);
        System.out.printf(fraseString.trim());
        System.out.printf("Quantidade de caracteres: %s%n", fraseString.trim());
    }
    public static void replaceAll(){//Poso substituir qualquer caractere (ou uma sequencia especifica)
        String fraseString = "  Ola, Mundo. 1 ";
        System.out.println(fraseString);
        System.out.println(fraseString.replaceAll("Mundo","World"));
        System.out.println(fraseString.replaceAll("1","12345"));
        System.out.println(fraseString.replaceAll(" ",""));
        System.out.println(fraseString.replaceAll(",","."));
    }
}
