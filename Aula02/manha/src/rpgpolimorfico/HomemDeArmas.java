package rpgpolimorfico;

public class HomemDeArmas extends Personagem {

    public HomemDeArmas(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Personagem alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }
}
