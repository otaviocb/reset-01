public class Arcano extends Personagem{
    double mana;

    public Arcano(String nome, double vida, double ataque, double defesa, boolean vivo, double mana) {
        super(nome, vida, ataque, defesa, vivo);
        this.mana = mana;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Guerreiro alvo, Magia magia) {
        if (testeMortoVivo(this.vida) == true) {
            if (mana > magia.custoMana) {
                double dano = calcularDano(alvo.defesa, magia.poderAtaque);
                alvo.vida -= dano;
                this.mana -= magia.custoMana;
                registrar(alvo.nome, magia.nome, dano, alvo.vida);
            } else {
                System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
            }
        }else{
        }
    }


    void atacar(Barbaro alvo, Magia magia) {
        if (testeMortoVivo(this.vida) == true) {
            if (mana > magia.custoMana) {
                double dano = calcularDano(alvo.defesa, magia.poderAtaque);
                alvo.vida -= dano;
                this.mana -= magia.custoMana;
                registrar(alvo.nome, magia.nome, dano, alvo.vida);
            }else {
                System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
            }
        }else{
        }
    }

    void atacar(Clerigo alvo, Magia magia) {
        if (testeMortoVivo(this.vida) == true) {
            if (mana > magia.custoMana) {
                double dano = calcularDano(alvo.defesa, magia.poderAtaque);
                alvo.vida -= dano;
                this.mana -= magia.custoMana;
                registrar(alvo.nome, magia.nome, dano, alvo.vida);
            }else {
                System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
            }
        }else{
        }
    }

    void atacar(Druida alvo, Magia magia) {
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

