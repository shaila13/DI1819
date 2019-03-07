package temporizador;


import java.io.File;
import java.io.Serializable;
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

    /*private String textoFin = "¡¡¡ FFF III NNN !!!";
    private Color colorFin;*/
    private TextoFinContador textoYcolor;
    private boolean decimales;
    private File imagenFin = new File("imgs" + File.separator + "icon.gif");//es una ruta tipo file
    private double segundosDecimales;
    private List<CuentaAtrasFinalizada> listeners = new ArrayList<>();

    /**
     * Constructor sin parámetros.
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

    public boolean isDecimales() {
        return decimales;
    }

    public void setDecimales(boolean decimales) {
        this.decimales = decimales;
    }

    public TextoFinContador getTextoYcolor() {
        return textoYcolor;
    }

    public void setTextoYcolor(TextoFinContador textoYcolor) {
        this.textoYcolor = textoYcolor;
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
                if (segundosDecimales > 0.0F && segundos > 0) {
                    if (decimales == true) {
                        String strDouble = String.format("%.1f", segundosDecimales);
                        segundosDecimales -= 0.1;
                        setText(strDouble);
                    } else {
                        setText(Integer.toString(segundos--));
                    }
                } else {
                    setText(textoYcolor.getTextoIntroducido());//propiedad "añadir un texto"
                    setForeground(textoYcolor.getColorTexto());//propiedad "añadir color"

                    if (imagenFin.getAbsolutePath() != null && imagenFin.exists()) {
                        setIcon(new ImageIcon(imagenFin.getAbsolutePath()));//añadir imagen
                    }
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
