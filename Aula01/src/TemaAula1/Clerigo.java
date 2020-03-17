public class Clerigo {

    String nome;

    double vida;

    double ataque;

    double defesa;

    int fe;

    Clerigo(String nome, double vida, double ataque, double defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano.");
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Guerreiro alvo, PoderDivino poderDivino) {
        if (fe>poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }else{
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
        }
    }

    void atacar(Barbaro alvo, PoderDivino poderDivino) {
        if (fe>poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }else{
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
        }
    }

    void atacar(Mago alvo, PoderDivino poderDivino) {
        if (fe>poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }else{
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
        }
    }

    void atacar(Feiticeiro alvo, PoderDivino poderDivino) {
        if (fe>poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }else{
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
        }
    }
    /*
        void atacar(Clerigo alvo, PoderDivino poderDivino) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }
    */
    void atacar(Druida alvo, PoderDivino poderDivino) {
        if (fe>poderDivino.custoFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
        }else{
            System.out.println(this.nome + " tem fé de:" + this.fe + ", não sendo possível atacar!");
        }
    }

}