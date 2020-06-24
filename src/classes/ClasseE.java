package classes;

public class ClasseE {
    private String nome = "Juliana";

    public class ClasseF {
        private Double valor = 551.12;
        public void processar() {
            System.out.println("Classe interna usando atributo da classe externa - " + nome);
            System.out.println("Classe interna E - " + valor);
        }
    }
}
