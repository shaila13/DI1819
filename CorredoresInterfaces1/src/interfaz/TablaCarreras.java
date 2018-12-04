package interfaz;

import interfaz.tablas.TableModelCarreras;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import modelo.Carrera;

/**
 *
 * @author Shaila
 */
public class TablaCarreras extends javax.swing.JDialog {

    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    /**
     * Creates new form TablaCorredores
     */
    LogicaNegocio logicaNegocio = LogicaNegocio.getInstance();
    public TablaCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jButtonModificar = new javax.swing.JButton();
        jButtonAlta = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonIniciarCarrera = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTablaCarreras.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

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
        jScrollPane1.setViewportView(jTableCarreras);

        jButtonModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonModificar.setText("Modificar Carrera");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAlta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonAlta.setText("Alta carrera");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonIniciarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonIniciarCarrera.setText("Gestión Carrera");
        jButtonIniciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTablaCarrerasLayout = new javax.swing.GroupLayout(jPanelTablaCarreras);
        jPanelTablaCarreras.setLayout(jPanelTablaCarrerasLayout);
        jPanelTablaCarrerasLayout.setHorizontalGroup(
            jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaCarrerasLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTablaCarrerasLayout.createSequentialGroup()
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonModificar)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIniciarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelTablaCarrerasLayout.setVerticalGroup(
            jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaCarrerasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTablaCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jButtonIniciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelTablaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelTablaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int seleccionado = jTableCarreras.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "!!ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            Carrera carreraModificar = logicaNegocio.getListaCarreras().get(seleccionado);
            FormularioCarreras dialogoModificar = new FormularioCarreras(this,
                    true, carreraModificar);
            dialogoModificar.setLocationRelativeTo(null);
            dialogoModificar.setVisible(true);
            rellenarTablaCarreras();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        FormularioCarreras dialogoAlta = new FormularioCarreras(this, true, logicaNegocio);
        dialogoAlta.setLocationRelativeTo(null);
        dialogoAlta.setVisible(true);
        rellenarTablaCarreras();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        int seleccionado = jTableCarreras.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "!!ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            Carrera carreraBorrar = logicaNegocio.getListaCarreras()
                    .get(seleccionado);

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

    private void jButtonIniciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarCarreraActionPerformed

        int seleccionado = jTableCarreras.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (logicaNegocio.
                    getListaCarrerasIniciar().size() == 0) {

                Carrera carreraIniciarCarrera = logicaNegocio.
                        getListaCarreras().get(seleccionado);
                carreraIniciarCarrera.setTiempoTotal("00:00:00");
                GestionarCarrera dialogoIniciarCarrera = new GestionarCarrera(this,
                        true, carreraIniciarCarrera);
                logicaNegocio.anadirCarreraListaCarreraIniciada(carreraIniciarCarrera);
                dialogoIniciarCarrera.setLocationRelativeTo(null);
                dialogoIniciarCarrera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No puede iniciar más de una carrera a la vez.",
                        "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
            super.dispose();
        }

    }//GEN-LAST:event_jButtonIniciarCarreraActionPerformed

//Utilizando un AbstractTableModel
    private void rellenarTablaCarreras() {
        jTableCarreras.setModel(new TableModelCarreras(
                logicaNegocio.getListaCarreras()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonIniciarCarrera;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelTablaCarreras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
