package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Item item1 = new Item("Massa", Segmento.ALIMENTACAO, 3.99, 2);
        Item item2 = new Item("Sabonete", Segmento.HIGIENE, 1.99, 3);
        Item item3 = new Item("Esfregão", Segmento.LIMPEZA, 5.99, 1);
        Item item4 = new Item("Pão", Segmento.ALIMENTACAO, 0.25, 10);
        Item item5 = new Item("Creme dental", Segmento.HIGIENE, 4.99, 2);
        Item item6 = new Item("Sabão em Pó", Segmento.LIMPEZA, 13.99, 1);

        List<Item> listaDeCompras = new ArrayList<>();
        listaDeCompras.add(item1);
        listaDeCompras.add(item2);
        listaDeCompras.add(item3);
        listaDeCompras.add(item4);
        listaDeCompras.add(item5);
        listaDeCompras.add(item6);

        for (Item item : listaDeCompras) {
            double valorTotal = item.getValor() * item.getQuantidade();
            System.out.println("[" + item.getSegmento() + "] " + item.getNome() + " (" + item.getQuantidade() + ") - " + item.getValor() + " | " + valorTotal);
        }

    }

}
