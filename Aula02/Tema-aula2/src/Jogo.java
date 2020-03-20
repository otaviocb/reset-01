import com.sun.xml.internal.ws.api.model.wsdl.WSDLInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    private static int numeroPersonagens;

    public static void main(String[] args) {


        // UTENSILHOS DE ATAQUE

        Arma espada = new Arma("Espada", 50);
        Arma adaga = new Arma("Adaga", 20);

        Magia bolaDeFogo = new Magia("Bola de Fogo", 28, 20);
        Magia plasmaDoAlem = new Magia("Plasma do Além", 30, 200);
        Magia vozDosMortos = new Magia("'Voz dos Mortos'", 15, 3);

        PoderDivino jutsu = new PoderDivino("Jutsu", 20, 5);
        PoderDivino cajado = new PoderDivino("Cajado", 13, 13);
/*
        System.out.println("Escolha o número de personagens: ");
        Scanner scanner = new Scanner(System.in);
        String numeroPersonagens = scanner.next();
        System.out.println("O numero é " + numeroPersonagens);
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos personagens deseja criar? ");


        int n = scan.nextInt();
        int num = scan.next();

        List<Guerreiro> listaGuerreiros = new ArrayList<>();
        List<Barbaro> listaBarbaros = new ArrayList<>();
        List<Druida> listaDruidas = new ArrayList<>();
        List<Mago> listaMagos = new ArrayList<>();
        List<Clerigo> listaClerigos = new ArrayList<>();
        List<Feiticeiro> listaFeiticeiros = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Scanner in = new Scanner(System.in);

            System.out.println("Crie seu próprio Personagem!");
            System.out.println("Escolha a classe do novo personagem:");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Bárbaro");
            System.out.println("3 - Feiticeiro");
            System.out.println("4 - Mago");
            System.out.println("5 - Clerigo");
            System.out.println("6 - Druida");


            System.out.print("Tipo: ");
            char tipo = in.next().charAt(0);

            System.out.print("Nome: ");
            String nome = in.next();

            System.out.print("Vida: ");
            double vida = in.nextDouble();

            System.out.print("Ataque: ");
            double ataque = in.nextDouble();

            System.out.print("Defesa: ");
            double defesa = in.nextDouble();


            int fe;
            int mana;


            // PERSONAGENS


            Barbaro atila = new Barbaro("Atila", 2300, 120, 5, true); //criação atila
            Clerigo jigorokano = new Clerigo("Jigorokano", 3000, 200, 100, true, 82); //criação jigorokano
            Druida merlin = new Druida("Merlin", 2800, 200, 19, 74, true); //criação merlin
            Feiticeiro draco = new Feiticeiro("Draco", 1900, 170, 80, true, 65); // criação draco
            Guerreiro aquiles = new Guerreiro("Aquiles", 3200, 10, 60, true); //criação aquiles
            Guerreiro leonidas = new Guerreiro("Leonidas", 5000, 7, 8, true); //cração leonidas
            Mago kaufa = new Mago("Kaufa", 2700, 40, 70, true, 90); //criação kaufa


            // BATALHA

            jigorokano.atacar(draco, jutsu);
            jigorokano.atacar(atila, cajado);
            kaufa.atacar(aquiles, vozDosMortos);
            kaufa.atacar(jigorokano, vozDosMortos);
            atila.atacar(merlin, adaga);
            atila.atacar(jigorokano, adaga);
            aquiles.atacar(atila, espada);
            aquiles.atacar(atila, espada);
            leonidas.atacar(jigorokano, adaga);
            draco.atacar(aquiles, plasmaDoAlem);
            merlin.atacar(draco, jutsu);
            merlin.atacar(kaufa, jutsu);
            draco.atacar(atila, vozDosMortos);
            draco.atacar(aquiles, bolaDeFogo);
            merlin.atacar(draco, jutsu);
            merlin.atacar(kaufa, jutsu);
            leonidas.atacar(merlin, espada);
            merlin.atacar(atila, jutsu);
            aquiles.atacar(atila, espada);
            aquiles.atacar(atila, espada);

            //RESULTADO

            System.out.println("\n Resultado Final! \n");

            aquiles.imprimirEstado();
            atila.imprimirEstado();
            draco.imprimirEstado();
            jigorokano.imprimirEstado();
            kaufa.imprimirEstado();
            leonidas.imprimirEstado();
            merlin.imprimirEstado();

        }
    }
}