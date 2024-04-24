import java.io.File;

public class DeleteFile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("El archivo Borrado fue: " + myObj.getName());
    } else {
      System.out.println("Error al borrar el Archivo");
    } 
  } 
}