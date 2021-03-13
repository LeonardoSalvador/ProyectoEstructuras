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
public class FrameBuscarReservacion extends javax.swing.JInternalFrame {
    static Principal principal;
    /**
     * Creates new form FrameRegistrarVenta
     */
    public FrameBuscarReservacion() {
        initComponents();
    }
    
    public FrameBuscarReservacion(Principal principal) {
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

        jLabel6 = new javax.swing.JLabel();
        btnBuscarReservacion = new javax.swing.JButton();
        txaMostrar = new javax.swing.JScrollPane();
        txaMostrarReservacionBuscada = new javax.swing.JTextArea();
        txtCodigoReservacionBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setText("BUSCAR RESERVACIONES");

        btnBuscarReservacion.setText("Buscar");
        btnBuscarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservacionActionPerformed(evt);
            }
        });

        txaMostrarReservacionBuscada.setColumns(20);
        txaMostrarReservacionBuscada.setRows(5);
        txaMostrar.setViewportView(txaMostrarReservacionBuscada);

        jLabel1.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(txaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(txtCodigoReservacionBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoReservacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservacionActionPerformed
        if (!txtCodigoReservacionBuscar.getText().isEmpty()){
            int codigoRes = Integer.parseInt(txtCodigoReservacionBuscar.getText());
            Reservacion reservacion1 = principal.reservaciones.buscarNodo(codigoRes);
            if (reservacion1 == null){
                txaMostrarReservacionBuscada.setText("No se ha encontrado la reservación");
            } else {
                txaMostrarReservacionBuscada.setText("¡Cliente encontrado!\n" + reservacion1.toString());
            }
            txtCodigoReservacionBuscar.setText(null);
        }
        else {
            txaMostrarReservacionBuscada.setText("No se ha ingresado información para"
                    + " realizar la búsqueda.\nPor favor, ingrese un valor en "
                    + " el campo \"Código\"");
        }
    }//GEN-LAST:event_btnBuscarReservacionActionPerformed

    public void limpiarAreaDeTexto(){
        txaMostrarReservacionBuscada.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReservacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane txaMostrar;
    private javax.swing.JTextArea txaMostrarReservacionBuscada;
    private javax.swing.JTextField txtCodigoReservacionBuscar;
    // End of variables declaration//GEN-END:variables
}
