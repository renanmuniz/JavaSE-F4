package exercicios;

import classes.Revista;

public class Exer22 {
    public static void main(String[] args) {
        Revista.ler();
        Revista.marcar();

        Revista.Marcar x = new Revista.Marcar();
        x.marcar();
    }
}
