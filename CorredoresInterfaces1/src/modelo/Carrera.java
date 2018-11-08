package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Shaila
 */
public class Carrera implements Comparable<Carrera> {

    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private String nombreCarrera = "";
    private Date fechaCarrera;
    private String lugarCarrera;
    private int numeroMaxCorredores;
    private int tiempoTotal;

    private HashMap<Integer, Corredor> tiemposCarreras = new HashMap<Integer, Corredor>();

    public Carrera() {
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera,
            int numeroMaxCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.numeroMaxCorredores = numeroMaxCorredores;

    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugarCarrera() {
        return lugarCarrera;
    }

    public void setLugarCarrera(String lugarCarrera) {
        this.lugarCarrera = lugarCarrera;
    }

    public int getNumeroMaxCorredores() {
        return numeroMaxCorredores;
    }

    public void setNumeroMaxCorredores(int numeroMaxCorredores) {
        this.numeroMaxCorredores = numeroMaxCorredores;
    }

    @Override
    public String toString() {
        return "Carrera: " + nombreCarrera + ", fecha: "
                + fecha.format(fechaCarrera)
                + ", lugar: " + lugarCarrera + ", número Max Corredores:"
                + numeroMaxCorredores;
    }

    @Override
    public int compareTo(Carrera t) {
        return this.nombreCarrera.compareTo(t.nombreCarrera);
    }

}
