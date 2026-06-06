// MiPruebaTiempo.java
// Uso de un objeto Tiempo1 en el mismo paquete predeterminado.

public class PruebaPaqueteTiempo1 
{
   public static void main( String[] args )
   {
      // crea e inicializa un objeto Tiempo1
      Tiempo1 tiempo = new Tiempo1(); // invoca al constructor de Tiempo1

      // imprime representaciones String de la hora
      System.out.print( "La hora universal inicial es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar inicial es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una linea en blanco

      // cambia la hora e imprime la hora actualizada
      tiempo.establecerTiempo( 13, 27, 6 ); 
      System.out.print( "La hora universal despues de establecerTiempo es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar despues de establecerTiempo es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una linea en blanco

      // intenta establecer la hora con valores invalidos
      try
      {
         tiempo.establecerTiempo( 99, 99, 99 ); // todos los valores fuera de rango
      }  
      catch (IllegalArgumentException e)
      {
         System.out.printf( "Excepcion: %s\n\n", e.getMessage() );
      }  

      // muestra la hora despues de tratar de establecer valores invalidos
      System.out.println( "Despues de intentar ajustes invalidos:" );
      System.out.print( "Hora universal: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "Hora estandar: " );
      System.out.println( tiempo.toString() );
   } 
}