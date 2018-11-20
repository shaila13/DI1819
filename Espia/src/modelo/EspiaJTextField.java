package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Shaila
 */
public class EspiaJTextField extends JTextField implements Serializable {


    //Atributos
    private List<String> palabrasEspeciales = new ArrayList<>();
    private List<Espia> listeners = new ArrayList<>();
    private String ficheroLog = "ficheroLog.txt";

    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");

    /**
     * Cosntructor sin parámetros.
     */
    public EspiaJTextField() {

    }

//Getters y Setters generados por defecto.
    /**
     * Método cuya finalidad es añadir una nueva palabra al componente para
     * buscar.
     *
     * @param palabra a buscar.
     */
    public boolean aniadirPalabra(String palabra) {
        if (!palabrasEspeciales.contains(palabra)) {
            palabrasEspeciales.add(palabra);
            return true;
        }
        return false;
    }

    public void start() throws IOException {
        File informacion = new File(ficheroLog);

        if (true) {

            int contador = 0;

            String archivo_destino = informacion.getAbsolutePath();
            FileWriter escritura = new FileWriter(archivo_destino);

            try {
                escritura.write(palabraEncontrada);
                escritura.write("\n");
                escritura.write("\n");
            } catch (IOException e) {
            }

            escritura.close();
        }
    }

}
