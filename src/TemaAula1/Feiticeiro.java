package TemaAula1;

public class Feiticeiro {
    public String nome;
    public int vida, ataque, defesa, mana, dano, poderFinal;
    public Feiticeiro(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    public void ataqueFB(Barbaro barbaro, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - barbaro.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante sem mana)");

        } else {
            this.mana -= magia.custoMana;
            barbaro.vida -= dano;

            if (barbaro.vida <= 0) {
                barbaro.vida = 0;
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueFC(Clerigo clerigo, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - clerigo.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando 0 de dano. (Atacante sem mana)");

        } else {
            this.mana -= magia.custoMana;
            clerigo.vida -= dano;

            if (clerigo.vida <= 0) {
                clerigo.vida = 0;
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueFD(Druida druida, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - druida.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando 0 de dano. (Atacante sem mana)");

        } else {
            this.mana -= magia.custoMana;
            druida.vida -= dano;

            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueFG(Guerreiro guerreiro, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - guerreiro.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante sem mana)");

        } else {
            this.mana -= magia.custoMana;
            guerreiro.vida -= dano;

            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueFM(Mago mago, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - mago.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + mago.nome + " com " + magia.nome + " causando 0 de dano, pois o tacante está morto.");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + mago.nome + " com " + magia.nome + " causando 0 de dano, pois o tacante está sem mana.");

        }  else {
            this.mana -= magia.custoMana;
            mago.vida -= dano;

            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nome + " atacou " + mago.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem atacado.");

            } else {
                System.out.println(this.nome + " atacou " + mago.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

}