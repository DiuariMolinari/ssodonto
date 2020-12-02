/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import businessLogicalLayer.ProdutoBLL;
import businessLogicalLayer.TipoEmbalagemBLL;
import domain.Produto;
import domain.TipoEmbalagem;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sabri
 */
public class FormCadastroProduto extends javax.swing.JFrame {

    private Produto lastProduto;
    private String lastNomeProduto;
    private TipoEmbalagem lastTipoEmbalagem;
    private Double lastPreco;
    private LocalDate lastDataCompra;
    
    private DefaultTableModel model;
    
    ProdutoBLL srvProduto = new ProdutoBLL();
    TipoEmbalagemBLL srvTipoEmbalagem = new TipoEmbalagemBLL();
    
            
    public FormCadastroProduto() {
        initComponents();
        model = new DefaultTableModel();
        grdProduto.setModel(model);
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
        txtProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEmbalagem = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ftxtDataCompra = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        ftxtPreco = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdProduto = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Produto");

        jLabel2.setText("Nome do Produto");

        jLabel5.setText("Embalagem");

        jLabel6.setText("Preço");

        jLabel9.setText("Data Compra");

        try {
            ftxtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        grdProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        grdProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdProduto);

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(ftxtDataCompra)))
                                    .addComponent(jLabel2)
                                    .addComponent(txtProduto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preencheCombo();
            preencheGrid();
        } catch (SQLException ex){
            Logger.getLogger(FormCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
    
    private void preencheGrid() throws SQLException{
       ArrayList<Produto> produtos = srvProduto.getAll();
       
       Object colunas[] = {"Id", "Produto", "Embalagem", "Valor", "Data"};
            model = new DefaultTableModel(colunas, 0);
            for (Produto produto: produtos) {
                model.addRow( new Object[] {
                    produto.getId(),
                    produto.getNome(),
                    produto.getTipoEmbalagem(),
                    produto.getPreco(),
                    produto.getDataCompra()
                });
            }
            grdProduto.setModel(model);
    }
    
    private void preencheCombo() throws SQLException{
        cmbEmbalagem.removeAllItems();
        
        ArrayList<TipoEmbalagem> embalagens = srvTipoEmbalagem.getAll();
        
        for (TipoEmbalagem tipoEmbalagem : embalagens) {
            cmbEmbalagem.addItem(tipoEmbalagem);
        }
        limpaCombo();
    }
    
    private void limpaCombo(){
        txtProduto.setText("");
        cmbEmbalagem.setSelectedItem(null);
        ftxtPreco.setText("");
        ftxtDataCompra.setText("");
    }
    
    private void grdProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdProdutoMouseClicked
        int row = grdProduto.getSelectedRow();
        TableModel model = grdProduto.getModel();
        
        int id =(int)model.getValueAt(row, 0);
        
        String nomeProduto = (String)model.getValueAt(row,1);
        txtProduto.setText(nomeProduto);
        
        TipoEmbalagem embalagem = (TipoEmbalagem)model.getValueAt(row, 2);
        cmbEmbalagem.getModel().setSelectedItem(embalagem);
        
        double preco = (double)model.getValueAt(row, 3);
        ftxtPreco.setText(String.valueOf(preco).replace('.', ','));
        
        LocalDate dataCompra = (LocalDate)model.getValueAt(row, 4);
        ftxtDataCompra.setText(dataCompra.toString());
        
        
        lastNomeProduto = nomeProduto;
        lastTipoEmbalagem = embalagem;
        lastPreco = preco;
        lastDataCompra = dataCompra;
        lastProduto = new Produto (id, nomeProduto, embalagem, preco, dataCompra);
    }//GEN-LAST:event_grdProdutoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            String precotxt = ftxtPreco.getText().trim().replace('.', Character.MIN_VALUE).replace(',', '.');
            if (txtProduto.getText().isEmpty() 
                    && cmbEmbalagem.getModel().getSelectedItem() == null 
                    && precotxt.isEmpty()) {
                return;
            }
            double preco = Double.valueOf(precotxt);
            lblMensagem.setText(srvProduto.insert(new Produto(0,txtProduto.getText(),(TipoEmbalagem)cmbEmbalagem.getSelectedItem(),preco,LocalDate.parse(ftxtDataCompra.getText()))));
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            limpaCombo();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            String precotxt = ftxtPreco.getText().trim().replace('.', Character.MIN_VALUE).replace(',', '.');
            if (cmbEmbalagem.getSelectedItem() != null 
                    && !txtProduto.getText().equals("")
                    && !ftxtDataCompra.getText().equals("") 
                    && !precotxt.equals("") 
                    && (lastTipoEmbalagem != cmbEmbalagem.getSelectedItem()
                    || !lastNomeProduto.equals(txtProduto.getText())
                    || !lastDataCompra.equals(ftxtDataCompra.getText())
                    || lastPreco != Double.valueOf(precotxt))                    
                    && lastProduto != null){
                double preco = Double.valueOf(precotxt);
                lblMensagem.setText(srvProduto.update(new Produto(lastProduto.getId(), txtProduto.getText(), (TipoEmbalagem)cmbEmbalagem.getSelectedItem(), preco, LocalDate.parse(ftxtDataCompra.getText()))));
                lblMensagem.setForeground(Color.blue);
                preencheGrid();
                limpaCombo();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lastProduto != null){
                lblMensagem.setText(srvProduto.delete(lastProduto));
                lblMensagem.setForeground(Color.red);
                preencheGrid();
                limpaCombo();                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<TipoEmbalagem> cmbEmbalagem;
    private javax.swing.JFormattedTextField ftxtDataCompra;
    private javax.swing.JFormattedTextField ftxtPreco;
    private javax.swing.JTable grdProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
