public class objeto_partido {

    //PRODUCTO
    public objeto_partido(String seleccion, String descripcion){
        this.seleccion=seleccion;
        this.descripcion=descripcion;
    }
    private String seleccion;
    private String descripcion;

    public String Getseleccion() {
        return seleccion;
        }
    
    public String Getdescripcion() {
        return descripcion;
    }
}