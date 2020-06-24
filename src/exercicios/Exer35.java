package exercicios;

import classes.Cidade;

public class Exer35 {
    public static void main(String[] args) {
        Cidade c1 = new Cidade("Porto Alegre", "RS");
        Cidade c2 = new Cidade("Porto Alegre", "RS");

        System.out.println(c1);
        System.out.println(c2);

        if(c1 == c2){

            System.out.println("mesmo objeto");
        } else {
            System.out.println("nâo são o mesmo objeto");
        }

        if(c1.equals(c2)) {
            System.out.println("objetos equivalentes");
        } else {
            System.out.println("nâo são objetos equivalentes");
        }

        c2 = c1;
        System.out.println(c1);
        System.out.println(c2);
        if(c1 == c2){

            System.out.println("mesmo objeto");
        } else {
            System.out.println("nâo são o mesmo objeto");
        }

        if(c1.equals(c2)) {
            System.out.println("objetos equivalentes");
        } else {
            System.out.println("nâo são objetos equivalentes");
        }

    }
}
