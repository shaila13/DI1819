package modelo;

import java.text.SimpleDateFormat;


/**
 *
 * @author Shaila
 */
public class SimpleDateFormato {

    private static SimpleDateFormato INSTANCE;
    private SimpleDateFormat fecha;

    /*Solo deberia haber una sola instacia de la clase, porque si hay varias, 
    va a haber varias listas de corredores.*/
//segunda manera
    /*Poner el constructor privado, fuera de esta clase no se puede hacer un 
    new fuera de aquí.*/
    private SimpleDateFormato() {
        fecha = new SimpleDateFormat("dd/MM/yy");
    }

    public static SimpleDateFormato getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleDateFormato();
        }
        return INSTANCE;
    }

    public SimpleDateFormat getFecha() {
        return fecha;
    }

    public void setFecha(SimpleDateFormat fecha) {
        this.fecha = fecha;
    }

}
