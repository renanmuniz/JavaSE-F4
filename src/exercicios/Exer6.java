package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exer6 {
    public static void main(String[] args) {
        String natal = "25/12/2019 09:00";
        String anoNovo = "01/01/2020 12:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Date dtNatal = null;
        Date dtAnoNovo = null;

        try{
            dtNatal = sdf.parse(natal);
            dtAnoNovo = sdf.parse(anoNovo);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(dtAnoNovo.after(dtNatal)){
            System.out.println("Ano novo é depois do Natal");
        }
        if(dtNatal.before(dtAnoNovo)){
            System.out.println("Natal é antes do ano novo");
        }

    }
}
