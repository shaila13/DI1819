package modelo;

import java.awt.TextField;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shaila
 */
public class EspiaJTextField extends TextField implements Serializable {

    //Atributos
    private String palabraEncontrada;
    private List<String> palabrasEspeciales = new ArrayList<>();
    private List<EncuentraPalabrasEspia> listeners = new ArrayList<>();
    private String ficheroLog = "";
    private GrabarFichero grabarFichero = new GrabarFichero();

    /**
     * Cosntructor sin parámetros.
     */
    public EspiaJTextField() throws IOException {
        palabraEncontrada = getText();
        if (palabrasEspeciales.contains(palabraEncontrada)) {
            //String ruta, String nombreArchivo, String palabra
            grabarFichero.grabarFichero(ficheroLog, "ficheroLog.txt", palabraEncontrada);
            System.out.println("ficheroLog " + palabraEncontrada);
            if (listeners != null) {
                for (EncuentraPalabrasEspia l : listeners) {
                    l.escuchadorPalabras(palabraEncontrada);
                }
            }

        }
    }

    /**
     * Método cuya finalidad es añadir una nueva palabra al componente para
     * buscar.
     *
     * @param palabra a buscar.
     */
    public boolean aniadirPalabra(String palabra) {
        if (!palabrasEspeciales.contains(palabra)) {
            palabrasEspeciales.add(palabra);
        }
        return true;
    }
//Getters y Setters generados por defecto.

    public String getPalabraEncontrada() {

        return palabraEncontrada;
    }

    public void setPalabraEncontrada(String palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }

    public String getFicheroLog() {
        return ficheroLog;
    }

    public void setFicheroLog(String ficheroLog) {
        this.ficheroLog = ficheroLog;
    }

}
