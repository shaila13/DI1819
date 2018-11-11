package interfaz;

import interfaz.tablas.TableModelCarrerasConParticipantes;
import interfaz.tablas.TableModelParticipantes;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import modelo.Carrera;
import modelo.Participantes;

/**
 *
 * @author Shaila
 */
public class IniciarCarrera extends javax.swing.JDialog {

    private Carrera carreraIniciar;
    private Participantes participante;
    private List<Participantes> listaParticipantes;
    private List<Carrera> listaCarrerasIniciar;
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    public IniciarCarrera(TablaCarreras aThis, boolean modal, Carrera c) {
        super(aThis, modal);
        carreraIniciar = c;
        initComponents();
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarrerasConParticipantes();
    }

    public IniciarCarrera(TablaCorredores aThis, boolean modal, Participantes p) {
        super(aThis, modal);
        participante = p;
        initComponents();
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCarrerasConParticipantes();
        rellenarTablaConParticipantes();
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
        jButtonGrabarCarreraIniciada = new javax.swing.JButton();
        jButtonSeleccionarCorredor = new javax.swing.JButton();
        jButtonCronometro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemSalirAplicacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloCarreras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTituloCarreras.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jLabelTituloCarreras.text")); // NOI18N

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
        jLabeTituloParticipantes.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jLabeTituloParticipantes.text")); // NOI18N

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
        jButtonEliminarCorredor.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButtonEliminarCorredor.text")); // NOI18N
        jButtonEliminarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCorredorActionPerformed(evt);
            }
        });

        jButtonGrabarCarreraIniciada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonGrabarCarreraIniciada.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButtonGrabarCarreraIniciada.text")); // NOI18N
        jButtonGrabarCarreraIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarCarreraIniciadaActionPerformed(evt);
            }
        });

        jButtonSeleccionarCorredor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSeleccionarCorredor.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButtonSeleccionarCorredor.text")); // NOI18N
        jButtonSeleccionarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarCorredorActionPerformed(evt);
            }
        });

        jButtonCronometro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonCronometro.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButtonCronometro.text")); // NOI18N
        jButtonCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCronometroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGrabarCarreraIniciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeTituloParticipantes)
                            .addComponent(jLabelTituloCarreras))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCarreras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabeTituloParticipantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrabarCarreraIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jMenuSalir.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jMenuSalir.text")); // NOI18N
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItemSalirAplicacion.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jMenuItemSalirAplicacion.text")); // NOI18N
        jMenuItemSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirAplicacionActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItemSalirAplicacion);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

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

            int confirmación = JOptionPane.showConfirmDialog(this, "¿Quiere borrar el registro?",
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
    /**
     * Método para generar archivo de Objetos
     */
    private void jButtonGrabarCarreraIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarCarreraIniciadaActionPerformed
        if (LogicaNegocio.getInstance().getListaParticipantes().size() == 0) {
            JOptionPane.showMessageDialog(this, "No ha añadido ningún corredor.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
        LogicaNegocio.getInstance().grabarCarreraConCorredores();
        if (LogicaNegocio.getInstance().grabarCarreraConCorredores()) {
            JOptionPane.showMessageDialog(this, "Se ha grabado correctamente la "
                    + "carrera con los participantes.",
                    "¡¡GRABAR BBDD!!", JOptionPane.ERROR_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "No se ha grabado la carrera con "
                    + "los participantes.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonGrabarCarreraIniciadaActionPerformed

    private void jButtonSeleccionarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarCorredorActionPerformed

        TablaCorredores confirmacionValidar
                = new TablaCorredores(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);

    }//GEN-LAST:event_jButtonSeleccionarCorredorActionPerformed

    private void jButtonCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCronometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCronometroActionPerformed

    private void jMenuItemSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirAplicacionActionPerformed
        //setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItemSalirAplicacionActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed

    }//GEN-LAST:event_jMenuSalirActionPerformed

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
    private javax.swing.JButton jButtonCronometro;
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JButton jButtonGrabarCarreraIniciada;
    private javax.swing.JButton jButtonSeleccionarCorredor;
    private javax.swing.JLabel jLabeTituloParticipantes;
    private javax.swing.JLabel jLabelTituloCarreras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSalirAplicacion;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreraInciada;
    private javax.swing.JTable jTableParticipantes;
    // End of variables declaration//GEN-END:variables

}
