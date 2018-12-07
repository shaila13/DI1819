package interfaz;

import interfaz.tablas.TableModelParticipantes;
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
public class DialogGestionarCarrera extends javax.swing.JDialog {

    private int idCarrera = LogicaNegocio.getInstance().getIdCarrera();
    private Carrera carreraIniciar;
    private Participantes participante;
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    public DialogGestionarCarrera(DialogTablaCarreras parent, boolean modal, Carrera c) {
        super(parent, modal);
        carreraIniciar = c;
        initComponents();

        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        jButtonExportarResultado.setVisible(false);

        jButtonFinalizarCarrera.setVisible(false);
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());

        jLabelCarreraAcorrer.setText(LogicaNegocio.getInstance().getListaCarreras().get(idCarrera).getNombreCarrera());
        //rellenarTablaCarrerasConParticipantes();
    }

    public DialogGestionarCarrera(DialogTablaCorredores parent, boolean modal, Participantes p) {
        super(parent, modal);
        participante = p;
        initComponents();
        jLabelCarreraAcorrer.setText(LogicaNegocio.getInstance().getListaCarreras().
                get(idCarrera).getNombreCarrera());

        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        jButtonExportarResultado.setVisible(false);
        jButtonFinalizarCarrera.setVisible(false);
        //Establecer el logo de la aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        //rellenarTablaCarrerasConParticipantes();
        rellenarTablaConParticipantes();
    }

    private void ocultarBotones() {

        jButtonEliminarCorredor.setVisible(false);
        jButtonEliminarTodosParticipantes.setVisible(false);
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
        jLabeTituloParticipantes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jButtonEliminarCorredor = new javax.swing.JButton();
        jButtonSeleccionarCorredor = new javax.swing.JButton();
        jButtoncRONOMETRO = new javax.swing.JButton();
        jButtonEliminarTodosParticipantes = new javax.swing.JButton();
        jButtonFinalizarCarrera = new javax.swing.JButton();
        jButtonExportarResultado = new javax.swing.JButton();
        jLabelCarreraAcorrer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabeTituloParticipantes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabeTituloParticipantes.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jLabeTituloParticipantes.text")); // NOI18N

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
        jButtonEliminarCorredor.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtonEliminarCorredor.text")); // NOI18N
        jButtonEliminarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCorredorActionPerformed(evt);
            }
        });

        jButtonSeleccionarCorredor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSeleccionarCorredor.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtonSeleccionarCorredor.text")); // NOI18N
        jButtonSeleccionarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarCorredorActionPerformed(evt);
            }
        });

        jButtoncRONOMETRO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtoncRONOMETRO.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtoncRONOMETRO.text")); // NOI18N
        jButtoncRONOMETRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncRONOMETROActionPerformed(evt);
            }
        });

        jButtonEliminarTodosParticipantes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonEliminarTodosParticipantes.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtonEliminarTodosParticipantes.text")); // NOI18N
        jButtonEliminarTodosParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTodosParticipantesActionPerformed(evt);
            }
        });

        jButtonFinalizarCarrera.setBackground(new java.awt.Color(204, 204, 255));
        jButtonFinalizarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonFinalizarCarrera.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtonFinalizarCarrera.text")); // NOI18N
        jButtonFinalizarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCarreraActionPerformed(evt);
            }
        });

        jButtonExportarResultado.setBackground(new java.awt.Color(204, 204, 255));
        jButtonExportarResultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonExportarResultado.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jButtonExportarResultado.text")); // NOI18N
        jButtonExportarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarResultadoActionPerformed(evt);
            }
        });

        jLabelCarreraAcorrer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCarreraAcorrer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCarreraAcorrer.setText(org.openide.util.NbBundle.getMessage(DialogGestionarCarrera.class, "DialogGestionarCarrera.jLabelCarreraAcorrer.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCarreraAcorrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabeTituloParticipantes))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFinalizarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtoncRONOMETRO, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButtonExportarResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminarTodosParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelCarreraAcorrer)
                .addGap(69, 69, 69)
                .addComponent(jLabeTituloParticipantes)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoncRONOMETRO, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarTodosParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExportarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalizarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        DialogTablaCorredores.mostrarBotonOculto(true);
        DialogTablaCorredores confirmacionValidar
                = new DialogTablaCorredores(this, true);
        confirmacionValidar.setVisible(true);
        rellenarTablaConParticipantes();

    }//GEN-LAST:event_jButtonSeleccionarCorredorActionPerformed

    private void jButtoncRONOMETROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncRONOMETROActionPerformed
        if (LogicaNegocio.getInstance().getListaCarreras().size() == 0
                || LogicaNegocio.getInstance().getListaParticipantes().size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay ninguna carrera iniciada "
                    + "con participantes.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            DialogCronometro iniciarCarrera = new DialogCronometro(this, true);
            iniciarCarrera.setLocationRelativeTo(null);
            iniciarCarrera.setVisible(true);
            //rellenarTablaCarrerasConParticipantes();
            rellenarTablaConParticipantes();
            jButtonFinalizarCarrera.setVisible(true);
            ocultarBotones();
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
    private void limpiar() {
        LogicaNegocio.getInstance().getListaParticipantes().
                removeAll(LogicaNegocio.getInstance().getListaParticipantes());

        LogicaNegocio.getInstance().getListaCarreras().removeAll(
                LogicaNegocio.getInstance().getListaCarreras());

        //rellenarTablaCarrerasConParticipantes();
        rellenarTablaConParticipantes();
    }
    private void jButtonFinalizarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCarreraActionPerformed

        jButtonExportarResultado.setVisible(true);

    }//GEN-LAST:event_jButtonFinalizarCarreraActionPerformed

    private void jButtonExportarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarResultadoActionPerformed

       
        LogicaNegocio.getInstance().grabarCarreraFinalizada();
        LogicaNegocio.getInstance().grabarCarrera();
        JOptionPane.showMessageDialog(this, "Se ha exportado satisfactoriamente");

//Borro los participantes 
        LogicaNegocio.getInstance().getListaParticipantes().
                removeAll(LogicaNegocio.getInstance().getListaParticipantes());
        dispose();
    }//GEN-LAST:event_jButtonExportarResultadoActionPerformed

    //Utilizando un AbstractTableModel
    /*    private void rellenarTablaCarrerasConParticipantes() {
    jTableCarreraInciada.setModel(new TableModelCarrerasConParticipantes(
    LogicaNegocio.getInstance().getListaCarreras()));
    }*/
    private void rellenarTablaConParticipantes() {
        jTableParticipantes.setModel(new TableModelParticipantes(
                LogicaNegocio.getInstance().getListaParticipantes()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JButton jButtonEliminarTodosParticipantes;
    private javax.swing.JButton jButtonExportarResultado;
    private javax.swing.JButton jButtonFinalizarCarrera;
    private javax.swing.JButton jButtonSeleccionarCorredor;
    private javax.swing.JButton jButtoncRONOMETRO;
    private javax.swing.JLabel jLabeTituloParticipantes;
    private javax.swing.JLabel jLabelCarreraAcorrer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableParticipantes;
    // End of variables declaration//GEN-END:variables

}