package enumeration.solucao.pessoa;

public abstract class Pessoa {

    private TipoPessoa tipo;

    private String nome;

    public Pessoa(TipoPessoa tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
}
