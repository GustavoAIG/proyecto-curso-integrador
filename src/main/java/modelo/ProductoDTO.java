package modelo;

public class ProductoDTO {
private int id;
private String nombre;
private String categoria;
private double precio;
private int cantidad;
private String estado;
private int disponibilidad;
private String nomtienda;
private int idtienda;

//constructor vacio
    public ProductoDTO() {
    }

//constructor para agregar

    public ProductoDTO(String nombre, String categoria, double precio, int cantidad, String estado, int disponibilidad, String nomtienda, int idtienda) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
        this.nomtienda = nomtienda;
        this.idtienda = idtienda;
    }


 
//constructor actualizar

    public ProductoDTO(int id, String nombre, String categoria, double precio, int cantidad, String estado, int disponibilidad, String nomtienda, int idtienda) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
        this.nomtienda = nomtienda;
        this.idtienda = idtienda;
    }

//getter y setter

    public String getNomtienda() {
        return nomtienda;
    }

    public void setNomtienda(String nomtienda) {
        this.nomtienda = nomtienda;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }
    

}
