package heranca.exercicio;

public class Caminhao extends VeiculoTerrestre {

    int lotacaoMaxima;
    Combustivel combustivel;

    Caminhao(String nome, double velocidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima, 12);
        this.lotacaoMaxima = 3;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
            "lotacaoMaxima=" + lotacaoMaxima +
            ", combustivel=" + combustivel +
            ", quantidadeRodas=" + quantidadeRodas +
            ", nome='" + nome + '\'' +
            ", velocidadeMaxima=" + velocidadeMaxima +
            ", terreno=" + terreno +
            '}';
    }
}
