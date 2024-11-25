package modelo;



public class ProveedorDTO {
 private int id;
private String nombre;
private String nombrepro;
private int anio;
private int idpro;
private int idtienda;  

    public ProveedorDTO() {
    }

    public ProveedorDTO(String nombre, String nombrepro, int anio, int idpro, int idtienda) {
        this.nombre = nombre;
        this.nombrepro = nombrepro;
        this.anio = anio;
        this.idpro = idpro;
        this.idtienda = idtienda;
    }

    public ProveedorDTO(int id, String nombre, String nombrepro, int anio, int idpro, int idtienda) {
        this.id = id;
        this.nombre = nombre;
        this.nombrepro = nombrepro;
        this.anio = anio;
        this.idpro = idpro;
        this.idtienda = idtienda;
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

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }


}
