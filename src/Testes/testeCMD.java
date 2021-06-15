package Testes;

public class testeCMD {
    public static void main(String[] args) {
        int num =1;
        while (true){
            num = num + 1;
            System.out.println(num);
        }
    }

    public static void formulador  (String stringInput1, String stringInput2){
        System.out.println("String 1: " + stringInput1);
        System.out.println("String 2: " + stringInput2);
        System.out.println("Tamanho de " + "'" + stringInput1 + "':" + stringInput1.length() + " caracteres");
        System.out.println("Tamanho de " + "'" + stringInput2 + "':" + stringInput2.length() + " caracteres");

        System.out.printf("Tamanho de '%s': %d caracteres", stringInput2, stringInput2.length());
    }
}
