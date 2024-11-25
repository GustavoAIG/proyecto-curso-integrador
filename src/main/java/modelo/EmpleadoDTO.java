package modelo;

public class EmpleadoDTO {
 private int id;
private String nombre;
private String apellido;
private int idusu;
private int idtienda; 

    public EmpleadoDTO() {
    }

//Agregar

    public EmpleadoDTO(String nombre, String apellido, int idusu, int idtienda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idusu = idusu;
        this.idtienda = idtienda;
    }
    
    //Actualziar

    public EmpleadoDTO(int id, String nombre, String apellido, int idusu, int idtienda) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idusu = idusu;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdusu() {
        return idusu;
    }

    public void setIdusu(int idusu) {
        this.idusu = idusu;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }
    
    
}
