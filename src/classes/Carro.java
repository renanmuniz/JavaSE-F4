package classes;

public class Carro {
    private String marca;
    private Integer ano;
    private Double valor;

    public Carro(String marca, Integer ano, Double valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro(marca = " + marca + ", ano = " + ano + ", valor = " + valor + ")";
        //return "Carro{" +
        //       "marca='" + marca + '\'' +
        //        ", ano=" + ano +
        //        ", valor=" + valor +
        //        '}';
    }
}
