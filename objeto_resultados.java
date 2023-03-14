import java.util.ArrayList;

public class objeto_resultados {
    
    public ArrayList<objeto_partido> partidos=new ArrayList<objeto_partido>();

    public void Listarpartidos() {
        for(int i=0;i<partidos.size();i++) {
            System.out.println(partidos.get(i).Getseleccion());
        }
        }
    }

