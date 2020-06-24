package exercicios;

import classes.Armario;
import classes.Armario2;
import classes.Blusa;
import classes.Camiseta;

public class Exer15 {
    public static void main(String[] args) {
        Blusa b1 = new Blusa("Cavalera",50);
        Blusa b2 = new Blusa("OX",100);

        Camiseta c1 = new Camiseta('M', "TRIZZ");
        Camiseta c2 = new Camiseta('P', "OAKLEY");

        Armario2<Blusa> armario1 = new Armario2<Blusa>();
        armario1.guardarGaveta1(b1);
        armario1.guardarGaveta2(b2);

        Armario2<Camiseta> armario2 = new Armario2<Camiseta>();
        armario2.guardarGaveta1(c1);
        armario2.guardarGaveta2(c2);

        System.out.println("Armario preenchido.");
    }
}
