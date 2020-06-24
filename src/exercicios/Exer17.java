package exercicios;

import classes.Cliente;

public class Exer17 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Renan");
        c.vender();

        new Cliente("Joao");
        new Cliente("Sarah").vender();


    }
}
