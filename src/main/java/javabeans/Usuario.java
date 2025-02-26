package javabeans;

import java.util.List;
import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private List<Task> taskList;

    //Constructor vacio
    public Usuario() {
    }

    //Constructor lleno
    public Usuario(String nombre , String apellido , String correo , List<Task> taskList) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.taskList = taskList;
    }

    //Geter and seter
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    //To String
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", taskList=" + taskList +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hashCode ( id );
    }
}
