package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Shaila
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {
//Atributos

    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();

    /**
     * Lo llama netbeans cuando quiere preguntar si hay un editor de propiedades
     * personalizado.
     *
     * @return
     */
    @Override
    public boolean supportsCustomEditor() {
        return true;

    }

    /**
     * Pide el panel que va a insertar luego.
     *
     * @return
     */
    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel;
    }

    /**
     * Meter un String. OJO!!! Cuando las comillas vayan con un String hay que
     * poner la barra de escape \"" + "
     *
     * @return
     */
    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = imagenFondoPanel.getSelectedValue();
        String rutaImagenFondo = imagenFondo.getRutaImagen().getAbsolutePath();
        rutaImagenFondo = rutaImagenFondo.replace("\\", "\\\\");
        return "new jpanelimagen.ImagenFondo("+"new java.io.File(\""+rutaImagenFondo+"\"),"+imagenFondo.getOpacidad()+"f)";
        
    }

    /**
     * Devuelve la propiedad que nosotros hemos creado.
     *
     * @return
     */
    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }

}
