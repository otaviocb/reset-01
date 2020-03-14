package TemaAula1;

public class Barbaro {

    public String nome;
    public int vida, ataque, defesa, poderFinal, dano;

    public Barbaro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void ataqueBG(Guerreiro guerreiro, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - guerreiro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + arma.nome + " causando 0 de dano, pois o tacante está morto.");

        } else {
            guerreiro.vida -= dano;

            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem atacado.");

            } else {
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueBC(Clerigo clerigo, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - clerigo.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            clerigo.vida -= dano;

            if (clerigo.vida <= 0) {
                clerigo.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueBD(Druida druida, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - druida.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            druida.vida -= dano;

            if (druida.vida <= 0) {
                druida.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando " + dano + " de dano.");

            }

        }

    }

    public void ataqueBF(Feiticeiro feiticeiro, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - feiticeiro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            feiticeiro.vida -= dano;

            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }


    public void ataqueBM(Mago mago, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - mago.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            mago.vida -= dano;

            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }

}