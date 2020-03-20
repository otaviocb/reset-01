public class HomemDeArmas extends Personagem{

    public HomemDeArmas(String nome, double vida, double ataque, double defesa, boolean vivo) {
        super(nome, vida, ataque, defesa, vivo);
    }

    public String toString(){
        return "Personagem" + this.nome;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Mago alvo, Arma arma) {
        if(testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        }else{

        }
    }

    void atacar (Feiticeiro alvo, Arma arma){
        if (testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        }else{
        }
    }

    void atacar(Clerigo alvo, Arma arma) {
        if (testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        } else {

        }
    }

    void atacar(Druida alvo, Arma arma) {
        if(testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        } else {

        }
    }

}
