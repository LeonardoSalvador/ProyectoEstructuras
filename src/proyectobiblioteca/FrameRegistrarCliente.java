/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author danie
 */
public class FrameRegistrarCliente extends javax.swing.JInternalFrame {
    static Principal principal;
    /**
     * Creates new form FrameRegistrarVenta
     */
    public FrameRegistrarCliente() {
        initComponents();
    }
    
    public FrameRegistrarCliente(Principal principal) {
        this.principal = principal;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtCICliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        panelMostrarClienteRegistro = new javax.swing.JScrollPane();
        txaMostrarClienteRegistro = new javax.swing.JTextArea();
        btnRegistrarCliente = new javax.swing.JButton();

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Dirección");

        jLabel4.setText("Cédula de Identidad");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel5.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setText("REGISTRAR CLIENTE");

        txtNombreCliente.setMinimumSize(new java.awt.Dimension(6, 59));

        txtApellidoCliente.setMinimumSize(new java.awt.Dimension(6, 59));

        txtDireccionCliente.setMinimumSize(new java.awt.Dimension(6, 59));

        txtCICliente.setMinimumSize(new java.awt.Dimension(6, 59));

        txtTelefonoCliente.setToolTipText("");
        txtTelefonoCliente.setMinimumSize(new java.awt.Dimension(6, 59));

        txaMostrarClienteRegistro.setColumns(20);
        txaMostrarClienteRegistro.setRows(5);
        panelMostrarClienteRegistro.setViewportView(txaMostrarClienteRegistro);

        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnRegistrarCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCICliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(panelMostrarClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMostrarClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        //Se valida que los campos no estén vacíos y que la cédula sea válida
        if (!txtNombreCliente.getText().isEmpty()
                && !txtApellidoCliente.getText().isEmpty()
                && !txtCICliente.getText().isEmpty()
                && !txtDireccionCliente.getText().isEmpty()
                && !txtTelefonoCliente.getText().isEmpty()){
            StringBuilder auxCI = new StringBuilder(txtCICliente.getText());
            boolean aux = true;
            for (int i = 0; i<auxCI.length();i++){
                aux &= Character.isDigit(auxCI.charAt(i));
            }
            
            if (aux){
                if (Cliente.esCedulaValida(txtCICliente.getText())){
                    if (principal.clientes.estaRegistrado(txtCICliente.getText())){
                        txaMostrarClienteRegistro.setText("Ya existe un cliente con la cédula indicada."
                                + "\nPor favor ingrese otra cédula.");
                    }
                    else {
                        if (Cliente.esNombreApellidoValido(txtNombreCliente.getText())
                                && Cliente.esNombreApellidoValido(txtApellidoCliente.getText())){
                            Cliente cliente1 = new Cliente();
                            cliente1.setNombres(txtNombreCliente.getText());
                            cliente1.setApellidos(txtApellidoCliente.getText());
                            cliente1.setDireccion(txtDireccionCliente.getText());
                            cliente1.setCedula(txtCICliente.getText());
                            cliente1.setTelefono(txtTelefonoCliente.getText());

                            NodoCliente nuevoNodoCliente = new NodoCliente(cliente1);
                            principal.clientes.ingresarNodo(nuevoNodoCliente);
                            txaMostrarClienteRegistro.setText("¡Cliente ingresado!\n" + cliente1.toString());

                            limpiarCasillas(); 
                        }
                        else {
                            txaMostrarClienteRegistro.setText("Error al ingresar el nombre o apellido."
                                    + "\nPor favor ingrese nombres y apellido válidos.");
                        }
                    } 
                }
                else {
                    txaMostrarClienteRegistro.setText("Error. Se ha ingresado un valor de cédula"
                            + " inválido.\nPor favor, ingrese una cédula válida.");
                }
            }
            else {
                txaMostrarClienteRegistro.setText("Error. En el campo \"Cédula\" debe ingresarse"
                        + " una cédula de 10 dígitos.\nPor favor, ingrese una cédula válida.");
            }  
        }
        else {
            txaMostrarClienteRegistro.setText("No se ha ingresado información suficiente"
                    + " para realizar el registro.\nPor favor, llene todos los campos");
        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    //Método para limpiar todos los campos
    public void limpiarCasillas(){
        txtApellidoCliente.setText(null);
        txtNombreCliente.setText(null);
        txtCICliente.setText(null);
        txtDireccionCliente.setText(null);
        txtTelefonoCliente.setText(null);
    }
    
    //Método para limpiar el área de texto
    public void limpiarAreaDeTexto(){
        txaMostrarClienteRegistro.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane panelMostrarClienteRegistro;
    private javax.swing.JTextArea txaMostrarClienteRegistro;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCICliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}