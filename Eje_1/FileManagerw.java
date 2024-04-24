import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class FileManagerw{
    public static void main(String[] args) {
        String data = "Hola Mundo!\nEsto es un texto de prueba.\n Hoy es martes";
        
        try {
            // Escribe el texto en el archivo, si no existe lo crea.
            Files.write(Paths.get("ejemplo.txt"), data.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
