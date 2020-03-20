package rpgpolimorfico;

public class Combate {

    public static void main(String[] args) {
        Arma espadaLonga = new Arma("Espada Longa", 12);
        Arma machadoGuerra = new Arma("Machado de Guerra", 20);
        Arma arcoEFlecha = new Arma("Arco e Flecha", 20);

        Magia misselMagico = new Magia("Míssel Mágico", 10, 1);
        Magia raioCongelante = new Magia("Raio Congelante", 15, 2);
        Magia bolaFogo = new Magia("Bola de Fogo", 15, 3);

        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 5, 1);
        PoderDivino relampagos = new PoderDivino("Relâmpagos", 25, 5);
        PoderDivino laminaFlamejante = new PoderDivino("Lâmina Flamejante", 30, 3);

        // heróis
        Guerreiro ramza = new Guerreiro("Ramza", 100, 1.5, 15);
        Clerigo ovelia = new Clerigo("Ovelia", 35, 4.5, 0, 100);
        Druida vandroy = new Druida("Vandroy", 75, 2.5, 5, 50);
        Arqueiro legolas = new Arqueiro("Legolas", 75, 2.5, 5);

        // vilões
        Feiticeiro dycedarg = new Feiticeiro("Dycedarg", 55, 3.0, 3, 150);
        Mago gaffgarion = new Mago("Gaffgarion", 50, 2.5, 2, 50);
        Barbaro wiegraf = new Barbaro("Wiegraf", 150, 2.5, 2);

        // combate
        dycedarg.atacar(ramza, misselMagico);
        ovelia.atacar(dycedarg, armaEspiritual);
        vandroy.atacar(dycedarg, relampagos);
        vandroy.atacar(gaffgarion, relampagos);
        vandroy.atacar(wiegraf, relampagos);
        gaffgarion.atacar(ramza, bolaFogo);
        gaffgarion.atacar(ovelia, bolaFogo);
        gaffgarion.atacar(vandroy, bolaFogo);
        wiegraf.atacar(ovelia, machadoGuerra);
        ramza.atacar(wiegraf, espadaLonga);
        ramza.atacar(wiegraf, espadaLonga);
        dycedarg.atacar(ramza, raioCongelante);
        ovelia.atacar(wiegraf, laminaFlamejante);
        vandroy.atacar(dycedarg, relampagos);
        vandroy.atacar(gaffgarion, relampagos);
        vandroy.atacar(wiegraf, relampagos);
        ramza.atacar(wiegraf, espadaLonga);
        ramza.atacar(wiegraf, espadaLonga);
        legolas.atacar(wiegraf, arcoEFlecha);
    }
}
