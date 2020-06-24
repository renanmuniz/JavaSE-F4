package exercicios;

import classes.Pipoca;

public class Exer24 {
    public static void main(String[] args) {
        Pipoca pipoca = new Pipoca() {
            public void estourar() {
                System.out.println("pipoca classe anonima.");
            }
        };
    }
}
