package javabeans;


import java.util.Date;
import java.util.Objects;

public class Task {
    private int id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String estado;
    private Date fechaCreacion;
    private boolean estaEcha;
    private boolean estaVencida;

    public Task() {
    }

    public Task(String nombre , String descripcion , String categoria , String estado , Date fechaCreacion , boolean estaEcha , boolean estaVencida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.estaEcha = estaEcha;
        this.estaVencida = estaVencida;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEstaEcha() {
        return estaEcha;
    }

    public void setEstaEcha(boolean estaEcha) {
        this.estaEcha = estaEcha;
    }

    public boolean isEstaVencida() {
        return estaVencida;
    }

    public void setEstaVencida(boolean estaVencida) {
        this.estaVencida = estaVencida;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", estaEcha=" + estaEcha +
                ", estaVencida=" + estaVencida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode ( id );
    }
}
