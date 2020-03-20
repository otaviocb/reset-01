package exercicio2;

public class Biblioteca {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", Categoria.FANTASIA, Status.DISPONIVEL);
        livro1.imprimir();

        Livro livro2 = new Livro("O Reverso da Medalha", "Sidney Sheldon", Categoria.ROMANCE, Status.EM_USO);
        livro2.imprimir();

        Livro livro3 = new Livro("Bird Box", "Josh Malerman", Categoria.SUSPENSE, Status.EMPRESTADO);
        livro3.imprimir();

        Livro livro4 = new Livro("O iluminado", "Stephen King", Categoria.TERROR, Status.DISPONIVEL);
        livro4.imprimir();
    }



}
