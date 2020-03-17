public class Barbaro extends HomemDeArmas{
/*
    String nome;

    double vida;

    double ataque;

    double defesa;
*/
    boolean vivo;

    public Barbaro(String nome, double vida, double ataque, double defesa, String arma, boolean vivo) {
        super(nome, vida, ataque, defesa, arma);
        this.vivo = vivo;
    }


    public boolean testeMortoVivo(double vida) {
        if(this.vida>0) {
            return vivo = true;
        }else{
            return vivo = false;
        }
    }

    void registrar(String alvo, String utensilho, double dano, double vida) {
        System.out.println(this.nome + " atacou " + alvo + " com " + utensilho + " causando " + dano + " de dano. O alvo " );
        if(vida <=0){
            System.out.println("morreu!\n");
        }else{
            System.out.println("permanece vivo!\n");
        }
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Guerreiro alvo, Arma arma) {
        if(testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        }else{

        }
    }
/*
    void atacar(Barbaro alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano, alvo.vida);
    }
*/
    void atacar(Mago alvo, Arma arma) {
        if(testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        }else{

            }
    }

    void atacar(Feiticeiro alvo, Arma arma) {
        if (testeMortoVivo(this.vida) == true) {
            double dano = calcularDano(alvo.defesa, arma.poderAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano, alvo.vida);
        } else {

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