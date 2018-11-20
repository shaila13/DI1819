package temporizador;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Annie
 */
public class Temporizador extends JLabel implements Serializable {

    //Atributos
    private int segundos;
    private String textoFin = "¡¡¡ FFF III NNN !!!";
    private Color colorFin;
    private boolean decimales;
    private File imagenFin = new File("imgs"+ File.separator +"icon.gif");//es una ruta tipo file
    private double segundosDecimales;
    private List<CuentaAtrasFinalizada> listeners = new ArrayList<>();

    /**
     * Cosntructor sin parámetros.
     */
    public Temporizador() {

    }

    public void addCuentaAtrasFinalizadaListener(CuentaAtrasFinalizada listener) {
        this.listeners.add(listener);
    }

//Getters y Setters generados por defecto.
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getTextoFin() {
        return textoFin;
    }

    public void setTextoFin(String textoFin) {
        this.textoFin = textoFin;
    }

    public Color getColorFin() {
        return colorFin;
    }

    public void setColorFin(Color colorFin) {
        this.colorFin = colorFin;
    }

    public boolean isDecimales() {
        return decimales;
    }

    public void setDecimales(boolean decimales) {
        this.decimales = decimales;
    }

    public File getImagenFin() {
        return imagenFin;
    }

    public void setImagenFin(File imagenFin) {
        this.imagenFin = imagenFin;
    }

    public void start() {

        setText(Integer.toString(segundos));
        segundosDecimales = segundos;
        /**
         * Para hacer que algo se ejecute cada cierto tiempo. Usar el
         * java.util.Timer en el import
         */
        Timer timer = new Timer();
        /**
         * Schedule: planificar. task: que tarea vamos a ejecutar. time: cuando
         */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (segundos > 0 && segundosDecimales > 0) {
                    if (decimales == true) {
                        /*DecimalFormat df = new DecimalFormat("#.##");
                        df.setRoundingMode(RoundingMode.CEILING);*/
                        //String strDouble = String.format("%.2f",numeroquesea);
                        segundosDecimales -= 0.1;
                        setText(Double.toString(segundosDecimales));//MAL 
                    } else {
                        setText(Integer.toString(segundos--));
                    }
                } else {
                    setText(textoFin);//propiedad "añadir un texto"
                    setForeground(colorFin);//propiedad "añadir color"
                    setIcon(new ImageIcon(imagenFin.getAbsolutePath()));//añadir imagen
                    cancel();
                    if (listeners != null) {
                        for (CuentaAtrasFinalizada l : listeners) {
                            l.ejecutar();
                        }
                    }
                }

            }
        }, 0, 1000);

    }
}
