package interfaz.tablas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Carrera;
import modelo.CarreraFinalizada;

/**
 *
 * @author Shaila
 */
public class TableModelCarrerasFinalizada extends AbstractTableModel {

    private final List<CarreraFinalizada> listaCarreraFinalizada;

    private final String[] columnas = {"Nombre", "Fecha", "Lugar", "Núm. "
        + "Máx. Corredores", "Tiempo Total"};

    public TableModelCarrerasFinalizada(List<CarreraFinalizada> finalizadas) {
        this.listaCarreraFinalizada = finalizadas;
    }

    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaCarreraFinalizada.size();
    }

    //Devuelve el número de columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    //Devuelve la columna correspondiente al índice
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    //Este método se llamará una vez por cada una de las celdas que tenga la tabla
    //Evidentemente el número de llamadas a este método depende de lo que haya
    //devuelto la clase en getRowCount y getColumnCount.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCarreraFinalizada.get(rowIndex).getNombreCarrera();
            case 1:
                return listaCarreraFinalizada.get(rowIndex).getFechaCarrera();
            case 2:
                return listaCarreraFinalizada.get(rowIndex).getLugarCarrera();
            case 3:
                return listaCarreraFinalizada.get(rowIndex).getNumeroMaxCorredores();
            case 4:
                return listaCarreraFinalizada.get(rowIndex).getTiempoTotal();
        }
        return null;
    }

}
