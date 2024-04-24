import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class FileManager_read {
    public static void main(String[] args) {
        try {
            // Lee todas las líneas del archivo como una lista de strings.
            List<String> lines = Files.readAllLines(Paths.get("ejemplo.txt"));
            
            System.out.println("Contenido del archivo:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
