import com.sun.xml.internal.ws.api.model.wsdl.WSDLInput;

import java.util.Scanner;

public class Jogo {

    int numeroPersonagens;

    public static void main(String[] args) {

        // UTENSILHOS DE ATAQUE

        Arma espada = new Arma("Espada", 50);
        Arma adaga = new Arma("Adaga", 20);

        Magia bolaDeFogo = new Magia("Bola de Fogo", 28, 20);
        Magia plasmaDoAlem = new Magia("Plasma do Além", 30, 200);
        Magia vozDosMortos = new Magia("'Voz dos Mortos'", 15, 3);

        PoderDivino jutsu = new PoderDivino("Jutsu", 20, 5);
        PoderDivino cajado = new PoderDivino("Cajado", 13, 13);

        System.out.println("Escolha o número de personagens: ");
        Scanner scanner = new Scanner(System.in);
        String numeroPersonagens = scanner.next();


        //CriarPersonagem(numeroPersonagens);

        // PERSONAGENS

        Barbaro atila = new Barbaro("Atila", 2300, 120, 5, null, true); //criação atila
        Clerigo jigorokano = new Clerigo("Jigorokano", 3000, 200, 100, 82, true); //criação jigorokano
        Druida merlin = new Druida("Merlin", 2800, 200, 19, 30, true); //criação merlin
        Feiticeiro draco = new Feiticeiro("Draco", 1900, 170, 80, 34, true); // criação draco
        Guerreiro aquiles = new Guerreiro("Aquiles", 3200, 10, 60,null,true); //criação aquiles
        Guerreiro leonidas = new Guerreiro("Leonidas", 5000, 7, 8,null, true); //cração leonidas
        Mago kaufa = new Mago("Kaufa", 2700, 40, 70, 50, true); //criação kaufa


        // BATALHA

        jigorokano.atacar(draco, jutsu);
        jigorokano.atacar(atila, cajado);
        kaufa.atacar(aquiles, vozDosMortos);
        kaufa.atacar(jigorokano, vozDosMortos);
        atila.atacar(merlin, adaga);
        atila.atacar(jigorokano, adaga);
        aquiles.atacar(atila, espada);
        aquiles.atacar(atila, espada);
        leonidas.atacar(jigorokano,adaga);
        draco.atacar(aquiles, plasmaDoAlem);
        merlin.atacar(draco, jutsu);
        merlin.atacar(kaufa, jutsu);
        draco.atacar(atila, vozDosMortos);
        draco.atacar(aquiles, bolaDeFogo);
        merlin.atacar(draco, jutsu);
        merlin.atacar(kaufa, jutsu);
        leonidas.atacar(merlin,espada);
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
