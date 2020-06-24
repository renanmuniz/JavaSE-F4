package classes;

public class ClasseA {
    private String nome = "Juca";

    private class ClasseB{
        private Double valor=150.50;
    }

    public void fazerAlgo(){
        System.out.println("classe externa A - " + nome);
        ClasseB b = new ClasseB();
        System.out.println("classe interna B - "+ b.valor);
    }

}
