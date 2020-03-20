package rpgpolimorfico;

public class Arcano extends Personagem {

    int mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

}
