import java.io.File;  // Importa la clase
import java.io.IOException;  // Importa el manejo de excepciones

public class CreateFile {
  public static void main(String[] args) {
    try {
      File miObjeto = new File("Archivo1.txt");
      if (miObjeto.createNewFile()) {
        System.out.println("Archivo Creado: " + miObjeto.getName());
      } else {
        System.out.println("El archivo ya existe.");
      }
    } catch (IOException e) {
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}