package Aula2;

public class Aviao extends Veiculo {
    int lotacaoMaxima;
    String combustivel;
    double altitudeMaxima;

    Aviao (String nome, double velocidadeMaxima, String terreno, int lotacoaMaxima, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima = 10;
        this.combustivel = "querosene";
        this.altitudeMaxima = 10000;
    }
}
