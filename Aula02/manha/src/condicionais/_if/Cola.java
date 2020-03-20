package condicionais._if;

import java.util.Scanner;

import common.Arma;
import common.Barbaro;
import common.Clerigo;
import common.Druida;
import common.Feiticeiro;
import common.Guerreiro;
import common.Magia;
import common.Mago;
import common.PoderDivino;

public class Cola {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Verificador de Número Par");
        System.out.print("Digite um número: ");
        int numero = in.nextInt();

        boolean isPar = numero %2 == 0;

        if (isPar) {
            System.out.println("Número PAR");
        } else {
            System.out.println("Número ÍMPAR");
        }
    }
}
