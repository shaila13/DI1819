package modelo;

import java.util.Date;

/**
 *
 * @author Shaila
 */
public class Participantes extends CorredorDorsal {

    private int Dorsal;
    private int tiempoCarrera;

    public Participantes(int Dorsal, int tiempoCarrera) {
        this.Dorsal = Dorsal;
        this.tiempoCarrera = tiempoCarrera;
    }

    public Participantes(int Dorsal, int tiempoCarrera, String nombre, String 
            dni, Date fechaNacimiento, String direccion, int telefono) {
        super(nombre, dni, fechaNacimiento, direccion, telefono);
        this.Dorsal = Dorsal;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Dorsal: " + Dorsal + ", tiempo de carrera: " 
                + tiempoCarrera;
    }

}
