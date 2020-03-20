public class Mago extends Arcano{


    public Mago(String nome, double vida, double ataque, double defesa, boolean vivo, double mana) {
        super(nome, vida, ataque, defesa, vivo, mana);
    }

    void atacar(Feiticeiro alvo, Magia magia) {
        if (testeMortoVivo(this.vida) == true) {
        if (mana > magia.custoMana) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano, alvo.vida);
    }else {
            System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
        }
        }else {
        }

    }

}