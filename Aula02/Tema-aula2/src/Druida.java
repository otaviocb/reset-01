public class Druida extends Sacerdote{

    public Druida(String nome, double vida, double ataque, double defesa, double fe, boolean vivo) {
        super(nome, vida, ataque, defesa, vivo, fe);
    }

    void atacar(Clerigo alvo, PoderDivino poderDivino) {
                        if (testeMortoVivo(this.vida) == true) {
                        if (fe > poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
        } else {
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
                        }
                        }else{
                        }
    }

}