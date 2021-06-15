package StringMethods;

public class ReplaceAll {
    public static void main(String[] args) {//Poso substituir qualquer caractere (ou uma sequencia especifica)
        int num = 0;
        String fraseString = "  Ola, Mundo. 1 ";
        System.out.println(fraseString);
        System.out.println(fraseString.replaceAll("Mundo","World"));
        System.out.println(fraseString.replaceAll("1","12345"));
        System.out.println(fraseString.replaceAll(" ",""));
        System.out.println(fraseString.replaceAll(",","."));
    }
}
