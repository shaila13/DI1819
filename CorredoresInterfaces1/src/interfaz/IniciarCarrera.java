package interfaz;

import interfaz.tablas.TableModelCarrerasConParticipantes;
import interfaz.tablas.TableModelParticipantes;
import java.io.File;
import javax.swing.ImageIcon;
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
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    public IniciarCarrera(TablaCarreras aThis, boolean modal, Carrera carreraIniciar) {
        super(aThis, modal);
        this.carreraIniciar = carreraIniciar;
        initComponents();
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        jButtonSeleccionarCorredor.setText("<html><p>SELECCIONAR</p>"
                + "<p>CORREDOR</p></html>");
        jButtonEliminarCorredor.setText("<html><p>ELIMINAR</p>"
                + "<p>CORREDOR</p></html>");
        rellenarTablaCarrerasConParticipantes();
    }

    public IniciarCarrera(TablaCorredores aThis, boolean modal, Participantes p) {
        super(aThis, modal);
        this.participante = p;
        initComponents();
        setTitle("REGISTRO CARRERA CON PARTICIPANTES.");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        jButtonSeleccionarCorredor.setText("<html><p>SELECCIONAR</p>"
                + "<p>CORREDOR</p></html>");
        jButtonEliminarCorredor.setText("<html><p>ELIMINAR</p>"
                + "<p>CORREDOR</p></html>");
        rellenarTablaCarrerasConParticipantes();
        rellenarTablaCorredoresConParticipantes();
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
        jLabelTituloTablaCarreras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreraInciada = new javax.swing.JTable();
        jLabelCorredoresConDorsal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredoresConDorsal = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        jButtonEliminarCorredor = new javax.swing.JButton();
        jButtonGrabarCarreraIniciada = new javax.swing.JButton();
        jButtonSeleccionarCorredor = new javax.swing.JButton();
        jButtonCronometro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloTablaCarreras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelTituloTablaCarreras.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jLabelTituloTablaCarreras.text")); // NOI18N

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

        jLabelCorredoresConDorsal.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelCorredoresConDorsal.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jLabelCorredoresConDorsal.text")); // NOI18N

        jTableCorredoresConDorsal.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTableCorredoresConDorsal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCorredoresConDorsal);

        jButtonSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSalir.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButtonSalir.text")); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCronometro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonGrabarCarreraIniciada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCorredoresConDorsal)
                            .addComponent(jLabelTituloTablaCarreras))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloTablaCarreras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelCorredoresConDorsal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrabarCarreraIniciada, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonEliminarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCorredorActionPerformed

    }//GEN-LAST:event_jButtonEliminarCorredorActionPerformed
    /**
     * Método para generar archivo de Objetos
     */
    private void jButtonGrabarCarreraIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarCarreraIniciadaActionPerformed

        /*try {
        String fichero = "ficheroObjetosListaClientes.dat";
        ObjectOutputStream oos = null;
        try {
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        
        Iterator it = listaClientes.keySet().iterator();
        while (it.hasNext()) {
        String key = (String) it.next();
        System.out.println("Clave: " + key + " -> Valor: "
        + listaClientes.get(key));
        oos.writeObject(listaClientes.get(key));
        }
        
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }
        oos.close();
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }*/

    }//GEN-LAST:event_jButtonGrabarCarreraIniciadaActionPerformed

    private void jButtonSeleccionarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarCorredorActionPerformed

        TablaCorredores confirmacionValidar
                = new TablaCorredores(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);


    }//GEN-LAST:event_jButtonSeleccionarCorredorActionPerformed

    private void jButtonCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCronometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCronometroActionPerformed

    //Utilizando un AbstractTableModel
    private void rellenarTablaCarrerasConParticipantes() {
        jTableCarreraInciada.setModel(new TableModelCarrerasConParticipantes(
                LogicaNegocio.getInstance().getListaCarrerasIniciar()));
    }

    private void rellenarTablaCorredoresConParticipantes() {
        jTableCorredoresConDorsal.setModel(new TableModelParticipantes(
                LogicaNegocio.getInstance().getListaParticipantes()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCronometro;
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JButton jButtonGrabarCarreraIniciada;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSeleccionarCorredor;
    private javax.swing.JLabel jLabelCorredoresConDorsal;
    private javax.swing.JLabel jLabelTituloTablaCarreras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreraInciada;
    private javax.swing.JTable jTableCorredoresConDorsal;
    // End of variables declaration//GEN-END:variables

}
