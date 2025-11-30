/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.vinhoDAO;
import dto.vinhoDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WhiskyComEnergetico
 */


public class GerenciamentoDeVinhos extends javax.swing.JFrame {
    
   private static final java.util.logging.Logger logger = 

java.util.logging.Logger.getLogger(GerenciamentoDeVinhos.class.getName());
    
    public GerenciamentoDeVinhos() {
        initComponents();
        
        // Centraliza a janela na tela
        setLocationRelativeTo(null); 
        
        // Chama nosso método para carregar os dados na tabela
        carregarTabela(); 
        
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProcurar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVinhos = new javax.swing.JTable();
        cbxTinto = new javax.swing.JCheckBox();
        cbxEspumante = new javax.swing.JCheckBox();
        cbxBranco = new javax.swing.JCheckBox();
        cbxRose = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lbPesquisar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        lbPesquisar1 = new javax.swing.JLabel();
        lbPesquisar2 = new javax.swing.JLabel();
        cbxFiltroAno = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbVinhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Ano", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbVinhos);

        cbxTinto.setText("Tinto");
        cbxTinto.addActionListener(this::cbxTintoActionPerformed);

        cbxEspumante.setText("Espumante");
        cbxEspumante.addActionListener(this::cbxEspumanteActionPerformed);

        cbxBranco.setText("Branco");
        cbxBranco.addActionListener(this::cbxBrancoActionPerformed);

        cbxRose.setText("Rosé");
        cbxRose.addActionListener(this::cbxRoseActionPerformed);

        btnCadastrar.setText("Cadastrar Vinho");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        lbPesquisar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbPesquisar.setText("Pesquisar nome");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnProcurar.setText("🔍︎ ");
        btnProcurar.addActionListener(this::btnProcurarActionPerformed);

        lbPesquisar1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbPesquisar1.setText("Tipo");

        lbPesquisar2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbPesquisar2.setText("Ano");

        cbxFiltroAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", " " }));
        cbxFiltroAno.addActionListener(this::cbxFiltroAnoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxBranco)
                                    .addComponent(cbxTinto)
                                    .addComponent(lbPesquisar1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxRose)
                                    .addComponent(cbxEspumante)))
                            .addComponent(lbPesquisar)
                            .addComponent(lbPesquisar2)
                            .addComponent(cbxFiltroAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnCadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(75, 75, 75)
                .addComponent(btnExcluir)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addGap(23, 23, 23)
                .addComponent(lbPesquisar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFiltroAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPesquisar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTinto)
                    .addComponent(cbxRose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBranco)
                    .addComponent(cbxEspumante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    private void carregarTabela() {
        // Pega o modelo padrão da tabela (que permite adicionar/remover linhas)
        DefaultTableModel modeloTabela = (DefaultTableModel) tbVinhos.getModel();
        
        // Limpa a tabela para evitar duplicatas ao recarregar
        modeloTabela.setRowCount(0);

        // Cria uma instância do DAO para acessar o banco de dados
        vinhoDAO dao = new vinhoDAO();
        
        // Chama o método do DAO que retorna a lista de vinhos
        List<vinhoDTO> lista = dao.listarVinhos();

        // Itera sobre a lista de vinhos e adiciona cada um como uma nova linha na tabela
        for (vinhoDTO v : lista) {
            modeloTabela.addRow(new Object[]{
                v.getId(),
                v.getNome(),
                v.getAno(),
                v.getTipo()
            });
        }
    }
     

    
    private void cbxTintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTintoActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_cbxTintoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
           vinhoView telaCadastro = new vinhoView();
        
        // Torna a tela de cadastro visível
        telaCadastro.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluirRegistroSelecionado();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
       // 1. Verifica se tem linha selecionada
    int selectedRow = tbVinhos.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione uma linha na tabela para salvar as alterações.");
        return;
    }

    // 2. IMPORTANTE: Se a célula ainda estiver em modo de edição (cursor piscando),
    // isso força a parada da edição e confirma o valor digitado.
    if (tbVinhos.isEditing()) {
        tbVinhos.getCellEditor().stopCellEditing();
    }

    try {
        // 3. Captura os dados ATUAIS que estão na tabela (já com a edição do usuário)
        // Lembre-se da ordem das colunas no seu carregarTabela: 
        // Coluna 0: ID, Coluna 1: Nome, Coluna 2: Ano, Coluna 3: Tipo
        
        Object idObj = tbVinhos.getValueAt(selectedRow, 0);
        Object nomeObj = tbVinhos.getValueAt(selectedRow, 1);
        Object anoObj = tbVinhos.getValueAt(selectedRow, 2);
        Object tipoObj = tbVinhos.getValueAt(selectedRow, 3);

        // 4. Cria o objeto DTO e preenche
        vinhoDTO objAlterado = new vinhoDTO();
        
        objAlterado.setId(Integer.parseInt(idObj.toString()));
        objAlterado.setNome(nomeObj.toString());
        objAlterado.setAno(anoObj.toString());
        objAlterado.setTipo(tipoObj.toString());

        // 5. Chama o DAO para atualizar no Banco
        vinhoDAO dao = new vinhoDAO();
        dao.atualizarVinho(objAlterado);

        JOptionPane.showMessageDialog(this, "Alteração salva com sucesso!");
        
        // 6. Recarrega a tabela para garantir que os dados estão sincronizados
        carregarTabela();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro: O campo 'Ano' deve ser numérico.", "Erro de Formatação", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar edição: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbxRoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRoseActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_cbxRoseActionPerformed

    private void cbxBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBrancoActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_cbxBrancoActionPerformed

    private void cbxEspumanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEspumanteActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_cbxEspumanteActionPerformed

    private void cbxFiltroAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroAnoActionPerformed
        // TODO add your handling code here:
        pesquisarVinhos();
    }//GEN-LAST:event_cbxFiltroAnoActionPerformed

    private void pesquisarVinhos() {
    try {
        // 1. Pega o termo digitado (em minúsculas para não diferenciar maiúsculas)
        String termoPesquisa = txtProcurar.getText().toLowerCase();
        String anoSelecionadoStr = cbxFiltroAno.getSelectedItem().toString();
        
        // 2. Busca TODOS os vinhos do banco
        vinhoDAO dao = new vinhoDAO();
        List<vinhoDTO> listaCompleta = dao.listarVinhos(); // Certifique-se que esse método traz tudo
        
        // 3. Limpa a tabela visual
        DefaultTableModel modelo = (DefaultTableModel) tbVinhos.getModel();
        modelo.setRowCount(0);
        
        // 4. Lógica de Filtragem Inteligente   
        for (vinhoDTO vinho : listaCompleta) {
            
            // --- Filtro 1: Nome ---
            // Verifica se o nome do vinho contem o que foi digitado
            boolean nomeCorresponde = vinho.getNome().toLowerCase().contains(termoPesquisa);
            
            // --- Filtro 2: Tipo (Checkboxes) ---
            boolean tipoCorresponde = false;
            
            // Verifica se NENHUMA caixa está marcada. Se nenhuma estiver, mostramos TODOS os tipos.
            boolean nenhumaCaixaMarcada = !cbxTinto.isSelected() && !cbxBranco.isSelected() && 
                                          !cbxRose.isSelected() && !cbxEspumante.isSelected();
            
            if (nenhumaCaixaMarcada) {
                tipoCorresponde = true;
            } else {
                // Se alguma estiver marcada, verificamos se o tipo do vinho bate com a seleção
                // Usamos 'contains' ou 'equalsIgnoreCase' para evitar erros de acento (Rosé/Rose)
                if (cbxTinto.isSelected() && vinho.getTipo().equalsIgnoreCase("Tinto")) tipoCorresponde = true;
                if (cbxBranco.isSelected() && vinho.getTipo().equalsIgnoreCase("Branco")) tipoCorresponde = true;
                // Verificação dupla para Rosé com ou sem acento
                if (cbxRose.isSelected() && (vinho.getTipo().equalsIgnoreCase("Rosé") || vinho.getTipo().equalsIgnoreCase("Rose"))) tipoCorresponde = true;
                if (cbxEspumante.isSelected() && vinho.getTipo().equalsIgnoreCase("Espumante")) tipoCorresponde = true;
            }
            
            boolean anoCorresponde = false;
            
            if (anoSelecionadoStr.equalsIgnoreCase("Todos")) {
                // Se estiver selecionado "Todos", aceita qualquer ano
                anoCorresponde = true;
            } else {
                if (vinho.getAno() != null && vinho.getAno().equals(anoSelecionadoStr)) {
                    anoCorresponde = true;
                }
            }
            
            // 5. Adiciona na tabela SÓ se passar nos dois testes (Nome E Tipo)
            if (nomeCorresponde && tipoCorresponde && anoCorresponde) {
                modelo.addRow(new Object[]{
                    vinho.getId(),      // ID (Oculto ou visível)
                    vinho.getNome(),
                    vinho.getAno(),
                    vinho.getTipo()
                });
            }
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao pesquisar: " + e.getMessage());
    }
}
    // READ + filtros
 public void filtrar() {
        try {
             vinhoDAO dao = new vinhoDAO();
            List<vinhoDTO> lista = dao.listarVinhos(txtProcurar.getText());
            DefaultTableModel model = (DefaultTableModel) tbVinhos.getModel();
            model.setRowCount(0);
            for (vinhoDTO item : lista) {
                boolean exibir = false;
                if (cbxTinto.isSelected() && item.getTipo().equalsIgnoreCase("Tinto")) {
                    exibir = true;
                }
                if (cbxBranco.isSelected() && item.getTipo().equalsIgnoreCase("Branco")) {
                    exibir
                            = true;
                }
                if (cbxEspumante.isSelected() && item.getTipo().equalsIgnoreCase("Espumante")) {
                    exibir = true;
                }
                  if (cbxRose.isSelected() && item.getTipo().equalsIgnoreCase("Rose")) {
                    exibir = true;
                }
                if (!cbxBranco.isSelected() && !cbxEspumante.isSelected() && !cbxRose.isSelected() && !cbxTinto.isSelected()) {
                    exibir = true;
                }
                if (exibir) {
                    model.addRow(new Object[]{
                        item.getId(),
                        item.getNome(),
                        item.getAno(),
                        item.getTipo(),
         
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao filtrar: " + e.getMessage());
        }
    }
 // DELETE - excluir com tecla Delete
    private void excluirRegistroSelecionado() {
        int selectedRow = tbVinhos.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(tbVinhos.getValueAt(selectedRow, 0).toString());
            String titulo = tbVinhos.getValueAt(selectedRow, 1).toString();
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o exemplar " + titulo + "?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                vinhoDAO dao = new vinhoDAO();
                dao.excluirVinho(id);
                JOptionPane.showMessageDialog(this, "Exemplar " + titulo + " excluído com sucesso!");
                carregarTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
 
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GerenciamentoDeVinhos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JCheckBox cbxBranco;
    private javax.swing.JCheckBox cbxEspumante;
    private javax.swing.JComboBox<String> cbxFiltroAno;
    private javax.swing.JCheckBox cbxRose;
    private javax.swing.JCheckBox cbxTinto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbPesquisar1;
    private javax.swing.JLabel lbPesquisar2;
    private javax.swing.JTable tbVinhos;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}
