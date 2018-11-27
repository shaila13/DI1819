package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Shaila
 */
public class Participantes extends Corredor implements Serializable  {

    private int dorsal;
    private String tiempoCarrera;

    public Participantes(int dorsal, String tiempoCarrera) {
        this.dorsal = dorsal;
        this.tiempoCarrera = tiempoCarrera;
    }

    public Participantes(int dorsal, String tiempoCarrera, String nombre, String 
            dni, Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
        this.dorsal = dorsal;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(String tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.dorsal;
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
        final Participantes other = (Participantes) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Dorsal: " + dorsal + ", tiempo de carrera: " 
                +tiempoCarrera+", "+super.toString();
    }



}
