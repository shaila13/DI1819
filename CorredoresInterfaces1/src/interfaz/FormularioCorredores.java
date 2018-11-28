package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import logica.LogicaNegocio;
import modelo.Corredor;
import org.netbeans.validation.api.builtin.stringvalidation.MayusculaValidator;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author Shaila
 */

/*Copiar javax.swing.JDialog y reemplazar java.awt.Frame*/
public class FormularioCorredores extends javax.swing.JDialog {

    private static final String RUTA_LOGO = "..\\imgs\\corredor.png";
    private LogicaNegocio logicaNegocio;
    private Corredor corredorModificar = null;
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private String nombre = "";
    private String dni = "";
    private Date fechaNacimiento;
    private String direccion = "";
    private int telefono;

    /**
     * reemplazar java.awt.Frame
     */
    //Constructor para el alta
    public FormularioCorredores(TablaCorredores aThis, boolean modal,
            LogicaNegocio logicaNegocio) {
        super(aThis, modal);
        this.logicaNegocio = LogicaNegocio.getInstance();
        initComponents();
        setTitle("FORMULARIO ALTA CORREDORES.");

//Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        setLocationRelativeTo(null);
        jButtonValidarCorredores.setEnabled(false);
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(jTextFieldNombreApellidos, StringValidators.REQUIRE_NON_EMPTY_STRING,
                new MayusculaValidator());
        group.add(jTextFieldDni, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldTelefono, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);

        validationPanel.addChangeListener((new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (validationPanel.getProblem() == null) {
                    jButtonValidarCorredores.setEnabled(true);
                } else {
                    jButtonValidarCorredores.setEnabled(false);
                }
            }
        }));

    }

    //Constructor para modificar. Sabemos diferenciar si es un alta o una modificación
    //gracias al valor de personaModificar. Si es null será un alta, si tiene un valor
    //será una modificación.
    public FormularioCorredores(TablaCorredores aThis, boolean modal,
            Corredor corredorModificar) {
        super(aThis, modal);
        this.corredorModificar = corredorModificar;
        initComponents();
        setTitle("FORMULARIO MODIFICACIÓN CORREDORES.");
        //Establecer el logo del a aplicación
        setIconImage(new ImageIcon(getClass().getResource(RUTA_LOGO)).getImage());
        jButtonValidarCorredores.setEnabled(false);
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(jTextFieldNombreApellidos, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDni, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldTelefono, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);

        validationPanel.addChangeListener((new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (validationPanel.getProblem() == null) {
                    jButtonValidarCorredores.setEnabled(true);
                } else {
                    jButtonValidarCorredores.setEnabled(false);
                }
            }
        }));

        jTextFieldNombreApellidos.setText(corredorModificar.getNombre());
        jTextFieldDni.setText(corredorModificar.getDni());
        jSpinnerFechaNacimiento.setValue(corredorModificar.getFechaNacimiento());
        jTextFieldDireccion.setText(corredorModificar.getDireccion());
        jTextFieldTelefono.setText(Integer.toString(corredorModificar.getTelefono()));

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
        jPanelDatos = new javax.swing.JPanel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombreApellidos = new javax.swing.JLabel();
        jTextFieldNombreApellidos = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSpinnerFechaNacimiento = new javax.swing.JSpinner();
        jButtonValidarCorredores = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelefono.setText("Telefono");

        jLabelDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDireccion.setText("Direccion");

        jLabelFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFecha.setText("Fecha nacimiento");

        jLabelDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDni.setText("DNI");

        jLabelNombreApellidos.setBackground(new java.awt.Color(51, 102, 255));
        jLabelNombreApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombreApellidos.setText("Nombre y apellidos");

        jTextFieldNombreApellidos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldNombreApellidos.setName("Nombre y apellidos"); // NOI18N
        jTextFieldNombreApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreApellidosActionPerformed(evt);
            }
        });

        jTextFieldDni.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldDni.setName("DNI"); // NOI18N
        jTextFieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniActionPerformed(evt);
            }
        });

        jTextFieldDireccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldDireccion.setName("Direccion"); // NOI18N
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jTextFieldTelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldTelefono.setName("Telefono"); // NOI18N
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jSpinnerFechaNacimiento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1285919640000L), new java.util.Date(-31590360000L), new java.util.Date(1285919640000L), java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDni)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelNombreApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 246, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelNombreApellidos))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextFieldNombreApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDni))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefono))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButtonValidarCorredores.setBackground(new java.awt.Color(204, 204, 255));
        jButtonValidarCorredores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonValidarCorredores.setText("Aceptar");
        jButtonValidarCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarCorredoresActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(validationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonValidarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonValidarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(validationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        //devuelve parámetro
        int confirmación = JOptionPane.showConfirmDialog(this, "Quiere limpiar el registro",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirmación == JOptionPane.YES_OPTION) {
            limpiarDatos();
            JOptionPane.showMessageDialog(this, "Se ha limpiado la pantalla.",
                    "Limpiar.", JOptionPane.INFORMATION_MESSAGE);
        } else if (confirmación == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "No se ha limpiado la pantalla.",
                    "Limpiar.", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void limpiarDatos() {
        jTextFieldNombreApellidos.setText("");
        jTextFieldDni.setText("");
        jSpinnerFechaNacimiento.setValue(new Date());
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");

    }
    private void jButtonValidarCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarCorredoresActionPerformed
        Corredor p;
        nombre = jTextFieldNombreApellidos.getText();
        dni = jTextFieldDni.getText();
        fechaNacimiento = (Date) jSpinnerFechaNacimiento.getValue();
        direccion = jTextFieldDireccion.getText();
        telefono = Integer.valueOf(jTextFieldTelefono.getText());
        //Checkeamos si es un alta o una modificación
        if (corredorModificar == null) {
            try {

                p = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
                LogicaNegocio.getInstance().anadirCorredorLista(p);

                //método para mostrar simplemente un mensaje
                JOptionPane.showMessageDialog(this, "Corredor creado con éxito.",
                        "Validación.", JOptionPane.INFORMATION_MESSAGE);
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try {

                corredorModificar.setNombre(nombre);
                corredorModificar.setDni(dni);
                corredorModificar.setFechaNacimiento(fechaNacimiento);
                corredorModificar.setDireccion(direccion);
                corredorModificar.setTelefono(telefono);
                LogicaNegocio.getInstance().anadirCorredorLista(corredorModificar);
                //método para mostrar simplemente un mensaje
                JOptionPane.showMessageDialog(this, "Corredor modificado con éxito.",
                        "Validación.", JOptionPane.INFORMATION_MESSAGE);
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        dispose();
    }//GEN-LAST:event_jButtonValidarCorredoresActionPerformed

    private void jTextFieldNombreApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreApellidosActionPerformed

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonValidarCorredores;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombreApellidos;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JSpinner jSpinnerFechaNacimiento;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombreApellidos;
    private javax.swing.JTextField jTextFieldTelefono;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables

}
