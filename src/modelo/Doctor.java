package modelo;

public class Doctor {
    private String nombre;
    private String especialidad;
    private String telefono;
    private String id;

    public Doctor(String nombre, String especialidad, String telefono, String id) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.id = id;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getId() {
        return id;
    }

    // Setters
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar la información del doctor
    public void mostrarInfo() {
        System.out.println("Doctor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("ID: " + id);
    }
}