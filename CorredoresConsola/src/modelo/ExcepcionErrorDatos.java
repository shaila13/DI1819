package modelo;

/**
 *
 * @author Shaila
 */
public class ExcepcionErrorDatos extends Exception {

    public ExcepcionErrorDatos() {
    }

    public ExcepcionErrorDatos(String codigoError) {
        super(codigoError);

    }
}
