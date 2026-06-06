//  PruebaTiempo1.java
// Objeto Tiempo1 utilizado en una aplicación.

public class PruebaTiempo1 
{
   public static void main( String[] args )
   {
      // crea e inicializa un objeto Tiempo1
      Tiempo1 tiempo = new Tiempo1(); // invoca el constructor de Tiempo1

      // imprime representaciones de cadena del tiempo
      System.out.print( "La hora universal inicial es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar inicial es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una línea en blanco

      // modifica el tiempo e imprime el tiempo actualizado
      tiempo.establecerTiempo( 13, 27, 6 ); 
      System.out.print( "La hora universal despues de establecerTiempo es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar despues de establecerTiempo es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una línea en blanco

      // intenta establecer el tiempo con valores inválidos 
      try
      {
         tiempo.establecerTiempo( 99, 99, 99 ); // todos los valores fuera de rango
      } // fin de try
      catch (IllegalArgumentException e)
      {
         System.out.printf( "Excepcion: %s\n\n", e.getMessage() );
      } // fin de catch

      // muestra el tiempo después de tratar de establecer valores inválidos
      System.out.println( "Despues de intentar ajustes invalidos:" );
      System.out.print( "Hora universal: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "Hora estandar: " );
      System.out.println( tiempo.toString() );
   } // fin de main
} // fin de la clase PruebaTiempo1
