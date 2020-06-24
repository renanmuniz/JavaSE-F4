package exercicios;

import classes.Telefone;
import classes.Xicara;

public class Exer33 {
    public static void main(String[] args) {
        Xicara x1 = new Xicara(10,11,10.50);
        Xicara x2 = null;

        // regra 1
        System.out.println(x1.equals(x2));

        // regra 2
        Telefone fone = new Telefone();
        System.out.println(x1.equals(fone));

        // regra 3 e 4
        x2 = new Xicara(10,11,10.50);
        System.out.println(x1.equals(x2));

        if (x1.equals(x2)) {
            System.out.println("sao iguais");
        }

    }
}
