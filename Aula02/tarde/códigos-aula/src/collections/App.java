package collections.solucao;

import collections.solucao.escola.Aluno;
import collections.solucao.escola.Turma;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Turma turmaA = new Turma("A100");
        Turma turmaB = new Turma("B100");

        Aluno augusto = new Aluno("Augusto", turmaA);
        augusto.setMediaFinal(10.0);

        Aluno alexandre = new Aluno("Alexandre", turmaA);
        alexandre.setMediaFinal(8.0);

        Aluno andre = new Aluno("Andre", turmaB);
        andre.setMediaFinal(5.0);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(augusto);
        alunos.add(alexandre);
        alunos.add(andre);

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println(aluno.getNome());
        }

        double sum = 0.0;
        for (Aluno a : alunos) {
            if (a.getTurma().equals(turmaA)) {
                sum += a.getMediaFinal();
            }
        }
        double mediaTurma = sum / alunos.size();

        System.out.println(alunos);
        System.out.println(mediaTurma);
    }

}
