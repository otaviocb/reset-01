package heranca.exercicio;

public class Navio extends VeiculoAquatico {

    int lotacaoMaxima;
    Combustivel combustivel;

    Navio(String nome, double velocidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima);
        this.lotacaoMaxima = 5000;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Navio{" +
            "lotacaoMaxima=" + lotacaoMaxima +
            ", combustivel=" + combustivel +
            ", nome='" + nome + '\'' +
            ", velocidadeMaxima=" + velocidadeMaxima +
            ", terreno=" + terreno +
            '}';
    }
}
