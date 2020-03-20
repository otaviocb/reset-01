public class Sacerdote extends Personagem {

    double fe;

    public Sacerdote(String nome, double vida, double ataque, double defesa, boolean vivo, double fe) {
        super(nome, vida, ataque, defesa, vivo);
        this.fe = fe;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Guerreiro alvo, PoderDivino poderDivino) {
        if(testeMortoVivo(this.vida) == true) {
            if (fe>poderDivino.custoFe) {
                double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
            }else{
                System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
            }
        }else{
        }
    }

    void atacar(Barbaro alvo, PoderDivino poderDivino) {
        if(testeMortoVivo(this.vida) == true) {
            if (fe>poderDivino.custoFe) {
                double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
            }else{
                System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
            }
        }else{
        }
    }

    void atacar(Mago alvo, PoderDivino poderDivino) {
        if(testeMortoVivo(this.vida) == true) {
            if (fe>poderDivino.custoFe) {
                double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
            }else{
                System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
            }
        }else{
        }
    }


    void atacar(Feiticeiro alvo, PoderDivino poderDivino) {
        if (testeMortoVivo(this.vida) == true) {
            if (fe > poderDivino.custoFe) {
                double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
            } else {
                System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
            }
        } else {
        }
    }

}
