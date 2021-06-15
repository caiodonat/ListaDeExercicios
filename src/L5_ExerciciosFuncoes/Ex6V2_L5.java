package L5_ExerciciosFuncoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex6V2_L5 {
        public static void main(String[] args) throws ParseException {
            Scanner myScanner = new Scanner(System.in);
            String dateString3 = myScanner.next();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date date3 = sdf.parse(dateString3);
            SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm aa");
            System.out.println("Tempo em AM/PM: "+sdf2.format(date3));

    }
}
