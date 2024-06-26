package gestion.eventos.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_organizador;
    private String nombre;
    private String apellido;
    private Long num_doc;
    private String correo;
    private String contrasena;

    //Getters y Setters
    public int getId_organizador() {
        return Id_organizador;
    }
    public void setId_organizador(int id_organizador) {
        Id_organizador = id_organizador;
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
    public Long getNum_doc() {
        return num_doc;
    }
    public void setNum_doc(Long num_doc) {
        this.num_doc = num_doc;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    //Constructor
    public Organizador() {
    }
}
