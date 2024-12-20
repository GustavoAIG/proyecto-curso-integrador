
package modelo;

public class TiendaDTO {
 private int id;
private String nombre;
private String direccion;
private int tele;   

    public TiendaDTO() {
    }

    public TiendaDTO(String nombre, String direccion, int tele) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tele = tele;
    }

    public TiendaDTO(int id, String nombre, String direccion, int tele) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }


}
