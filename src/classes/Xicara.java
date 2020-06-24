package classes;

public class Xicara {

    private double peso;
    private double altura;
    private double preco;

    public Xicara(double peso, double altura, double preco) {
        this.peso = peso;
        this.altura = altura;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        // regra 1
        if(obj == null) {
            return false;
        }

        // regra 2
        if(!(obj instanceof Xicara)) {
            return false;
        }

        // regra 3
        Xicara outro = (Xicara) obj;

        // regra 4 e 5
        return this.peso == outro.peso && this.altura==outro.altura && this.preco == outro.preco;
    }
}
