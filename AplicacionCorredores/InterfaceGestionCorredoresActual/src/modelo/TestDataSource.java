package modelo;

import java.util.*;
import logica.LogicaNegocio;

/**
 *
 * @author Shaila
 */
public class TestDataSource {

    //InterfaceGestionCorredoresActual
    //modelo.TestDataSource
    //listaCarreras
    public static List<Carrera> listaCarreras() {
        List<Carrera> listaCarreras = LogicaNegocio.getInstance().getListaCarreras();

        return listaCarreras;
    }

    //InterfaceGestionCorredoresActual
    //modelo.TestDataSource
    //listaParticipantes
    public static List<Participantes> listaParticipantes() {
        List<Participantes> listaParticipantes = LogicaNegocio.getInstance().getListaParticipantes();

        return listaParticipantes;
    }

    //InterfaceGestionCorredoresActual
    //modelo.TestDataSource
    //listaCorredores
    public static List<Corredor> listaCorredores() {
        List<Corredor> listaCorredores = LogicaNegocio.getInstance().getListaCorredores();

        return listaCorredores;
    }

}
