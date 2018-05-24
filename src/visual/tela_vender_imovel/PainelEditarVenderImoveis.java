package visual.tela_vender_imovel;

/*import controle.ClienteControl;*/
import controle.CorretorControl;
import controle.Dados;
/*import controle.ImovelControl;*/
import controle.VenderImovelControl;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import modelo.ClientePessoaResumoBean;
import modelo.CorretorBean;
import modelo.ImovelBean;
import modelo.VenderImovelBean;
import util.TeclasPermitidasParaData;
import visual.tela_principal.TelaPrincipalDoSistema;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoBuscarVendaDeImovel;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoEditarVenderImovel;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoExcluirVenderImovel;
import static visual.tela_principal.TelaPrincipalDoSistema.facade;
import static visual.tela_vender_imovel.PainelPesquisarVenderImovel.valorNegociadoAuxiliarEdit;
import static visual.tela_vender_imovel.PainelVenderImoveis.valorNegociadoAuxiliar;

/**
 * @author Marcelo Henrique
 */
public class PainelEditarVenderImoveis extends javax.swing.JPanel {

    Calendar c = Calendar.getInstance();

    public PainelEditarVenderImoveis() {
        initComponents();
        selecionarCorretoresEditar();
        selecionarClientesEditar();
    }

    public static void selecionarCorretoresEditar() {
        facade.listarCorretoresPeloNome();
        for (CorretorBean corretorBean : Dados.listaDeCorretoresVenderImovel) {
            campoSelecioneCorretorDaVendaEditar.addItem(corretorBean.getNome()); 
        }           
    }
    
    public static void selecionarClientesEditar() {
        facade.ordenarClientesPeloNome();
        for (ClientePessoaResumoBean clientePessoaResumoBean : Dados.listaDeClientesResumo) {
            campoSelecioneClienteDaCompraEditar.addItem(clientePessoaResumoBean.getCliente());          
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

        botaoGrupoContrato = new javax.swing.ButtonGroup();
        botaoGrupoPeriodo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoEditVenderImovel = new javax.swing.JButton();
        botaoCancelarEditarVenderImovel = new javax.swing.JButton();
        campoEditarValorNegociadoDaVendaEditar = new javax.swing.JTextField();
        txtDataEntega = new javax.swing.JLabel();
        campoEditarImovelVenderImovel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDiaDataDaVendaEditar = new javax.swing.JTextField();
        txtDataEntega1 = new javax.swing.JLabel();
        campoMesDataDaVendaEditar = new javax.swing.JTextField();
        txtDataEntega2 = new javax.swing.JLabel();
        campoAnoDataDaVendaEditar = new javax.swing.JTextField();
        campoSelecioneCorretorDaVendaEditar = new javax.swing.JComboBox<>();
        campoSelecioneClienteDaCompraEditar = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setMaximumSize(new java.awt.Dimension(860, 520));
        setMinimumSize(new java.awt.Dimension(860, 520));
        setPreferredSize(new java.awt.Dimension(860, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Corretor:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Imovel:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Valor Negociado:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 30));

        botaoEditVenderImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_vender_imovel/botao_edit_vender_imovel.png"))); // NOI18N
        botaoEditVenderImovel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditVenderImovel.setMaximumSize(new java.awt.Dimension(150, 40));
        botaoEditVenderImovel.setMinimumSize(new java.awt.Dimension(150, 40));
        botaoEditVenderImovel.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoEditVenderImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditVenderImovelActionPerformed(evt);
            }
        });
        add(botaoEditVenderImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 150, 40));

        botaoCancelarEditarVenderImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_vender_imovel/botao_cancelar_editar_vender_imovel.png"))); // NOI18N
        botaoCancelarEditarVenderImovel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelarEditarVenderImovel.setMaximumSize(new java.awt.Dimension(150, 40));
        botaoCancelarEditarVenderImovel.setMinimumSize(new java.awt.Dimension(150, 40));
        botaoCancelarEditarVenderImovel.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoCancelarEditarVenderImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarEditarVenderImovelActionPerformed(evt);
            }
        });
        add(botaoCancelarEditarVenderImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 40));

        campoEditarValorNegociadoDaVendaEditar.setEditable(false);
        campoEditarValorNegociadoDaVendaEditar.setBackground(new java.awt.Color(204, 255, 204));
        campoEditarValorNegociadoDaVendaEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        campoEditarValorNegociadoDaVendaEditar.setForeground(new java.awt.Color(0, 102, 51));
        campoEditarValorNegociadoDaVendaEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoEditarValorNegociadoDaVendaEditar.setText("R$ 0,00");
        campoEditarValorNegociadoDaVendaEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoEditarValorNegociadoDaVendaEditar.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        campoEditarValorNegociadoDaVendaEditar.setMinimumSize(new java.awt.Dimension(2, 30));
        campoEditarValorNegociadoDaVendaEditar.setPreferredSize(new java.awt.Dimension(41, 30));
        campoEditarValorNegociadoDaVendaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEditarValorNegociadoDaVendaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEditarValorNegociadoDaVendaEditarFocusLost(evt);
            }
        });
        campoEditarValorNegociadoDaVendaEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoEditarValorNegociadoDaVendaEditarMouseEntered(evt);
            }
        });
        campoEditarValorNegociadoDaVendaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEditarValorNegociadoDaVendaEditarActionPerformed(evt);
            }
        });
        add(campoEditarValorNegociadoDaVendaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, 30));

        txtDataEntega.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        txtDataEntega.setText("Data da Venda:");
        add(txtDataEntega, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        campoEditarImovelVenderImovel.setEditable(false);
        campoEditarImovelVenderImovel.setBackground(new java.awt.Color(204, 204, 204));
        campoEditarImovelVenderImovel.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        campoEditarImovelVenderImovel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoEditarImovelVenderImovel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoEditarImovelVenderImovel.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        campoEditarImovelVenderImovel.setMinimumSize(new java.awt.Dimension(2, 30));
        campoEditarImovelVenderImovel.setPreferredSize(new java.awt.Dimension(2, 30));
        campoEditarImovelVenderImovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEditarImovelVenderImovelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEditarImovelVenderImovelFocusLost(evt);
            }
        });
        campoEditarImovelVenderImovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoEditarImovelVenderImovelMouseEntered(evt);
            }
        });
        campoEditarImovelVenderImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEditarImovelVenderImovelActionPerformed(evt);
            }
        });
        campoEditarImovelVenderImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoEditarImovelVenderImovelKeyReleased(evt);
            }
        });
        add(campoEditarImovelVenderImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 660, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Cliente:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 30));

        campoDiaDataDaVendaEditar.setDocument(new TeclasPermitidasParaData());
        campoDiaDataDaVendaEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDiaDataDaVendaEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDiaDataDaVendaEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoDiaDataDaVendaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDiaDataDaVendaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDiaDataDaVendaEditarFocusLost(evt);
            }
        });
        campoDiaDataDaVendaEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDiaDataDaVendaEditarKeyReleased(evt);
            }
        });
        add(campoDiaDataDaVendaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 40, 30));

        txtDataEntega1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDataEntega1.setForeground(new java.awt.Color(204, 204, 204));
        txtDataEntega1.setText("/");
        add(txtDataEntega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 30));

        campoMesDataDaVendaEditar.setDocument(new TeclasPermitidasParaData());
        campoMesDataDaVendaEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMesDataDaVendaEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMesDataDaVendaEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoMesDataDaVendaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMesDataDaVendaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoMesDataDaVendaEditarFocusLost(evt);
            }
        });
        campoMesDataDaVendaEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoMesDataDaVendaEditarKeyReleased(evt);
            }
        });
        add(campoMesDataDaVendaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 40, 30));

        txtDataEntega2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDataEntega2.setForeground(new java.awt.Color(204, 204, 204));
        txtDataEntega2.setText("/");
        add(txtDataEntega2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 30));

        campoAnoDataDaVendaEditar.setDocument(new TeclasPermitidasParaData());
        campoAnoDataDaVendaEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAnoDataDaVendaEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoAnoDataDaVendaEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoAnoDataDaVendaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoAnoDataDaVendaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoAnoDataDaVendaEditarFocusLost(evt);
            }
        });
        campoAnoDataDaVendaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoDataDaVendaEditarActionPerformed(evt);
            }
        });
        campoAnoDataDaVendaEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoAnoDataDaVendaEditarKeyReleased(evt);
            }
        });
        add(campoAnoDataDaVendaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 70, 30));

        campoSelecioneCorretorDaVendaEditar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        campoSelecioneCorretorDaVendaEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um corretor" }));
        campoSelecioneCorretorDaVendaEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoSelecioneCorretorDaVendaEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSelecioneCorretorDaVendaEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSelecioneCorretorDaVendaEditarFocusLost(evt);
            }
        });
        campoSelecioneCorretorDaVendaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSelecioneCorretorDaVendaEditarActionPerformed(evt);
            }
        });
        add(campoSelecioneCorretorDaVendaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 660, 30));

        campoSelecioneClienteDaCompraEditar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        campoSelecioneClienteDaCompraEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cliente" }));
        campoSelecioneClienteDaCompraEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        campoSelecioneClienteDaCompraEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSelecioneClienteDaCompraEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSelecioneClienteDaCompraEditarFocusLost(evt);
            }
        });
        campoSelecioneClienteDaCompraEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSelecioneClienteDaCompraEditarActionPerformed(evt);
            }
        });
        add(campoSelecioneClienteDaCompraEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 660, 30));
    }// </editor-fold>//GEN-END:initComponents

  
    public static boolean jaInvocouListaDeImoveis = false;
    private void selecionarImovel() {
        if (jaInvocouListaDeImoveis == false) {
            facade.listarCodigoDosImoveisVender();
            for (ImovelBean imovelBean : Dados.listaDeImoveisVenderImovel) {
               //campoSelecioneImovelDaVenda.addItem("IMOVEL: |" + imovelBean.getCodigo()+ "|    TIPO: " + imovelBean.getTipo());          
            }
            jaInvocouListaDeImoveis = true;
        }    
    }
    
    public static boolean jaInvocouListaDeClientes = false;
    private void selecionarCliente() {
        if (jaInvocouListaDeClientes == false) {
            facade.ordenarClientesPeloNome();
            for (ClientePessoaResumoBean clientePessoaResumoBean : Dados.listaDeClientesResumo) {
               //campoSelecioneClienteDaCompra.addItem("CLIENTE: |" + clientePessoaResumoBean.getCliente()+ "|    TIPO: |" + clientePessoaResumoBean.getTipo()+"| :");          
            }
            jaInvocouListaDeClientes = true;
        }
    }
    
    private void campoEditarValorNegociadoDaVendaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEditarValorNegociadoDaVendaEditarFocusGained
   
                
       
    }//GEN-LAST:event_campoEditarValorNegociadoDaVendaEditarFocusGained

    private void campoEditarValorNegociadoDaVendaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEditarValorNegociadoDaVendaEditarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEditarValorNegociadoDaVendaEditarFocusLost

   

    VenderImovelBean venderImovelBean;
    private void botaoEditVenderImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditVenderImovelActionPerformed

        venderImovelBean = new VenderImovelBean();
        venderImovelBean.setCodigo(Dados.venderImovelEstaticoBean.getCodigo());
        venderImovelBean.setDataDaVenda(campoEditarImovelVenderImovel.getText());
        venderImovelBean.setCorretor(campoSelecioneCorretorDaVendaEditar.getSelectedItem().toString());
        venderImovelBean.setImovel(campoEditarImovelVenderImovel.getText().trim());
        venderImovelBean.setCliente(campoEditarImovelVenderImovel.getText());
        venderImovelBean.setValorNegociado(campoEditarValorNegociadoDaVendaEditar.getText().trim());
        
        facade.alterarVendaDeImovel(venderImovelBean, venderImovelBean.getCodigo());
        
        PainelDeDialogoCadastrarVenderImovel dialogoEditarVenderImovel = new PainelDeDialogoCadastrarVenderImovel(null, true);
        PainelDeDialogoCadastrarVenderImovel.textoCadastroDialogoVenderImovel.setText("Cadastro alterado!");
        dialogoEditarVenderImovel.setLocationRelativeTo(null);
        dialogoEditarVenderImovel.setVisible(true);
        
        TelaPrincipalDoSistema.exibirPainelPesquisarVenderImovel();
        PainelPesquisarVenderImovel.mostrarTabelaVenderImovel();
       
    }//GEN-LAST:event_botaoEditVenderImovelActionPerformed

    Double numero;

    Calendar calendarioPadrao = Calendar.getInstance();
    private void botaoCancelarEditarVenderImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarEditarVenderImovelActionPerformed
        botaoBuscarVendaDeImovel.setEnabled(false);
        botaoEditarVenderImovel.setEnabled(true);
        botaoExcluirVenderImovel.setEnabled(true);
        
        TelaPrincipalDoSistema.exibirPainelPesquisarVenderImovel();
    }//GEN-LAST:event_botaoCancelarEditarVenderImovelActionPerformed

    String pegandoOCodigo = "Selecione |1| imovel disponivel para venda";
    private void campoEditarImovelVenderImovelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEditarImovelVenderImovelKeyReleased

    }//GEN-LAST:event_campoEditarImovelVenderImovelKeyReleased

    private void campoEditarImovelVenderImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEditarImovelVenderImovelFocusLost
        
    }//GEN-LAST:event_campoEditarImovelVenderImovelFocusLost

    private void campoEditarImovelVenderImovelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEditarImovelVenderImovelFocusGained
        
    }//GEN-LAST:event_campoEditarImovelVenderImovelFocusGained

   
    String pegaTipoDeCliente;
    
    int contadorJuridico = 1;
    int contadorFisico = 2;
    Double valorFinalSemDesconto;
    private void campoDiaDataDaVendaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDiaDataDaVendaEditarFocusGained
        campoDiaDataDaVendaEditar.setBorder(new LineBorder(new Color(0,204,204),2,true));
    }//GEN-LAST:event_campoDiaDataDaVendaEditarFocusGained

    private void campoDiaDataDaVendaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDiaDataDaVendaEditarFocusLost
        campoDiaDataDaVendaEditar.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoDiaDataDaVendaEditarFocusLost

    private void campoDiaDataDaVendaEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDiaDataDaVendaEditarKeyReleased
        if(campoDiaDataDaVendaEditar.getText().length() == 2){
            campoMesDataDaVendaEditar.requestFocus();
        }
    }//GEN-LAST:event_campoDiaDataDaVendaEditarKeyReleased

    private void campoMesDataDaVendaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMesDataDaVendaEditarFocusGained
        campoMesDataDaVendaEditar.setBorder(new LineBorder(new Color(0,204,204),2,true));
    }//GEN-LAST:event_campoMesDataDaVendaEditarFocusGained

    private void campoMesDataDaVendaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMesDataDaVendaEditarFocusLost
        campoMesDataDaVendaEditar.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoMesDataDaVendaEditarFocusLost

    private void campoMesDataDaVendaEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMesDataDaVendaEditarKeyReleased
        if(campoMesDataDaVendaEditar.getText().length() == 2){
            campoAnoDataDaVendaEditar.requestFocus();
        }
    }//GEN-LAST:event_campoMesDataDaVendaEditarKeyReleased

    private void campoAnoDataDaVendaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoAnoDataDaVendaEditarFocusGained
        campoAnoDataDaVendaEditar.setBorder(new LineBorder(new Color(0,204,204),2,true));
    }//GEN-LAST:event_campoAnoDataDaVendaEditarFocusGained

    private void campoAnoDataDaVendaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoAnoDataDaVendaEditarFocusLost
        campoAnoDataDaVendaEditar.setBorder(new LineBorder(new Color(204,204,204),1,true));
    }//GEN-LAST:event_campoAnoDataDaVendaEditarFocusLost

    private void campoAnoDataDaVendaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoDataDaVendaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoDataDaVendaEditarActionPerformed

    private void campoAnoDataDaVendaEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAnoDataDaVendaEditarKeyReleased
        if(campoAnoDataDaVendaEditar.getText().length() == 4){
            campoSelecioneCorretorDaVendaEditar.requestFocus();
        }
    }//GEN-LAST:event_campoAnoDataDaVendaEditarKeyReleased

    private void campoSelecioneCorretorDaVendaEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSelecioneCorretorDaVendaEditarFocusGained
        campoSelecioneCorretorDaVendaEditar.setBackground(new Color(0,204,204));
        //campoSelecioneCorretorDaVendaEditar.setForeground(Color.WHITE);

    }//GEN-LAST:event_campoSelecioneCorretorDaVendaEditarFocusGained

    private void campoSelecioneCorretorDaVendaEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSelecioneCorretorDaVendaEditarFocusLost
        campoSelecioneCorretorDaVendaEditar.setBackground(Color.WHITE);
        campoSelecioneCorretorDaVendaEditar.setForeground(Color.BLACK);

        campoSelecioneCorretorDaVendaEditar.setBorder(new LineBorder(new Color(0,204,204)));

    }//GEN-LAST:event_campoSelecioneCorretorDaVendaEditarFocusLost

    private void campoSelecioneCorretorDaVendaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSelecioneCorretorDaVendaEditarActionPerformed

        //Dados.CorretorEstatico = campoSelecioneCorretorDaVenda.getSelectedItem().toString().trim();
    }//GEN-LAST:event_campoSelecioneCorretorDaVendaEditarActionPerformed

    private void campoEditarValorNegociadoDaVendaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEditarValorNegociadoDaVendaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEditarValorNegociadoDaVendaEditarActionPerformed

    private void campoEditarImovelVenderImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEditarImovelVenderImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEditarImovelVenderImovelActionPerformed

    private void campoEditarValorNegociadoDaVendaEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEditarValorNegociadoDaVendaEditarMouseEntered

        URL url = getClass().getResource("/imagens/tela_vender_imovel/teste.png");
        Image customimage = new ImageIcon(url).getImage().getScaledInstance(50, 50, 50);      
        Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(customimage, new Point(0, 0), "customCursor");
        
        campoEditarValorNegociadoDaVendaEditar.setCursor(customCursor);
    }//GEN-LAST:event_campoEditarValorNegociadoDaVendaEditarMouseEntered

    private void campoEditarImovelVenderImovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEditarImovelVenderImovelMouseEntered
        URL url = getClass().getResource("/imagens/tela_vender_imovel/teste.png");
        Image customimage = new ImageIcon(url).getImage().getScaledInstance(50, 50, 50);      
        Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(customimage, new Point(0, 0), "customCursor");
        
        campoEditarImovelVenderImovel.setCursor(customCursor);
    }//GEN-LAST:event_campoEditarImovelVenderImovelMouseEntered

    private void campoSelecioneClienteDaCompraEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSelecioneClienteDaCompraEditarFocusGained
        campoSelecioneClienteDaCompraEditar.setBackground(new Color(0,204,204));
        //campoSelecioneClienteDaCompra.setForeground(Color.WHITE);
    }//GEN-LAST:event_campoSelecioneClienteDaCompraEditarFocusGained

    private void campoSelecioneClienteDaCompraEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSelecioneClienteDaCompraEditarFocusLost
        campoSelecioneClienteDaCompraEditar.setBackground(Color.WHITE);
        campoSelecioneClienteDaCompraEditar.setForeground(Color.BLACK);

        campoSelecioneClienteDaCompraEditar.setBorder(new LineBorder(new Color(0,204,204)));
    }//GEN-LAST:event_campoSelecioneClienteDaCompraEditarFocusLost

    
    public static Double valorAuxiliarFinalEditar = 0.0;
    
    private void campoSelecioneClienteDaCompraEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSelecioneClienteDaCompraEditarActionPerformed
  
        
        
        if (campoSelecioneClienteDaCompraEditar.getSelectedIndex() != 0) {

            facade.ordenarClientesPeloNome();

            for(ClientePessoaResumoBean clientePessoaResumoBean: Dados.listaDeClientesResumo){
                if( (clientePessoaResumoBean.getCliente().equals(campoSelecioneClienteDaCompraEditar.getSelectedItem().toString().trim())) &&  (clientePessoaResumoBean.getTipo().equals("Pessoa Física")) ){
                    valorAuxiliarFinalEditar = valorNegociadoAuxiliarEdit;
                    campoEditarValorNegociadoDaVendaEditar.setText(DecimalFormat.getCurrencyInstance().format(valorAuxiliarFinalEditar));
                }else if((clientePessoaResumoBean.getCliente().equals(campoSelecioneClienteDaCompraEditar.getSelectedItem().toString().trim())) &&  (clientePessoaResumoBean.getTipo().equals("Pessoa Jurídica"))){
                    Double valor = valorNegociadoAuxiliarEdit;
                    Double valorFinalComDesconto = valor * 0.835;
                    valorAuxiliarFinalEditar = valorFinalComDesconto;
                    campoEditarValorNegociadoDaVendaEditar.setText(DecimalFormat.getCurrencyInstance().format(valorFinalComDesconto));
                }

            }

        }

    }//GEN-LAST:event_campoSelecioneClienteDaCompraEditarActionPerformed

    
    /**
    public static Double valorNegociadoAuxiliarEditar = 0.0;
    private String converteValorBRemEUAEditar(String valorEmBR){
        // esta assim R$ 80.000,90
        
        String removeRS = valorEmBR.replace("R$", "").trim();
        // fica assim 80.000,90
        
        String subistituiVirgulaPorPonto = removeRS.replace(',', 'a').trim();
        // fica assim 80.000a90
        
        String removePonto = subistituiVirgulaPorPonto.replace(".", "").trim();
         // fica assim 80000a90
          
        String fiaal = removePonto.replace('a', '.');
        // fica assim 80000.90
        
        String finall = fiaal;
        
        return finall;
    }
    */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoCancelarEditarVenderImovel;
    public static javax.swing.JButton botaoEditVenderImovel;
    public static javax.swing.ButtonGroup botaoGrupoContrato;
    public static javax.swing.ButtonGroup botaoGrupoPeriodo;
    public static javax.swing.JTextField campoAnoDataDaVendaEditar;
    public static javax.swing.JTextField campoDiaDataDaVendaEditar;
    public static javax.swing.JTextField campoEditarImovelVenderImovel;
    public static javax.swing.JTextField campoEditarValorNegociadoDaVendaEditar;
    public static javax.swing.JTextField campoMesDataDaVendaEditar;
    public static javax.swing.JComboBox<String> campoSelecioneClienteDaCompraEditar;
    public static javax.swing.JComboBox<String> campoSelecioneCorretorDaVendaEditar;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JLabel txtDataEntega;
    public static javax.swing.JLabel txtDataEntega1;
    public static javax.swing.JLabel txtDataEntega2;
    // End of variables declaration//GEN-END:variables

    private void limparCamposVenderImovel() {
        campoEditarImovelVenderImovel.setText(null);
        //campoSelecioneCorretorDaVenda.setSelectedIndex(0);
        //campoSelecioneImovelDaVenda.setSelectedIndex(0);
        //campoSelecioneClienteDaCompra.setSelectedIndex(0);
        campoEditarValorNegociadoDaVendaEditar.setText("0.00");  
        campoEditarImovelVenderImovel.requestFocus();
    }


}