// Archivo: Estudiante.java
public class Estudiante extends Universitario {
    private String carrera;

    // Constructor de la clase hija
    public Estudiante(String nombre, String cuentaId, String carrera) {
        super(nombre, cuentaId); // Llama al constructor de Universitario
        System.out.println("-> Inicializando constructor de Estudiante (Hija)");
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    // Implementación obligatoria del método abstracto de la clase abuela
    @Override
    public void realizarActividadPrincipal() {
        System.out.println(getNombre() + " esta asistiendo a clases teóricas de la carrera: " + carrera);
    }
}