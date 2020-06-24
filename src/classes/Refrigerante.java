package classes;

public enum Refrigerante {
    COCA_COLA(5.50),
    FANTA(4.00),
    GUARANA(4.50);

    private double preco;

    Refrigerante(double valor){
        this.preco = valor;
    }

    public double getPreco(){
        return this.preco;
    }
}
