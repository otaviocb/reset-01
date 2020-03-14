package TemaAula1;

public class Mago {

    public String nome;
    public int vida, ataque, defesa, mana, dano, poderFinal;
    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    public void ataqueMB(Barbaro barbaro, Magias magia) {
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
                barbaro.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueMC(Clerigo clerigo, Magias magia) {
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
                clerigo.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueMD(Druida druida, Magias magia) {
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
                druida.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + druida.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueMF(Feiticeiro feiticeiro, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - feiticeiro.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + magia.nome + " causando 0 de dano. (Atacante sem mana)");

        } else {
            this.mana -= magia.custoMana;
            feiticeiro.vida -= dano;

            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueMG(Guerreiro guerreiro, Magias magia) {
        poderFinal = (magia.ataquePoder * this.ataque);
        dano = poderFinal - guerreiro.defesa;

        if (this.vida <= 0){
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando 0 de dano, pois o tacante está morto.");

        } else if (magia.custoMana > this.mana){
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando 0 de dano, pois o tacante está sem mana.");

        } else {
            this.mana -= magia.custoMana;
            guerreiro.vida -= dano;

            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando " + dano + " de dano e matou o personagem atacado.");

            } else {
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + magia.nome + " causando " + dano + " de dano.");
            }

        }

    }

}