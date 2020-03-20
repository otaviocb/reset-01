package exercicio2;

public enum Categoria {

    SUSPENSE("Suspense"),
    ROMANCE("Romance"),
    FANTASIA("Fantasia"),
    TERROR("Terror");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
