package cronometro.modelo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    private List<LLegadaCorredor> listeners = new ArrayList<>();
    private List<LLegadaCorredor> listenerPausar = new ArrayList<>();

    /**
     * Constructor sin parámetros.
     */
    public CronometroPropio() {

        //meto aquí el evento de mouseclick
        /*        this.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
        int tiempoLlegada = 0;
        int dorsal = 0;
        /*if (LLegadaCorredor != null) {
        ejecutar(dorsal, tiempoLlegada);
        } //To change body of generated methods, choose Tools | Templates.
        }
        
    });
         */
    }

    /*
      Hacer un método pausar que lleve todo el código que tengo en la interface y lo llamo desde allí
           public void pausar(){
    //pausas
    fore pausarlistener
        pausarlistener.ejecutar()
    //aqui solo llamo al listener
    
    }
     */
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

    public List<LLegadaCorredor> getListeners() {
        return listeners;
    }

    public void setListeners(List<LLegadaCorredor> listeners) {
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
                    /*for (LLegadaCorredor l : listeners) {
                    l.ejecutar();
                    }*/
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

            }
        }, 0, 1000);

    }

    public boolean addCuentaAtrasFinalizadaListener(LLegadaCorredor listener) {
        return this.listeners.add(listener);
    }

    public boolean addPausaListener(LLegadaCorredor listener) {
        return this.listenerPausar.add(listener);
    }

    public void ejecutarListeners() {

    }
}
