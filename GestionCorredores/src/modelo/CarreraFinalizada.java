package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shaila
 */
public class CarreraFinalizada extends Carrera implements Serializable {

    private boolean finalizada;
    private List<Participantes> listaParticipantes;

    public CarreraFinalizada() {
    }

    public CarreraFinalizada(boolean finalizada, List<Participantes> listaParticipantes,
            Date fechaCarrera, String lugarCarrera, int numeroMaxCorredores,
            String tiempoTotal) {
        super(fechaCarrera, lugarCarrera, numeroMaxCorredores, tiempoTotal);
        this.finalizada = finalizada;
        this.listaParticipantes = listaParticipantes;
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

}
