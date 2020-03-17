public class Jogo {

    public static void main(String[] args) {

        // UTENSILHOS DE ATAQUE

        Arma espada = new Arma("Espada", 50);
        Arma adaga = new Arma("Adaga", 20);

        Magia bolaDeFogo = new Magia("Bola de Fogo", 28, 20);
        Magia plasmaDoAlem = new Magia("Plasma do Além", 30, 200);
        Magia vozDosMortos = new Magia("Voz dos Mortos", 15, 3);

        PoderDivino jutsu = new PoderDivino("Jutsu", 20, 45);
        PoderDivino cajado = new PoderDivino("Cajado", 13, 130);


        // PERSONAGENS

        Barbaro atila = new Barbaro("Atila", 2300, 12, 5); //criação atila
        Clerigo jigorokano = new Clerigo("Jigorokano", 3000, 20, 100, 18); //criação jigorokano
        Druida merlin = new Druida("Merlin", 2800, 1020, 19, 300); //criação merlin
        Feiticeiro draco = new Feiticeiro("Draco", 1900, 17, 80, 14); // criação draco
        Guerreiro aquiles = new Guerreiro("Aquiles", 3200, 10, 60); //criação aquiles
        Guerreiro leonidas = new Guerreiro("Leonidas", 5000, 7, 8); //cração leonidas
        Mago kaufa = new Mago("Kaufa", 2700, 40, 70, 50); //criação kaufa


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
        System.out.println("Resultado Final!");

        aquiles.imprimirEstado();
        atila.imprimirEstado();
        draco.imprimirEstado();
        jigorokano.imprimirEstado();
        kaufa.imprimirEstado();
        leonidas.imprimirEstado();
        merlin.imprimirEstado();

    }
}