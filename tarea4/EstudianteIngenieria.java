// Archivo: EstudianteIngenieria.java
public class EstudianteIngenieria extends Estudiante {
    private String laboratorioAsignado;

    // Constructor de la clase nieta
    public EstudianteIngenieria(String nombre, String cuentaId, String carrera, String laboratorioAsignado) {
        super(nombre, cuentaId, carrera); // Llama al constructor de Estudiante (Hija)
        System.out.println("-> Inicializando constructor de EstudianteIngenieria (Nieta)");
        this.laboratorioAsignado = laboratorioAsignado;
    }

    public String getLaboratorioAsignado() {
        return laboratorioAsignado;
    }

    // Polimorfismo: Sobrescribimos el método para darle un comportamiento más específico
    @Override
    public void realizarActividadPrincipal() {
        System.out.println(getNombre() + " esta ejecutando simulaciones y ensambles en el: " + laboratorioAsignado);
    }

    // Método exclusivo de la subclase nieta
    public void resolverProblema() {
        System.out.println(getNombre() + " esta analizando y depurando el codigo del sistema para su entrega.");
    }
}