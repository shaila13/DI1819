package temporizador;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Shaila
 */
public class TextoFinContador implements Serializable {

    //Atributos
    private String textoIntroducido;
    private Color colorTexto;

    /**
     * Constructor al que se le pasan por parámetro el texto que se introduce y
     * el color.
     *
     * @param textoIntroducido
     * @param colorTexto
     */
    public TextoFinContador(String textoIntroducido, Color colorTexto) {
        this.textoIntroducido = textoIntroducido;
        this.colorTexto = colorTexto;
    }

    //Getters y Setters
    public String getTextoIntroducido() {
        return textoIntroducido;
    }

    public void setTextoIntroducido(String textoIntroducido) {
        this.textoIntroducido = textoIntroducido;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

}
