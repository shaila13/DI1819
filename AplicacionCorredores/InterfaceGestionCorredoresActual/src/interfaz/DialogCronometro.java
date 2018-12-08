package interfaz;

import cronometro.modelo.LLegadaParticipantes;
import interfaz.tablas.TableModelParticipantes;
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
import logica.LogicaNegocio;
import modelo.Participantes;
import org.openide.util.Exceptions;

/**
 *
 * @author Shaila
 */
public class DialogCronometro extends javax.swing.JDialog {

    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";
    private String tiempoGlobal;
    private int dorsalParticipante = 0;
    private int contadorParticipantes = 0;
    private List<Participantes> listaParticipantesCarreraFinalizada = new ArrayList<>();

    /**
     * Creates new form CronometroCarrera
     */
    public DialogCronometro(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ponLaAyuda();
        //Establecer el logo de la aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        rellenarTablaConParticipantes();
        cronometroPropio.setVisible(false);
        cronometroPropio.addLlegadaParticipante(new LLegadaParticipantes() {
            @Override
            public void ejecutar(int dorsal, String tiempoParcial) {
                tiempoParcial = cronometroPropio.getText();
                btnStart.setEnabled(true);

                String dorsalPregunta = JOptionPane.showInputDialog("Introduzca el dorsal del "
                        + "participante que acaba de llegar: ");
                dorsalParticipante = Integer.parseInt(dorsalPregunta);
                for (int i = 0; i < LogicaNegocio.getInstance().getListaParticipantes().size();
                        i++) {
                    LogicaNegocio.getInstance().getListaParticipantes().get(i);
                    if (LogicaNegocio.getInstance().getListaParticipantes().get(i).getDorsal()
                            == dorsalParticipante) {

                        if (LogicaNegocio.getInstance().getListaParticipantes().get(i).
                                getTiempoCarrera().equalsIgnoreCase("00:00:00")) {
                            LogicaNegocio.getInstance().getListaParticipantes().get(i).
                                    setTiempoCarrera(tiempoParcial);
                            LogicaNegocio.getInstance().getListaParticipantes().get(i).
                                    setPosicion(contadorParticipantes);
                            //OJO AQUÍ Añado el participante a otra lista
                            listaParticipantesCarreraFinalizada.add(LogicaNegocio.getInstance().
                                    getListaParticipantes().get(i));
                            rellenarTablaConParticipantes();
                            JOptionPane.showMessageDialog(null, "Ha llegado el corredor con dorsal: "
                                    + dorsalParticipante + ", tiempo de carrera: " + tiempoParcial);
                            contadorParticipantes++;
                            if (contadorParticipantes == LogicaNegocio.getInstance().
                                    getListaParticipantes().size()) {
                                JOptionPane.showMessageDialog(null, "Ya han llegado "
                                        + "todos los participantes.");
                                tiempoGlobal = tiempoParcial;
                                finalizarCarrera(tiempoGlobal);
//Ordeno a los participantes por orden de llegada y se los meto a la carrera
                                LogicaNegocio.getInstance().ordenarPosicion();

                                rellenarTablaConParticipantes();

                                LogicaNegocio.getInstance().getListaCarreras().
                                        get(LogicaNegocio.getInstance().getIdCarrera()).
                                        setListaParticipantes(listaParticipantesCarreraFinalizada);

                                LogicaNegocio.getInstance().getListaCarreras().get(LogicaNegocio.
                                        getInstance().getIdCarrera()).setFinalizada(true);
                                LogicaNegocio.getInstance().getListaCarreras().get(LogicaNegocio.
                                        getInstance().getIdCarrera()).setEstado("Finalizada");
                                LogicaNegocio.getInstance().getListaCarreras().get(LogicaNegocio.
                                        getInstance().getIdCarrera()).setTiempoTotal(tiempoGlobal);
//Añado la carrera finalizada a la lista de carreras finalizadas
                                LogicaNegocio.getInstance().anadirCarreraFinalizada(LogicaNegocio.
                                        getInstance().getListaCarreras().get(LogicaNegocio.
                                                getInstance().getIdCarrera()));

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El participante "
                                    + "ya ha llegado a la meta.");
                        }

                    }
                }

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        cronometroPropio = new cronometro.modelo.CronometroPropio();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.jLabel1.text")); // NOI18N

        btnStart.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnStart.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.btnStart.text")); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnStop.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.btnStop.text")); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

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

        cronometroPropio.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.cronometroPropio.text")); // NOI18N
        cronometroPropio.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 255));

        jMenuSalir.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.jMenuSalir.text")); // NOI18N
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItemAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAyuda.setText(org.openide.util.NbBundle.getMessage(DialogCronometro.class, "DialogCronometro.jMenuItemAyuda.text")); // NOI18N
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btnStart)
                                .addGap(193, 193, 193)
                                .addComponent(btnStop))
                            .addComponent(jLabel1))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cronometroPropio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cronometroPropio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        cronometroPropio.start();
        cronometroPropio.setVisible(true);
        btnStart.setEnabled(false);
        btnStop.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed
    private void finalizarCarrera(String tiempoGlobal) {
        cronometroPropio.setParar(true);
        btnStart.setEnabled(true);
        btnStart.setText("Iniciar");
        btnStop.setEnabled(false);
        cronometroPropio.setH(0);
        cronometroPropio.setM(0);
        cronometroPropio.setS(0);
        cronometroPropio.actualizarCronometro();
        JOptionPane.showMessageDialog(this, "Carrera finalizada, tiempo de carrera: "
                + tiempoGlobal);

        dispose();
    }
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        tiempoGlobal = cronometroPropio.getText();
        finalizarCarrera(tiempoGlobal);
        dispose();
    }//GEN-LAST:event_btnStopActionPerformed

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed

    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed

    }//GEN-LAST:event_jMenuSalirActionPerformed
    private void rellenarTablaConParticipantes() {
        jTableParticipantes.setModel(new TableModelParticipantes(
                LogicaNegocio.getInstance().getListaParticipantes()));
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
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private cronometro.modelo.CronometroPropio cronometroPropio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableParticipantes;
    // End of variables declaration//GEN-END:variables
}
