
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class EJERCICIO_02 extends javax.swing.JFrame {

    FUN_ESTADISTICAS estadistica = new FUN_ESTADISTICAS();

    public EJERCICIO_02() {
        initComponents();
        formulario();
    }

    private void formulario() {
        this.setTitle("Funciones Estadisticas");
        this.setLocationRelativeTo(this);// hace que se coloque al medio
        this.setResizable(false);//para que no se pueda editar el tamaño del form
        this.setSize(new Dimension(600, 700));
        this.getContentPane().setBackground(new Color(9, 66, 147));
        this.panelDatos.setBackground(new Color(9, 66, 147));
        this.panelOperaciones.setBackground(new Color(9, 66, 147));
        this.txtCantidad.requestFocus();
    }

    private int leerCantidad() {
        int cant;
        cant = Integer.parseInt(this.txtCantidad.getText());
        return cant;
    }

    private int[] Almacenador() {
        int[] almacenador = new int[leerCantidad()];
        for (int i = 0; i < almacenador.length; i++) {
            almacenador[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1)));
        }
        return almacenador;
    }

    private String Mostrar(int[] numeros) {
        StringBuilder resultado = new StringBuilder();
        for (int num : numeros) {
            resultado.append(num).append(" ");
        }
        return resultado.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelOperaciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGrafico = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        jpanelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("                          FUNCIONES ESTADISTICAS");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGrafico.setText("Grafico");
        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnGrafico)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(19, 19, 19))
        );

        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Ingrese cantidad de datos:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtAreaSalida.setColumns(20);
        txtAreaSalida.setRows(5);
        jScrollPane1.setViewportView(txtAreaSalida);

        javax.swing.GroupLayout jpanelGraficoLayout = new javax.swing.GroupLayout(jpanelGrafico);
        jpanelGrafico.setLayout(jpanelGraficoLayout);
        jpanelGraficoLayout.setHorizontalGroup(
            jpanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpanelGraficoLayout.setVerticalGroup(
            jpanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[] numeros = Almacenador();
        this.txtAreaSalida.append("\t RESULTADO \n");
        this.txtAreaSalida.append("Los números de la poblacion son:\n " + this.Mostrar(numeros) + "\n");
        this.txtAreaSalida.append("La media aritmética es: " + String.valueOf(estadistica.Media(numeros)) + "\n");
        this.txtAreaSalida.append("La moda es: " + String.valueOf(estadistica.Moda(numeros)) + "\n");
        this.txtAreaSalida.append("La mediana es: " + String.valueOf(estadistica.Mediana(numeros)) + "\n");
        this.txtAreaSalida.append("La varianza es: " + String.valueOf(estadistica.Varianza(numeros)) + "\n");
        this.txtAreaSalida.append("La desviacion estandar: " + String.valueOf(estadistica.desviacionEstandar(numeros)) + "\n");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (txtCantidad.getText().length() > 0 && txtAreaSalida.getText().length() > 0 ) {
            txtCantidad.setText("");
            txtAreaSalida.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede limpiar si los campos no estan llenos");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this,//para que agarre el cuadro de show 
                "Estas seguro que quieres salir..",//el mensaje que saldra
                "Salida",//el titulo del Pane que se abre
                JOptionPane.YES_NO_OPTION,// las opciones de si o no pero en ingles yes y no
                JOptionPane.QUESTION_MESSAGE,//la img del signo de interrogacion
                null,//para que no tome ningun valor por defecto
                new Object[]{"si", "no"},// se pone las opciones si o no en español ya que por defecto esta en ingles
                "si");// esto marca el si por defecto
        if (resp == 0) { // el indice de si es 0 y el de no es 1
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed
        // Obtener el texto del txtAreaSalida
        String datosSalida = txtAreaSalida.getText();

        /// Dividir el texto por saltos de línea y eliminar espacios en blanco
        String[] lineas = datosSalida.split("\\r?\\n");

        // Filtrar solo los números de cada línea y convertirlos a enteros
        List<Integer> numeros = new ArrayList<>();
        for (String linea : lineas) {
            String[] partes = linea.trim().split("\\s+");
            for (String parte : partes) {
                try {
                    int numero = Integer.parseInt(parte);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    // Ignorar si la parte no es un número válido
                }
            }
        }
        // Convertir la lista de números a un arreglo de enteros
        int[] arregloNumeros = numeros.stream().mapToInt(Integer::intValue).toArray();
        // Calcular las estadísticas con los datos obtenidos
        float media = estadistica.Media(arregloNumeros);
        int moda= estadistica.Moda(arregloNumeros);
        float mediana = estadistica.Mediana(arregloNumeros);
        float varianza = estadistica.Varianza(arregloNumeros);
        float desviacion = estadistica.desviacionEstandar(arregloNumeros);
        

        // Crear el dataset para el gráfico
        DefaultCategoryDataset datosDataset = new DefaultCategoryDataset();
        datosDataset.setValue(media, "Media", "");
        datosDataset.setValue(moda, "Moda", "");
        datosDataset.setValue(mediana, "Mediana", "");
        datosDataset.setValue(varianza, "Varianza", "");
        datosDataset.setValue(desviacion, "Desviacion", "");

        // Crear el gráfico de barras
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Funciones Estadisticas",
                "",
                "Total",
                datosDataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Crear el panel de gráfico
        ChartPanel panelGrafico = new ChartPanel(graficoBarras);
        panelGrafico.setMouseWheelEnabled(true);
        panelGrafico.setPreferredSize(new Dimension(450, 250));

        // Limpiar el panel actual y agregar el nuevo panel con el gráfico
        jpanelGrafico.removeAll();
        jpanelGrafico.setLayout(new BorderLayout());
        jpanelGrafico.add(panelGrafico, BorderLayout.NORTH);
        jpanelGrafico.revalidate();
        jpanelGrafico.repaint();
    }//GEN-LAST:event_btnGraficoActionPerformed

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
            java.util.logging.Logger.getLogger(EJERCICIO_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJERCICIO_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafico;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelGrafico;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JTextArea txtAreaSalida;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
