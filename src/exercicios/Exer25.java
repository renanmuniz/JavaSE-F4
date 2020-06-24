package exercicios;

import classes.Homem;

public class Exer25 {
    public static void main(String[] args) {
        Homem brasileiro = new Homem() {
            @Override
            public void falar() {
                System.out.println("Classes polimorficas implementando interface");
            }
        };

        brasileiro.falar();

        Homem americano = new Homem() {
            @Override
            public void falar() {
                System.out.println("I Love Java");
            }
        };
        americano.falar();
    }
}
