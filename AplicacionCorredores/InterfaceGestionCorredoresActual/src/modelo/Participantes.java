package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shaila
 */
public class Participantes extends Corredor implements Serializable, Comparable<Corredor> {

    private int dorsal;
    private String tiempoParticipante;
    private int posicion;


    public Participantes(int dorsal, String tiempoCarrera) {
        
        this.dorsal = dorsal;
        this.tiempoParticipante = tiempoCarrera;
    }

    public Participantes(int dorsal, String tiempoCarrera, String nombre, String dni, 
            Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
        this.dorsal = dorsal;
        this.tiempoParticipante = tiempoCarrera;
    }



    //Getters y Setters
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

    public String getTiempoParticipante() {
        return tiempoParticipante;
    }

    public void setTiempoParticipante(String tiempoParticipante) {
        this.tiempoParticipante = tiempoParticipante;
    }


    /**
     *
     * @return String con los datos del Participante de la carrera.
     */
    @Override
    public String toString() {
        return super.getNombre() + ". Dorsal: " + dorsal + ", tiempo de carrera: "
                + tiempoParticipante + "\n";
    }

}
