/**
 * Aplicacion para calcular descuentos de camisas por la temporada de verano
 */
package taller_clase_01;

import java.awt.Color;

/**
 * @author Rojas Gutiérrez Pool Fabian
 * @version 1.0
 */
public class Enunciado04 extends javax.swing.JFrame {

    /**
     * Constructor de la aplicacion
     * Se utilizo una libreria para añadir una imagen
     */
    public Enunciado04() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImg, "C:\\Users\\FABIAN\\Documents\\NetBeansProjects\\Taller_Clase_01\\Taller_Clase_01\\src\\taller_clase_01\\camisa.png");
        OfertaVerano();
    }
    /**
     * Método OfertaVerano
     * @param no tiene parametros
     */
    private void OfertaVerano(){
        this.setTitle("Oferta de Verano");
        this.setLocationRelativeTo(this);// hace que se coloque al medio
        this.setResizable(false);//para que no se pueda editar el tamaño del form
        this.getContentPane().setBackground(new Color(173, 217, 231));
        this.jPanel1.setBackground(new Color(173, 217, 231));
        this.jPanel2.setBackground(new  Color (173, 217, 231));
    }
    
    
    /**
     * Método Precio
     * @return retorna el precio en la variable precio
     */
    public float Precio(){
        float precio;
        precio= Float.parseFloat(this.txtPrecio.getText());
        return precio;
    }
    /**
     * MÉTODO INGRESAMOS LA CANTIDAD
     * @return retorna la cantidad en la variable cant
     */
     public float Cantidad (){
        float cant;
        cant= Float.parseFloat(this.txtCantidad.getText());
        return cant;
    }
    /**
     * MÉTODO PARA CALCULAR EL IMPORTE DE COMPRA
     * @return retorna el importe de compra en la variable importeCom
     */
    public float ImporteCompra(){
        float importeCom;
        importeCom= Precio()* Cantidad();
        return importeCom;
    }
    /**
     * Método para mostrar el importe de compra 
     */
    public void MostrarImporteCompra(){
        txtImporteCompra.setText(String.valueOf(ImporteCompra()));
    }
    
    /**
     * METODO PARA HALLAR EL DESCUENTO 
     * HALLAMOS EL PRIMER DESCUENTO
     * @return  retorna el primer descuento en la variable PrDescuento
     */
    public float PrimerDescuento(){
        float PrDescuento;
        PrDescuento= ImporteCompra() * 0.07f;
        return PrDescuento;
    }
    /**
     * Metodo para mostrar el primer descuento
     */
    public void MostrarPrimerDescuento(){
        txtPDescuento.setText(String.valueOf(PrimerDescuento()));
    }
    
    /**
     * METODO PARA HALLAR EL SEGUNDO DESCUENTO 
     * @return  retorna el segundo descuento en la variable SgDescuento
     */
    public float SegundoDescuento(){
        float SgDescuento;
        SgDescuento= (ImporteCompra()-PrimerDescuento()) * 0.07f;
        return SgDescuento;
    }
    /**
     * Metodo para mostrar el segundo descuento
     */
    public void MostrarSegundoDescuento(){
        txtSDescuento.setText(String.valueOf(SegundoDescuento()));
    }
    
    /**
     * METODO PARA HALLAR EL DESCUENTO TOTAL 
     * @return  retorna el descuento total en la variable desTotal
     */
    public float DescuentoTotal(){
        float desTotal;
        desTotal= PrimerDescuento() + SegundoDescuento();
        return desTotal;
    }
    /**
     * Metodo para mostrar el descuento total
     */
    public void MostrasDescuentoTotal(){
        txtDescuentoTotal.setText(String.valueOf(DescuentoTotal()));
    }
    
    /**
     * METODO PARA HALLAR EL IMPORTE A PAGAR 
     * @return  retorna el importe a pagar en la variable imPagar
     */
    public float ImportePagar(){
        float imPagar;
        imPagar= ImporteCompra()- DescuentoTotal();
        return imPagar;
    }
    /**
     * Metodo para mostrar el importe a pagar
     */
    public float MostrarImportePagar(){
        txtImportePagar.setText(String.valueOf(ImportePagar()));
        return ImportePagar();
    }
    
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblImg = new javax.swing.JLabel();
        btnICompra = new javax.swing.JButton();
        txtPDescuento = new javax.swing.JTextField();
        btnPDescuento = new javax.swing.JButton();
        txtImporteCompra = new javax.swing.JTextField();
        btnSDescuento = new javax.swing.JButton();
        txtSDescuento = new javax.swing.JTextField();
        btnDescuentoTotal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDescuentoTotal = new javax.swing.JTextField();
        btnImporteAPagar = new javax.swing.JButton();
        txtImportePagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 146, 169));
        jLabel1.setText("DESCUENTOS DE CAMISAS POR VERANO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(46, 146, 169));
        jLabel2.setText("PRECIO:  ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(46, 146, 169));
        jLabel3.setText("CANTIDAD:");

        btnICompra.setBackground(new java.awt.Color(46, 146, 169));
        btnICompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnICompra.setForeground(new java.awt.Color(102, 102, 102));
        btnICompra.setText("I. COMPRA");
        btnICompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICompraActionPerformed(evt);
            }
        });

        btnPDescuento.setBackground(new java.awt.Color(46, 146, 169));
        btnPDescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPDescuento.setForeground(new java.awt.Color(102, 102, 102));
        btnPDescuento.setText("PRIMER DESCUENTO");
        btnPDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDescuentoActionPerformed(evt);
            }
        });

        btnSDescuento.setBackground(new java.awt.Color(46, 146, 169));
        btnSDescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSDescuento.setForeground(new java.awt.Color(102, 102, 102));
        btnSDescuento.setText("SEGUNDO DESCUENTO");
        btnSDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDescuentoActionPerformed(evt);
            }
        });

        btnDescuentoTotal.setBackground(new java.awt.Color(46, 146, 169));
        btnDescuentoTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDescuentoTotal.setForeground(new java.awt.Color(102, 102, 102));
        btnDescuentoTotal.setText("DESCUENTO TOTAL");
        btnDescuentoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(46, 146, 169));
        jLabel4.setText("DESCUENTO:");

        btnImporteAPagar.setBackground(new java.awt.Color(46, 146, 169));
        btnImporteAPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImporteAPagar.setForeground(new java.awt.Color(102, 102, 102));
        btnImporteAPagar.setText("IMPORTE A PAGAR");
        btnImporteAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporteAPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSDescuento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(112, 112, 112))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnICompra)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnPDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(txtPDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnDescuentoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDescuentoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnImporteAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtImportePagar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnICompra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPDescuento)
                            .addComponent(txtPDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSDescuento)
                            .addComponent(txtSDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescuentoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDescuentoTotal))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImporteAPagar)
                            .addComponent(txtImportePagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnICompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICompraActionPerformed
        MostrarImporteCompra();
    }//GEN-LAST:event_btnICompraActionPerformed

    private void btnPDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDescuentoActionPerformed
        MostrarPrimerDescuento();
    }//GEN-LAST:event_btnPDescuentoActionPerformed

    private void btnSDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDescuentoActionPerformed
        MostrarSegundoDescuento();
    }//GEN-LAST:event_btnSDescuentoActionPerformed

    private void btnDescuentoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoTotalActionPerformed
        MostrasDescuentoTotal();
    }//GEN-LAST:event_btnDescuentoTotalActionPerformed

    private void btnImporteAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteAPagarActionPerformed
        MostrarImportePagar();
    }//GEN-LAST:event_btnImporteAPagarActionPerformed

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
            java.util.logging.Logger.getLogger(Enunciado04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enunciado04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enunciado04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enunciado04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enunciado04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescuentoTotal;
    private javax.swing.JButton btnICompra;
    private javax.swing.JButton btnImporteAPagar;
    private javax.swing.JButton btnPDescuento;
    private javax.swing.JButton btnSDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuentoTotal;
    private javax.swing.JTextField txtImporteCompra;
    private javax.swing.JTextField txtImportePagar;
    private javax.swing.JTextField txtPDescuento;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSDescuento;
    // End of variables declaration//GEN-END:variables
}
