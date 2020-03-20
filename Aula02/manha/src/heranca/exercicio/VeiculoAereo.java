package heranca.exercicio;

public class VeiculoAereo extends Veiculo {

    double altitudadeMaxima;

    VeiculoAereo(String nome, double velocidadeMaxima, double altitudadeMaxima) {
        super(nome, velocidadeMaxima, new Terreno("aéreo"));
        this.altitudadeMaxima = altitudadeMaxima;
    }

}
