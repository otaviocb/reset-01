package enumeration.solucao;

import enumeration.solucao.pessoa.Pessoa;
import enumeration.solucao.pessoa.PessoaFisica;
import enumeration.solucao.pessoa.PessoaJuridica;

public class App {

    public static void main(String[] args) {

        Pessoa alexandre = new PessoaFisica("Alexandre");

        Pessoa cwi = new PessoaJuridica("CWI Software");

    }

}
