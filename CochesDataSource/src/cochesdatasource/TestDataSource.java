
package cochesdatasource;

import java.util.*;

/**
 *
 * @author Shaila
 */
public class TestDataSource {
        public static List<Coche> listaCoches() {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Marca1", "Modelo1", "Matricula1"));
        listaCoches.add(new Coche("Marca2", "Modelo2", "Matricula2"));
        listaCoches.add(new Coche("Marca3", "Modelo3", "Matricula3"));
        listaCoches.add(new Coche("Marca4", "Modelo4", "Matricula4"));
        return listaCoches;
    }
}
