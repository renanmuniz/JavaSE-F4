package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Exer39 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date horario = null;
        try {
            horario = sdf.parse("23/06/2020 17:47:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Gerando relatorio financeiro em pdf - " + sdf.format(new Date()));
            }
        };
        Timer t = new Timer();
        t.schedule(tarefa,horario);
        System.out.println("Agendamento feito com sucesso.");
    }
}
