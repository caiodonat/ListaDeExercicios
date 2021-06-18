package L7_ExerciciosArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01_L7 {
    public static void main(String[] args) {
        try {
            File myFile = new File("File.txt");//crio um arquivo novo
            FileWriter myWritter = new FileWriter("File.txt");
            myWritter.write("Hello World, in File.txt");
            myWritter.close();
            System.out.println("Write Conclude");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
