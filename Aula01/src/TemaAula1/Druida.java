package TemaAula1;

public class Druida {
    public String nome;
    public int vida, ataque, defesa, fe, poderFinal, dano;

    public Druida(String nome, int vida, int ataque, int defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    public void ataqueDB(Barbaro barbaro, PoderesDivinos poder) {
        poderFinal = (poder.ataquePoder * this.ataque);
        dano = poderFinal - barbaro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (poder.custoFe > this.fe) {
            System.out.println(this.nome + " atacou " + barbaro.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está sem fé)");

        } else {
            this.fe -= poder.custoFe;
            barbaro.vida -= dano;

            if (barbaro.vida <= 0) {
                barbaro.vida = 0; //para não negativar a vida
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + poder.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + barbaro.nome + " com " + poder.nome + " causando " + dano + " de dano.");

            }

        }

    }

    public void ataqueDC(Clerigo clerigo, PoderesDivinos poder) {
        poderFinal = (poder.ataquePoder * this.ataque);
        dano = poderFinal - clerigo.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (poder.custoFe > this.fe) {
            System.out.println(this.nome + " atacou " + clerigo.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está sem fé)");

        } else {
            this.fe -= poder.custoFe;
            clerigo.vida -= dano;

            if (clerigo.vida <= 0) {
                clerigo.vida = 0; //para não negativar a vida
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + poder.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + clerigo.nome + " com " + poder.nome + " causando " + dano + " de dano.");

            }

        }

    }

    public void ataqueDF(Feiticeiro feiticeiro, PoderesDivinos poder) {
        poderFinal = (poder.ataquePoder * this.ataque);
        dano = poderFinal - feiticeiro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (poder.custoFe > this.fe) {
            System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está sem fé)");

        } else {
            this.fe -= poder.custoFe;
            feiticeiro.vida -= dano;

            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0; //para não negativar a vida
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + poder.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + feiticeiro.nome + " com " + poder.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueDG(Guerreiro guerreiro, PoderesDivinos poder) {
        poderFinal = (poder.ataquePoder * this.ataque);
        dano = poderFinal - guerreiro.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + poder.nome + " causando 0 de dano, pois o tacante está morto.");

        } else if (poder.custoFe > this.fe) {
            System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + poder.nome + " causando 0 de dano, pois o tacante está sem fé.)");

        } else {
            this.fe -= poder.custoFe;
            guerreiro.vida -= dano;

            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + poder.nome + " causando " + dano + " de dano e matou o personagem atacado.");

            } else {
                System.out.println(this.nome + " atacou " + guerreiro.nome + " com " + poder.nome + " causando " + dano + " de dano.");
            }

        }

    }

    public void ataqueDM(Mago mago, PoderesDivinos poder) {
        poderFinal = (poder.ataquePoder * this.ataque);
        dano = poderFinal - mago.defesa;

        if (this.vida <= 0) {
            System.out.println(this.nome + " atacou " + mago.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está morto)");

        } else if (poder.custoFe > this.fe) {
            System.out.println(this.nome + " atacou " + mago.nome + " com " + poder.nome + " causando 0 de dano. (Atacante está sem fé)");

        } else {
            this.fe -= poder.custoFe;
            mago.vida -= dano;

            if (mago.vida <= 0) {
                mago.vida = 0; //para não negativar a vida
                System.out.println(this.nome + " atacou " + mago.nome + " com " + poder.nome + " causando " + dano + " de dano e matou o personagem alvo.");

            } else {
                System.out.println(this.nome + " atacou " + mago.nome + " com " + poder.nome + " causando " + dano + " de dano.");

            }

        }

    }

}
