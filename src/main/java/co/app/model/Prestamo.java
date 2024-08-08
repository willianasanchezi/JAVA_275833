package co.app.model;  
  
import java.sql.Date;  
  
public class Prestamo {  
    private int idPrestamo;  
    private int idUsuario;  
    private int idProducto;  
    private Date fechaPrestamo;  
    private Date fechaDevolucion;  
    private String estado;  
  
    // Constructor sin parámetros  
    public Prestamo() {}  
  
    // Constructor con todos los parámetros, excepto idPrestamo (autogenerado)  
    public Prestamo(int idUsuario, int idProducto, Date fechaPrestamo, Date fechaDevolucion, String estado) {  
        this.idUsuario = idUsuario;  
        this.idProducto = idProducto;  
        this.fechaPrestamo = fechaPrestamo;  
        this.fechaDevolucion = fechaDevolucion;  
        this.estado = estado;  
    }  
  
    // Constructor con todos los parámetros, incluyendo idPrestamo  
    public Prestamo(int idPrestamo, int idUsuario, int idProducto, Date fechaPrestamo, Date fechaDevolucion, String estado) {  
        this.idPrestamo = idPrestamo;  
        this.idUsuario = idUsuario;  
        this.idProducto = idProducto;  
        this.fechaPrestamo = fechaPrestamo;  
        this.fechaDevolucion = fechaDevolucion;  
        this.estado = estado;  
    }  
  
    // Getters y Setters  
  
    public int getIdPrestamo() {  
        return idPrestamo;  
    }  
  
    public void setIdPrestamo(int idPrestamo) {  
        this.idPrestamo = idPrestamo;  
    }  
  
    public int getIdUsuario() {  
        return idUsuario;  
    }  
  
    public void setIdUsuario(int idUsuario) {  
        this.idUsuario = idUsuario;  
    }  
  
    public int getIdProducto() {  
        return idProducto;  
    }  
  
    public void setIdProducto(int idProducto) {  
        this.idProducto = idProducto;  
    }  
  
    public Date getFechaPrestamo() {  
        return fechaPrestamo;  
    }  
  
    public void setFechaPrestamo(Date fechaPrestamo) {  
        this.fechaPrestamo = fechaPrestamo;  
    }  
  
    public Date getFechaDevolucion() {  
        return fechaDevolucion;  
    }  
  
    public void setFechaDevolucion(Date fechaDevolucion) {  
        this.fechaDevolucion = fechaDevolucion;  
    }  
  
    public String getEstado() {  
        return estado;  
    }  
  
    public void setEstado(String estado) {  
        this.estado = estado;  
    }  
}  
