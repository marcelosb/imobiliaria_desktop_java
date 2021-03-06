package visual.tela_alugar_imovel;

/*import controle.AlugarImovelControl;*/
import visual.tela_vender_imovel.*;
import controle.Dados;
import controle.VenderImovelControl;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import util.TabelaAbstrataAlugarImoveis;
import visual.tela_principal.TelaPrincipalDoSistema;
import static visual.tela_principal.TelaPrincipalDoSistema.botaoBuscarAluguelDeImovel;
import static visual.tela_principal.TelaPrincipalDoSistema.facade;

/**
 * @author Marcelo Henrique
 */
public class PainelPesquisarAlugarImovel extends javax.swing.JPanel {

    public PainelPesquisarAlugarImovel() {
        initComponents();
        mostrarTabelaAlugarImovel();
    }

    public static void mostrarTabelaAlugarImovel() {
        facade.listarAlugarImoveis();
        
        tabelaAlugarImoveis.setModel(new TabelaAbstrataAlugarImoveis(Dados.listaAlugarImoveis));
        
        tabelaAlugarImoveis.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
      
            Component resultado = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            
            
                if (row % 2 == 0) {  
                    resultado.setBackground(new Color(255, 153, 153));
                    resultado.setForeground(Color.WHITE); 
                    setHorizontalAlignment(CENTER);
                } else {
                    resultado.setBackground(Color.WHITE);
                    resultado.setForeground(Color.BLACK);
                    setHorizontalAlignment(CENTER);
                }

                if (isSelected) {
                    setBackground(new Color(255, 255, 153));
                    setForeground(Color.BLACK); 
                }

                return resultado; 
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlugarImoveis = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        campoPesquisarAlugarImovel = new javax.swing.JTextField();
        campoPesquisaCliente2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoVoltarAlugarImovel = new javax.swing.JButton();

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(469, 419));

        tabelaAlugarImoveis.setAutoCreateRowSorter(true);
        tabelaAlugarImoveis.setBackground(new java.awt.Color(240, 240, 240));
        tabelaAlugarImoveis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaAlugarImoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaAlugarImoveis.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaAlugarImoveis.setFocusable(false);
        tabelaAlugarImoveis.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaAlugarImoveis.setPreferredSize(new java.awt.Dimension(1200, 480));
        tabelaAlugarImoveis.setRequestFocusEnabled(false);
        tabelaAlugarImoveis.setRowHeight(30);
        tabelaAlugarImoveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlugarImoveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlugarImoveisMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaAlugarImoveisMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlugarImoveis);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisarAlugarImovel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campoPesquisarAlugarImovel.setForeground(new java.awt.Color(51, 51, 51));
        campoPesquisarAlugarImovel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoPesquisarAlugarImovel.setBorder(null);
        campoPesquisarAlugarImovel.setOpaque(false);
        campoPesquisarAlugarImovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPesquisarAlugarImovelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPesquisarAlugarImovelFocusLost(evt);
            }
        });
        campoPesquisarAlugarImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisarAlugarImovelKeyReleased(evt);
            }
        });
        jPanel1.add(campoPesquisarAlugarImovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 430, 30));

        campoPesquisaCliente2.setEditable(false);
        campoPesquisaCliente2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPesquisaCliente2.setForeground(new java.awt.Color(153, 153, 153));
        campoPesquisaCliente2.setText("Digite o nome do corretor ou o nome do cliente");
        campoPesquisaCliente2.setBorder(null);
        jPanel1.add(campoPesquisaCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 430, 30));

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_principal_do_sistema/pesquisa_veiculos.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 53));

        botaoVoltarAlugarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_alugar_imovel/botao_voltar_alugar_imovel.png"))); // NOI18N
        botaoVoltarAlugarImovel.setAlignmentX(0.5F);
        botaoVoltarAlugarImovel.setContentAreaFilled(false);
        botaoVoltarAlugarImovel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltarAlugarImovel.setMaximumSize(new java.awt.Dimension(150, 40));
        botaoVoltarAlugarImovel.setMinimumSize(new java.awt.Dimension(150, 40));
        botaoVoltarAlugarImovel.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoVoltarAlugarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarAlugarImovelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVoltarAlugarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltarAlugarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAlugarImoveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlugarImoveisMouseClicked
        
    }//GEN-LAST:event_tabelaAlugarImoveisMouseClicked

    private void tabelaAlugarImoveisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlugarImoveisMouseReleased

        //popularPainelEditar(); 
        popularPainelEditarVenderImoveis();
    }//GEN-LAST:event_tabelaAlugarImoveisMouseReleased

    public void popularPainelEditarVenderImoveis() {
        
        if ((tabelaAlugarImoveis.getSelectedRow() != -1)){
            
           Dados.venderImovelEstaticoBean.setCodigo(Integer.parseInt(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 0))));

           //PainelEditarVenderImoveis.campoEditarDataDaVendaVenderImovel.setText(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 1)));
           //PainelEditarVenderImoveis.campoEditarCorretorVenderImovel.setText(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 2)));
           //PainelEditarVenderImoveis.campoEditarImovelVenderImovel.setText(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 3)));
           PainelEditarVenderImoveis.campoEditarImovelVenderImovel.setText(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 4)));
           PainelEditarVenderImoveis.campoEditarValorNegociadoDaVendaEditar.setText(String.valueOf(tabelaAlugarImoveis.getValueAt(tabelaAlugarImoveis.getSelectedRow(), 5)));
           
        }

    }
    
    private void personalizandoCampoUsuario(Color cor) {
        if (campoPesquisarAlugarImovel.getText().isEmpty()) {
            campoPesquisaCliente2.setVisible(true);
            campoPesquisaCliente2.setBackground(cor);
            campoPesquisarAlugarImovel.setOpaque(false);
        }
        if (!campoPesquisarAlugarImovel.getText().isEmpty()) {
            campoPesquisarAlugarImovel.setOpaque(true);
            campoPesquisarAlugarImovel.setBackground(cor);
            campoPesquisaCliente2.setVisible(false);
        }
    }
                     
    
    private void campoPesquisarAlugarImovelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisarAlugarImovelKeyReleased
        personalizandoCampoUsuario(new Color(204, 255, 204));
        facade.pesquisarAlugarImovel(campoPesquisarAlugarImovel.getText());
    }//GEN-LAST:event_campoPesquisarAlugarImovelKeyReleased

    private void campoPesquisarAlugarImovelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesquisarAlugarImovelFocusGained
        personalizandoCampoUsuario(new Color(255, 255, 153));
        
    }//GEN-LAST:event_campoPesquisarAlugarImovelFocusGained

    private void campoPesquisarAlugarImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesquisarAlugarImovelFocusLost
        personalizandoCampoUsuario(new Color(255, 255, 255));
        
    }//GEN-LAST:event_campoPesquisarAlugarImovelFocusLost

    private void botaoVoltarAlugarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarAlugarImovelActionPerformed
        botaoBuscarAluguelDeImovel.setEnabled(true);
        
        TelaPrincipalDoSistema.exibirPainelAlugarImovel();
        TelaPrincipalDoSistema.botaoEditarAlugarImovel.setVisible(false);
        TelaPrincipalDoSistema.botaoExcluirAlugarImovel.setVisible(false);
    }//GEN-LAST:event_botaoVoltarAlugarImovelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoVoltarAlugarImovel;
    public static javax.swing.JTextField campoPesquisaCliente2;
    public static javax.swing.JTextField campoPesquisarAlugarImovel;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelaAlugarImoveis;
    // End of variables declaration//GEN-END:variables
}
