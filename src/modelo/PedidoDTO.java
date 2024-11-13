package modelo;


public class PedidoDTO {
private int id;
private int cantidad;
private String fecha;
private int idprove;
private int idtienda;
private int idadm;
private int idpro;
private String nombreadm;

    public PedidoDTO() {
    }

    //Insertar
    public PedidoDTO(int cantidad, String fecha, int idprove, int idtienda, int idadm, int idpro, String nombreadm) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idprove = idprove;
        this.idtienda = idtienda;
        this.idadm = idadm;
        this.idpro = idpro;
        this.nombreadm = nombreadm;
    }

    
    //actualizar

    public PedidoDTO(int id, int cantidad, String fecha, int idprove, int idtienda, int idadm, int idpro, String nombreadm) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idprove = idprove;
        this.idtienda = idtienda;
        this.idadm = idadm;
        this.idpro = idpro;
        this.nombreadm = nombreadm;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdprove() {
        return idprove;
    }

    public void setIdprove(int idprove) {
        this.idprove = idprove;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }

    public int getIdadm() {
        return idadm;
    }

    public void setIdadm(int idadm) {
        this.idadm = idadm;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public String getNombreadm() {
        return nombreadm;
    }

    public void setNombreadm(String nombreadm) {
        this.nombreadm = nombreadm;
    }
    
    

}
