package visual.tela_corretor;


import controle.CorretorControl;
import controle.Dados;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import modelo.CorretorBean;
import util.TeclasPermitidasApenasLetrasMaiusculas;
import visual.tela_vender_imovel.PainelVenderImoveis;
import visual.tela_principal.TelaPrincipalDoSistema;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoCadastrarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoDeletarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoEditarCorretor;
import static visual.tela_principal.TelaPrincipalDoSistema.facade;

/**
 * @author Marcelo Henrique
 */
public class PainelEditarCorretores extends javax.swing.JPanel {

    public PainelEditarCorretores() {
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
        campoNomeEditarCorretor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoImobiliariaVinculadaEditar = new javax.swing.JTextField();
        botaoCancelarAlteracaoDeCorretor = new javax.swing.JButton();
        botaoEditarCorretores = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 228, 228));
        setMaximumSize(new java.awt.Dimension(860, 520));
        setMinimumSize(new java.awt.Dimension(860, 520));
        setPreferredSize(new java.awt.Dimension(860, 520));

        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setMaximumSize(new java.awt.Dimension(860, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        campoNomeEditarCorretor.setDocument(new TeclasPermitidasApenasLetrasMaiusculas());
        campoNomeEditarCorretor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNomeEditarCorretor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoNomeEditarCorretor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeEditarCorretorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeEditarCorretorFocusLost(evt);
            }
        });
        jPanel1.add(campoNomeEditarCorretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 46, 580, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Imobiliária Vinculada:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        campoImobiliariaVinculadaEditar.setEditable(false);
        campoImobiliariaVinculadaEditar.setBackground(new java.awt.Color(204, 204, 204));
        campoImobiliariaVinculadaEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoImobiliariaVinculadaEditar.setText("IMOBILIÁRIA UEPB");
        campoImobiliariaVinculadaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoImobiliariaVinculadaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoImobiliariaVinculadaEditarFocusLost(evt);
            }
        });
        campoImobiliariaVinculadaEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoImobiliariaVinculadaEditarMouseEntered(evt);
            }
        });
        campoImobiliariaVinculadaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoImobiliariaVinculadaEditarActionPerformed(evt);
            }
        });
        jPanel1.add(campoImobiliariaVinculadaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 100, 580, 30));

        botaoCancelarAlteracaoDeCorretor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCancelarAlteracaoDeCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_corretor/botao_cancelar_editar_corretor.png"))); // NOI18N
        botaoCancelarAlteracaoDeCorretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelarAlteracaoDeCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarAlteracaoDeCorretorActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCancelarAlteracaoDeCorretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 150, 40));

        botaoEditarCorretores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEditarCorretores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_corretor/botao_edit_corretor.png"))); // NOI18N
        botaoEditarCorretores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditarCorretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarCorretoresActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEditarCorretores, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 150, 40));

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


    private void botaoCancelarAlteracaoDeCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarAlteracaoDeCorretorActionPerformed
        botaoCadastrarCorretor.setEnabled(true);
        botaoEditarCorretor.setEnabled(true);
        botaoDeletarCorretor.setEnabled(true);
        
        TelaPrincipalDoSistema.exibirPainelPesquisarCorretor();  
    }//GEN-LAST:event_botaoCancelarAlteracaoDeCorretorActionPerformed

    
    private boolean validarCamposEditarCorretor(){
        if(campoNomeEditarCorretor.getText().isEmpty()){
            return false;   
        }else{
            return true;   
        }

    }
    

    private void botaoEditarCorretoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarCorretoresActionPerformed

        if (validarCamposEditarCorretor() == true) {
        
            CorretorBean corretorBean = new CorretorBean();


            corretorBean.setRegistro(Dados.corretorEstaticoBean.getRegistro());
            corretorBean.setNome(campoNomeEditarCorretor.getText().trim());
            corretorBean.setImobiliariaVinculada(campoImobiliariaVinculadaEditar.getText().trim());

            facade.alterarCorretor(corretorBean, corretorBean.getRegistro());

            PainelDeDialogoCadastrarCorretor painelDeDialogoEditarCorretor = new PainelDeDialogoCadastrarCorretor(null, true);
            PainelDeDialogoCadastrarCorretor.textoCadastroDialogoCorretor.setText("Cadastro alterado!");
            painelDeDialogoEditarCorretor.setLocationRelativeTo(null);
            painelDeDialogoEditarCorretor.setVisible(true);
          
            PainelVenderImoveis.campoSelecioneCorretorDaVenda.removeAllItems();
            PainelVenderImoveis.campoSelecioneCorretorDaVenda.addItem("Selecione um Corretor");
            PainelVenderImoveis.selecionarCorretores();

            botaoCadastrarCorretor.setEnabled(true);
            botaoEditarCorretor.setEnabled(true);
            botaoDeletarCorretor.setEnabled(true);
            
            TelaPrincipalDoSistema.exibirPainelPesquisarCorretor();
            PainelPesquisarCorretores.mostrarTabelaDeCorretores();
        }else{
            PainelDeDialogoCorretor editarDialogoCorretor = new PainelDeDialogoCorretor(null, true);
            PainelDeDialogoCorretor.textoDialogo.setText("Campo(s) inválido(s)!");
            editarDialogoCorretor.setLocationRelativeTo(null);
            editarDialogoCorretor.setVisible(true);
            
            
        }
    }//GEN-LAST:event_botaoEditarCorretoresActionPerformed

    private void campoNomeEditarCorretorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeEditarCorretorFocusGained
        campoNomeEditarCorretor.setBorder(new LineBorder(new Color(51,153,255),2,true));
    }//GEN-LAST:event_campoNomeEditarCorretorFocusGained

    private void campoNomeEditarCorretorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeEditarCorretorFocusLost
        campoNomeEditarCorretor.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoNomeEditarCorretorFocusLost

    private void campoImobiliariaVinculadaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaEditarFocusGained
        campoImobiliariaVinculadaEditar.setBorder(new LineBorder(new Color(51,153,255),2,true));
    }//GEN-LAST:event_campoImobiliariaVinculadaEditarFocusGained

    private void campoImobiliariaVinculadaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaEditarFocusLost
        campoImobiliariaVinculadaEditar.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoImobiliariaVinculadaEditarFocusLost

    private void campoImobiliariaVinculadaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoImobiliariaVinculadaEditarActionPerformed

    private void campoImobiliariaVinculadaEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoImobiliariaVinculadaEditarMouseEntered
        URL url = getClass().getResource("/imagens/tela_vender_imovel/teste.png");
        Image customimage = new ImageIcon(url).getImage().getScaledInstance(50, 50, 50);      
        Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(customimage, new Point(0, 0), "customCursor");
        
        campoImobiliariaVinculadaEditar.setCursor(customCursor);
    }//GEN-LAST:event_campoImobiliariaVinculadaEditarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoCancelarAlteracaoDeCorretor;
    public static javax.swing.JButton botaoEditarCorretores;
    public static javax.swing.JTextField campoImobiliariaVinculadaEditar;
    public static javax.swing.JTextField campoNomeEditarCorretor;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
