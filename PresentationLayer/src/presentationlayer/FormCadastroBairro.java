/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import businessLogicalLayer.BairroBLL;
import businessLogicalLayer.CidadeBLL;
import businessLogicalLayer.EstadoBLL;
import businessLogicalLayer.PaisBLL;
import domain.Bairro;
import domain.Cidade;
import domain.Estado;
import domain.Pais;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
public class FormCadastroBairro extends javax.swing.JFrame {

    PaisBLL srvPais = new PaisBLL();
    EstadoBLL srvEstado = new EstadoBLL();
    CidadeBLL srvCidade =  new CidadeBLL();
    BairroBLL srvBairro = new BairroBLL();
    
    private String lastNomeBairro;
    private Cidade lastCidade;
    private Bairro lastBairro;
    
    private DefaultTableModel model;
    
    
    /**
     * Creates new form FormCadastroBairro
     */
    public FormCadastroBairro() {
        initComponents();
        model = new DefaultTableModel();
        grdBairro.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdBairro = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(845, 514));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bairro");

        jLabel2.setText("Nome do Bairro");

        jLabel3.setText("Cidade");

        jLabel4.setText("País");

        jLabel5.setText("Estado");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        grdBairro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Bairro", "Cidade", "Estado", "País"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdBairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdBairroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdBairro);
        if (grdBairro.getColumnModel().getColumnCount() > 0) {
            grdBairro.getColumnModel().getColumn(0).setResizable(false);
            grdBairro.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

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
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            addAllListener();
            
            preencheGrid();
            preencheCombo();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void grdBairroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdBairroMouseClicked
        try {
            int row = grdBairro.getSelectedRow();
            TableModel model = grdBairro.getModel();

            int id = (int)model.getValueAt(row, 0);

            String nome = (String)model.getValueAt(row, 1);
            txtBairro.setText(nome);

            Pais pais = (Pais)model.getValueAt(row, 4);
            cmbPais.getModel().setSelectedItem(pais);
            preencheEstado();

            Estado estado = (Estado)model.getValueAt(row, 3);
            cmbEstado.getModel().setSelectedItem(estado);
            preencheCidade();

            Cidade cidade = (Cidade)model.getValueAt(row, 2);
            cmbCidade.getModel().setSelectedItem(cidade);
            
            lastNomeBairro = nome;
            lastCidade = cidade;
            lastBairro = new Bairro(id, nome, cidade);
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_grdBairroMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (cmbCidade.getSelectedItem() == null || txtBairro.getText().equals("")) {
                return;
            }
            lblMensagem.setText(srvBairro.insert(new Bairro(0, txtBairro.getText(),(Cidade)cmbCidade.getSelectedItem())));
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            deselecionaCombo(); 
            limpaCampos();
            
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (cmbCidade.getSelectedItem() != null 
                    && !"".equals(txtBairro.getText()) 
                    && (lastCidade != cmbCidade.getSelectedItem() 
                    || !lastNomeBairro.equals(txtBairro.getText())) 
                    && lastBairro != null){
                lblMensagem.setText(srvBairro.update(new Bairro(lastBairro.getId(), txtBairro.getText(), (Cidade)cmbCidade.getSelectedItem())));
                lblMensagem.setForeground(Color.blue);
                preencheGrid();
                deselecionaCombo();
                limpaCampos();
                preencheCombo();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lastBairro != null){
                lblMensagem.setText(srvBairro.delete(lastBairro));
                lblMensagem.setForeground(Color.red);
                preencheGrid();
                deselecionaCombo(); 
                limpaCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void preencheGrid() throws SQLException{
        ArrayList<Bairro> bairos = srvBairro.getAll();
         
        Object colunas[] = {"Id", "Bairro", "Cidade", "Estado", "Pais"};
            model = new DefaultTableModel(colunas, 0);
            for (Bairro bairro : bairos) {
                model.addRow( new Object[]{
                    bairro.getId(),
                    bairro.getNome(),
                    bairro.getCidade(),
                    bairro.getCidade().getEstado(),
                    bairro.getCidade().getEstado().getPais()
                });           
            }  
            grdBairro.setModel(model);
    }
    
    private void preencheCombo() throws SQLException{
        limpaCampos();
        ArrayList<Pais> paises = srvPais.getAll();
        for (Pais pais : paises) {
            cmbPais.addItem(pais);
        }
        deselecionaCombo();
    }
        
    private void deselecionaCombo(){
        cmbPais.setSelectedItem(null);
        cmbEstado.setSelectedItem(null);
        cmbCidade.setSelectedItem(null);
    }
    
    private void limpaCampos(){
        cmbEstado.removeAllItems();  
        cmbCidade.removeAllItems();   
        txtBairro.setText("");
    }    
      
    private void addAllListener(){
        addListenerPais();
        addListenerEstado();
    }
    
    private void preencheEstado() throws SQLException{
        cmbEstado.removeAllItems();
        ArrayList<Estado> estados = srvEstado.getByPais((Pais)cmbPais.getSelectedItem());
        for (Estado estado : estados) {
            cmbEstado.addItem(estado);
        }
    }
    
    private void addListenerPais(){
        cmbPais.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent eventoItem){
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheEstado();
                        cmbEstado.setSelectedItem(null);
                        addListenerEstado();
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    private void preencheCidade() throws SQLException{
        cmbCidade.removeAllItems();
        ArrayList<Cidade> cidades = srvCidade.getByEstado((Estado)cmbEstado.getSelectedItem());
        for (Cidade cidade : cidades) {
            cmbCidade.addItem(cidade);
        }
    }
    
    private void addListenerEstado(){
        cmbEstado.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent eventoItem){
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheCidade();
                        cmbCidade.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
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
            java.util.logging.Logger.getLogger(FormCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Cidade> cmbCidade;
    private javax.swing.JComboBox<Estado> cmbEstado;
    private javax.swing.JComboBox<Pais> cmbPais;
    private javax.swing.JTable grdBairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtBairro;
    // End of variables declaration//GEN-END:variables
}
