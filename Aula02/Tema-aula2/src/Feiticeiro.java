public class Feiticeiro extends Arcano{

    boolean vivo;

    public Feiticeiro(String nome, double vida, double ataque, double defesa, double mana, boolean vivo) {
        super(nome, vida, ataque, defesa, mana);
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
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Guerreiro alvo, Magia magia) {
        if (testeMortoVivo(this.vida) == true) {
            if (mana > magia.custoMana) {
                double dano = calcularDano(alvo.defesa, magia.poderAtaque);
                alvo.vida -= dano;
                this.mana -= magia.custoMana;
                registrar(alvo.nome, magia.nome, dano, alvo.vida);
            } else {
                System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
            }
        }else{
            }
        }


    void atacar(Barbaro alvo, Magia magia) {
            if (testeMortoVivo(this.vida) == true) {
        if (mana > magia.custoMana) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano, alvo.vida);
    }else {
            System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
        }
            }else{
                }
    }


    void atacar(Mago alvo, Magia magia) {
                if (testeMortoVivo(this.vida) == true) {
            if (mana > magia.custoMana) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano, alvo.vida);
    }else {
                System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
            }
                }else{
                    }
    }


    void atacar(Clerigo alvo, Magia magia) {
                    if (testeMortoVivo(this.vida) == true) {
                if (mana > magia.custoMana) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano, alvo.vida);
    }else {
                    System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
                }
                    }else{
                    }
    }

    void atacar(Druida alvo, Magia magia) {
                        if (testeMortoVivo(this.vida) == true) {
                    if (mana > magia.custoMana) {
                        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano, alvo.vida);
    }else {
                   System.out.println(this.nome + " tem mana de:" + this.mana + ", não sendo possível atacar!");
                    }
    }else {
                        }
                    }

}