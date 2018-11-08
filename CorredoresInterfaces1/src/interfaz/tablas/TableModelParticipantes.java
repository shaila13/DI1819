package interfaz.tablas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Participantes;

/**
 *
 * @author Shaila
 */
public class TableModelParticipantes extends AbstractTableModel {

    private final List<Participantes> listaParticipantes;

    private final String[] columnas = {"Dorsal", "Tiempo", "Nombre y apellidos",
        "DNI", "Fecha de nacimiento", "Dirección", "Teléfono"};

    public TableModelParticipantes(List<Participantes> lp) {
        this.listaParticipantes = lp;
    }

    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaParticipantes.size();
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
                return listaParticipantes.get(rowIndex).getDorsal();
            case 1:
                return listaParticipantes.get(rowIndex).getTiempoCarrera();
            case 3:
                return listaParticipantes.get(rowIndex).getNombre();
            case 4:
                return listaParticipantes.get(rowIndex).getDni();
            case 5:
                return listaParticipantes.get(rowIndex).getFechaNacimiento();
            case 6:
                return listaParticipantes.get(rowIndex).getDireccion();
            case 7:
                return listaParticipantes.get(rowIndex).getTelefono();
        }
        return null;

    }
}
