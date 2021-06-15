package StringMethods;

public class Trim {
    public static void main(String[] args) {//Remove os 'espaços em branco' do inicio e do fim (mas no meio) da String
        String fraseString = "  Ola, Mundo.  ";
        System.out.print(fraseString);
        System.out.printf("Quantidade de caracteres: %s%n", fraseString);
        System.out.print(fraseString.trim());
        System.out.printf("Quantidade de caracteres: %s%n", fraseString.trim());

    }
}
