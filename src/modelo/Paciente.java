package modelo;

import java.time.LocalDate;

public class Paciente {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Paciente(String id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void mostrarInfo() {
        System.out.println("Paciente: " + nombre + " (ID: " + id + "), Nacimiento: " + fechaNacimiento);
    }
}