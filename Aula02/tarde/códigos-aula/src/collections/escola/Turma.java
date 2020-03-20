package collections.solucao.escola;

public class Turma {

    private String descricao;

    public Turma(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
