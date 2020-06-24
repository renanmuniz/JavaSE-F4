package exercicios;

import classes.TipoPessoa;

public class Exer10 {
    public static void main(String[] args) {
        TipoPessoa t1 = TipoPessoa.FISICA;
        TipoPessoa t2 = TipoPessoa.JURIDICA;

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println(t1.ordinal());
        System.out.println(t2.ordinal());

        for (TipoPessoa t: TipoPessoa.values()) {
            System.out.println(t.toString() + " - " + t.ordinal());
        }
    }
}

