/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;


import businessLogicalLayer.TipoPagamentoBLL;
import domain.TipoPagamento;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sabri
 */
public class FormCadastroTipoPagamento extends javax.swing.JFrame {

    private TipoPagamento lastTipoPagamento;
    private String lastNomeTipoPagamento;
    
    TipoPagamentoBLL srvPagamento = new TipoPagamentoBLL();
    
    private DefaultTableModel model;
    
    
    /**
     * Creates new form FormCadastroTipoPagamento
     */
    public FormCadastroTipoPagamento() {
        initComponents();
        model = new DefaultTableModel();
        grdTipoPagamento.setModel(model);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipoPagamento = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdTipoPagamento = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tipo Pagamento");

        jLabel2.setText("Tipo de Pagamento");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        grdTipoPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        grdTipoPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdTipoPagamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdTipoPagamento);

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar))
                            .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preencheGrid(); 
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void grdTipoPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdTipoPagamentoMouseClicked
        int row = grdTipoPagamento.getSelectedRow();
        TableModel model = grdTipoPagamento.getModel();
        
        int id = (int)model.getValueAt(row, 0);
        
        String tipoPagamento = (String)model.getValueAt(row, 1);
        txtTipoPagamento.setText(tipoPagamento);
            
        lastNomeTipoPagamento = tipoPagamento;
        lastTipoPagamento = new TipoPagamento(id, tipoPagamento);
    }//GEN-LAST:event_grdTipoPagamentoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            String descricao = txtTipoPagamento.getText().trim();
            if (descricao.length() == 0 ){
                return;
            }
            lblMensagem.setText(srvPagamento.insert(new TipoPagamento(0, txtTipoPagamento.getText())));
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            limpaCampos();  
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (!"".equals(txtTipoPagamento.getText()) 
                    || !lastNomeTipoPagamento.equals(txtTipoPagamento.getText())
                    && lastTipoPagamento != null){ 
                lblMensagem.setText(srvPagamento.update(new TipoPagamento(lastTipoPagamento.getId(),txtTipoPagamento.getText())));
                lblMensagem.setForeground(Color.blue);
                preencheGrid();
                limpaCampos();
            }
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lastTipoPagamento != null){
                lblMensagem.setText(srvPagamento.delete(lastTipoPagamento));
                lblMensagem.setForeground(Color.red);
                preencheGrid();
                limpaCampos();
            }
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void preencheGrid() throws SQLException, Exception{
        ArrayList<TipoPagamento> tipoPagamentos = srvPagamento.getAll();
         
        Object colunas[] = {"Id", "Tipo Pagamento"};
            model = new DefaultTableModel(colunas, 0);
            for (TipoPagamento tipoPagamento : tipoPagamentos) {
                model.addRow( new Object[]{
                    tipoPagamento.getId(),
                    tipoPagamento.getTipoPagamento()
                });           
            }  
            grdTipoPagamento.setModel(model);
    }    
    
    private void limpaCampos(){
        txtTipoPagamento.setText("");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroTipoPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTable grdTipoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtTipoPagamento;
    // End of variables declaration//GEN-END:variables
}
