// Archivo: Universitario.java
public abstract class Universitario {
    private String nombre;
    private String cuentaId;

    // Constructor de la clase abstracta
    public Universitario(String nombre, String cuentaId) {
        System.out.println("-> Inicializando constructor de Universitario (Abuela)");
        this.nombre = nombre;
        this.cuentaId = cuentaId;
    }

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public String getCuentaId() {
        return cuentaId;
    }

    // Método concreto que heredan todas las clases
    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre + " | ID/Cuenta: " + cuentaId);
    }

    // MÉTODO ABSTRACTO: No tiene cuerpo, las subclases deben definirlo
    public abstract void realizarActividadPrincipal();
}