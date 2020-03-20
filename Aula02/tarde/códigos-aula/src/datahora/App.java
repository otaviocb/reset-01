package datahora.solucao;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
        LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
        System.out.println("Dia que o homem foi para o espaço: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(homemNoEspaco));
        System.out.println("Dia que o homem pisou na lua: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(homemNaLua));

        LocalTime horarioDeEntrada = LocalTime.of(8, 30);
        LocalTime horarioDeSaida = LocalTime.of(17, 0);
        System.out.println("Horário de Entrada: " + DateTimeFormatter.ofPattern("HH:mm").format(horarioDeEntrada));
        System.out.println("Horário de Saída: " + DateTimeFormatter.ofPattern("HH:mm").format(horarioDeSaida));

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime aberturaDaCopa = LocalDateTime.of(2022, Month.NOVEMBER, 12, 17, 0);

        Period periodo = Period.between(homemNoEspaco, homemNaLua);
        System.out.println("Anos passados entre a primeira vez no espaço e a primeira vez na lua: " + periodo.getYears());

        Duration cargaHoraria = Duration.between(horarioDeEntrada, horarioDeSaida);
        Long horas = cargaHoraria.toHours();
        long minutos = cargaHoraria.toMinutes();
        System.out.println("Horas trabalhadas no dia: " + horas);
        System.out.println("Minutos trabalhados no dia: " + minutos);

        Duration tempoRestanteParaCopa = Duration.between(agora, aberturaDaCopa);
        System.out.println("Horas restantes para copa: " + tempoRestanteParaCopa.toHours());
    }

}
