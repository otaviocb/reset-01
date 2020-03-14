public class App {
    public static void main(String[] args){

        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(10, 1);
        System.out.println(somaDasIdades);

        int diferencaDasIdades = calculadoraDeIdades.subtrair(33, 22);
        System.out.println(diferencaDasIdades);

        int divisaoDasIdades = calculadoraDeIdades.dividir(10, 5);
        System.out.println(divisaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplicar(5, 5);
        System.out.println(multiplicacaoDasIdades);

        Comparador primeiroMenor = new Comparador();
        boolean menor = primeiroMenor.menorQue( 15,  1000);
        System.out.println(menor);
    }
}
