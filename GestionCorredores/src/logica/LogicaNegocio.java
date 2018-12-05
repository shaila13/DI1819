package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import modelo.Carrera;
import modelo.CarreraFinalizada;
import modelo.Corredor;
import modelo.Participantes;
import org.openide.util.Exceptions;

/**
 * private transient palabra señalada para que no grabe Serializable
 *
 * @author Shaila
 */
public class LogicaNegocio implements Serializable {

    //Atributos
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private static LogicaNegocio INSTANCE = GestionGuardado.cargarInstancia();
    private transient Timer time;
    private long tiempoActualizacionAutomatica = 0;
    /*Solo deberia haber una sola instacia de la clase, porque si hay varias, 
    va a haber varias listas de corredores.*/
    //segunda manera
    /*Poner el constructor privado, fuera de esta clase no se puede hacer un 
    new fuera de aquí.*/

    private List<Corredor> listaCorredores;
    private List<Carrera> listaCarreras;
    private List<Participantes> listaParticipantes;
    private List<Carrera> listaCarrerasIniciar;
    private List<CarreraFinalizada> listaCarrerasFinalizadas;
    private boolean resultado = false;
    private int dorsalCorredorBorrado;
    private boolean borrarCorredor = false;

    /**
     * Constructor que inicializa arraysList.
     */
    LogicaNegocio() {
        listaCorredores = new ArrayList<>();
        listaCarreras = new ArrayList<>();
        listaParticipantes = new ArrayList<>();
        listaCarrerasIniciar = new ArrayList<>();
        listaCarrerasFinalizadas = new ArrayList<>();
    }

    /**
     * Método para crear una sola instancia de la lógica del negocio.
     *
     * @return INSTANCE
     */
    public static LogicaNegocio getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        LogicaNegocio logicaNegocio = new LogicaNegocio();
        return logicaNegocio;
    }

//Getters y Setters
    public boolean isBorrarCorredor() {
        return borrarCorredor;
    }

    public void setBorrarCorredor(boolean borrarCorredor) {
        this.borrarCorredor = borrarCorredor;
    }

    public void setDorsalCorredorBorrado(int dorsalCorredorBorrado) {
        this.dorsalCorredorBorrado = dorsalCorredorBorrado;
    }

    public int getDorsalCorredorBorrado() {
        return dorsalCorredorBorrado;
    }

    public List<Carrera> getListaCarrerasIniciar() {
        return listaCarrerasIniciar;
    }

    public void setListaCarrerasIniciar(List<Carrera> listaCarrerasIniciar) {
        this.listaCarrerasIniciar = listaCarrerasIniciar;
    }

    public List<Participantes> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<Participantes> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    //hay que meter el objeto
    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    /**
     * Método para borrar un participante de la lista de participantes de la
     * carrera.
     *
     * @param participante
     */
    public void borrarParticipante(Participantes participante) {
        if (listaParticipantes.contains(participante)) {
            listaParticipantes.remove(participante);
        }
    }

    /**
     * Método para borrar un corredor de la lista de corredores.
     *
     * @param corredor
     */
    public void borrarCorredor(Corredor corredor) {
        if (listaCorredores.contains(corredor)) {
            listaCorredores.remove(corredor);
        }
    }

    /**
     * Método para borrar una carrera de la lista de carreras.
     *
     * @param carrera
     */
    public void borrarCarrera(Carrera carrera) {
        if (listaCarreras.contains(carrera)) {
            listaCarreras.remove(carrera);
        }
    }

    /**
     * Método para borrar la carrera actual.
     *
     * @param carrera
     */
    public void borrarCarreraIniciar(Carrera carrera) {
        if (listaCarrerasIniciar.contains(carrera)) {
            listaCarrerasIniciar.remove(carrera);
        }
    }

    /**
     * Método para borrar la carrera finalizada.
     *
     * @param carrera
     */
    public void borrarCarreraFinalizada(CarreraFinalizada carrera) {
        if (listaCarrerasFinalizadas.contains(carrera)) {
            listaCarrerasFinalizadas.remove(carrera);
        }
    }

    /**
     * Método para añadir una carrera finalizada a la lista.
     *
     * @param carrera
     * @return
     * @throws ParseException
     */
    public boolean anadirCarreraAlistaFinalizadas(CarreraFinalizada carrera)
            throws ParseException {

        if (!listaCarrerasFinalizadas.contains(carrera)) {
            listaCarrerasFinalizadas.add(carrera);
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Método para añadir un participante a la lista de participantes.
     *
     * @param participante
     * @throws ParseException
     */
    public boolean anadirCorredorListaCarreraIniciada(Participantes participante)
            throws ParseException {

        if (!listaParticipantes.contains(participante)) {
            listaParticipantes.add(participante);
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Método para añadir un corredor a la lista de corredores.
     *
     * @param corredor
     * @throws ParseException
     */
    public void anadirCorredorLista(Corredor corredor) throws ParseException {
        if (!listaCorredores.contains(corredor)) {
            listaCorredores.add(corredor);
        }
    }

    /**
     * Método para añadir una carrera a la lista de carreras.
     *
     * @param carrera
     */
    public void anadirCarreraLista(Carrera carrera) {
        if (!listaCarreras.contains(carrera)) {
            listaCarreras.add(carrera);
        }

    }

    /**
     * Método para añadir una carrera a la lista de carreras inciadas.
     *
     * @param carrera
     */
    public void anadirCarreraListaCarreraIniciada(Carrera carrera) {
        if (!listaCarrerasIniciar.contains(carrera)) {
            listaCarrerasIniciar.add(carrera);
        }

    }

    /**
     * Método para ver la lista de corredores.
     */
    public void verListaCorredores() {
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<Corredor> nombreIterator = listaCorredores.iterator();
        while (nombreIterator.hasNext()) {
            Corredor elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
    }

    /**
     * Método para ver la lista de carreras.
     */
    public void verListaCarreras() {
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<Carrera> nombreIterator = listaCarreras.iterator();
        while (nombreIterator.hasNext()) {
            Carrera elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
    }

    /**
     * Método para grabar los corredores en un CSV.
     */
    public void grabarCSVCorredores() {
        Corredor corredor;
        FileWriter fw = null;
        String linea;
        File fichero = new File("Corredores.csv");
        //Poner si ya existe que me lo sobrescriba
        try {
            if (fichero.exists()) {
                fichero.delete();
                //si no pongo true cuando grabe solo graba el primero
                fw = new FileWriter(fichero, true);
                BufferedWriter fsalida = new BufferedWriter(fw);
                //leemos el primer registro

                for (Corredor elemento : listaCorredores) {
                    String fnacimiento = fecha.format(elemento.getFechaNacimiento());
                    fsalida.write(elemento.getNombre() + "," + elemento.getDni()
                            + "," + fnacimiento + "," + elemento.getDireccion()
                            + "," + elemento.getTelefono() + "\n");
                }
                fsalida.flush();
                fsalida.close();
            } else {
                //si no pongo true cuando grabe solo graba el primero
                fw = new FileWriter(fichero, true);
                BufferedWriter fsalida = new BufferedWriter(fw);
                //leemos el primer registro

                for (Corredor elemento : listaCorredores) {
                    String fnacimiento = fecha.format(elemento.getFechaNacimiento());
                    fsalida.write(elemento.getNombre() + "," + elemento.getDni()
                            + "," + fnacimiento + "," + elemento.getDireccion()
                            + "," + elemento.getTelefono() + "\n");
                }
                fsalida.flush();
                fsalida.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

    /**
     * Método para cargar los corredores de un CSV.
     */
    public void cargarCSVCorredores() throws ParseException {
        Corredor p;
        FileWriter fw = null;
        File file = new File("Corredores.csv");
        Iterator it = listaCorredores.iterator();
        if (file.exists()) {
            String linea;
            try {

                BufferedReader br = new BufferedReader(new FileReader("Corredores.csv"));
                linea = br.readLine(); //lee la primera linea

                while (linea != null) {
                    StringTokenizer srt = new StringTokenizer(linea, ",");
                    while (srt.hasMoreTokens()) {
                        String nombre = srt.nextToken().trim();
                        //mirar con punto ruptura
                        String dni = srt.nextToken().trim();
                        Date fechaNacimiento = fecha.parse(srt.nextToken().trim());
                        String direccion = srt.nextToken().trim();
                        int telefono = Integer.parseInt(srt.nextToken().trim());
                        p = new Corredor(nombre, dni, fechaNacimiento,
                                direccion, telefono);
                        listaCorredores.add(p);
                    }
                    linea = br.readLine();
                }
                br.close();

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Método para grabar la carrera con los participantes.
     *
     * @return boolean con el resultado de la operación.
     */
    public boolean grabarCarrera(CarreraFinalizada carrera) {

        FileWriter fw = null;
        String linea;
        File fichero = new File("CarreraFinalizada.csv");
        //Poner si ya existe que me lo sobrescriba
        try {
            if (fichero.exists()) {
                fichero.delete();
                //si no pongo true cuando grabe solo graba el primero
                fw = new FileWriter(fichero, true);
                BufferedWriter fsalida = new BufferedWriter(fw);
                //leemos el primer registro

                for (CarreraFinalizada elemento : listaCarrerasFinalizadas) {
                    String fechaCarrera=fecha.format(elemento.getFechaCarrera());
                    fsalida.write(elemento.getNombreCarrera() + "," + elemento.getLugarCarrera()
                            + "," + fechaCarrera + "," + elemento.getNumeroMaxCorredores()
                            + "," + elemento.getTiempoTotal() + "\n");
                }
                fsalida.flush();
                fsalida.close();
            } else {
                //si no pongo true cuando grabe solo graba el primero
                fw = new FileWriter(fichero, true);
                BufferedWriter fsalida = new BufferedWriter(fw);
                //leemos el primer registro

                fsalida.flush();
                fsalida.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }

        return true;
    }

    /**
     * Método para iniciar el guardado automático de los valores de la
     * aplicación, si no se selecciona, se pone por defecto 5 minutos.
     *
     * @param automaticSave tiempo en minutos para ejecutar el timer de
     * autoguardado.
     */
    public void iniciarGuardadoAutomatico(int automaticSave) {

        if (automaticSave == 0) {
            tiempoActualizacionAutomatica = 5 * 60 * 1000;
        }
        tiempoActualizacionAutomatica = automaticSave * 60 * 1000;
        if (time == null) {
            time = new Timer();
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    //grabarCarrera(carrera);
                }
            }, tiempoActualizacionAutomatica);
        } else if (time != null) {
            time.cancel();
            time = new Timer();
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    //grabarCarrera(carrera);
                }
            }, tiempoActualizacionAutomatica);

        }

    }

}
