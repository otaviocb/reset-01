package console;

import java.util.Scanner;

import common.Clerigo;

public class Cola {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Crie seu próprio clérigo!");

        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("Vida: ");
        double vida = in.nextDouble();
        System.out.print("Ataque: ");
        double ataque = in.nextDouble();
        System.out.print("Defesa: ");
        double defesa = in.nextDouble();
        System.out.print("Fé: ");
        int fe = in.nextInt();

        System.out.println("Criando clérigo...");
        Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
        clerigo.imprimirEstado();
    }
}
