package interfaz;

import interfaz.tablas.TableModelCorredores;
import java.io.File;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import modelo.Corredor;
import modelo.Participantes;
import org.openide.util.Exceptions;

/**
 *
 * @author Shaila
 */
public class TablaCorredores extends javax.swing.JDialog {

    
    private int dorsal = 0;
    private String tiempoCorredora="00:00:00";
    private LogicaNegocio logicaNegocio;
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    /**
     * Creates new form TablaCorredores
     */
    public TablaCorredores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("TABLA CORREDORES.");
        jButtonAnadirCorredorAcarrera.setText("<html><p>Añadir </p>"
                + "<p>Corredor </p><p>a carrera</p></html>");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaCorredores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTablaCorredores = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonAlta = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonGrabarCSVCorredores = new javax.swing.JButton();
        jButtonAnadirCorredorAcarrera = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemSalirAplicacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneTabla.setViewportView(jTableCorredores);

        jButtonAlta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonAlta.setText("Alta corredor");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonModificar.setText("Modificar");
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

        jButtonGrabarCSVCorredores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonGrabarCSVCorredores.setText("Grabar CSV");
        jButtonGrabarCSVCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarCSVCorredoresActionPerformed(evt);
            }
        });

        jButtonAnadirCorredorAcarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonAnadirCorredorAcarrera.setText("Añadir corredor a carrera");
        jButtonAnadirCorredorAcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirCorredorAcarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTablaCorredoresLayout = new javax.swing.GroupLayout(jPanelTablaCorredores);
        jPanelTablaCorredores.setLayout(jPanelTablaCorredoresLayout);
        jPanelTablaCorredoresLayout.setHorizontalGroup(
            jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaCorredoresLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTablaCorredoresLayout.createSequentialGroup()
                        .addComponent(jButtonAnadirCorredorAcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTablaCorredoresLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTablaCorredoresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonGrabarCSVCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTablaCorredoresLayout.setVerticalGroup(
            jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaCorredoresLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonAnadirCorredorAcarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTablaCorredoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrabarCSVCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jMenuSalir.setText(org.openide.util.NbBundle.getMessage(TablaCorredores.class, "IniciarCarrera.jMenuSalir.text")); // NOI18N
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItemSalirAplicacion.setText(org.openide.util.NbBundle.getMessage(TablaCorredores.class, "IniciarCarrera.jMenuItemSalirAplicacion.text")); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelTablaCorredores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanelTablaCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        FormularioCorredores dialogoAlta = new FormularioCorredores(this, true, logicaNegocio);
        dialogoAlta.setLocationRelativeTo(null);
        dialogoAlta.setVisible(true);
        rellenarTablaCorredores();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int seleccionado = jTableCorredores.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);

        } else {
            Corredor corredorModificar = LogicaNegocio.getInstance().getListaCorredores().
                    get(seleccionado);
            FormularioCorredores dialogoModificar = new FormularioCorredores(this,
                    true, corredorModificar);
            dialogoModificar.setLocationRelativeTo(null);
            dialogoModificar.setVisible(true);
            rellenarTablaCorredores();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int seleccionado = jTableCorredores.getSelectedRow();
        Corredor corredorBorrar = LogicaNegocio.getInstance().getListaCorredores()
                .get(seleccionado);

        int confirmación = JOptionPane.showConfirmDialog(this, "¿Quiere borrar el registro?",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirmación == JOptionPane.YES_OPTION) {
            LogicaNegocio.getInstance().borrarCorredor(corredorBorrar);
            JOptionPane.showMessageDialog(this, "Se ha borrado el corredor.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
        } else if (confirmación == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "No se ha borrado el corredor.",
                    "Borrar.", JOptionPane.INFORMATION_MESSAGE);
        }
        rellenarTablaCorredores();

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonGrabarCSVCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarCSVCorredoresActionPerformed
        LogicaNegocio.getInstance().grabarCSVCorredores();
    }//GEN-LAST:event_jButtonGrabarCSVCorredoresActionPerformed

    private void jButtonAnadirCorredorAcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirCorredorAcarreraActionPerformed

        int seleccionado = jTableCorredores.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro.",
                    "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int contador = LogicaNegocio.getInstance().getListaParticipantes().size();
                Corredor corredor = LogicaNegocio.getInstance().
                        getListaCorredores().get(seleccionado);
               
                //CAMBIAR EL INDICE
                int contadorMaximoParticipantes = LogicaNegocio.getInstance().
                        getListaCarrerasIniciar().get(0).getNumeroMaxCorredores();
                if (contador < contadorMaximoParticipantes) {
                    contador++;

                    if (LogicaNegocio.getInstance().isBorrarCorredor()) {
                        int numero = LogicaNegocio.getInstance().getListaParticipantes()
                                .size();

                        dorsal = LogicaNegocio.getInstance().getListaParticipantes()
                                .get(numero - 1).getDorsal() + 1;
                    } else {
                        dorsal = contador;
                    }
                    
                    //PITA AQUI
                    Participantes participante = new Participantes(dorsal, tiempoCorredora,
                            corredor.getNombre(), corredor.getDni(), corredor.
                                    getFechaNacimiento(),
                            corredor.getDireccion(), corredor.getTelefono());
                    LogicaNegocio.getInstance().anadirCorredorListaCarreraIniciada(participante);
                    if (LogicaNegocio.getInstance().anadirCorredorListaCarreraIniciada(participante)) {
                        GestionarCarrera dialogoIniciarCarrera = new GestionarCarrera(this,
                                true, participante);
                        dialogoIniciarCarrera.setLocationRelativeTo(null);
                        dialogoIniciarCarrera.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "El participante ya ha sido añadido en la carrera.",
                                "¡¡ATENCIÓN!!", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Se ha superado el número máximo de participantes.",
                            "¡¡ATENCIÓN!!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ParseException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        //dispose();
    }//GEN-LAST:event_jButtonAnadirCorredorAcarreraActionPerformed

    private void jMenuItemSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirAplicacionActionPerformed
        //setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jMenuItemSalirAplicacionActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed

    }//GEN-LAST:event_jMenuSalirActionPerformed

//Utilizando un AbstractTableModel
    private void rellenarTablaCorredores() {
        jTableCorredores.setModel(new TableModelCorredores(
                LogicaNegocio.getInstance().getListaCorredores()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonAnadirCorredorAcarrera;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonGrabarCSVCorredores;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSalirAplicacion;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanelTablaCorredores;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
