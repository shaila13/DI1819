package temporizador;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Shaila
 */
public class ColoresYtextosPropertyEditorSupport extends PropertyEditorSupport {

    private ImagenFinContadorPanel coloresYtextos = new ImagenFinContadorPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return coloresYtextos;
    }

    @Override
    public String getJavaInitializationString() {

        Color colorTexto = coloresYtextos.getPropiedadesSeleccionadas().getColorTexto();
        String textoIntroducido = coloresYtextos.getPropiedadesSeleccionadas().getTextoIntroducido();
        return "new temporizador.TextoFinContador(\""+textoIntroducido+ "\",new "
                + "java.awt.Color(" + colorTexto.getRGB() + "))";
    }

    @Override
    public Object getValue() {
        return coloresYtextos.getPropiedadesSeleccionadas();
    }

}
