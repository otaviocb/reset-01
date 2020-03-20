package enumeration.solucao.agenda;

public enum Cor {

    AZUL("#0000FF"),
    AMARELO("#00FFFF"),
    VERMELHO("#FF0000"),
    VERDE("#00FF00"),
    PRETO("#000000"),
    BRANCO("#FFFFFF");

    private String codigoHexadecimal;

    Cor(String codigoHexadecimal) {
        this.codigoHexadecimal = codigoHexadecimal;
    }
}
