import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void incrementarPuntos(int cantidad) {
        this.puntos += cantidad;
    }

    public static List<Equipo> getEquipos() {
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Argentina"));
        equipos.add(new Equipo("Polonia"));
        equipos.add(new Equipo("Arabia Saudita"));
        equipos.add(new Equipo("Mexico"));
        return equipos;
    }
}
