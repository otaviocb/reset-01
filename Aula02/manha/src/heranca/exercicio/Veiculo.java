package heranca.exercicio;

public class Veiculo {

    String nome;
    double velocidadeMaxima;
    Terreno terreno;

    Veiculo(String nome, double velocidadeMaxima, Terreno terreno) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.terreno = terreno;
    }

    public String toString() {
        return "Não configurado";
    }
}
