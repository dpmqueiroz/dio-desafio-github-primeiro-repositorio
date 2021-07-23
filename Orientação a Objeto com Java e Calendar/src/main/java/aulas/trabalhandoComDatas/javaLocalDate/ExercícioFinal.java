package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class ExercícioFinal {
    public static void main(String[] args){

        // Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

        LocalDateTime data = LocalDateTime.of(2010,05, 05, 10,00,00,000);
        System.out.println("Data antes do exercício : "+data);

        System.out.println(data.plusYears(4).plusMonths(6).plusHours(13));

    }
}
