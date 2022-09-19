package calculadorainterface;

/*
 * @author Kezia Domingos
 */
public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        labelNum1 = new javax.swing.JLabel();
        labelNum2 = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        fieldNum1 = new javax.swing.JTextField();
        fieldNum2 = new javax.swing.JTextField();
        radioSoma = new javax.swing.JRadioButton();
        radioSub = new javax.swing.JRadioButton();
        radioMult = new javax.swing.JRadioButton();
        radioDiv = new javax.swing.JRadioButton();
        radioResto = new javax.swing.JRadioButton();
        labelResult = new javax.swing.JLabel();
        fieldResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Simples");

        labelNum1.setText("Nº 1:");

        labelNum2.setText("Nº 2:");

        buttonCalcular.setText("CALCULAR");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        radioGroup.add(radioSoma);
        radioSoma.setText("Soma (+)");

        radioGroup.add(radioSub);
        radioSub.setText("Subtração (-)");

        radioGroup.add(radioMult);
        radioMult.setText("Multiplicação (*)");

        radioGroup.add(radioDiv);
        radioDiv.setText("Divisão (/)");

        radioGroup.add(radioResto);
        radioResto.setText("Resto (%)");

        labelResult.setText("RESULTADO:");

        fieldResult.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCalcular)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioResto)
                    .addComponent(radioDiv)
                    .addComponent(radioSub)
                    .addComponent(radioMult)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(radioSoma))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNum1)
                    .addComponent(fieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNum2)
                    .addComponent(fieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioMult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioDiv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioResto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(buttonCalcular)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResult)
                    .addComponent(fieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        double num1, num2,result = 0;
        
        num1 = Double.parseDouble(fieldNum1.getText());
        num2 = Double.parseDouble(fieldNum2.getText());
        
        if (radioSoma.isSelected()) {
            result = num1 + num2;
            fieldResult.setText("" + result);
        } else
            if (radioSub.isSelected()) {
                result = num1 - num2;
                fieldResult.setText("" + result);
            } else
                if (radioMult.isSelected()) {
                    result = num1 * num2;
                    fieldResult.setText("" + result);
                } else
                    if (radioDiv.isSelected()) {
                        result = num1 / num2;
                        fieldResult.setText("" + result);
                    } else
                        if (radioResto.isSelected()) {
                            result = num1 % num2;
                            fieldResult.setText("" + result);
                        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JTextField fieldNum1;
    private javax.swing.JTextField fieldNum2;
    private javax.swing.JTextField fieldResult;
    private javax.swing.JLabel labelNum1;
    private javax.swing.JLabel labelNum2;
    private javax.swing.JLabel labelResult;
    private javax.swing.JRadioButton radioDiv;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JRadioButton radioMult;
    private javax.swing.JRadioButton radioResto;
    private javax.swing.JRadioButton radioSoma;
    private javax.swing.JRadioButton radioSub;
    // End of variables declaration//GEN-END:variables
}
