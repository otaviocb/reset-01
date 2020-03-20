public class Guerreiro extends HomemDeArmas{


    public Guerreiro(String nome, double vida, double ataque, double defesa, boolean vivo) {
        super(nome, vida, ataque, defesa, vivo);
    }

        void atacar (Barbaro alvo, Arma arma){
            if (testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano, alvo.vida);
        }else{
        }
        }

}