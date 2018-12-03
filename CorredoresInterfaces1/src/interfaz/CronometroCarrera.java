package interfaz;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import cronometro.modelo.LLegadaCorredor;

/**
 *
 * @author Shaila
 */
public class CronometroCarrera extends javax.swing.JDialog {

    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";
    private String tiempoParcial, tiempoGlobal;
    private int dorsalParticipante = 0;
    private boolean encontrado = false;

    /**
     * Creates new form CronometroCarrera
     */
    public CronometroCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Establecer el logo de la aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());

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
        btnGuardarTiempoCorredor = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        cronometroPropio = new cronometro.modelo.CronometroPropio();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(CronometroCarrera.class, "CronometroCarrera.jLabel1.text")); // NOI18N

        btnStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStart.setText(org.openide.util.NbBundle.getMessage(CronometroCarrera.class, "CronometroCarrera.btnStart.text")); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnGuardarTiempoCorredor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGuardarTiempoCorredor.setText(org.openide.util.NbBundle.getMessage(CronometroCarrera.class, "CronometroCarrera.btnGuardarTiempoCorredor.text")); // NOI18N
        btnGuardarTiempoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTiempoCorredorActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStop.setText(org.openide.util.NbBundle.getMessage(CronometroCarrera.class, "CronometroCarrera.btnStop.text")); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        cronometroPropio.setBorder(new javax.swing.border.MatteBorder(null));
        cronometroPropio.setText(org.openide.util.NbBundle.getMessage(CronometroCarrera.class, "CronometroCarrera.cronometroPropio.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnStop))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardarTiempoCorredor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnStart, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cronometroPropio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cronometroPropio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStart)
                        .addGap(20, 20, 20)
                        .addComponent(btnGuardarTiempoCorredor)
                        .addGap(20, 20, 20)
                        .addComponent(btnStop))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        cronometroPropio.start();
        btnStart.setEnabled(false);
        btnStart.setText("Reanudar");
        btnGuardarTiempoCorredor.setEnabled(true);
        btnStop.setEnabled(true);


    }//GEN-LAST:event_btnStartActionPerformed

    private void btnGuardarTiempoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTiempoCorredorActionPerformed

        tiempoParcial = cronometroPropio.getText();
        btnStart.setEnabled(true);
        btnGuardarTiempoCorredor.setEnabled(false);
        //PONER TRUE PARA QUE SE SEPA QUE HA LLEGADO A LA META Y NO PODER REPETIR EL DORSAL
        //AQUÍ VOY A TENER QUE METER LA INTERFACE
        String dorsal = JOptionPane.showInputDialog("Introduzca el dorsal del "
                + "participante que acaba de llegar: ");
        dorsalParticipante = Integer.parseInt(dorsal);
        for (int i = 0; i < LogicaNegocio.getInstance().getListaParticipantes().size(); i++) {
            LogicaNegocio.getInstance().getListaParticipantes().get(i);
            if (LogicaNegocio.getInstance().getListaParticipantes().get(i).getDorsal()
                    == dorsalParticipante) {
                LogicaNegocio.getInstance().getListaParticipantes().get(i).
                        setTiempoCarrera(tiempoParcial);
                JOptionPane.showMessageDialog(this, "Ha llegado el corredor con dorsal: "
                        + dorsalParticipante + ", tiempo de carrera: " + tiempoParcial);
            }
        }
    }//GEN-LAST:event_btnGuardarTiempoCorredorActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        cronometroPropio.setParar(true);
        btnStart.setEnabled(true);
        btnStart.setText("Iniciar");
        btnGuardarTiempoCorredor.setEnabled(false);
        btnStop.setEnabled(false);

        tiempoGlobal = cronometroPropio.getText();
        cronometroPropio.setH(0);
        cronometroPropio.setM(0);
        cronometroPropio.setS(0);
        cronometroPropio.actualizarCronometro();
        JOptionPane.showMessageDialog(this, "Carrera finalizada, tiempo de carrera: "
                + tiempoGlobal);

        //NUMERO SELECCIONADO DE LA CARRERA EN VEZ DE CERO
        //CAMBIÉ EL TIEMPO AQUÍ
        LogicaNegocio.getInstance().getListaCarrerasIniciar().get(0).
                setTiempoTotal(tiempoGlobal);
        dispose();
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CronometroCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CronometroCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CronometroCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CronometroCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CronometroCarrera dialog = new CronometroCarrera(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarTiempoCorredor;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private cronometro.modelo.CronometroPropio cronometroPropio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIcono;
    // End of variables declaration//GEN-END:variables
}
