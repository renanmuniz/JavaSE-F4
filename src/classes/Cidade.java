package classes;

public class Cidade {
    private String nome;
    private String uf;

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    @Override
    public boolean equals(Object obj) {
        // regra 1
        if(obj == null) {
            return false;
        }

        // regra 2
        if(!(obj instanceof Cidade)) {
            return false;
        }

        // regra 3
        Cidade outro = (Cidade) obj;

        // regra 4 e 5
        return this.nome == outro.nome && this.uf == outro.uf;
    }
}
