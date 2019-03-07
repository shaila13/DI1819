package modelo;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Shaila
 */
public class GrabarFichero {

    private SimpleDateFormat fechaActual = new SimpleDateFormat("dd/MM/YY");
    private SimpleDateFormat horaActual = new SimpleDateFormat("hh/mm/ss");

    public void grabarFichero(String ruta, String nombreArchivo, String palabra) throws IOException {

        File archivoEspia = new File(ruta + File.separator + nombreArchivo);

        String archivo_destino = archivoEspia.getAbsolutePath();

        FileWriter escritura = new FileWriter(archivo_destino);
        Date date = new Date();

        try {
            escritura.write("La palabra: " +palabra + " ha sido escrita en la "
                    + "fecha " + fechaActual.format(date.getTime())
                    + " a las " + horaActual.format(date.getTime()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        escritura.close();
    }
}
