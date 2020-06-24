package exercicios;

import classes.Armario;
import classes.Camiseta;

public class Exer13 {
    public static void main(String[] args) {
        Camiseta c1 = new Camiseta('M', "TRIZZ");
        Camiseta c2 = new Camiseta('P', "OAKLEY");
        Armario armario = new Armario();
        armario.guardarGaveta1(c1);
        armario.guardarGaveta2(c2);
        System.out.println("Armario preenchido.");
    }
}
