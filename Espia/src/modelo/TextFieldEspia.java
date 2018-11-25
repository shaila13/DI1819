package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Shaila
 */
public class TextFieldEspia extends JLabel implements Serializable {

    //Atributos
    private String ficheroLog;
    private String textFieldEspia;
    private GrabarFichero grabarFichero;
    private List<String> listaPalabrasClave = new ArrayList<>();
    //Eventos
    private List<EncuentraPalabrasEspia> listeners = new ArrayList<>();

    /**
     * Constructor sin parámetros.
     */
    public TextFieldEspia() {
        this.listaPalabrasClave = new ArrayList<>();
    }

    public void addEncuentraPalabrasEspia(EncuentraPalabrasEspia listener) {
        this.listeners.add(listener);
    }

    //Getters y Setters por defecto
    public String getFicheroLog() {
        return ficheroLog;
    }

    public void setFicheroLog(String ficheroLog) {
        this.ficheroLog = ficheroLog;
    }

    /**
     * Método para añadir palabra a una lista de palabras clave.
     *
     * @param palabra String.
     * @return booleano con el resultado de la operación.
     */
    public boolean aniadirPalabra(String palabra) {
        if (!listaPalabrasClave.contains(palabra)) {
            listaPalabrasClave.add(palabra);
        }
        return true;
    }

    public void start() throws IOException {
        textFieldEspia = getText();
        if (listaPalabrasClave.contains(textFieldEspia)) {
            //Añadir la palabra al listener
            for (EncuentraPalabrasEspia listener : listeners) {
                listener.escuchadorPalabras(textFieldEspia);
            }
            //Escribir en el fichero ficheroLog la palabra seguida de fecha y hora
            grabarFichero.grabarFichero(ficheroLog, "ficheroLog", textFieldEspia);
        }

    }
}
