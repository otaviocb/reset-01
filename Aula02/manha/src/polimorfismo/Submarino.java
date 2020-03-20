package polimorfismo;

class Submarino extends Veiculo {

    double profundidadeMaxima;

    public Submarino(String nome, double profundidadeMaxima) {
        super(nome);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public String toString() {
        return super.toString() + " | profundidade máxima: " + this.profundidadeMaxima;
    }
}