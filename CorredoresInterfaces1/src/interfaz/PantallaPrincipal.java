package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaz.TablaCarreras;
import interfaz.TablaCorredores;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.GestionGuardado;
import logica.LogicaNegocio;

/**
 * Los combos se rellenan siempre en constructor porque no funciona, hacer una
 * función para rellenar, privada
 *
 * @author Shaila
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private static final String RUTA_LOGO = ".." + File.separator + "imgs"
            + File.separator + "corredor.png";

    //ojo con crearlo en veinte sitios
    //private LogicaNegocio logicaNegocio;
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() throws ParseException {
        initComponents();
        //this.setExtendedState(this.MAXIMIZED_BOTH); //MAXIMIZAR FORMULARIO
        setLocationRelativeTo(null);
        //Establecer el título de la aplicación
        setTitle("APLICACIÓN GESTIÓN CARRERAS.");
        LogicaNegocio.getInstance().cargarCSVCorredores();
        //Establecer una imagen en una label
        jLabelIcono.setIcon(new ImageIcon(getClass().getResource(RUTA_LOGO)));
        jButtonModificarCorredores.setText("<html><p>BBDD </p>"
                + "<p>CORREDORES</p></html>");
        jButtonModificarCarrera.setText("<html><p>ALTA/MODIFICACIÓN</p>"
                + "<p>CARRERAS</p></html>");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                super.windowClosing(we);
                //Meter aquí la logica grabar datos
                if (LogicaNegocio.getInstance().getListaCarrerasIniciar().size() != 0) {
                    LogicaNegocio.getInstance().grabarCarreraConParticipantes();
                    GestionGuardado.salvarCambios();
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanelPantallaPrincipal = new javax.swing.JPanel();
        jButtonModificarCorredores = new javax.swing.JButton();
        jButtonModificarCarrera = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemConfiguracion = new javax.swing.JMenuItem();
        jCheckBoxMenuItemGrabadoAutomatico = new javax.swing.JCheckBoxMenuItem();
        jMenuHistorialCarreras = new javax.swing.JMenu();
        jMenuItemGenerarPDF = new javax.swing.JMenuItem();
        jMenuItemVerCarrerasAntiguas = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemSalirAplicacion = new javax.swing.JMenuItem();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonModificarCorredores.setBackground(new java.awt.Color(204, 204, 255));
        jButtonModificarCorredores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonModificarCorredores.setText("BBDD CORREDORES");
        jButtonModificarCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCorredoresActionPerformed(evt);
            }
        });

        jButtonModificarCarrera.setBackground(new java.awt.Color(204, 204, 255));
        jButtonModificarCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonModificarCarrera.setText("ALTA/MODIFICACIÓN CARRERAS");
        jButtonModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPantallaPrincipalLayout = new javax.swing.GroupLayout(jPanelPantallaPrincipal);
        jPanelPantallaPrincipal.setLayout(jPanelPantallaPrincipalLayout);
        jPanelPantallaPrincipalLayout.setHorizontalGroup(
            jPanelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantallaPrincipalLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPantallaPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonModificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jButtonModificarCorredores)
                .addGap(50, 50, 50))
        );
        jPanelPantallaPrincipalLayout.setVerticalGroup(
            jPanelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantallaPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenuConfiguracion.setText("Configuracion");

        jMenuItemConfiguracion.setText("Configuracion");
        jMenuItemConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfiguracionActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItemConfiguracion);

        jCheckBoxMenuItemGrabadoAutomatico.setText("Grabado automático");
        jCheckBoxMenuItemGrabadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemGrabadoAutomaticoActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jCheckBoxMenuItemGrabadoAutomatico);

        jMenuBar1.add(jMenuConfiguracion);

        jMenuHistorialCarreras.setText("Historial Carreras");

        jMenuItemGenerarPDF.setText("Generar PDF");
        jMenuHistorialCarreras.add(jMenuItemGenerarPDF);

        jMenuItemVerCarrerasAntiguas.setText("Carreras Antiguas");
        jMenuHistorialCarreras.add(jMenuItemVerCarrerasAntiguas);

        jMenuBar1.add(jMenuHistorialCarreras);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jMenuItemSalirAplicacion.setText("Salir Aplicacion");
        jMenuItemSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirAplicacionActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItemSalirAplicacion);

        jMenuItemAyuda.setText("Ayuda");
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
                .addComponent(jPanelPantallaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCorredoresActionPerformed
        TablaCorredores confirmacionValidar
                = new TablaCorredores(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);
    }//GEN-LAST:event_jButtonModificarCorredoresActionPerformed

    private void jButtonModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCarreraActionPerformed
        TablaCarreras confirmacionValidar
                = new TablaCarreras(new javax.swing.JFrame(), true);
        confirmacionValidar.setVisible(true);
    }//GEN-LAST:event_jButtonModificarCarreraActionPerformed

    private void jMenuItemConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfiguracionActionPerformed

        DialogConfiguracion dialogoConfiguracion = new DialogConfiguracion(this, true);
        dialogoConfiguracion.setLocationRelativeTo(null);
        dialogoConfiguracion.setVisible(true);
    }//GEN-LAST:event_jMenuItemConfiguracionActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed

    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItemSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirAplicacionActionPerformed
        //setVisible(false);  
        this.dispose();
        System.exit(0);//Este usarlo para salir porque el dispose me deja una pantalla.
    }//GEN-LAST:event_jMenuItemSalirAplicacionActionPerformed

    private void jCheckBoxMenuItemGrabadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemGrabadoAutomaticoActionPerformed

        if (jCheckBoxMenuItemGrabadoAutomatico.getState()) {
            String automaticSave = JOptionPane.showInputDialog("Introduzca tiempo autoguardado (minutos): ");
            LogicaNegocio.getInstance().iniciarGuardadoAutomatico(Integer.parseInt(automaticSave));
        } else {
            String automaticSave = "0";
            LogicaNegocio.getInstance().iniciarGuardadoAutomatico(Integer.parseInt(automaticSave));
        }

    }//GEN-LAST:event_jCheckBoxMenuItemGrabadoAutomaticoActionPerformed
    /**
     * Crea un dialogo de mensaje con la ayuda de la aplicación.
     *
     * @param evt
     */
    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed

        String mensaje = "Aplicación para gestionar una carrera con participantes. "
                + "\nPara agregar o modificar un corredor a la base de datos pulse "
                + "\nen el botón BBDD CORREDORES."
                + "\nPara crear una carrera y gestionarla pulse en "
                + "\nALTA/MODIFICACIÓN CARRERAS, "
                + "\nposteriormente, cree la carrera que se va a realizar "
                + "\ny pulse gestionar carrera para agregar los participantes "
                + "\na la misma e iniciar la carrera para guardar los tiempos "
                + "\ny los dorsales de los corredores. ";
        String titulo = "Ayuda Gestión de Carreras.";
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);


    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaPrincipal().setVisible(true);

                } catch (ParseException ex) {
                    Logger.getLogger(PantallaPrincipal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModificarCarrera;
    private javax.swing.JButton jButtonModificarCorredores;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemGrabadoAutomatico;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenu jMenuHistorialCarreras;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemConfiguracion;
    private javax.swing.JMenuItem jMenuItemGenerarPDF;
    private javax.swing.JMenuItem jMenuItemSalirAplicacion;
    private javax.swing.JMenuItem jMenuItemVerCarrerasAntiguas;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanelPantallaPrincipal;
    // End of variables declaration//GEN-END:variables
}
