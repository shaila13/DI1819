package cronometro.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JLabel;
import java.util.Timer;

/**
 *
 * @author Shaila
 */
public class CronometroPropio extends JLabel implements Serializable {

//Atributos
    private int h, m, s;
    private boolean parar;
    private String tiempo;
    private Timer timer;
    private List<CronometroListener> listeners = new ArrayList<>();

    /**
     * Cosntructor sin parámetros.
     */
    public CronometroPropio() {

    }

    public void addCuentaAtrasFinalizadaListener(CronometroListener listener) {
        this.listeners.add(listener);
    }

    public Timer getTimer() {
        return timer;
    }

//Getters y Setters generados por defecto.
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public List<CronometroListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<CronometroListener> listeners) {
        this.listeners = listeners;
    }

    public void actualizarCronometro() {
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m
                + ":" + (s <= 9 ? "0" : "") + s;
        //System.out.println("Tiempo en clase cronometro: " + tiempo);
        setText(tiempo);
    }

    public boolean isParar() {
        return parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }

    public void start() {
        //setText(tiempo);
        /**
         * Para hacer que algo se ejecute cada cierto tiempo. Usar el
         * java.util.Timer en el import
         */
        timer = new Timer();
//Schedule: planificar. task: que tarea vamos a ejecutar. time: cuando
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (parar) {
                    cancel();
                } else {
                    ++s;
                    if (s == 60) {
                        s = 0;
                        ++m;
                    }
                    if (m == 60) {
                        m = 0;
                        ++h;
                    }
                    actualizarCronometro();
                }
                if (listeners != null) {
                    for (CronometroListener l : listeners) {
                        l.ejecutar();
                    }
                }
            }
        }, 0, 1000);

    }
}
