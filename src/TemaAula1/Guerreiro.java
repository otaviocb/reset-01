package TemaAula1;

public class Guerreiro {
    public String nome;
    public int vida, ataque, defesa, poderFinal, dano;
    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void ataque(Barbaro barbaro, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - barbaro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            barbaro.vida -= dano;

            if (barbaro.vida <= 0) {
                barbaro.vida = 0;
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando " + dano + " de dano.");

            }

        }

    }

    public void ataque(Clerigo clerigo, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - clerigo.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            clerigo.vida -= dano;

            if (clerigo.vida <= 0) {
                clerigo.vida = 0;
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueGD(Druida druida, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - druida.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            druida.vida -= dano;

            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + druida.nome + " com " + arma.nome + " causando " + dano + " de dano.");

            }

        }

    }

    public void ataqueGF(Feiticeiro feiticeiro, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - feiticeiro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            feiticeiro.vida -= dano;

            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0;
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + arma.nome + " causando " + dano + " de dano.");

            }

        }

    }
    public void ataqueGB(Barbaro barbaro, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - barbaro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando 0 de dano, pois o tacante está morto.");

        } else {
            barbaro.vida -= dano;

            if (barbaro.vida <= 0) {
                barbaro.vida = 0;
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem atacado.");

            } else {
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }
    public void ataqueGM(Mago mago, Armas arma) {
        poderFinal = (arma.ataquePoder * this.ataque);
        dano = poderFinal - mago.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando 0 de dano. (Atacante está morto)");

        } else {
            mago.vida -= dano;

            if (mago.vida <= 0) {
                mago.vida = 0; // para não negativar a vida
                System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + mago.nome + " com " + arma.nome + " causando " + dano + " de dano.");
            }

        }

    }

}