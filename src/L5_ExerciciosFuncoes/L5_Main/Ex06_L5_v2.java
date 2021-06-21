package L5_ExerciciosFuncoes.L5_Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex06_L5_v2 {
    public static void main(String[] args) throws ParseException {
        String dataString;
        System.out.println("Digite um horaio, no formato 24 horas (HH:mm, 12:25, 02:05)");
        Scanner myScanner = new Scanner(System.in);
        do {
            dataString = myScanner.next();

            if (formatacaoData(dataString)){
                break;
            }else {
                System.out.println("Horario nao esta na formatação correta (HH:mm)");
            }

        }while (!formatacaoData(dataString));

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//23.40
        Date date3 = sdf.parse(dataString);

        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm aa");
        System.out.println("Tempo em AM/PM: " + sdf2.format(date3));
    }

    private static boolean formatacaoData(String dataString) {
        String[] dataStringSplit = dataString.split("");
        return dataStringSplit[2].equals(":");
    }


}