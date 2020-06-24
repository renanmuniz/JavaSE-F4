package classes;

public enum CartaoCredito {
    VISA(2.5),
    MASTERCARD(3.50),
    AMERICAN_EXPRESS(5.0);

    private double taxa;

    CartaoCredito(double v1){
        this.taxa = v1;
    }

    public double calcularTaxa(double venda){
        return (venda * this.taxa)/100;
    }


}
