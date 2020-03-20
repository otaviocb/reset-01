package enumeration.solucao.agenda;

public enum Compromisso {

    CONSULTA_MEDICA(Cor.AMARELO, 2),
    REUNIAO(Cor.AZUL, 1),
    ANIVERSARIO(Cor.VERDE, 3),
    FESTA_ANIVERSARIO(Cor.VERMELHO, 4);

    private Cor cor;

    private int ordemPrioridade;

    Compromisso(Cor cor, int ordemPrioridade) {
        this.cor = cor;
        this.ordemPrioridade = ordemPrioridade;
    }
}
