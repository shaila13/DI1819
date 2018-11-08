package modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Shaila
 */
public class Corredor implements Comparable<Corredor>{

    private String nombre;
    private String dni = "";
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;

    public Corredor() {
    }

    /*
    El compareTo del String da problemas si el String es null.
    
    Ir al constructor:
    
        public Corredor(String nombre, String dni, Date fechaNacimiento, 
            String direccion, int telefono) {
        this.nombre = nombre;
        if (dni == null) 
            throw new IllegalArgumentException("El dni no puede ser null");
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }
     */
    public Corredor(String nombre, String dni, Date fechaNacimiento,
            String direccion, int telefono) {
        this.nombre = nombre;
        if (dni == null) {
            throw new IllegalArgumentException("El dni no puede ser null");
        }
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    /*
    Mejor implementar el metodo toString para que saque la lista
    */
    
    @Override
    public String toString() {
        return "Corredor: " + nombre + ", DNI: " + dni
                + ", fecha de nacimiento: " +  fechaNacimiento.getDate()+"/"+
                fechaNacimiento.getMonth()+"/"+fechaNacimiento.getYear() + 
                ", Direccion: " + direccion + ", Telefono: " + telefono;
    }

    @Override
    public int compareTo(Corredor t) {
        return this.dni.compareTo(t.dni);
    }
    //Clases Anónimas
    /*
    Si necesitamos otro comparador podemos utilizar el sort(List...)
    Trae dos. Lo hacemos directamente en un método en el "main".
    */

}
