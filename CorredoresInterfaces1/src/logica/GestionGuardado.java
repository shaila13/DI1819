
package logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.openide.util.Exceptions;

/**
 *
 * @author Shaila
 */
public class GestionGuardado implements Serializable {

    private static final GestionGuardado INSTANCIA = new GestionGuardado();

    private GestionGuardado() {
    }

    public GestionGuardado getInstancia() {
        return INSTANCIA;
    }

    public static void salvarCambios() {
        ObjectOutputStream oos = null;
        try {
            File archivo = new File("LogicaNegocio.dat");
            oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(LogicaNegocio.getInstance());
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            try {
                oos.flush();
                oos.close();
                
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    public static LogicaNegocio cargarInstancia() {
        File archivo = new File("LogicaNegocio.dat");
        LogicaNegocio la = null;
        if (archivo.exists())
        {
            try{
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));

              la =(LogicaNegocio) ois.readObject();
            } catch (FileNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            } catch (ClassNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        else
            //Cambié esto 03/12/2018
            la = new LogicaNegocio();
        
        return la;

    }

}

