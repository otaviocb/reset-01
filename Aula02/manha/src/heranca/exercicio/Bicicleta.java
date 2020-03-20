package heranca.exercicio;

public class Bicicleta extends VeiculoTerrestre {

    int lotacaoMaxima;

    Bicicleta(String nome, double velocidadeMaxima) {
        super(nome, velocidadeMaxima, 2);
        this.lotacaoMaxima = 2;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
            "lotacaoMaxima=" + lotacaoMaxima +
            ", quantidadeRodas=" + quantidadeRodas +
            ", nome='" + nome + '\'' +
            ", velocidadeMaxima=" + velocidadeMaxima +
            ", terreno=" + terreno +
            '}';
    }
}
