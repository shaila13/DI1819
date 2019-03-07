package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shaila
 */
public class Carrera implements Serializable, Comparable<Carrera> {

    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private boolean finalizada;
    private List<Participantes> listaParticipantes;
    private String nombreCarrera = "";
    private Date fechaCarrera;
    private String lugarCarrera = "";
    private int numeroMaxCorredores;
    private int numeroParticipantes;
    private String tiempoTotal = "";
    private String estado = "";
    private int idCarrera;

    public Carrera() {
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugarCarrera,
            int numeroMaxCorredores, boolean finalizada) {
        this.nombreCarrera = nombreCarrera;
        this.listaParticipantes = new ArrayList<>();
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.numeroMaxCorredores = numeroMaxCorredores;
        this.tiempoTotal = "00:00:00";
        this.estado = (finalizada == true ? "Finalizada" : "Pendiente");
    }

    public Carrera(String nombreCarrera, String lugarCarrera,
            int numeroMaxCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.lugarCarrera = lugarCarrera;
        this.numeroMaxCorredores = numeroMaxCorredores;

    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<Participantes> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<Participantes> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(String tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
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
    public int compareTo(Carrera t) {
        return this.nombreCarrera.compareTo(t.nombreCarrera);
    }

    @Override
    public String toString() {
        return "Carrera: " + nombreCarrera + ", fecha: "
                + fecha.format(fechaCarrera)
                + ", lugar: " + lugarCarrera + ", número Max Corredores:"
                + numeroMaxCorredores + ", tiempo carrera:" + tiempoTotal;
    }

}
