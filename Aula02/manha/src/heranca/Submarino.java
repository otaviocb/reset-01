package heranca;

public class Submarino extends Veiculo {

    double profundidadeMaxima;

    Submarino(String nome, double profundidadeMaxima) {
        super(nome);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public String toString() {
        return super.toString() + " | profundidade máxima: " + this.profundidadeMaxima;
    }
}
