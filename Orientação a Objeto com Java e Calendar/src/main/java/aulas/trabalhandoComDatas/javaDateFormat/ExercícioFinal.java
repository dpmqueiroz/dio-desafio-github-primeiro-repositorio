package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercícioFinal {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS:mmm a");

        String data = formatter.format(agora);
        System.out.println(data);

    }
}
