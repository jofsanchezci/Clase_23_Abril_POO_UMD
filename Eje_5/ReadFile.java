import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; // 

public class ReadFile {
  public static void main(String[] args) {
    try {
      File miObjeto = new File("filename.txt");
      Scanner milector = new Scanner(miObjeto);
      while (milector.hasNextLine()) {
        String data = milector.nextLine();
        System.out.println(data);
      }
      milector.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error No se encuentra archivo!!");
      e.printStackTrace();
    }
  }
}