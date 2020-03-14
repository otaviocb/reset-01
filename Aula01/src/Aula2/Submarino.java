package Aula2;

public class Submarino extends Veiculo{
        double profundidadeMaxima;
        int lotacaoMaxima;
        String combustivel;

    Submarino (String nome, double velocidadeMaxima, String terreno, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima = 10;
        this.combustivel = "querosene";
    }
}
