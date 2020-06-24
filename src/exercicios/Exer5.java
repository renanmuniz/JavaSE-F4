package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exer5 {
    public static void main(String[] args) {
        String texto = "10/10/2015";

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            Date data = sdf.parse(texto);
            System.out.println(data);
        }catch(Exception e){
            e.printStackTrace();
        }

        texto = "25/12/2015 22:30:59";
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try{
            Date data = sdf.parse(texto);
            System.out.println(data);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
