package Exercicio3;

public class App3 {

    public static void main(String[] args) {

    Aluno ana = new Aluno("Ana",7);

        System.out.println("O aluno " + ana.nome + " está " + ana.aprovado() + ",");
        System.out.println("pois sua nota final foi: " + ana.nota);
    }
}
