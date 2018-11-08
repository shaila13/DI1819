package logica;

import java.text.ParseException;
import vista.ControladorCorredor;

/**
 *
 * @author Shaila
 */
public class MainCorredores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        ControladorCorredor controlador = new ControladorCorredor();
        controlador.menu();
    }
}
