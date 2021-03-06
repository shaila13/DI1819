package interfaz;

import interfaz.tablas.TableModelCarreras;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import logica.LogicaNegocio;
import modelo.Carrera;
import org.openide.util.Exceptions;

/**
 *
 * @author Shaila
 */
public class DialogTablaCarreras extends javax.swing.JDialog {

    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";
    private int posicionCarreraFinalizada;
    /**
     * Creates new form TablaCorredores
     */
    LogicaNegocio logicaNegocio = LogicaNegocio.getInstance();

    public DialogTablaCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //ponLaAyuda();
        setLocationRelativeTo(null);
        setTitle("TABLA CARRERAS.");

        //Establecer el logo del a aplicación
        //setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarreras();
    }
    public DialogTablaCarreras(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ponLaAyuda();
        setLocationRelativeTo(null);
        setTitle("TABLA CARRERAS.");

        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarreras();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTablaCarreras = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAlta = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonGestionarCarrera = new javax.swing.JButton();
        jButtonResultadoCarreras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuSalir1 = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTablaCarreras.setBackground(new java.awt.Color(0, 153, 204));
        jPanelTablaCarreras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta y Modificación de Carreras en Base de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16))); // NOI18N
        jPanelTablaCarreras.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión del Evento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jButtonAlta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonAlta.setText("Alta carrera");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonModificar.setText("Modificar Carrera");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonGestionarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonGestionarCarrera.setText("Gestión Carrera");
        jButtonGestionarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarCarreraActionPerformed(evt);
            }
        });

        jButtonResultadoCarreras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonResultadoCarreras.setText("Resultado Carreras");
        jButtonResultadoCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadoCarrerasActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("Seleccione una opción:");
        jLabel2.setToolTipText("Introduzca euros a apostar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonModificar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonGestionarCarrera)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonResultadoCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonResultadoCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonGestionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel3.setBackground(new java.awt.Color(255, 204, 255));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Listado de Carreras:");
        jLabel3.setToolTipText("Introduzca euros a apostar");

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCarreras);

        javax.swing.GroupLayout jPanelTablaCarrerasLayout = new javax.swing.GroupLayout(jPanelTablaCarreras);
        jPanelTablaCarreras.setLayout(jPanelTablaCarrerasLayout);
        jPanelTablaCarrerasLayout.setHorizontalGroup(
            jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTablaCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTablaCarrerasLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTablaCarrerasLayout.setVerticalGroup(
            jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaCarrerasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(102, 153, 255));

        jMenuSalir1.setText(org.openide.util.NbBundle.getMessage(DialogTablaCarreras.class, "DialogGestionarCarrera.jMenuSalir1.text")); // NOI18N
        jMenuSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalir1ActionPerformed(evt);
            }
        });

        jMenuItemAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAyuda.setText(org.openide.util.NbBundle.getMessage(DialogTablaCarreras.class, "DialogGestionarCarrera.jMenuItemAyuda.text")); // NOI18N
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenuSalir1.add(jMenuItemAyuda);

        jMenuBar2.add(jMenuSalir1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelTablaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTablaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed

    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    private void jMenuSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalir1ActionPerformed

    }//GEN-LAST:event_jMenuSalir1ActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        int seleccionado = jTableCarreras.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                "!!ERROR!!", JOptionPane.ERROR_MESSAGE);

        } else if (logicaNegocio.getListaCarreras().get(seleccionado).isFinalizada()) {
            JOptionPane.showMessageDialog(this, "Carrera ya finalizada, no se puede borrar.",
                "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            Carrera carreraBorrar = logicaNegocio.getListaCarreras().get(seleccionado);

            int confirmación = JOptionPane.showConfirmDialog(this, "¿Quiere borrar el registro?",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmación == JOptionPane.YES_OPTION) {
                logicaNegocio.borrarCarrera(carreraBorrar);
                JOptionPane.showMessageDialog(this, "Se ha borrado la carrera.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
            } else if (confirmación == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "No se ha borrado la carrera.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
            }
            rellenarTablaCarreras();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int seleccionado = jTableCarreras.getSelectedRow();
        
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                "!!ERROR!!", JOptionPane.ERROR_MESSAGE);

        } else if (logicaNegocio.getListaCarreras().get(seleccionado).isFinalizada()) {
            JOptionPane.showMessageDialog(this, "Carrera ya finalizada, no se puede modificar.",
                "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);

        } else {
            Carrera carreraModificar = logicaNegocio.getListaCarreras().get(seleccionado);
            DialogFormularioCarreras dialogoModificar = new DialogFormularioCarreras(this,
                true, carreraModificar);
            dialogoModificar.setLocationRelativeTo(null);
            dialogoModificar.setVisible(true);
            rellenarTablaCarreras();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        DialogFormularioCarreras dialogoAlta = new DialogFormularioCarreras(this, true, logicaNegocio);
        dialogoAlta.setLocationRelativeTo(null);
        dialogoAlta.setVisible(true);
        rellenarTablaCarreras();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonGestionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarCarreraActionPerformed
        int selectedRow = jTableCarreras.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            int seleccionado = jTableCarreras.convertRowIndexToModel(selectedRow);
            if (!logicaNegocio.getListaCarreras().get(seleccionado).isFinalizada()) {
                posicionCarreraFinalizada = logicaNegocio.getListaCarrerasFinalizadas().size();
                Carrera carreraAcorrer = logicaNegocio.getListaCarreras().get(seleccionado);
                logicaNegocio.setIdCarrera(posicionCarreraFinalizada);
                carreraAcorrer.setIdCarrera(posicionCarreraFinalizada);

                DialogGestionarCarrera dialogGestionarCarrera = new DialogGestionarCarrera(this, true,
                    carreraAcorrer);
                dialogGestionarCarrera.setLocationRelativeTo(null);
                dialogGestionarCarrera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Carrera ya finalizada.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonGestionarCarreraActionPerformed

    private void jButtonResultadoCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadoCarrerasActionPerformed

        DialogTablaCarrerasFinalizadas resultadoCarreraFinalizada
        = new DialogTablaCarrerasFinalizadas(this, true);
        resultadoCarreraFinalizada.setLocationRelativeTo(null);
        resultadoCarreraFinalizada.setVisible(true);

    }//GEN-LAST:event_jButtonResultadoCarrerasActionPerformed

//Utilizando un AbstractTableModel
    private void rellenarTablaCarreras() {

        //La lista que tenemos en logica negocio no la tocamos, va a ser el jtable quién lo haga
        TableModelCarreras tableModelCarreras = new TableModelCarreras(logicaNegocio.getListaCarreras());
        jTableCarreras.setModel(tableModelCarreras);
        TableRowSorter<TableModelCarreras> sorter = new TableRowSorter<>(tableModelCarreras);
        jTableCarreras.setRowSorter(sorter);

        List<SortKey> sortKeys = new ArrayList<>();
        //Creamos uno nuevo y le pasamos dos valores, 
        //el primero la columna por la que queremos ordenar y el orden
        sortKeys.add(new SortKey(1,SortOrder.ASCENDING));
        //indicar claves ordenación
        sorter.setSortKeys(sortKeys);
        
    }

        /**
     * Método que incorpora la ayuda en nuestro proyecto.
     */
    private void ponLaAyuda() {
        try {
            //Carga el fichero de ayuda
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            //Si metemos la carpeta help en src tenemos que quitar lo anterior y poner
            /**
             * URL ayuda = getClass().getResource("ruta"); File
             * ficheroAyudaEnJar = new File(ayuda.toURI());
             */
            //Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            /**
             * Pone ayuda a item de menu al pulsarlo y a F1 en ventana ppal y
             * secundaria.
             */
            hb.enableHelpOnButton(jMenuItemAyuda, "aplicacion", helpset);
            //Al pulsar F1 salta la ayuda
            hb.enableHelpKey(getRootPane(), "aplicacion", helpset);
            /*hb.enableHelpKey(jButton1, "ventana_principal", helpset);
            hb.enableHelpKey(jButton2, "ventana_secundaria", helpset);
            hb.enableHelpKey(jButton1, "ventana_principal", helpset);
            hb.enableHelpKey(jButton2, "ventana_secundaria", helpset);*/
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        } catch (HelpSetException ex) {
            Exceptions.printStackTrace(ex);
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonGestionarCarrera;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonResultadoCarreras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenu jMenuSalir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTablaCarreras;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
