package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exer4 {
    public static void main(String[] args) {
        Date data1 = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("dd/MM/yy");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("HH:mm");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("HH:mm:ss");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("EEEEEEEEEEEEEEEEEE, MMMMMMMMMMMM d, YYYY.");
        texto = sdf.format(data1);
        System.out.println(texto);

        sdf = new SimpleDateFormat("'Londrina', d 'de' MMMMMMMMMMMM 'de' YYYY.");
        texto = sdf.format(data1);
        System.out.println(texto);

    }
}
