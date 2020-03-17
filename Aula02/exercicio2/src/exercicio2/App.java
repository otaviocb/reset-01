package exercicio2;

public class App {
    public static void main(String[] args) {

        Livro livro1 = new Livro ("Viagem","Carlos","SUSPENSE", Status.DISPONIVEL);
        Livro livro2 = new Livro ("Terra","Jose","ROMANCE", Status.EM_USO);
        Livro livro3 = new Livro ("Mar","Maria","TERROR",Status.EMPRESTADO);
        Livro livro4 = new Livro ("Vento","Robson","FANTASIA", Status.DISPONIVEL);
        System.out.println(livro1.categoria + " - " + livro1.titulo + " (" + livro1.autor + "): " + livro1.status);
    }

}
