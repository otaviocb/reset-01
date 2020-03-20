package heranca.exercicio;

public class Aviao extends VeiculoAereo {

    int lotacaoMaxima;
    Combustivel combustivel;

    Aviao(String nome, double velocidadeMaxima, double altitudeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima, altitudeMaxima);
        this.lotacaoMaxima = 180;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Aviao{" +
            "lotacaoMaxima=" + lotacaoMaxima +
            ", combustivel=" + combustivel +
            ", altitudadeMaxima=" + altitudadeMaxima +
            ", nome='" + nome + '\'' +
            ", velocidadeMaxima=" + velocidadeMaxima +
            ", terreno=" + terreno +
            '}';
    }
}
