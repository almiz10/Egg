package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date Nacimiento;
    public String Pais;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date Nacimiento, String Pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.Nacimiento = Nacimiento;
        this.Pais = Pais;
    }

    
}
