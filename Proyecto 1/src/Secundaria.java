import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Secundaria {

    public static void main(String[] args) {

        try{
            try (BufferedReader partidosReader = new BufferedReader(new FileReader("PartidoDeFutbol.java"))) {
                String archivo ="";
                String lineas = partidosReader.readLine();

                while(lineas != null){
                    archivo += lineas + "\n";
                    lineas = partidosReader.readLine();
                }

                System.out.println(archivo);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
