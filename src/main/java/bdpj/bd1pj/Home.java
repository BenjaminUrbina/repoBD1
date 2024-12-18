/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdpj.bd1pj;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//

/**
 *
 * @author benjaminurbinarusque
 */
public class Home extends javax.swing.JFrame {

    prueba p1 = new prueba();
    BD1PJ recuperarBD = new BD1PJ();

    public Home() {
        initComponents();
        
        Electronicos panelElectronicos = new Electronicos();
        // Buscar el índice de la pestaña "Atencion Cliente"
        int clienteIndex = -1;
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            if (jTabbedPane1.getTitleAt(i).equals("Atencion Cliente")) {
                clienteIndex = i;
                break;
            }
        }
        if (clienteIndex != -1) {
            jTabbedPane1.insertTab("Electronicos", null, panelElectronicos, null, clienteIndex + 1);  
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AtencionCliente = new javax.swing.JPanel();
        Servicios = new javax.swing.JPanel();
        Graficos = new javax.swing.JPanel();
        OpcionesGrafico = new javax.swing.JComboBox<>();
        Graficar = new javax.swing.JButton();
        info1Grafico = new javax.swing.JLabel();
        Info1GraficoB = new javax.swing.JLabel();
        PanelInfo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AtencionClienteLayout = new javax.swing.GroupLayout(AtencionCliente);
        AtencionCliente.setLayout(AtencionClienteLayout);
        AtencionClienteLayout.setHorizontalGroup(
            AtencionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        AtencionClienteLayout.setVerticalGroup(
            AtencionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Atencion Cliente", AtencionCliente);

        javax.swing.GroupLayout ServiciosLayout = new javax.swing.GroupLayout(Servicios);
        Servicios.setLayout(ServiciosLayout);
        ServiciosLayout.setHorizontalGroup(
            ServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        ServiciosLayout.setVerticalGroup(
            ServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Servicios", Servicios);

        OpcionesGrafico.setBackground(new java.awt.Color(255, 255, 255));
        OpcionesGrafico.setForeground(new java.awt.Color(0, 0, 0));
        OpcionesGrafico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona las opciones disponibles", "Graficar ganancias total del mes hasta el momento", "Graficar Ingreso por año", "Graficar ingresos por metodos de pago (Intervalo de tiempo dado)", " " }));
        Font JCF = new Font("Arial", Font.PLAIN, 18);
        OpcionesGrafico.setFont(JCF);
        OpcionesGrafico.setToolTipText("sfasf");
        OpcionesGrafico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OpcionesGrafico.setName(""); // NOI18N
        OpcionesGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesGraficoActionPerformed(evt);
            }
        });

        Graficar.setBackground(new java.awt.Color(255, 255, 255));
        Graficar.setForeground(new java.awt.Color(0, 0, 0));
        Graficar.setText("Graficar");
        Graficar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        info1Grafico.setText("Opción 1");

        Info1GraficoB.setText("Opción 1");

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GraficosLayout = new javax.swing.GroupLayout(Graficos);
        Graficos.setLayout(GraficosLayout);
        GraficosLayout.setHorizontalGroup(
            GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GraficosLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpcionesGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info1Grafico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Info1GraficoB))
                .addGap(93, 93, 93))
        );
        GraficosLayout.setVerticalGroup(
            GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficosLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info1Grafico)
                    .addComponent(Info1GraficoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpcionesGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        OpcionesGrafico.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Graficos", Graficos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Font font = new Font("Arial", Font.BOLD, 14);  // Cambia la fuente y tamaño aquí
        jTabbedPane1.setFont(font);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcionesGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesGraficoActionPerformed
        String selectedOption = (String) OpcionesGrafico.getSelectedItem();
        PanelInfo.removeAll();
        if (selectedOption != null && selectedOption.equals("Graficar ingresos por metodos de pago (Intervalo de tiempo dado)")) {
            if (p1 == null) { // Crear p1 solo si aún no existe
                p1 = new prueba();
            } else {
                p1.limpiarCampos();
            }

            p1.setLocation(0, 0);
            p1.setSize(1100, 470);
            PanelInfo.add(p1, BorderLayout.CENTER); // Agregar p1
        }
        PanelInfo.revalidate();
        PanelInfo.repaint();
    }//GEN-LAST:event_OpcionesGraficoActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        // TODO add your handling code here:

        String selectedOption = (String) OpcionesGrafico.getSelectedItem();
        if (selectedOption != null && selectedOption.equals("Graficar ingresos por metodos de pago (Intervalo de tiempo dado)")) {
            if ((!p1.getIntervalo1().equals("")) && (!p1.getIntervalo2().equals("")) && (!p1.getIntervalo1().equals("Primera fecha")) && (!p1.getIntervalo2().equals("Segunda fecha"))) {
                showGraphPopup(selectedOption);
            }
        }

        /*if (selectedOption != null && !selectedOption.equals("Selecciona las opciones disponibles")){
            showGraphPopup(selectedOption);
        }*/
    }//GEN-LAST:event_GraficarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }

        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AtencionCliente;
    private javax.swing.JPanel BG;
    private javax.swing.JButton Graficar;
    private javax.swing.JPanel Graficos;
    private javax.swing.JLabel Info1GraficoB;
    private javax.swing.JComboBox<String> OpcionesGrafico;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel Servicios;
    private javax.swing.JLabel info1Grafico;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void showGraphPopup(String selectedOption) {
        try {
            // Crear el panel que contendrá el gráfico
            JPanel graphPanel = new JPanel();
            graphPanel.setLayout(new BorderLayout());

            // Llamar al método que crea el gráfico
            JFreeChart chart = createChart(selectedOption);

            // Crear el panel de gráfico de JFreeChart
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(600, 400));
            graphPanel.add(chartPanel, BorderLayout.CENTER);

            // Mostrar el gráfico en un popup
            JOptionPane.showMessageDialog(Graficos, graphPanel, "Gráfico: " + selectedOption, JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private JFreeChart createChart(String selectedOption) throws SQLException, ParseException {
        JFreeChart chart = null;

        if (selectedOption.equals("Graficar ganancias total del mes hasta el momento")) {
            // Datos de ejemplo para el gráfico 1
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(10, "Ingresos", "Enero");
            dataset.addValue(20, "Ingresos", "Febrero");
            dataset.addValue(30, "Ingresos", "Marzo");

            // Crear el gráfico de barras
            chart = ChartFactory.createBarChart(
                    "Ingresos por Mes", // Título
                    "Mes", // Eje X
                    "Valor", // Eje Y
                    dataset, // Datos
                    PlotOrientation.VERTICAL, true, true, false);
        } else if (selectedOption.equals("Graficar ingresos por metodos de pago (Intervalo de tiempo dado)")) {
            if ((!p1.getIntervalo1().equals("")) && (!p1.getIntervalo2().equals("")) && (!p1.getIntervalo1().equals("Primera fecha")) && (!p1.getIntervalo2().equals("Segunda fecha"))) {
                System.out.println("Entrando a consulta !");
                System.out.println("valores buscados: " + p1.getIntervalo1() + p1.getIntervalo2());

                String query_sql = "SELECT \n"
                        + "    Boleta.Metodo_Pago,\n"
                        + "    COUNT(*) AS numero_servicios,\n"
                        + "    SUM(Servicio.Costo_Normal + Servicio.Costo_Especializado + Servicio.Costo_Revision) AS total_ganado\n"
                        + "FROM \n"
                        + "    Boleta, Servicio\n"
                        + "WHERE \n"
                        + "    Boleta.ID_Boleta = Servicio.ID_Boleta\n"
                        + "    AND Boleta.fecha_emision >= ?\n"
                        + "    AND Boleta.fecha_emision <= ?\n"
                        + "GROUP BY \n"
                        + "    Boleta.Metodo_Pago\n"
                        + "ORDER BY \n"
                        + "    total_ganado DESC;";

                try (Connection connection = ConexionBd.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query_sql)) {

                    //Se les pasa los valores del intervalo
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaInicio = new Date(format.parse(p1.getIntervalo1()).getTime());
                    Date fechaFin = new Date(format.parse(p1.getIntervalo2()).getTime());

                    // Establecer los parámetros como java.sql.Date
                    preparedStatement.setDate(1, fechaInicio);
                    preparedStatement.setDate(2, fechaFin);

                    ResultSet resultSet = preparedStatement.executeQuery();
                    
                    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                    int i = 0;
                    // Procesar los resultados
                    while (resultSet.next()) {
                        System.out.println("Contador = " + i);
                        String metodoPago = resultSet.getString("Metodo_Pago");
                        int numeroServicios = resultSet.getInt("numero_servicios");
                        double totalGanado = resultSet.getDouble("total_ganado");

                        // Imprimir los resultados (puedes almacenarlos o procesarlos según sea necesario)
                        System.out.println("Método de Pago: " + metodoPago);
                        System.out.println("Número de Servicios: " + numeroServicios);
                        System.out.println("Total Ganado: $" + totalGanado);
                        System.out.println("-----------------------------");
                        i++;
                        
                        
                        dataset.addValue(totalGanado, metodoPago, "Ingreso");
                    }
                    chart = ChartFactory.createBarChart(
                    "Ingresos por Mes", // Título
                    "Metodo", // Eje X
                    "Valor", // Eje Y
                    dataset, // Datos
                    PlotOrientation.VERTICAL, true, true, false);
                } catch (SQLException e) {
                    System.out.println("Error al realizar la consulta: " + e.getMessage());
                }
            }
        }
        return chart; //Retorna grafico completo
    }
}
