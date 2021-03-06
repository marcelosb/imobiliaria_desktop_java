package visual.tela_corretor;

import controle.CorretorControl;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelo.ClientePessoaFisicaBean;
import modelo.CorretorBean;
import util.TeclasPermitidasApenasLetrasMaiusculas;
import visual.tela_alugar_imovel.PainelAlugarImoveis;
import visual.tela_vender_imovel.PainelVenderImoveis;
import visual.tela_principal.TelaPrincipalDoSistema;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoCadastrarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoDeletarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoEditarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.facade;
import visual.tela_vender_imovel.PainelEditarVenderImoveis;
import static visual.tela_vender_imovel.PainelEditarVenderImoveis.campoEditarImovelVenderImovel;

/**
 * @author Marcelo Henrique
 */
public class PainelCadastrarCorretores extends javax.swing.JPanel {

    public PainelCadastrarCorretores() {
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
        jLabel2 = new javax.swing.JLabel();
        campoNomeCorretor = new javax.swing.JTextField();
        txtIdade = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoImobiliariaVinculada = new javax.swing.JTextField();
        botaoCancelarCadastroDeCorretor = new javax.swing.JButton();
        botaoSalvarCadastroDeCorretor = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 228, 228));
        setMaximumSize(new java.awt.Dimension(860, 520));
        setPreferredSize(new java.awt.Dimension(860, 520));

        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setMaximumSize(new java.awt.Dimension(860, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        campoNomeCorretor.setDocument(new TeclasPermitidasApenasLetrasMaiusculas());
        campoNomeCorretor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNomeCorretor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoNomeCorretor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeCorretorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeCorretorFocusLost(evt);
            }
        });
        campoNomeCorretor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeCorretorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNomeCorretorKeyReleased(evt);
            }
        });
        jPanel1.add(campoNomeCorretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 65, 590, 30));

        txtIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 80, 86, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Imobiliária Vinculada:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        campoImobiliariaVinculada.setEditable(false);
        campoImobiliariaVinculada.setBackground(new java.awt.Color(204, 204, 204));
        campoImobiliariaVinculada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoImobiliariaVinculada.setText("IMOBILIÁRIA UEPB");
        campoImobiliariaVinculada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoImobiliariaVinculadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoImobiliariaVinculadaFocusLost(evt);
            }
        });
        campoImobiliariaVinculada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoImobiliariaVinculadaMouseEntered(evt);
            }
        });
        campoImobiliariaVinculada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoImobiliariaVinculadaActionPerformed(evt);
            }
        });
        jPanel1.add(campoImobiliariaVinculada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 590, 30));

        botaoCancelarCadastroDeCorretor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCancelarCadastroDeCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_corretor/botao_cancelar_cadastro_corretor.png"))); // NOI18N
        botaoCancelarCadastroDeCorretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelarCadastroDeCorretor.setMaximumSize(new java.awt.Dimension(150, 50));
        botaoCancelarCadastroDeCorretor.setMinimumSize(new java.awt.Dimension(150, 50));
        botaoCancelarCadastroDeCorretor.setPreferredSize(new java.awt.Dimension(150, 50));
        botaoCancelarCadastroDeCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCadastroDeCorretorActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCancelarCadastroDeCorretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 150, 40));

        botaoSalvarCadastroDeCorretor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoSalvarCadastroDeCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_corretor/botao_salvar_corretor.png"))); // NOI18N
        botaoSalvarCadastroDeCorretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvarCadastroDeCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarCadastroDeCorretorActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSalvarCadastroDeCorretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void botaoCancelarCadastroDeCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCadastroDeCorretorActionPerformed
        
        botaoCadastrarCorretor.setEnabled(true);
        botaoEditarCorretor.setEnabled(true);
        botaoDeletarCorretor.setEnabled(true);
        
        TelaPrincipalDoSistema.exibirPainelPesquisarCorretor();
        limparCampos();
    }//GEN-LAST:event_botaoCancelarCadastroDeCorretorActionPerformed

  
    private boolean validarCamposCorretor(){
        if(campoNomeCorretor.getText().isEmpty()){
            return false;   
        }else{
            return true;   
        }
   
    }
    
    ClientePessoaFisicaBean clienteBean;
    CorretorBean corretorBean;
    

    private void botaoSalvarCadastroDeCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarCadastroDeCorretorActionPerformed

       if (validarCamposCorretor() == true) {

            corretorBean = new CorretorBean();

            corretorBean.setNome(campoNomeCorretor.getText().trim());
            corretorBean.setImobiliariaVinculada(campoImobiliariaVinculada.getText().trim());

            facade.cadastrarCorretor(corretorBean);

            PainelDeDialogoCadastrarCorretor painelDeDialogoCadastratCorretor = new PainelDeDialogoCadastrarCorretor(null, true);
            painelDeDialogoCadastratCorretor.setLocationRelativeTo(null);
            painelDeDialogoCadastratCorretor.setVisible(true);
            
            PainelVenderImoveis.campoSelecioneCorretorDaVenda.addItem(corretorBean.getNome());
            PainelEditarVenderImoveis.campoSelecioneCorretorDaVendaEditar.addItem(corretorBean.getNome()); 
            PainelAlugarImoveis.campoSelecioneCorretorDoAluguel.addItem(corretorBean.getNome());
            //campoSelecioneCorretorDaVenda.removeAllItems();
            //campoSelecioneCorretorDaVenda.addItem("Selecione um corretor");

            limparCampos();

                // atualiza a contagem de clientes cadastrados no sistema
                // Dados.listaDeClientesResumo.add(clienteBean);
                //PainelHome.atualizarResumoDoSistema();

            botaoCadastrarCorretor.setEnabled(true);
            botaoEditarCorretor.setEnabled(true);
            botaoDeletarCorretor.setEnabled(true);
                
            TelaPrincipalDoSistema.exibirPainelPesquisarCorretor();
            PainelPesquisarCorretores.mostrarTabelaDeCorretores();


        } else {
           
           PainelDeDialogoCorretor dialogo = new PainelDeDialogoCorretor(null, true);
           PainelDeDialogoCorretor.textoDialogo.setText("Campo(s) inválido(s)!");
           dialogo.setLocationRelativeTo(null);
           dialogo.setVisible(true);
        }


    }//GEN-LAST:event_botaoSalvarCadastroDeCorretorActionPerformed

   
    
    
    private boolean verificarCampos() {

        if (campoNomeCorretor.getText().isEmpty()) {
            JOptionPane.showInternalMessageDialog(this, "ERRO DIGITE UM NOME!");
            return false;
        }
        return true;

    }


    private void campoNomeCorretorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeCorretorKeyReleased

    }//GEN-LAST:event_campoNomeCorretorKeyReleased

    private void campoNomeCorretorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeCorretorKeyPressed

    }//GEN-LAST:event_campoNomeCorretorKeyPressed
   
    
    public String auxiliar = "";
    private void campoNomeCorretorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeCorretorFocusGained
        
        campoNomeCorretor.setBorder(new LineBorder(new Color(51,153,255),2,true));
    }//GEN-LAST:event_campoNomeCorretorFocusGained

    private void campoNomeCorretorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeCorretorFocusLost
        campoNomeCorretor.setBorder(new LineBorder(new Color(204,204,204),1,true));
        
    }//GEN-LAST:event_campoNomeCorretorFocusLost

    private void campoImobiliariaVinculadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaFocusGained
        campoImobiliariaVinculada.setBorder(new LineBorder(new Color(51,153,255),2,true));
      
    }//GEN-LAST:event_campoImobiliariaVinculadaFocusGained

    private void campoImobiliariaVinculadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaFocusLost
        campoImobiliariaVinculada.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoImobiliariaVinculadaFocusLost

    private void campoImobiliariaVinculadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoImobiliariaVinculadaActionPerformed

    private void campoImobiliariaVinculadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaMouseEntered
        URL url = getClass().getResource("/imagens/tela_vender_imovel/teste.png");
        Image customimage = new ImageIcon(url).getImage().getScaledInstance(50, 50, 50);      
        Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(customimage, new Point(0, 0), "customCursor");
        
        campoImobiliariaVinculada.setCursor(customCursor);
    }//GEN-LAST:event_campoImobiliariaVinculadaMouseEntered

    private void limparCampos() {
        campoNomeCorretor.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarCadastroDeCorretor;
    private javax.swing.JButton botaoSalvarCadastroDeCorretor;
    private javax.swing.JTextField campoImobiliariaVinculada;
    private javax.swing.JTextField campoNomeCorretor;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIdade;
    // End of variables declaration//GEN-END:variables
}
