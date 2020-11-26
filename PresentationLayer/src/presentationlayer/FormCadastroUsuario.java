/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import businessLogicalLayer.ColaboradorBLL;
import businessLogicalLayer.UsuarioBLL;
import domain.Colaborador;
import domain.Usuario;
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
public class FormCadastroUsuario extends javax.swing.JFrame {
    
    private Colaborador lastColaborador;
    private String lastUsuario;
    private String lastSenha;
    private String lastConfirmaSenha;
    private Usuario lasCadUsuario;    
    
    private DefaultTableModel model;
    
    UsuarioBLL srvUsuario = new UsuarioBLL();
    ColaboradorBLL  srvColaborador = new ColaboradorBLL();

    /**
     * Creates new form FormCadastroUsuario
     */
    public FormCadastroUsuario() {
        initComponents();
        model = new DefaultTableModel();
        grdUsuario.setModel(model);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbColaborador = new javax.swing.JComboBox<>();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdUsuario = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        ptxtSenha = new javax.swing.JPasswordField();
        ptxtConfirmaSenha = new javax.swing.JPasswordField();
        chkMostrarSenha = new javax.swing.JCheckBox();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel9.setText("Senha ");

        jLabel10.setText("Confirmar Senha ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setText("Colaborador");

        jLabel3.setText("Usuário");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        grdUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        grdUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdUsuario);

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

        chkMostrarSenha.setText("Mostrar Senha");
        chkMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarSenhaActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ptxtConfirmaSenha, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(chkMostrarSenha)
                            .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ptxtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMostrarSenha)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_formWindowOpened

    private void grdUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdUsuarioMouseClicked
        int row = grdUsuario.getSelectedRow();
        TableModel model = grdUsuario.getModel();
        
        int id = (int)model.getValueAt(row, 0);
        
        String usuario = (String)model.getValueAt(row, 1);
            txtUsuario.setText(usuario);
            
        String senha = (String)model.getValueAt(row, 2);
            ptxtSenha.setText(senha);
            ptxtConfirmaSenha.setText(senha);
          
        Colaborador colaborador = (Colaborador)model.getValueAt(row, 3);
        cmbColaborador.getModel().setSelectedItem(colaborador);   
        
        lastUsuario = usuario;
        lastSenha = senha;
        lastConfirmaSenha = senha;
        lastColaborador = colaborador;
        lasCadUsuario = new Usuario(id, usuario, senha, colaborador);
    }//GEN-LAST:event_grdUsuarioMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (cmbColaborador.getSelectedItem() == null  
                    || txtUsuario.getText().trim().length() == 0 
                    || ptxtSenha.getPassword().length == 0 
                    || ptxtConfirmaSenha.getPassword().length == 0 
                    || !ptxtSenha.getText().equals(ptxtConfirmaSenha.getText())){
                return;
            }
            String senha = new String(ptxtSenha.getPassword());
            lblMensagem.setText(srvUsuario.insert(new Usuario(0, txtUsuario.getText(), (String)senha, (Colaborador)cmbColaborador.getSelectedItem())));
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            deselecionaCombo(); 
            limpaCampos();
            preencheCombo();   
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (cmbColaborador.getSelectedItem() != null 
                    && !"".equals(txtUsuario.getText()) 
                    && ptxtSenha.getPassword().length != 0
                    && ptxtConfirmaSenha.getPassword().length != 0
                    && (lastColaborador != cmbColaborador.getSelectedItem()
                    || !lastUsuario.equals(txtUsuario.getText()) 
                    || !lastSenha.equals(ptxtSenha.getPassword())
                    || !lastConfirmaSenha.equals(ptxtConfirmaSenha.getPassword())
                    || ptxtSenha.getPassword().equals(ptxtConfirmaSenha.getPassword()))
                    && lasCadUsuario != null){ 
                String senha = new String(ptxtSenha.getPassword());
                lblMensagem.setText(srvUsuario.update(new Usuario(lasCadUsuario.getId(),txtUsuario.getText(), senha, (Colaborador)cmbColaborador.getSelectedItem())));
                lblMensagem.setForeground(Color.blue);
                preencheGrid();
                deselecionaCombo();
                preencheCombo();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lasCadUsuario != null){
                lblMensagem.setText(srvUsuario.delete(lasCadUsuario));
                lblMensagem.setForeground(Color.red);
                preencheGrid();
                deselecionaCombo(); 
                limpaCampos();
                preencheCombo();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void chkMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarSenhaActionPerformed
        if (chkMostrarSenha.isSelected()) {
            ptxtSenha.setEchoChar('\u0000');  
            ptxtConfirmaSenha.setEchoChar('\u0000');            
        }
        else {
            ptxtSenha.setEchoChar('*');
            ptxtConfirmaSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarSenhaActionPerformed

    private void preencheGrid() throws SQLException{
        ArrayList<Usuario> usuarios = srvUsuario.getAll();
         
        Object colunas[] = {"Id", "Usuário", "Senha", "Colaborador"};
            model = new DefaultTableModel(colunas, 0);
            for (Usuario usuario : usuarios) {
                model.addRow( new Object[]{
                    usuario.getId(),
                    usuario.getLogin(),
                    usuario.getSenha(),
                    usuario.getColaborador()
                });           
            }  
            grdUsuario.setModel(model);
    }
    
    private void preencheCombo() throws SQLException{
        limpaCampos();

        ArrayList<Colaborador> colabordores = srvColaborador.getAll();

        for (Colaborador colaborador : colabordores) {
            cmbColaborador.addItem(colaborador);            
        }             
        deselecionaCombo();
    }
    
     private void deselecionaCombo(){
        cmbColaborador.setSelectedItem(null);
    }
     
    private void limpaCampos(){
        cmbColaborador.removeAllItems();
        ptxtSenha.setText("");
        ptxtConfirmaSenha.setText("");
        txtUsuario.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkMostrarSenha;
    private javax.swing.JComboBox<Colaborador> cmbColaborador;
    private javax.swing.JTable grdUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JPasswordField ptxtConfirmaSenha;
    private javax.swing.JPasswordField ptxtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
