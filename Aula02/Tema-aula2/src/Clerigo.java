public class Clerigo extends Sacerdote{


    boolean vivo;

    public Clerigo(String nome, double vida, double ataque, double defesa, double fe, boolean vivo) {
        super(nome, vida, ataque, defesa, fe);
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
/*
    void atacar(Clerigo alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        //testeAlvoMorto(alvo.vida);
        registrar(alvo.nome, poderDivino.nome, dano, alvo.vida);
    }
*/
        void atacar (Druida alvo, PoderDivino poderDivino){
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