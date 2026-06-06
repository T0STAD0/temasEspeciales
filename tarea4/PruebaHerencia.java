// Archivo: PruebaHerencia.java
public class PruebaHerencia {
    public static void main(String[] args) {
        // NOTA: No es posible hacer: Universitario u = new Universitario("Carlos", "123");
        // Porque 'Universitario' es abstracta y no se puede instanciar directamente.

        System.out.println("=== 1. CREANDO INSTANCIA DE CLASE HIJA ===");
        Estudiante alumnoHija = new Estudiante("Ana Gomez", "320145", "Medicina");
        alumnoHija.mostrarPerfil();               // Método heredado de la Abuela
        alumnoHija.realizarActividadPrincipal();  // Método definido en la Hija
        System.out.println("--------------------------------------------------\n");

        System.out.println("=== 2. CREANDO INSTANCIA DE CLASE NIETA ===");
        EstudianteIngenieria alumnoNieta = new EstudianteIngenieria(
            "Luis Perez", 
            "319284", 
            "Ingeniería en Computación", 
            "Laboratorio de Sistemas Digitales"
        );
        
        System.out.println("\n=== 3. EJECUTANDO MÉTODOS DE LA CLASE NIETA ===");
        alumnoNieta.mostrarPerfil();               // Método heredado de la Abuela (Universitario)
        System.out.println("Carrera actual: " + alumnoNieta.getCarrera()); // Método heredado de la Hija (Estudiante)
        alumnoNieta.realizarActividadPrincipal();  // Método especializado en la Nieta (Polimorfismo)
        alumnoNieta.resolverProblema();            // Método propio y exclusivo de la Nieta
    }
}