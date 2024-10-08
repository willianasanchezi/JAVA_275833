package co.app.model;  
  
import java.sql.Date;  
  
public class Mantenimiento {  
    private int idMantenimiento;  
    private int idProducto;  
    private Date fechaMantenimiento;  
    private String descripcion;  
    private String estado;  
  
    // Constructor sin parámetros  
    public Mantenimiento() {}  
  
    // Constructor con todos los parámetros, excepto idMantenimiento (autogenerado)  
    public Mantenimiento(int idProducto, Date fechaMantenimiento, String descripcion, String estado) {  
        this.idProducto = idProducto;  
        this.fechaMantenimiento = fechaMantenimiento;  
        this.descripcion = descripcion;  
        this.estado = estado;  
    }  
  
    // Constructor con todos los parámetros, incluyendo idMantenimiento  
    public Mantenimiento(int idMantenimiento, int idProducto, Date fechaMantenimiento, String descripcion, String estado) {  
        this.idMantenimiento = idMantenimiento;  
        this.idProducto = idProducto;  
        this.fechaMantenimiento = fechaMantenimiento;  
        this.descripcion = descripcion;  
        this.estado = estado;  
    }  
  
    // Getters y Setters  
  
    public int getIdMantenimiento() {  
        return idMantenimiento;  
    }  
  
    public void setIdMantenimiento(int idMantenimiento) {  
        this.idMantenimiento = idMantenimiento;  
    }  
  
    public int getIdProducto() {  
        return idProducto;  
    }  
  
    public void setIdProducto(int idProducto) {  
        this.idProducto = idProducto;  
    }  
  
    public Date getFechaMantenimiento() {  
        return fechaMantenimiento;  
    }  
  
    public void setFechaMantenimiento(Date fechaMantenimiento) {  
        this.fechaMantenimiento = fechaMantenimiento;  
    }  
  
    public String getDescripcion() {  
        return descripcion;  
    }  
  
    public void setDescripcion(String descripcion) {  
        this.descripcion = descripcion;  
    }  
  
    public String getEstado() {  
        return estado;  
    }  
  
    public void setEstado(String estado) {  
        this.estado = estado;  
    }  
}  
