package L5_ExerciciosFuncoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex6V2_L5 {
        public static void main(String[] args) throws ParseException {
            do {
                Scanner myScanner = new Scanner(System.in);
                System.out.println("Digite um horaio, no formato 24 horas (14:30, 12:25, 02:05)");
                String dateString3 = myScanner.next();

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//23.40
                Date date3 = sdf.parse(dateString3);

                SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm aa");
                System.out.println("Tempo em AM/PM: " + sdf2.format(date3));
            }while ()
    }
}