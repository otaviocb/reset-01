package console;

import java.util.Scanner;

import common.Barbaro;
import common.Guerreiro;

public class App {

    public static Guerreiro criarGuerreiro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de guerreiro");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.println("Criando meu guerreirinho...");
        Guerreiro meuGuerreirinho = new Guerreiro(nome, vida, ataque, defesa);

        return meuGuerreirinho;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de herói");

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.println("Criando barbaro...");
        Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
        barbaro.imprimirEstado();

        Guerreiro meuGuerreirinho = criarGuerreiro();
        meuGuerreirinho.imprimirEstado();


    }
}
