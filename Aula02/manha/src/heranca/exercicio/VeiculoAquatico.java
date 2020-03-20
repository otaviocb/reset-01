package heranca.exercicio;

public class VeiculoAquatico extends Veiculo {

    VeiculoAquatico(String nome, double velocidadeMaxima) {
        super(nome, velocidadeMaxima, new Terreno("aquático"));
    }

}
