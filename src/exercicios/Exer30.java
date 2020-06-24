package exercicios;

import classes.Carro;
import org.w3c.dom.ls.LSOutput;

public class Exer30 {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda",2017,33.999d);
        String estado = carro.toString();
        System.out.println(estado);
        System.out.println(carro);
    }


}
