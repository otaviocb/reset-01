package heranca.exercicio;

public class Submarino extends VeiculoAquatico {

    int lotacaoMaxima;
    double profundidadeMaxima;
    Combustivel combustivel;

    Submarino(String nome, double velocidadeMaxima, double profundidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima);
        this.lotacaoMaxima = 5000;
        this.combustivel = combustivel;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public String toStringEspecifico() {
        return "Submarino{" +
            "lotacaoMaxima=" + lotacaoMaxima +
            ", profundidadeMaxima=" + profundidadeMaxima +
            ", combustivel=" + combustivel +
            ", nome='" + nome + '\'' +
            ", velocidadeMaxima=" + velocidadeMaxima +
            ", terreno=" + terreno +
            '}';
    }

}
