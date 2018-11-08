package logica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import modelo.Corredor;

/**
 *
 * @author Shaila
 */
public class LogicaCorredores {
    /*OJO CON BORRAR NO se puede borrar una lista a la vez que la recorres, 
    se hace con el iterator.*/
    private Map<String, Corredor> corredores = new HashMap<String, Corredor>();
    private List<Corredor> listaCorredoresOrdenados;
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private int respuesta;
    private boolean exito;

    public LogicaCorredores() {
    }

    public Map<String, Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(Map<String, Corredor> corredores) {
        this.corredores = corredores;
    }

    public List<Corredor> getListaCorredoresOrdenados() {
        return listaCorredoresOrdenados;
    }

    public void setListaCorredoresOrdenados(List<Corredor> listaCorredoresOrdenados) {
        this.listaCorredoresOrdenados = listaCorredoresOrdenados;
    }

    public boolean añadirCorredorColeccion(Corredor corredor) {
        corredores.put(corredor.getDni(), corredor);
        exito = true;
        return exito;
    }

    public int darBajaCorredor(String dniCorredor) {
        if (corredores.containsKey(dniCorredor)) {
            corredores.remove(dniCorredor);
            respuesta = 0;
        } else if (corredores.size() == 0) {
            respuesta = -1;
        } else {
            respuesta = 1;
        }
        return respuesta;
    }

    public int buscarCorredor(String dniCorredor) {
        if (corredores.containsKey(dniCorredor)) {
            respuesta = 0;
        } else if (corredores.size() == 0) {
            respuesta = -1;
        } else {
            respuesta = 1;
        }
        return respuesta;
    }

    public void ordenarCorredores() {
        List<Corredor> listaCorredoresOrdenados = new ArrayList<Corredor>(corredores.values());
        Collections.sort(listaCorredoresOrdenados, new Comparator<Corredor>()  {
                        @Override
            public int compare(Corredor o1, Corredor o2) {
            return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
               
            }
        });
        for (Corredor corredor : listaCorredoresOrdenados) {
            System.out.println(corredor.toString());
        }
    }
    public void verColeccion() {
        Iterator it = corredores.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + corredores.get(key));
        }
    }
}
