
public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valorA_textField = new javax.swing.JTextField();
        operacao_combobox = new javax.swing.JComboBox<>();
        valorB_textField = new javax.swing.JTextField();
        calcular_button = new javax.swing.JButton();
        resultado_textField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        valorA_textField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        operacao_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADIÇÃO", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO" }));

        valorB_textField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        calcular_button.setText("CALCULAR");
        calcular_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_buttonActionPerformed(evt);
            }
        });

        resultado_textField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorA_textField)
                    .addComponent(operacao_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcular_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado_textField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valorB_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valorA_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(operacao_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valorB_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcular_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcular_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_buttonActionPerformed
        String operacao = operacao_combobox.getSelectedItem().toString();
        double valorA = Double.parseDouble(valorA_textField.getText());
        double valorB = Double.parseDouble(valorB_textField.getText());
        resultado_textField.setText("0");
        
        switch (operacao) {
            case "ADIÇÃO":
                resultado_textField.setText(new Operacoes().adicao(valorA, valorB));
                break;
            
            case "SUBTRAÇÃO":
                resultado_textField.setText(new Operacoes().subtracao(valorA, valorB));
                break;
            
            case "MULTIPLICAÇÃO":
                resultado_textField.setText(new Operacoes().multiplicacao(valorA, valorB));
                break;
            
            case "DIVISÃO":
                resultado_textField.setText(new Operacoes().divisao(valorA, valorB));
                break;
            
        }
    }//GEN-LAST:event_calcular_buttonActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> operacao_combobox;
    private javax.swing.JTextField resultado_textField;
    private javax.swing.JTextField valorA_textField;
    private javax.swing.JTextField valorB_textField;
    // End of variables declaration//GEN-END:variables
}
