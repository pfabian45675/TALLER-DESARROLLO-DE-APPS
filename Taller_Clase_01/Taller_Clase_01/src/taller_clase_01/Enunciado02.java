/**
 * Aplicacion del sueldo de los empleados de una empresa
 */
package taller_clase_01;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Rojas Gutiérrez Pool Fabian
 * @version 1.0
 */
public class Enunciado02 extends javax.swing.JFrame {

    /**
     * Constructor de la aplicacion
     */
    public Enunciado02() {
        initComponents();
        Sempleado();
        
    }
    /**
     * Método Sempleado(sueldo empleado)
     * @param no tiene parametros
     */
    private void Sempleado(){
        this.setTitle("Sueldo de Empleados");
        this.setLocationRelativeTo(this);// hace que se coloque al medio
        this.setResizable(false);//para que no se pueda editar el tamaño del form
        this.getContentPane().setBackground(new Color(120,129,153));
    }
    
    /**
     * Metodo SueldoBasico
     * @return retorna el sueldo Basico en la variable SBasic
     */
    private float SueldoBasico(){
        float SBasic;
        SBasic= Float.parseFloat(this.txtSueldoBasico.getText());
        return SBasic;
    }
    
    /**
     * Metodo ImporteVendido
     * @return retorna el Importe vendido en la variable IVendio
     */
    private float ImporteVendido(){
        float IVendido;
        IVendido=Float.parseFloat(this.txtImporteVendido.getText());
        return  IVendido;
    }
    /**
     * Metodo CalcularComision
     * @return retorna la comision del Importe vendido por el 5%
     */
    private float CalcularComision(){
        float comision;
        comision= ImporteVendido () * 0.05f;
        return comision;
    }
    /**
     * Metodo que muestra el total de la comision
     */
     private void MostrarComision(){
        txtComision1.setText(String.valueOf(CalcularComision()));
     }
     /**
     * Metodo que calcula el sueldo bruto
     * @return retorna el sueldo bruto en la variable SBruto
     */
     private float SueldoBruto(){
        float SBruto;
        SBruto= SueldoBasico()+ CalcularComision();
        return SBruto;
     }
     /**
     * Metodo que muestra el sueldo bruto
     */
     private void MostrarSBruto(){
        txtSueldoBruto1.setText(String.valueOf(SueldoBruto()));
     }
       
     /**
     * Metodo que calcula el descuento
     * @return retorna el descuento en la variable descuento
     */
      private float Descuento(){
        float descuento;
        descuento= SueldoBruto()*15/100;
        return descuento;
     }
     /**
     * Metodo que muestra el Descuento
     */
      private void MostrarDescuento(){
         txtDescuento.setText(String.valueOf(Descuento()));
     }
      
     /**
     * Metodo que calcula Sueldo Neto
     * @return retorna el sueldo neto en la variable Sneto
     */
      private float SueldoNeto(){
          float Sneto;
          Sneto=SueldoBruto()-Descuento();
          return Sneto;
      }
      /**
      * Metodo que muestra el sueldo neto
      */
      private void MostrarSneto(){
         txtSueldoNeto.setText(String.valueOf(SueldoNeto()));
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSueldoBasico = new javax.swing.JTextField();
        txtImporteVendido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtComision1 = new javax.swing.JTextField();
        txtSueldoBruto1 = new javax.swing.JTextField();
        txtSueldoNeto = new javax.swing.JTextField();
        btnComision = new javax.swing.JButton();
        btnSueldoBruto = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        btnSueldoNeto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 235, 241));
        jLabel1.setText("SUELDO DE LOS EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 235, 241));
        jLabel2.setText("SUELDO BASICO:");

        txtSueldoBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBasicoActionPerformed(evt);
            }
        });

        txtImporteVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteVendidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(227, 235, 241));
        jLabel4.setText("IMPORTE TOTAL VENDIDO:");

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        txtComision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComision1ActionPerformed(evt);
            }
        });

        txtSueldoBruto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBruto1ActionPerformed(evt);
            }
        });

        txtSueldoNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoNetoActionPerformed(evt);
            }
        });

        btnComision.setBackground(new java.awt.Color(104, 131, 145));
        btnComision.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComision.setForeground(new java.awt.Color(240, 241, 244));
        btnComision.setText("COMISION");
        btnComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComisionActionPerformed(evt);
            }
        });

        btnSueldoBruto.setBackground(new java.awt.Color(104, 131, 145));
        btnSueldoBruto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSueldoBruto.setForeground(new java.awt.Color(240, 241, 244));
        btnSueldoBruto.setText("CALCULAR S. BRUTO");
        btnSueldoBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoBrutoActionPerformed(evt);
            }
        });

        btnDescuento.setBackground(new java.awt.Color(104, 131, 145));
        btnDescuento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDescuento.setForeground(new java.awt.Color(240, 241, 244));
        btnDescuento.setText("DESCUENTO");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });

        btnSueldoNeto.setBackground(new java.awt.Color(104, 131, 145));
        btnSueldoNeto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSueldoNeto.setForeground(new java.awt.Color(240, 241, 244));
        btnSueldoNeto.setText("SUELDO NETO");
        btnSueldoNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoNetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueldoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldoBruto1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtImporteVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnComision)
                                .addGap(35, 35, 35)
                                .addComponent(txtComision1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSueldoBruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSueldoNeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSueldoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtImporteVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComision1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComision))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldoBruto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSueldoBruto))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescuento)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSueldoNeto)
                    .addComponent(txtSueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSueldoBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBasicoActionPerformed
            
    }//GEN-LAST:event_txtSueldoBasicoActionPerformed

    private void txtImporteVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteVendidoActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtComision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComision1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComision1ActionPerformed

    private void txtSueldoBruto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBruto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoBruto1ActionPerformed

    private void txtSueldoNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoNetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoNetoActionPerformed

    private void btnComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComisionActionPerformed
       MostrarComision();
    }//GEN-LAST:event_btnComisionActionPerformed

    private void btnSueldoBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoBrutoActionPerformed
        MostrarSBruto();
    }//GEN-LAST:event_btnSueldoBrutoActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        MostrarDescuento();
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void btnSueldoNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoNetoActionPerformed
        MostrarSneto();
    }//GEN-LAST:event_btnSueldoNetoActionPerformed

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
            java.util.logging.Logger.getLogger(Enunciado02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enunciado02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enunciado02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enunciado02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enunciado02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComision;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnSueldoBruto;
    private javax.swing.JButton btnSueldoNeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtComision1;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtImporteVendido;
    private javax.swing.JTextField txtSueldoBasico;
    private javax.swing.JTextField txtSueldoBruto1;
    private javax.swing.JTextField txtSueldoNeto;
    // End of variables declaration//GEN-END:variables
}
