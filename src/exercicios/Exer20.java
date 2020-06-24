package exercicios;

import classes.ClasseE;

public class Exer20 {
    public static void main(String[] args) {
        ClasseE.ClasseF i1 = new ClasseE().new ClasseF();
        i1.processar();

        ClasseE externa = new ClasseE();
        ClasseE.ClasseF i2 = externa.new ClasseF();
        i2.processar();
    }

}
