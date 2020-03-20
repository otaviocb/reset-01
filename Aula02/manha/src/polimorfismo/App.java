package polimorfismo;

public class App {

    public static void main(String[] args) {

        Submarino sub1 = new Submarino("Sub1", 10.1);
        Veiculo sub2 = new Submarino("Sub2", 25.7);
        Bicicleta bike1 = new Bicicleta("Bike1", 26);
        Veiculo bike2 = new Bicicleta("Bike2", 29);

        SimuladorVeiculo simulador = new SimuladorVeiculo();
        simulador.simular(sub1);
        simulador.simular(sub2);
        simulador.simular(bike1);
        simulador.simular(bike2);

    }
}
