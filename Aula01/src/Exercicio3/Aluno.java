package Exercicio3;

public class Aluno {
    String nome;
    double nota;
    boolean aprovado;


    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    boolean aprovado() {
        return nota >= 7.0;
    }
}

