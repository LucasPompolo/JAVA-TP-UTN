import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String partidosFile = "partidos.txt";
        String resultadosFile = "resultados.txt";
        ArrayList<Partido> partidos = new ArrayList<>();
        ArrayList<Resultado> resultados = new ArrayList<>();

        try {
            BufferedReader partidosReader = new BufferedReader(new FileReader(partidosFile));
            BufferedReader resultadosReader = new BufferedReader(new FileReader(resultadosFile));

            // Lee los archivo de los partidos
            String line = partidosReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Partido partido = new Partido(fields[0], fields[1]);
                partidos.add(partido);
                line = partidosReader.readLine();
            }
            partidosReader.close();

            // Lee los resultados
            line = resultadosReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Resultado resultado = new Resultado(fields[0], fields[1]);
                resultados.add(resultado);
                line = resultadosReader.readLine();
            }
            resultadosReader.close();

            // Compara los resultados
            int puntaje = 0;
            for (int i = 0; i < partidos.size(); i++) {
                Partido partido = partidos.get(i);
                Resultado resultado = resultados.get(i);
                if (partido.getResultado().equals(resultado.getResultado())) {
                    puntaje++;
                }
            }

            // Imprimi el puntaje
            System.out.println("Puntaje: " + puntaje);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Partido {
    private String equipo1;
    private String equipo2;
    private String resultado;

    public Partido(String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

class Resultado {
    public Resultado(String string, String string2) {
    }
    public Object getResultado() {
        return null;
    }
    private String equipo1;
    private String equipo2;
    private String

}

