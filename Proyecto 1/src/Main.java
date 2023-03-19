import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{

        // Path mipath=Paths.get("C:/Users/Alejo/Desktop/Java/Secundaria.java");
        // probando2(mipath, "probando a ver si funciona");
        // System.out.println("este es el contenido: " + Files.readAllLines(Paths.get(mipath)));

        // System.out.println("----------------");
        
        Path mipath2=Paths.get("C:/Users/Lucas/Desktop/Java/objeto_resultado.java");
               
        probando2(mipath2, "probando a ver si funciona");
        System.out.println("este es el contenido: " + Files.readAllLines(Paths.get(mipath2)));
        String partidosFile = "partidos.txt";
        String resultadosFile = "resultados.txt";
        ArrayList<Partido> partidos = new ArrayList<>();
        ArrayList<Resultado> resultados = new ArrayList<>();
        ArrayList<Ronda> ronda=new ArrayList<>();

        
        Equipo Argentina= new Equipo(
            "Argentina");

        System.out.println(Equipo.getEquipos());

        Equipo Polonia= new Equipo(
            "Polonia");

        System.out.println(Equipo.getEquipos());

        Equipo ArabiaSaudita= new Equipo(
            "ArabiaSaudita");

        System.out.println(Equipo.getEquipos());

        Equipo Mexico= new Equipo(
            "Mexico");

        System.out.println(Equipo.getEquipos());

        // objeto_partido Polonia= new objeto_partido(
        //     "Polonia",
        //     "");
        // System.out.println(Polonia.Getseleccion());
        
        // objeto_partido Mexico= new objeto_partido(
        //     "Mexico",          
        //     "");
        // System.out.println(Mexico.Getseleccion());

        // objeto_partido Arabia= new objeto_partido(
        //     "Arabia",
        //     "");
        // System.out.println(Arabia.Getseleccion());

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
            //que lea argentina contra arabia
            partidosReader.close();

           
            // Lee los resultados
            line = resultadosReader.readLine();
            
            while (line != null) {
                String[] fields = line.split(",");
                Resultado resultado = new Resultado(fields[0], fields[1]);
                resultados.add(resultado);
                line = resultadosReader.readLine();
                // que lea el resultado
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


        // public static void probando(Path path)  throws IOException{
        //     if(Files.exists(path)) {
        //         System.out.println("archivo de objeto_partido");
        //     }
        // }

        public static void probando2(Path path2)  throws IOException{
            if(Files.exists(path2)) {
                System.out.println("archivo de objeto_resultado");
            }
        }
    }

    private static void probando2(Object mipath2, String string) {
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

class Ronda {
    private String ronda_1;
    private String ronda_2;
    private String ronda_3;
    private String ronda_4;

    private String resultado_rondas;

    public Ronda(String ronda_1, String ronda_2, String ronda_3, String ronda_4, String resultado_rondas){
        this.ronda_1=ronda_1;
        this.ronda_2=ronda_2;
        this.ronda_3=ronda_3;
        this.ronda_4=ronda_4;
        this.resultado_rondas=resultado_rondas;
    }

    public String getRonda(){
        return resultado_rondas;
    }
}

class Pronostico {

}


class Resultado {
    public Resultado(String string, String string2) {
    }
    public Object getResultado() {
        return null;
    }
    private String equipo1;
    private String equipo2;
    //private String;

}