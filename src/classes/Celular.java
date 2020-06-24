package classes;

public class Celular implements Produto{

    public String nome;
    public double valor;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
