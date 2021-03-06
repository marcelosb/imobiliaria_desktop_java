/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.tela_cliente;

import visual.tela_corretor.*;
import visual.tela_principal.TelaPrincipalDoSistema;

/**
 *
 * @author Marcelo
 */
public class PainelDeDialogoExcluirCliente extends javax.swing.JDialog {

    /**
     * Creates new form PainelDeDialogoCorretor
     */
    public PainelDeDialogoExcluirCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        textoExcluirDialogoCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoOkClienteExcluir = new javax.swing.JButton();
        botaoCancelarExclusaoCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensagem de Alerta - Corretor");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textoExcluirDialogoCliente.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        textoExcluirDialogoCliente.setText("Tem certeza que deseja excluir rafael henrique da silva?");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_cliente/help.png"))); // NOI18N

        botaoOkClienteExcluir.setBackground(new java.awt.Color(255, 153, 51));
        botaoOkClienteExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoOkClienteExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoOkClienteExcluir.setText("OK");
        botaoOkClienteExcluir.setFocusable(false);
        botaoOkClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkClienteExcluirActionPerformed(evt);
            }
        });

        botaoCancelarExclusaoCliente.setBackground(new java.awt.Color(255, 153, 51));
        botaoCancelarExclusaoCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoCancelarExclusaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarExclusaoCliente.setText("Cancelar");
        botaoCancelarExclusaoCliente.setFocusable(false);
        botaoCancelarExclusaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarExclusaoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(botaoOkClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botaoCancelarExclusaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoExcluirDialogoCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(textoExcluirDialogoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOkClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelarExclusaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOkClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkClienteExcluirActionPerformed
        TelaPrincipalDoSistema.nomeDialogoExcluirCliente = "OK";
        PainelDeDialogoExcluirCliente.this.dispose();
    }//GEN-LAST:event_botaoOkClienteExcluirActionPerformed

    private void botaoCancelarExclusaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarExclusaoClienteActionPerformed
        TelaPrincipalDoSistema.nomeDialogoExcluirCliente = "";
        PainelDeDialogoExcluirCliente.this.dispose();
    }//GEN-LAST:event_botaoCancelarExclusaoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(PainelDeDialogoExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelDeDialogoExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelDeDialogoExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelDeDialogoExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PainelDeDialogoExcluirCliente dialog = new PainelDeDialogoExcluirCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoCancelarExclusaoCliente;
    public static javax.swing.JButton botaoOkClienteExcluir;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel textoExcluirDialogoCliente;
    // End of variables declaration//GEN-END:variables
}
