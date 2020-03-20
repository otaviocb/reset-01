package heranca.exercicio;

public class Terreno {

    String tipo;

    Terreno(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Terreno{" +
            "tipo='" + tipo + '\'' +
            '}';
    }
}
