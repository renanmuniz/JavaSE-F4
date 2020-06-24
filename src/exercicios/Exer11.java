package exercicios;

import classes.Refrigerante;

public class Exer11 {
    public static void main(String[] args) {
        Refrigerante r1 = Refrigerante.COCA_COLA;
        Refrigerante r2 = Refrigerante.FANTA;
        Refrigerante r3 = Refrigerante.GUARANA;

        System.out.println(r1.getPreco());
        System.out.println(r2.getPreco());
        System.out.println(r3.getPreco());

    }
}
