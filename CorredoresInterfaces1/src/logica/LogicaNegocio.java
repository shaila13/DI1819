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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import modelo.Carrera;
import modelo.Corredor;
import modelo.Participantes;
import org.openide.util.Exceptions;

/**
 *
 * @author Shaila
 */
public class LogicaNegocio {

    //Atributos
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private static LogicaNegocio INSTANCE;
    /*Solo deberia haber una sola instacia de la clase, porque si hay varias, 
    va a haber varias listas de corredores.*/
    //segunda manera
    /*Poner el constructor privado, fuera de esta clase no se puede hacer un 
    new fuera de aquí.*/

    private List<Corredor> listaCorredores;
    private List<Carrera> listaCarreras;
    private List<Participantes> listaParticipantes;
    private List<Carrera> listaCarrerasIniciar;
    private boolean resultado = false;
    private int dorsalCorredorBorrado;
    private boolean borrarCorredor = false;

    /**
     * Cosntructor que inicializa arraysList.
     */
    private LogicaNegocio() {
        listaCorredores = new ArrayList<>();
        listaCarreras = new ArrayList<>();
        listaParticipantes = new ArrayList<>();
        listaCarrerasIniciar = new ArrayList<>();
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
     * Método para crear una sola instancia de la lógica del negocio.
     *
     * @return INSTANCE
     */
    public static LogicaNegocio getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LogicaNegocio();
        }
        return INSTANCE;
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
        try {
            //si no pongo true cuando grabe solo graba el primero
            fw = new FileWriter("Corredores.csv", true);
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

    public boolean grabarCarreraConCorredores() {
        String fichero;
        try {
            fichero = listaCarrerasIniciar.get(0).getNombreCarrera() + listaCarrerasIniciar.get(0).
                    getFechaCarrera().getYear() + ".dat";
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject("-------CARRERA-------");
            Iterator<Carrera> carreraIterator = listaCarrerasIniciar.iterator();
            while (carreraIterator.hasNext()) {
                Carrera carrera = carreraIterator.next();
                oos.writeObject(carrera.toString());
            }
            oos.writeObject("\n");
            oos.writeObject("-------CORREDOR-------");
            Iterator<Participantes> participantesIterator = listaParticipantes.iterator();
            while (participantesIterator.hasNext()) {
                Participantes participante = participantesIterator.next();
                oos.writeObject(participante.toString());

            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return true;
    }
}
