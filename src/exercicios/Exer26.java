package exercicios;

import classes.Panela;
import classes.Pipoca;

public class Exer26 {
    public static void main(String[] args) {
        Panela panela = new Panela();
        panela.cozinhar(new Pipoca(){
            @Override
            public void estourar() {
                System.out.println("pipoca sabor pizza");
            }
        });

        panela.cozinhar(new Pipoca(){
            @Override
            public void estourar() {
                System.out.println("pipoca com cheddar");
            }
        });
    }
}
