import logica.AgendaMedica;
import modelo.Paciente;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        AgendaMedica agenda = new AgendaMedica();

        Paciente paciente1 = new Paciente("001", "Ana García", LocalDate.of(1990, 5, 15));
        Paciente paciente2 = new Paciente("002", "Carlos Pérez", LocalDate.of(1985, 11, 23));

        agenda.agregarCita(paciente1, LocalDate.of(2025, 6, 3), LocalTime.of(9, 30));
        agenda.agregarCita(paciente2, LocalDate.of(2025, 6, 3), LocalTime.of(10, 15));

        agenda.mostrarTodasLasCitas();
    }
}