/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bdpj.bd1pj;

import javax.swing.JTextField;

/**
 *
 * @author benjaminurbinarusque
 */
public class prueba extends javax.swing.JPanel {

    /**
     * Creates new form prueba
     */
    public prueba() {
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

        Intervalo1 = new javax.swing.JTextField();
        Intervalo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Intervalo1.setText("Primera fecha");
        Intervalo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intervalo1ActionPerformed(evt);
            }
        });

        Intervalo2.setText("Segunda fecha");
        Intervalo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intervalo2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Las fechas tienen que seguir el siguiente formato: yyyy-MM-dd");

        jLabel2.setText("Ejemplo: 2024-11-30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(Intervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2)))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Intervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(343, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Intervalo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intervalo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Intervalo2ActionPerformed

    private void Intervalo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intervalo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Intervalo1ActionPerformed

    public String getIntervalo1() {
        return Intervalo1.getText();
    }

    public String getIntervalo2() {
        return Intervalo2.getText();
    }
        public void limpiarCampos() {
        Intervalo1.setText("Primera fecha"); // Vaciar el primer campo
        Intervalo2.setText("Segunda fecha"); // Vaciar el segundo campo
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Intervalo1;
    private javax.swing.JTextField Intervalo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
