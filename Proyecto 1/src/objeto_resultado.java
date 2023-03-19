import java.util.Random;

public class objeto_resultado {
    public static void main(String[] args) {

        String[] equipos = {"Argentina", "Polonia", "Arabia Saudita", "Mexico"};
        
        Random random = new Random();
        
        for (String equipo : equipos) {
            int goles = random.nextInt(3); //Aca se genera un número de goles aleatorio entre 0 y 3
            System.out.println(equipo + ": " + goles + " goles");
        }
    }
}
