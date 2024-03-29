/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationlayer;

import businessLogicalLayer.BairroBLL;
import businessLogicalLayer.CidadeBLL;
import businessLogicalLayer.ClinicaBLL;
import businessLogicalLayer.EnderecoBLL;
import businessLogicalLayer.EstadoBLL;
import businessLogicalLayer.LogradouroBLL;
import businessLogicalLayer.PaisBLL;
import domain.Bairro;
import domain.Cidade;
import domain.Clinica;
import domain.Endereco;
import domain.Estado;
import domain.Logradouro;
import domain.Pais;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
public class FormCadastroClinica extends javax.swing.JFrame {

    private Clinica lastClinica;
    private String lastNome;
    private LocalDate lastDtInauguracao;
    private Endereco lastEndereco;

    private DefaultTableModel model;

    PaisBLL srvPais = new PaisBLL();
    EstadoBLL srvEstado = new EstadoBLL();
    CidadeBLL srvCidade = new CidadeBLL();
    BairroBLL srvBairro = new BairroBLL();
    EnderecoBLL srvEndereco = new EnderecoBLL();
    LogradouroBLL srvLogradouro = new LogradouroBLL();
    ClinicaBLL srvClinica = new ClinicaBLL();

    /**
     * Creates new form FormCadastroClinica
     */
    public FormCadastroClinica() {
        initComponents();
        model = new DefaultTableModel();
        grdClinica.setModel(model);
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
        txtClinica = new javax.swing.JTextField();
        ftxtDataInauguracao = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        cmbBairro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        cmbLogradouro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdClinica = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        cmbEndereco = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Clínica");

        jLabel2.setText("Nome da Clínica");

        try {
            ftxtDataInauguracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Data de Inauguração");

        jLabel11.setText("CEP");

        jLabel12.setText("Logradouro");

        jLabel17.setText("País");

        jLabel19.setText("Estado");

        jLabel7.setText("Bairro");

        jLabel8.setText("Cidade");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        grdClinica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome da Clínica", "Data Inauguração", "CEP", "Logradouro", "Bairro", "Cidade", "Estado", "País"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdClinicaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdClinica);
        if (grdClinica.getColumnModel().getColumnCount() > 0) {
            grdClinica.getColumnModel().getColumn(0).setResizable(false);
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEndereco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(198, 198, 198))
                                            .addComponent(cmbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(txtClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(ftxtDataInauguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)))
                .addContainerGap())
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtDataInauguracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (cmbBairro.getSelectedItem() == null || txtClinica.getText().equals("") || ftxtDataInauguracao.getText().equals("")) {
                return;
            }

            String retorno = srvClinica.insert(new Clinica(0, txtClinica.getText(), LocalDate.parse(ftxtDataInauguracao.getText()), (Endereco) cmbEndereco.getSelectedItem()));
            lblMensagem.setText(retorno);
            lblMensagem.setForeground(new Color(0, 102, 0));
            preencheGrid();
            deselecionaCombo();
            limpaCampos();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (cmbBairro.getSelectedItem() != null && !txtClinica.getText().equals("") && !ftxtDataInauguracao.getText().equals("") && (!lastEndereco.equals(cmbEndereco.getSelectedItem())
                    || !lastDtInauguracao.equals(ftxtDataInauguracao.getText()) || !lastClinica.equals(txtClinica.getText()) || !lastNome.equals(txtClinica.getText())) && lastClinica != null) {

                String retorno = srvClinica.update(new Clinica(lastClinica.getId(), txtClinica.getText(), LocalDate.parse(ftxtDataInauguracao.getText()), (Endereco) cmbEndereco.getSelectedItem()));
                lblMensagem.setText(retorno);
                lblMensagem.setForeground(Color.BLUE);
                preencheGrid();
                deselecionaCombo();
                limpaCampos();
                preenchePais();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (lastClinica != null) {
                lblMensagem.setText(srvClinica.delete(lastClinica));
                lblMensagem.setForeground(Color.RED);
                preencheGrid();
                deselecionaCombo();
                limpaCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void grdClinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdClinicaMouseClicked
        try {
            int row = grdClinica.getSelectedRow();
            TableModel model = grdClinica.getModel();

            int id = (int) model.getValueAt(row, 0);

            String nomeClinica = (String) model.getValueAt(row, 1);
            txtClinica.setText(nomeClinica);

            LocalDate inauguracao = (LocalDate) model.getValueAt(row, 2);
            ftxtDataInauguracao.setText(inauguracao.toString());
            
            Pais pais = (Pais) model.getValueAt(row, 8);
            cmbPais.getModel().setSelectedItem(pais);
            preencheEstado();

            Estado estado = (Estado) model.getValueAt(row, 7);
            cmbEstado.getModel().setSelectedItem(estado);
            preencheCidade();

            Cidade cidade = (Cidade) model.getValueAt(row, 6);
            cmbCidade.getModel().setSelectedItem(cidade);
            preencheBairro();

            Bairro bairro = (Bairro) model.getValueAt(row, 5);
            cmbBairro.getModel().setSelectedItem(bairro);

            Logradouro logradouro = (Logradouro) model.getValueAt(row, 4);
            cmbLogradouro.getModel().setSelectedItem(logradouro);

            Endereco endereco = (Endereco) model.getValueAt(row, 3);
            cmbEndereco.getModel().setSelectedItem(endereco);

            lastNome = nomeClinica;
            lastDtInauguracao = inauguracao;
            lastEndereco = endereco;
            lastClinica = new Clinica(id, nomeClinica, inauguracao, lastEndereco);
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_grdClinicaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            addAllListener();
            
            preencheGrid();
            preenchePais();
            deselecionaCombo();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void preencheGrid() throws SQLException {
        ArrayList<Clinica> clinicas = srvClinica.getAll();

        Object colunas[] = {"Id", "Nome", "Data Inauguração", "CEP", "Logradouro", "Bairro", "Cidade", "Estado", "País"};
        model = new DefaultTableModel(colunas, 0);
        for (Clinica clinica : clinicas) {
            model.addRow(new Object[]{
                clinica.getId(),
                clinica.getNome(),
                clinica.getDataInauguracao(),
                clinica.getEndereco(),
                clinica.getEndereco().getLogradouro(),
                clinica.getEndereco().getLogradouro().getBairro(),
                clinica.getEndereco().getLogradouro().getBairro().getCidade(),
                clinica.getEndereco().getLogradouro().getBairro().getCidade().getEstado(),
                clinica.getEndereco().getLogradouro().getBairro().getCidade().getEstado().getPais()
            });
        }
        grdClinica.setModel(model);
    }

    private void limpaCampos() {
        cmbEstado.removeAllItems();
        cmbCidade.removeAllItems();
        cmbBairro.removeAllItems();
        cmbLogradouro.removeAllItems();
        cmbEndereco.removeAllItems();

        txtClinica.setText("");
        ftxtDataInauguracao.setText("");
    }

    private void deselecionaCombo() {
        cmbPais.setSelectedItem(null);
        cmbEstado.setSelectedItem(null);
        cmbCidade.setSelectedItem(null);
        cmbBairro.setSelectedItem(null);
        cmbLogradouro.setSelectedItem(null);
        cmbEndereco.setSelectedItem(null);
    }

    private void addAllListener(){
        addListenerPais();
        addListenerEstado();
        addListenerCidade();
        addListenerBairro();
        addListenerLogradouro();
    }

    private void preenchePais() throws SQLException {
        cmbPais.removeAllItems();
        ArrayList<Pais> paises = srvPais.getAll();
        for (Pais pais : paises) {
            cmbPais.addItem(pais);
        }
    }

    private void preencheEstado() throws SQLException {
        cmbEstado.removeAllItems();
        ArrayList<Estado> estados = srvEstado.getByPais((Pais) cmbPais.getSelectedItem());
        for (Estado estado : estados) {
            cmbEstado.addItem(estado);
        }
    }

    private void addListenerPais() {
        cmbPais.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent eventoItem) {
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheEstado();
                        cmbEstado.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    private void preencheCidade() throws SQLException {
        cmbCidade.removeAllItems();
        ArrayList<Cidade> cidades = srvCidade.getByEstado((Estado) cmbEstado.getSelectedItem());
        for (Cidade cidade : cidades) {
            cmbCidade.addItem(cidade);
        }
    }

    private void addListenerEstado() {
        cmbEstado.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent eventoItem) {
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheCidade();
                        cmbCidade.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    private void preencheBairro() throws SQLException {
        cmbBairro.removeAllItems();
        ArrayList<Bairro> bairros = srvBairro.getByCidade((Cidade) cmbCidade.getSelectedItem());
        for (Bairro bairro : bairros) {
            cmbBairro.addItem(bairro);
        }
    }
    
    private void addListenerCidade() {
        cmbCidade.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent eventoItem) {
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheBairro();
                        cmbBairro.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    private void preencheLogradouro() throws SQLException {
        cmbLogradouro.removeAllItems();
        ArrayList<Logradouro> logradouros = srvLogradouro.getByBairro((Bairro) cmbBairro.getSelectedItem());
        for (Logradouro logradouro : logradouros) {
            cmbLogradouro.addItem(logradouro);
        }
    }
    
    private void addListenerBairro() {
        cmbBairro.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent eventoItem) {
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheLogradouro();
                        cmbLogradouro.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    private void preencheEndereco() throws SQLException {
        cmbEndereco.removeAllItems();
        ArrayList<Endereco> enderecos = srvEndereco.getByLogradouro((Logradouro) cmbLogradouro.getSelectedItem());
        for (Endereco endereco : enderecos) {
            cmbEndereco.addItem(endereco);
        }
    }
    
    private void addListenerLogradouro() {
        cmbLogradouro.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent eventoItem) {
                if (eventoItem.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        preencheEndereco();
                        cmbEndereco.setSelectedItem(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormCadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FormCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Bairro> cmbBairro;
    private javax.swing.JComboBox<Cidade> cmbCidade;
    private javax.swing.JComboBox<Endereco> cmbEndereco;
    private javax.swing.JComboBox<Estado> cmbEstado;
    private javax.swing.JComboBox<Logradouro> cmbLogradouro;
    private javax.swing.JComboBox<Pais> cmbPais;
    private javax.swing.JFormattedTextField ftxtDataInauguracao;
    private javax.swing.JTable grdClinica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtClinica;
    // End of variables declaration//GEN-END:variables
}
