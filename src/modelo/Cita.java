package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private Paciente paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(Paciente paciente, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void mostrarCita() {
        System.out.println("Cita para " + paciente.getNombre() + " el " + fecha + " a las " + hora);
    }
}