/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import businessLogicalLayer.ColaboradorBLL;
import businessLogicalLayer.ContatoBLL;
import businessLogicalLayer.FoneTipoBLL;
import businessLogicalLayer.PacienteBLL;
import domain.Colaborador;
import domain.Contato;
import domain.FoneTipo;
import domain.Paciente;
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
public class FormCadastroContato extends javax.swing.JFrame {

    private int _tipo;
    private int _id;

    private FoneTipo lastFoneTipo;
    private String lastEmail;
    private String lastContato;
    private Contato lastCadContato;

    ContatoBLL srvContato = new ContatoBLL();
    FoneTipoBLL srvFoneTipo = new FoneTipoBLL();
    ColaboradorBLL srvColaborador = new ColaboradorBLL();
    PacienteBLL srvPaciente = new PacienteBLL();

    private DefaultTableModel model;

    /**
     * Creates new form FormCadastroContato
     */
    public FormCadastroContato() {
        initComponents();
    }

    public FormCadastroContato(int tipo, int id) {
        _tipo = tipo;
        _id = id;
        initComponents();
        model = new DefaultTableModel();
        grdContato.setModel(model);
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
        txtContato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbFoneTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdContato = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
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
        jLabel1.setText("Contato");

        jLabel2.setText("Contato");

        jLabel3.setText("Email");

        jLabel5.setText("Tipo Contato");

        grdContato.setModel(new javax.swing.table.DefaultTableModel(
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
        grdContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdContatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdContato);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

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
                    .addComponent(txtEmail)
                    .addComponent(txtContato)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar))
                            .addComponent(cmbFoneTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFoneTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroContato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void grdContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdContatoMouseClicked
        int row = grdContato.getSelectedRow();
        TableModel model = grdContato.getModel();

        int id = (int) model.getValueAt(row, 0);

        String contato = (String) model.getValueAt(row, 1);
        txtContato.setText(contato);

        FoneTipo tipoFone = (FoneTipo) model.getValueAt(row, 2);
        cmbFoneTipo.getModel().setSelectedItem(tipoFone);

        String email = (String) model.getValueAt(row, 3);
        txtEmail.setText(email);

        lastContato = contato;
        lastEmail = email;
        lastFoneTipo = tipoFone;
        lastCadContato = new Contato(id);
        lastCadContato.setFone(contato);
        lastCadContato.setEmail(email);
        lastCadContato.setFoneTipo(tipoFone);
    }//GEN-LAST:event_grdContatoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (txtContato.getText().trim().length() == 0 
                    || txtEmail.getText().trim().length() == 0 
                    || cmbFoneTipo.getSelectedItem() == null){
                return;
            }
            Contato contato;
            if (_tipo == 0) {
                    contato = new Contato(0, txtContato.getText(),(FoneTipo)cmbFoneTipo.getSelectedItem(), txtEmail.getText(), new Colaborador(_id));
                }
                else{
                    contato = new Contato(0, txtContato.getText(),(FoneTipo)cmbFoneTipo.getSelectedItem(), txtEmail.getText(), new Paciente(_id));
                }
            String result = srvContato.insert(contato);
            lblMensagem.setText(result);
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            limpaCampos();  
            preencheCombo();
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {            
            if (cmbFoneTipo.getSelectedItem() != null 
                    && !"".equals(txtContato.getText()) 
                    && !"".equals(txtEmail.getText())
                    && (lastFoneTipo != cmbFoneTipo.getSelectedItem()
                    || !lastContato.equals(txtContato.getText()) 
                    || !lastEmail.equals(txtEmail.getText()))
                    && lastCadContato != null){ 
                Contato contato;
                if (_tipo == 0) {
                    contato = new Contato(lastCadContato.getId(), txtContato.getText(),(FoneTipo)cmbFoneTipo.getSelectedItem(), txtEmail.getText(), new Colaborador(_id));
                }
                else{
                    contato = new Contato(lastCadContato.getId(), txtContato.getText(),(FoneTipo)cmbFoneTipo.getSelectedItem(), txtEmail.getText(), new Paciente(_id));
                }
                String result = srvContato.update(contato);
                lblMensagem.setText(result);
                lblMensagem.setForeground(Color.blue);
                preencheGrid();
                preencheCombo();
                deselecionaCombo();                
            }
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lastCadContato != null){
                lblMensagem.setText(srvContato.delete(lastCadContato));
                lblMensagem.setForeground(Color.red);
                preencheGrid();
                deselecionaCombo(); 
                limpaCampos();
                preencheCombo();
            }
        } catch (Exception ex) {
            Logger.getLogger(FormCadastroContato.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void preencheGrid() throws SQLException, Exception {
        //caso seja colaborador, tipo = 0
        if (_tipo == 0) {
            lblNome.setText("- " + srvColaborador.getById(new Colaborador(_id)).getNome());
            
            ArrayList<Contato> contatos = srvContato.getByColaborador(new Colaborador(_id));

            Object colunas[] = {"Id", "Contato", "Tipo", "Email"};
            model = new DefaultTableModel(colunas, 0);
            for (Contato contato : contatos) {
                model.addRow(new Object[]{
                    contato.getId(),
                    contato.getFone(),
                    contato.getFoneTipo(),
                    contato.getEmail()
                });
            }
            grdContato.setModel(model);
        } // se não é paciente
        else {
            lblNome.setText("- " + srvPaciente.getById(new Paciente(_id)).getNome());
            
            ArrayList<Contato> contatos = srvContato.getByPaciente(new Paciente(_id));

            Object colunas[] = {"Id", "Contato", "Tipo", "Email"};
            model = new DefaultTableModel(colunas, 0);
            for (Contato contato : contatos) {
                model.addRow(new Object[]{
                    contato.getId(),
                    contato.getFone(),
                    contato.getFoneTipo(),
                    contato.getEmail()
                });
            }
            grdContato.setModel(model);
        }
    }

    private void preencheCombo() throws SQLException, Exception {
        limpaCampos();

        ArrayList<FoneTipo> tipoFones = srvFoneTipo.getAll();

        for (FoneTipo tipoFone : tipoFones) {
            cmbFoneTipo.addItem(tipoFone);
        }
        deselecionaCombo();
    }

    private void deselecionaCombo() {
        cmbFoneTipo.setSelectedItem(null);
    }

    private void limpaCampos() {
        cmbFoneTipo.removeAllItems();
        txtContato.setText("");
        txtEmail.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<FoneTipo> cmbFoneTipo;
    private javax.swing.JTable grdContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
