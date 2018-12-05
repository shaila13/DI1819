package interfaz;

import interfaz.tablas.TableModelCarrerasConParticipantes;
import interfaz.tablas.TableModelParticipantes;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import modelo.Carrera;
import modelo.Participantes;

/**
 *
 * @author Shaila
 */
public class GestionarCarrera extends javax.swing.JDialog {

    private Carrera carreraIniciar;
    private Participantes participante;
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    public GestionarCarrera(TablaCarreras aThis, boolean modal, Carrera c) {
        super(aThis, modal);
        carreraIniciar = c;
        initComponents();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                super.windowClosing(we);
                LogicaNegocio.getInstance().getListaParticipantes().
                        removeAll(LogicaNegocio.getInstance().getListaParticipantes());
                LogicaNegocio.getInstance().getListaCarrerasIniciar().removeAll(
                        LogicaNegocio.getInstance().getListaCarrerasIniciar());
            }
        });
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        jButtonExportarCSV.setVisible(false);
        jButtonSeleccionarCarrera.setVisible(false);
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarrerasConParticipantes();
    }

    public GestionarCarrera(TablaCorredores aThis, boolean modal, Participantes p) {
        super(aThis, modal);
        participante = p;
        initComponents();
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        jButtonExportarCSV.setVisible(false);
        jButtonSeleccionarCarrera.setVisible(false);
        //Establecer el logo de la aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarrerasConParticipantes();
        rellenarTablaConParticipantes();
    }

    private void ocultarBotones() {

        jButtonEliminarCorredor.setVisible(false);
        jButtonEliminarTodosParticipantes.setVisible(false);
        jButtonLimpiarCampos.setVisible(false);
        jButtonSeleccionarCarrera.setVisible(false);
        jButtonSeleccionarCorredor.setVisible(false);
        jButtoncRONOMETRO.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloCarreras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreraInciada = new javax.swing.JTable();
        jLabeTituloParticipantes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jButtonEliminarCorredor = new javax.swing.JButton();
        jButtonSeleccionarCorredor = new javax.swing.JButton();
        jButtoncRONOMETRO = new javax.swing.JButton();
        jButtonEliminarTodosParticipantes = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jButtonSeleccionarCarrera = new javax.swing.JButton();
        jButtonFinalizarCarrera = new javax.swing.JButton();
        jButtonExportarCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloCarreras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTituloCarreras.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jLabelTituloCarreras.text")); // NOI18N

        jTableCarreraInciada.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTableCarreraInciada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCarreraInciada);

        jLabeTituloParticipantes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabeTituloParticipantes.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jLabeTituloParticipantes.text")); // NOI18N

        jTableParticipantes.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableParticipantes);

        jButtonEliminarCorredor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonEliminarCorredor.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonEliminarCorredor.text")); // NOI18N
        jButtonEliminarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCorredorActionPerformed(evt);
            }
        });

        jButtonSeleccionarCorredor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSeleccionarCorredor.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonSeleccionarCorredor.text")); // NOI18N
        jButtonSeleccionarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarCorredorActionPerformed(evt);
            }
        });

        jButtoncRONOMETRO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtoncRONOMETRO.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtoncRONOMETRO.text")); // NOI18N
        jButtoncRONOMETRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncRONOMETROActionPerformed(evt);
            }
        });

        jButtonEliminarTodosParticipantes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonEliminarTodosParticipantes.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonEliminarTodosParticipantes.text")); // NOI18N
        jButtonEliminarTodosParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTodosParticipantesActionPerformed(evt);
            }
        });

        jButtonLimpiarCampos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonLimpiarCampos.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonLimpiarCampos.text")); // NOI18N
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        jButtonSeleccionarCarrera.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSeleccionarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSeleccionarCarrera.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonSeleccionarCarrera.text")); // NOI18N
        jButtonSeleccionarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarCarreraActionPerformed(evt);
            }
        });

        jButtonFinalizarCarrera.setBackground(new java.awt.Color(204, 204, 255));
        jButtonFinalizarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonFinalizarCarrera.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonFinalizarCarrera.text")); // NOI18N
        jButtonFinalizarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCarreraActionPerformed(evt);
            }
        });

        jButtonExportarCSV.setBackground(new java.awt.Color(204, 204, 255));
        jButtonExportarCSV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonExportarCSV.setText(org.openide.util.NbBundle.getMessage(GestionarCarrera.class, "GestionarCarrera.jButtonExportarCSV.text")); // NOI18N
        jButtonExportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloCarreras)
                            .addComponent(jLabeTituloParticipantes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFinalizarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jButtoncRONOMETRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarTodosParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSeleccionarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCarreras)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabeTituloParticipantes)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeleccionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalizarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEliminarTodosParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtoncRONOMETRO, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExportarCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonEliminarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCorredorActionPerformed
        int seleccionado = jTableParticipantes.getSelectedRow();

        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            Participantes participantesBorrar = LogicaNegocio.getInstance().
                    getListaParticipantes().get(seleccionado);
            LogicaNegocio.getInstance().setDorsalCorredorBorrado(LogicaNegocio.getInstance().
                    getListaParticipantes().get(seleccionado).getDorsal());
            LogicaNegocio.getInstance().setBorrarCorredor(true);
            int confirmación = JOptionPane.showConfirmDialog(this,
                    "¿Quiere borrar el registro?",
                    "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmación == JOptionPane.YES_OPTION) {
                LogicaNegocio.getInstance().borrarParticipante(participantesBorrar);
                JOptionPane.showMessageDialog(this, "Se ha borrado el participante.",
                        "Borrar.", JOptionPane.INFORMATION_MESSAGE);
            } else if (confirmación == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "No se ha borrado el participante.",
                        "Borrar.", JOptionPane.INFORMATION_MESSAGE);
            }
            rellenarTablaConParticipantes();
        }
    }//GEN-LAST:event_jButtonEliminarCorredorActionPerformed

    private void jButtonSeleccionarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarCorredorActionPerformed
        TablaCorredores.mostrarBotonOculto(true);
        TablaCorredores confirmacionValidar
                = new TablaCorredores(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButtonSeleccionarCorredorActionPerformed

    private void jButtoncRONOMETROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncRONOMETROActionPerformed
        if (LogicaNegocio.getInstance().getListaCarrerasIniciar().size() == 0
                || LogicaNegocio.getInstance().getListaParticipantes().size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay ninguna carrera iniciada "
                    + "con participantes.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            CronometroCarrera iniciarCarrera = new CronometroCarrera(new javax.swing.JFrame(), true);
            iniciarCarrera.setLocationRelativeTo(null);
            iniciarCarrera.setVisible(true);
            rellenarTablaCarrerasConParticipantes();
            rellenarTablaConParticipantes();

        }
    }//GEN-LAST:event_jButtoncRONOMETROActionPerformed

    private void jButtonEliminarTodosParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarTodosParticipantesActionPerformed

        int confirmación = JOptionPane.showConfirmDialog(this,
                "¿Quiere borrar el registro?",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirmación == JOptionPane.YES_OPTION) {
            LogicaNegocio.getInstance().getListaParticipantes().
                    removeAll(LogicaNegocio.getInstance().getListaParticipantes());
            rellenarTablaConParticipantes();
            JOptionPane.showMessageDialog(this, "Se han borrado todos los participantes.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
        } else if (confirmación == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "No se han borrado los participantes.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButtonEliminarTodosParticipantesActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed

        int confirmación = JOptionPane.showConfirmDialog(this,
                "¿Quiere limpiar todo el registro?",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirmación == JOptionPane.YES_OPTION) {

            LogicaNegocio.getInstance().getListaParticipantes().
                    removeAll(LogicaNegocio.getInstance().getListaParticipantes());

            LogicaNegocio.getInstance().getListaCarrerasIniciar().removeAll(
                    LogicaNegocio.getInstance().getListaCarrerasIniciar());

            rellenarTablaCarrerasConParticipantes();
            rellenarTablaConParticipantes();
            JOptionPane.showMessageDialog(this, "Se han borrado participantes y carrera.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
            jButtonSeleccionarCarrera.setVisible(true);
        } else if (confirmación == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "No se han borrado participantes y carrera.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    private void jButtonSeleccionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarCarreraActionPerformed
        TablaCarreras confirmacionValidar
                = new TablaCarreras(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);


    }//GEN-LAST:event_jButtonSeleccionarCarreraActionPerformed

    private void jButtonFinalizarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCarreraActionPerformed

        ocultarBotones();
        jButtonExportarCSV.setVisible(true);

    }//GEN-LAST:event_jButtonFinalizarCarreraActionPerformed

    private void jButtonExportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarCSVActionPerformed

        LogicaNegocio.getInstance().grabarResultadoCarrera();
    }//GEN-LAST:event_jButtonExportarCSVActionPerformed

    
    //Utilizando un AbstractTableModel
    private void rellenarTablaCarrerasConParticipantes() {
        jTableCarreraInciada.setModel(new TableModelCarrerasConParticipantes(
                LogicaNegocio.getInstance().getListaCarrerasIniciar()));
    }

    private void rellenarTablaConParticipantes() {
        jTableParticipantes.setModel(new TableModelParticipantes(
                LogicaNegocio.getInstance().getListaParticipantes()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JButton jButtonEliminarTodosParticipantes;
    private javax.swing.JButton jButtonExportarCSV;
    private javax.swing.JButton jButtonFinalizarCarrera;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonSeleccionarCarrera;
    private javax.swing.JButton jButtonSeleccionarCorredor;
    private javax.swing.JButton jButtoncRONOMETRO;
    private javax.swing.JLabel jLabeTituloParticipantes;
    private javax.swing.JLabel jLabelTituloCarreras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreraInciada;
    private javax.swing.JTable jTableParticipantes;
    // End of variables declaration//GEN-END:variables

}
