package modelo;

import java.text.SimpleDateFormat;

/**
 *
 * @author Shaila
 */
public class UtilsFechas {

    //Atributos
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private static UtilsFechas INSTANCE;

    /**
     * Constructor privado.
     */
    private UtilsFechas() {
    }

    /**
     * Método para crear una sola instancia de la lógica del negocio.
     *
     * @return INSTANCE
     */
    public static UtilsFechas getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UtilsFechas();
        }
        return INSTANCE;
    }

}
