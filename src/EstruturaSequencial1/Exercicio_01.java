package EstruturaSequencial1;

public class Exercicio_01 {



    public static void main(String[] args) {
        int num = 1;
        int num2 = 2;
        float numPi = (float) 3.12345678910;
        double douPi = 3.12345678910;
        String hW = "Hello, World";
        String hello = "Hello,";
        String world = " World";

        System.out.println("Hello, World");
        System.out.print("Hello, World\n");
        System.out.printf("Hello, World%n");
        System.out.println("Hello," + " World");
        System.out.printf("%s%n", "Hello, World");
        System.out.printf("%s, %s%n", "Hello", "World");
        System.out.printf("%s%s %s%n", "Hello", ",", "World");
        System.out.printf("%s%n", hW);
        System.out.printf("%s%s%n", hello, world);

        System.out.println();

        System.out.println("Hello, World | " + num);
        System.out.print("Hello, World | " + num + "\n");
        System.out.printf("%s | %d%n", "Hello, World", num);

        System.out.println();

        System.out.println("Hello, World | " + 1);
        System.out.print("Hello, World | " + 1 + "\n");
        System.out.printf("%s | %d%n", "Hello, World", 1);

        System.out.println();

        System.out.println("Hello, World | " + 3.12345678910);
        System.out.println("Hello, World | " + numPi);
        System.out.print("Hello, World | " + numPi + "\n");
        System.out.printf("%s | %f%n", "Hello, World", numPi);
        System.out.printf("%s | %f%n", "Hello, World", douPi);
        System.out.printf("%s | %.10f%n", "Hello, World", numPi);
        System.out.printf("%s | %.11f%n", "Hello, World", douPi);

        System.out.println();

        System.out.println("Hello, World");
        System.out.println(num);
        System.out.println("Hello, World\n" + num);
        System.out.printf("%s%n%d%n", "Hello, World", num);

        System.out.println();

        System.out.print("Hello, World ");
        System.out.println(num);
        System.out.print("Hi, World ");
        System.out.println(num2);
        System.out.println("Hello, World " + num + "\nHi, World " + num2);
        System.out.printf("%s %d%n%s %d%n", "Hello, World", num, "Hi, World", num2);
        helloWorldNumeros(num, num2);

        System.out.println("");

        helloWorld();

        System.out.println();

        System.out.println("1   2   3   4   5   6");
        System.out.println("1\t2\t3\t4\t5\t6");
    }

    private static void helloWorld() {
        System.out.println("Hello, World");
    }
    private static void helloWorldNumeros(int num1, int num2) {
        System.out.println("Hello, World " + num1 + "\nHi, World " + num2);
    }
}
