import java.io.FileWriter;
import java.io.IOException;

public class PrimeCSV {
    public static void main(String[] args) {
        int limit = 100; // Limita hasta donde quieres comprobar números primos
        String filePath = "primes.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Escribir la cabecera del CSV
            writer.append("Numero,Es Primo\n");

            // Verificar cada número y escribir si es primo o no
            for (int i = 1; i <= limit; i++) {
                boolean isPrime = isPrime(i);
                writer.append(String.format("%d,%s\n", i, isPrime ? "Si" : "No"));
            }

            System.out.println("Archivo CSV creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    // Función para determinar si un número es primo
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
