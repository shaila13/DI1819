
package cochesdatasource;

import java.util.*;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author Shaila
 */
public class CochesDataSource {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException {
        
        //preparamos los datos a formatear en un informe
        List<Coche> listaCoches = new ArrayList<Coche>();
        listaCoches.add(new Coche("Marca1", "Modelo1", "Matricula1"));
        listaCoches.add(new Coche("Marca2", "Modelo2", "Matricula2"));
        listaCoches.add(new Coche("Marca3", "Modelo3", "Matricula3"));
        listaCoches.add(new Coche("Marca4", "Modelo4", "Matricula4"));
        
        //Adaptamos estos datos a la estructura del jasper para crear el informe
        JRDataSource dataSource = new JRBeanCollectionDataSource(listaCoches);
        Map parametros = new HashMap();
        JasperPrint print= JasperFillManager.fillReport("pruebacoches.jasper",parametros,dataSource);
        JasperExportManager.exportReportToPdfFile(print,"pruebaCoches.pdf");
    }
    
}
