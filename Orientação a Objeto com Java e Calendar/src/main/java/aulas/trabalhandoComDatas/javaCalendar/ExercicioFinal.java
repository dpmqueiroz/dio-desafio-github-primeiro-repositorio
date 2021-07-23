package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class ExercicioFinal {
    public static void main(String[] args) {

        Calendar dataHoje = Calendar.getInstance();
        System.out.println(dataHoje.getTime());
        dataHoje.add(Calendar.DATE, 10);
        System.out.println("A data de vencimento deveria ser: " + dataHoje.getTime());

        while(dataHoje.getTime().getDay() == 0 || dataHoje.getTime().getDay() == 6){
            dataHoje.add(Calendar.DATE, 1);
        }

        System.out.println("A data de vencimento da conta é : "+dataHoje.getTime());
    }
}
