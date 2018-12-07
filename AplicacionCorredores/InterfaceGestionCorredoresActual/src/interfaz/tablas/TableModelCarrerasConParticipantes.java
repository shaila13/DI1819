package interfaz.tablas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Carrera;

/**
 *
 * @author Shaila
 */
public class TableModelCarrerasConParticipantes extends AbstractTableModel {

    private final List<Carrera> listaCarrerasIniciar;

    private final String[] columnas = {"Nombre", "Fecha", "Lugar", "Núm. "
        + "Máx. Corredores", "Tiempo Total"};

    public TableModelCarrerasConParticipantes(List<Carrera> listaCarrerasIniciar) {
        this.listaCarrerasIniciar = listaCarrerasIniciar;
    }

    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaCarrerasIniciar.size();
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
                return listaCarrerasIniciar.get(rowIndex).getNombreCarrera();
            case 1:
                return listaCarrerasIniciar.get(rowIndex).getFechaCarrera();
            case 2:
                return listaCarrerasIniciar.get(rowIndex).getLugarCarrera();
            case 3:
                return listaCarrerasIniciar.get(rowIndex).getNumeroMaxCorredores();
            case 4:
                return listaCarrerasIniciar.get(rowIndex).getTiempoTotal();
        }
        return null;
    }

}
