package modelo;

import java.util.Date;

/**
 *
 * @author Shaila
 */
public class Participantes extends CorredorDorsal {

    private int dorsal;
    private int tiempoCarrera;

    public Participantes(int dorsal, int tiempoCarrera) {
        this.dorsal = dorsal;
        this.tiempoCarrera = tiempoCarrera;
    }

    public Participantes(int dorsal, int tiempoCarrera, String nombre, String 
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

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Dorsal: " + dorsal + ", tiempo de carrera: " 
                + tiempoCarrera;
    }

}
