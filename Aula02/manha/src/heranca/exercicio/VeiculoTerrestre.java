package heranca.exercicio;

public class VeiculoTerrestre extends Veiculo {

    int quantidadeRodas;

    VeiculoTerrestre(String nome, double velocidadeMaxima, int quantidadeRodas) {
        super(nome, velocidadeMaxima, new Terreno("terrestre"));
        this.quantidadeRodas = quantidadeRodas;
    }

}
