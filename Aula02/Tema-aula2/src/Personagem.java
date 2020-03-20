import java.util.Scanner;

public class Personagem {
    String nome;
    double vida;
    double ataque;
    double defesa;
    boolean vivo;

    public Personagem(String nome, double vida, double ataque, double defesa, boolean vivo) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vivo = vivo;
    }

    public String toString() {
        return "Personagem: " + this.nome;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    public boolean testeMortoVivo(double vida) {
        if(this.vida>0) {
            return vivo = true;
        }else{
            return vivo = false;
        }
    }
    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void registrar(String alvo, String utensilho, double dano, double vida) {
        System.out.println(this.nome + " atacou " + alvo + " com " + utensilho + " causando " + dano + " de dano. O alvo " );
        if(vida <=0){
            System.out.println("morreu!\n");
        }else{
            System.out.println("permanece vivo!\n");
        }
    }

}
