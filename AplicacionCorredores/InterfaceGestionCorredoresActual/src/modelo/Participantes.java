package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Shaila
 */
public class Participantes extends Corredor implements Serializable,Comparable<Corredor>{

    private int dorsal;
    private String tiempoParticipante;
    private int posicion;

    public Participantes(int dorsal, String tiempoCarrera) {
        this.dorsal = dorsal;
        this.tiempoParticipante = tiempoCarrera;
    }

    public Participantes(int dorsal, String tiempoCarrera, String nombre, String 
            dni, Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
        this.dorsal = dorsal;
        this.tiempoParticipante = tiempoCarrera;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempoCarrera() {
        return tiempoParticipante;
    }

    public void setTiempoCarrera(String tiempoCarrera) {
        this.tiempoParticipante = tiempoCarrera;
    }

    @Override
    public String toString() {
        return "Dorsal: " + dorsal + ", tiempo de carrera: " 
                +tiempoParticipante+", Nombre: "+super.getNombre();
    }

}
