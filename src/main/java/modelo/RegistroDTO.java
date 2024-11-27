package modelo;

public class RegistroDTO {
private int id;
private String nombrepro;
private String fecha;
private int cantidad;
private String operacion;
private int id_pro;   

    public RegistroDTO() {
    }

    public RegistroDTO(String nombrepro, String fecha, int cantidad, String operacion, int id_pro) {
        this.nombrepro = nombrepro;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.operacion = operacion;
        this.id_pro = id_pro;
    }

    public RegistroDTO(int id, String nombrepro, String fecha, int cantidad, String operacion, int id_pro) {
        this.id = id;
        this.nombrepro = nombrepro;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.operacion = operacion;
        this.id_pro = id_pro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }



}
