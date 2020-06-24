package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Exer40 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date horario = null;
        try {
            horario = sdf.parse("24/06/2020 10:05:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimerTask tarefa = new TimerTask() {
            int contagem = 0;
            @Override
            public void run() {
                contagem++;
                System.out.println("Relatorio de vendas - " + sdf.format(new Date()));
                if(contagem == 5) {
                    this.cancel();
                    System.exit(0);
                }
            }
        };
        Timer t = new Timer();
        t.schedule(tarefa,horario,10000);
        System.out.println("Agendamento feito com sucesso.");
    }
}
