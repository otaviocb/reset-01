package heranca.exercicio;

public class Combustivel {

    String tipo;

    Combustivel(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Combustivel{" +
            "tipo='" + tipo + '\'' +
            '}';
    }
}
