/**
 * Aplicación para calcular la inversion en una feria
 */
package taller_clase_01;

import java.awt.Color;

/**
 * @author Huaman Ñahui Dany Daniel
 * @version 1.0
 */
public class Enunciado03 extends javax.swing.JFrame {

    /**
     * Constructor de la aplicacion
     */
    public Enunciado03() {
        initComponents();
        InversionFeria();
    }
    
    /**
     * Método InversionFeria
     * @param no tiene parametros
     */
    private void InversionFeria(){
        this.setTitle("Inversion de Feria");
        this.setLocationRelativeTo(this);// hace que se coloque al medio
        this.setResizable(false);//para que no se pueda editar el tamaño del form
        this.getContentPane().setBackground(new Color(255,255,210));
        this.jPanel1.setBackground(new Color(255,255,210));
        this.jPanel2.setBackground(new  Color (255,255,210));
    }
    
    /**
     * Método MontoInversion
     * @return retorna el monto de inversion en la variable MInversion
     */
    private float MontoInversion(){
        float MInversion;
        MInversion= Float.parseFloat(this.txtInversion.getText());
        return MInversion;
    }
    /**
     * METODO PARA CALCULAR EL ALQUILER
     * @return retorna el alquiler en la variable alquiler
     */
    private float Alquiler(){
        float alquiler;
        alquiler= MontoInversion()* 0.23f;
        return alquiler;
    }
    
    /**
     * Método que muestra el precio el precio del alquiler
     */
    private void MostrarAlquiler(){
        txtAlquiler.setText(String.valueOf(Alquiler()));
    }
    
    /**
     * METODO PARA CALCULAR LA PUBLICIDAD
     *@return devuelve el costo de publicidad en la variable publicidad 
     */
    private float Publicidad(){
        float publicidad;
        publicidad= MontoInversion() * 0.07f;
        return publicidad;
    }
    /**
     * Método que muestra el precio de la publicidad
     */
    private float MostrarPublicidad(){
        txtPublicidad.setText(String.valueOf(Publicidad()));
        return Publicidad();
    }
    
    /**
     * METODO PARA CALCULAR EL TRANSPORTE
     *@return devuelve el costo de transporte en la variable trans 
     */
    private float Transporte(){
        float trans;
        trans= MontoInversion()* 0.26f;
        return trans;
    }
    /**
     * Método que muestra el precio del transporte
     */
    private void MostrarTransporte(){
        txtTransporte.setText(String.valueOf(Transporte()));
    }
    /**
     * METODO PARA CALCULAR LOS SERVICIOS
     * @return devuelve el costo de los servicios
     */
    private float Servicios(){
        float servicios;
        servicios= MontoInversion() * 0.12f;
        return servicios;
    }
    /**
     * Método que muestra el costo de los servicios
     */
    private float MostrarServicios(){
        txtServicios.setText(String.valueOf(Servicios()));
        return Servicios();
    }
    
    /**
     * METODO PARA CALCULAR DECORACION
     * @return devuelve el costo de decoracion en la variable decoracion
    */
    private float Decoracion(){
        float decoracion;
        decoracion= MontoInversion() * 0.21f;
        return decoracion;
    }
     /**
     * Método que muestra el costo de la decoracion
     */
    private void MostrarDecoracion(){
        txtDecoracion.setText(String.valueOf(Decoracion()));
    }
    
    /**
     * MOSTRAR LOS GASTOS
     *@return devuelve el costo de los gastos en la variable gastos
     */
    private float Gastos(){
        float gastos;
        gastos= MontoInversion()*0.11f;
        return gastos;
    }
    /**
     * Método que muestra el costo de los gastos
     */
    private void MostrarGastos(){
        txtGastos.setText(String.valueOf(Gastos()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtInversion = new javax.swing.JTextField();
        btnAlquiler = new javax.swing.JButton();
        txtAlquiler = new javax.swing.JTextField();
        txtPublicidad = new javax.swing.JTextField();
        btnPublicidad = new javax.swing.JButton();
        txtTransporte = new javax.swing.JTextField();
        btnTransporte = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        txtServicios = new javax.swing.JTextField();
        btnDecoracion = new javax.swing.JButton();
        txtDecoracion = new javax.swing.JTextField();
        btnGastos = new javax.swing.JButton();
        txtGastos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 150, 218));
        jLabel1.setText("INVERSION PARA LA FERIA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 150, 218));
        jLabel2.setText("MONTO DE INVERSION");

        btnAlquiler.setBackground(new java.awt.Color(197, 250, 213));
        btnAlquiler.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlquiler.setForeground(new java.awt.Color(170, 150, 218));
        btnAlquiler.setText("ALQUILER DE LOCAL");
        btnAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilerActionPerformed(evt);
            }
        });

        btnPublicidad.setBackground(new java.awt.Color(197, 250, 213));
        btnPublicidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPublicidad.setForeground(new java.awt.Color(170, 150, 218));
        btnPublicidad.setText("PUBLICIDAD");
        btnPublicidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicidadActionPerformed(evt);
            }
        });

        btnTransporte.setBackground(new java.awt.Color(197, 250, 213));
        btnTransporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTransporte.setForeground(new java.awt.Color(170, 150, 218));
        btnTransporte.setText("TRANSPORTE");
        btnTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransporteActionPerformed(evt);
            }
        });

        btnServicios.setBackground(new java.awt.Color(197, 250, 213));
        btnServicios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(170, 150, 218));
        btnServicios.setText("SERVICIOS FERIALES");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnDecoracion.setBackground(new java.awt.Color(197, 250, 213));
        btnDecoracion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDecoracion.setForeground(new java.awt.Color(170, 150, 218));
        btnDecoracion.setText("DECORACION");
        btnDecoracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecoracionActionPerformed(evt);
            }
        });

        btnGastos.setBackground(new java.awt.Color(197, 250, 213));
        btnGastos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGastos.setForeground(new java.awt.Color(170, 150, 218));
        btnGastos.setText("GASTOS");
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnTransporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPublicidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlquiler)
                    .addComponent(txtAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransporte))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicios)
                    .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecoracion)
                    .addComponent(txtDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGastos)
                    .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecoracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecoracionActionPerformed
        MostrarDecoracion();
    }//GEN-LAST:event_btnDecoracionActionPerformed

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        MostrarGastos();
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilerActionPerformed
        MostrarAlquiler();
    }//GEN-LAST:event_btnAlquilerActionPerformed

    private void btnPublicidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicidadActionPerformed
        MostrarPublicidad();
    }//GEN-LAST:event_btnPublicidadActionPerformed

    private void btnTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransporteActionPerformed
        MostrarTransporte();
    }//GEN-LAST:event_btnTransporteActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        MostrarServicios();
    }//GEN-LAST:event_btnServiciosActionPerformed

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
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enunciado03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enunciado03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquiler;
    private javax.swing.JButton btnDecoracion;
    private javax.swing.JButton btnGastos;
    private javax.swing.JButton btnPublicidad;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAlquiler;
    private javax.swing.JTextField txtDecoracion;
    private javax.swing.JTextField txtGastos;
    private javax.swing.JTextField txtInversion;
    private javax.swing.JTextField txtPublicidad;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JTextField txtTransporte;
    // End of variables declaration//GEN-END:variables
}
