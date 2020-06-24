package exercicios;

import classes.Pipoca;
import classes.PipocaDoce;

public class Exer23 {
    public static void main(String[] args) {
        Pipoca pipoca = new Pipoca();
        pipoca.estourar();

        pipoca = new PipocaDoce();
        pipoca.estourar();
    }
}
