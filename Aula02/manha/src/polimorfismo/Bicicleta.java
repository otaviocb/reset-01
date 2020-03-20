package polimorfismo;

class Bicicleta extends Veiculo {

    double aro;

    public Bicicleta(String nome, double aro) {
        super(nome);
        this.aro = aro;
    }

    public String toString() {
        return super.toString() + " | aro: " + this.aro;
    }
}