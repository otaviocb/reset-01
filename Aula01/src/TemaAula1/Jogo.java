package TemaAula1;

public class Jogo {
    public static void main(String[] args) {

//Criação de personagens
        Guerreiro Aquiles = new Guerreiro("Aquiles", 342, 100, 100);
        Guerreiro Leonidas = new Guerreiro("Leonidas", 500, 700, 1800);
        Barbaro Atila = new Barbaro("Atila", 230, 120, 50);
        Mago Kaufa = new Mago("Kaufa", 270, 2000, 170, 50);
        Feiticeiro Ravenna = new Feiticeiro("Ravenna", 60, 30, 300, 30);
        Feiticeiro Draco = new Feiticeiro("Draco", 190, 400, 80, 140);
        Druida Merlin = new Druida("Merlin", 280, 1020, 30, 300);
        Clerigo Jigorokano = new Clerigo("Jigorokano", 300, 1100, 3000, 180);

//Criação de ataque
        Armas Espada = new Armas("Espada", 500);
        Armas Adaga = new Armas("Adaga", 200);
        Magias Plasma = new Magias("Plasma", 300, 200);
        Magias BolaDeFogo = new Magias("BolaDeFogo", 280, 200);
        PoderesDivinos Jutsu = new PoderesDivinos("Jutsu", 200, 45);
        PoderesDivinos Cajado = new PoderesDivinos("Cajado", 130, 130);

        //Ataques

//        // Aquiles ataca Atila com a Espada
//        Aquiles.ataqueGB("Atila","Espada");
//
//        // Leonidas ataca Kaufa com a Adaga
//        Leonidas.ataqueGM("Kaufa", "Adaga");
//
//        // Atila ataca Aquiles com a Espada
//        Atila.ataqueBG("Aquiles","Espada");
//
//        // Kaufa ataca Leonidas com o Plasma
//        Kaufa.ataqueMG("Leonidas","Plasma");
//
//        // Ravenna ataca Jigorokano com a BolaDeFogo
//        Ravenna.ataqueFC("Jigorokano","BolaDeFogo");
//
//        // Ravenna ataca Merlin com o Plasma
//        Ravenna.ataqueFD("Merlin","Plasma");
//
//        // Draco ataca Leonidas com o Plasma
//        Draco.ataqueFG("Leonidas","Plasma");
//
//        // Merlin ataca Aquiles com o Cajado
//        Merlin.ataqueDG("Aquiles","Cajado");
//
//        // Jigorokano ataca Ravena com o Jutsu
//        Jigorokano.ataqueCF("Ravenna","Jutsu");


        //Resultado final

        System.out.println("Resultado Final");
        System.out.println("Guerreiro: " + Aquiles.nome + " Vida: " + Aquiles.vida);
    }
}