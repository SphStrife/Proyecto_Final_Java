package logica;

import modelo.Cita;
import modelo.Paciente;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaMedica {
    private List<Cita> citas;

    public AgendaMedica() {
        citas = new ArrayList<>();
    }

    public void agregarCita(Paciente paciente, LocalDate fecha, LocalTime hora) {
        Cita nuevaCita = new Cita(paciente, fecha, hora);
        citas.add(nuevaCita);
        System.out.println("Cita agregada con éxito.");
    }

    public void mostrarTodasLasCitas() {
        System.out.println("=== CITAS REGISTRADAS ===");
        for (Cita cita : citas) {
            cita.mostrarCita();
        }
    }
}