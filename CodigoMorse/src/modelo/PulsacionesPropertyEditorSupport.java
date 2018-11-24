package modelo;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Shaila
 */
public class PulsacionesPropertyEditorSupport extends PropertyEditorSupport {

    private PulsacionesPanel duracionPulsaciones = new PulsacionesPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return duracionPulsaciones;
    }

    @Override
    public String getJavaInitializationString() {

        int pulsacionLarga = duracionPulsaciones.getPropiedadesSeleccionadas().
                getDuracionPulsacionLarga();
        int pulsacionCorta= duracionPulsaciones.getPropiedadesSeleccionadas().
                getDuracionPulsacionCorta();
        return "new modelo.BotonMorse("+pulsacionLarga+ ","+ pulsacionCorta + ")";
    }

    @Override
    public Object getValue() {
        return duracionPulsaciones.getPropiedadesSeleccionadas();
    }

}
