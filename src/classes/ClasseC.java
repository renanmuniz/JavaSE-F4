package classes;

public class ClasseC {
    private String nome = "Pedro";

    private class ClasseD {
        private Double valor = 220.90;

        public void processar() {
            System.out.println("Classe interna usando atributo da classe externa - " + nome);
            System.out.println("Classe interna C - " + valor);
        }
    }
    public void fazerAlgo() {
        new ClasseD().processar();
    }
}
