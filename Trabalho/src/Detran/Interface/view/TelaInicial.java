/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Detran.Interface.View;

/**
 *
 * @author Felipe
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        opcaoPessoa = new javax.swing.JButton();
        opcaoCarro = new javax.swing.JButton();
        opcaoMoto = new javax.swing.JButton();
        opcaoCaminhao = new javax.swing.JButton();
        opcaoOnibus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        botaoSair = new javax.swing.JMenuItem();
        botaoNavegacao = new javax.swing.JMenu();
        botaoPessoa = new javax.swing.JMenuItem();
        botaoCarro = new javax.swing.JMenuItem();
        botaoMoto = new javax.swing.JMenuItem();
        botaoCaminhao = new javax.swing.JMenuItem();
        botaoOnibus = new javax.swing.JMenuItem();
        botaoSobre = new javax.swing.JMenu();
        botaoSobreMenu = new javax.swing.JMenuItem();

        jLabel6.setText("jLabel6");

        jButton2.setText("Cadastro");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detran");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        opcaoPessoa.setText("Pessoa");
        opcaoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoPessoaActionPerformed(evt);
            }
        });

        opcaoCarro.setText("Carro");
        opcaoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCarroActionPerformed(evt);
            }
        });

        opcaoMoto.setText("Moto");
        opcaoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoMotoActionPerformed(evt);
            }
        });

        opcaoCaminhao.setText("Caminhão");
        opcaoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCaminhaoActionPerformed(evt);
            }
        });

        opcaoOnibus.setText("Ônibus");
        opcaoOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoOnibusActionPerformed(evt);
            }
        });

        botaoArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        botaoArquivo.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/script.png"))); // NOI18N
        jMenuItem1.setText("Relatório quantidade Veículos");
        botaoArquivo.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/script.png"))); // NOI18N
        jMenuItem2.setText("Relatório total Veículos Cadastrados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        botaoArquivo.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/script.png"))); // NOI18N
        jMenuItem3.setText("Relatório Proprietários Motoristas");
        botaoArquivo.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/script.png"))); // NOI18N
        jMenuItem4.setText("Relatório Percentual de Motoristas ");
        botaoArquivo.add(jMenuItem4);

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        botaoArquivo.add(botaoSair);

        jMenuBar1.add(botaoArquivo);

        botaoNavegacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world.png"))); // NOI18N
        botaoNavegacao.setText("Navegação");
        botaoNavegacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNavegacaoActionPerformed(evt);
            }
        });

        botaoPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        botaoPessoa.setText("Pessoa");
        botaoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPessoaActionPerformed(evt);
            }
        });
        botaoNavegacao.add(botaoPessoa);

        botaoCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.png"))); // NOI18N
        botaoCarro.setText("Carro");
        botaoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarroActionPerformed(evt);
            }
        });
        botaoNavegacao.add(botaoCarro);

        botaoMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/moto.png"))); // NOI18N
        botaoMoto.setText("Moto");
        botaoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMotoActionPerformed(evt);
            }
        });
        botaoNavegacao.add(botaoMoto);

        botaoCaminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lorry.png"))); // NOI18N
        botaoCaminhao.setText("Caminhão");
        botaoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaminhaoActionPerformed(evt);
            }
        });
        botaoNavegacao.add(botaoCaminhao);

        botaoOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bus.png"))); // NOI18N
        botaoOnibus.setText("Ônibus");
        botaoOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOnibusActionPerformed(evt);
            }
        });
        botaoNavegacao.add(botaoOnibus);

        jMenuBar1.add(botaoNavegacao);

        botaoSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        botaoSobre.setText("Sobre");

        botaoSobreMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        botaoSobreMenu.setText("Sobre o Sistema");
        botaoSobreMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreMenuActionPerformed(evt);
            }
        });
        botaoSobre.add(botaoSobreMenu);

        jMenuBar1.add(botaoSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcaoOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcaoCaminhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcaoPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcaoCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcaoMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(opcaoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(opcaoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoNavegacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNavegacaoActionPerformed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_botaoNavegacaoActionPerformed

    private void botaoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPessoaActionPerformed
        TelaCadastroPessoa telaCadPessoa = new TelaCadastroPessoa();
        telaCadPessoa.setVisible(true);
        
    }//GEN-LAST:event_botaoPessoaActionPerformed

    private void botaoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarroActionPerformed
        TelaCadastroCarro telaCadCarro = new TelaCadastroCarro();
        telaCadCarro.setVisible(true);
    }//GEN-LAST:event_botaoCarroActionPerformed

    private void botaoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaminhaoActionPerformed
        TelaCadastroCaminhao telaCadCaminhao = new TelaCadastroCaminhao();
        telaCadCaminhao.setVisible(true);
    }//GEN-LAST:event_botaoCaminhaoActionPerformed

    private void botaoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMotoActionPerformed
        TelaCadastroMoto telaCadMoto = new TelaCadastroMoto();
        telaCadMoto.setVisible(true);
    }//GEN-LAST:event_botaoMotoActionPerformed

    private void botaoOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOnibusActionPerformed
        TelaCadastroOnibus telaCadOnibus = new TelaCadastroOnibus();
        telaCadOnibus.setVisible(true);
    }//GEN-LAST:event_botaoOnibusActionPerformed

    private void botaoSobreMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreMenuActionPerformed
        TelaSobre telaSobre = new TelaSobre();
        telaSobre.setVisible(true);
    }//GEN-LAST:event_botaoSobreMenuActionPerformed

    private void opcaoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoPessoaActionPerformed
        TelaCadastroPessoa telaCadPessoa = new TelaCadastroPessoa();
        telaCadPessoa.setVisible(true);
    }//GEN-LAST:event_opcaoPessoaActionPerformed

    private void opcaoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCarroActionPerformed
        TelaCadastroCarro telaCadCarro = new TelaCadastroCarro();
        telaCadCarro.setVisible(true);
    }//GEN-LAST:event_opcaoCarroActionPerformed

    private void opcaoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoMotoActionPerformed
        TelaCadastroMoto telaCadMoto = new TelaCadastroMoto();
        telaCadMoto.setVisible(true);
    }//GEN-LAST:event_opcaoMotoActionPerformed

    private void opcaoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCaminhaoActionPerformed
        TelaCadastroCaminhao telaCadCaminhao = new TelaCadastroCaminhao();
        telaCadCaminhao.setVisible(true);
    }//GEN-LAST:event_opcaoCaminhaoActionPerformed

    private void opcaoOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoOnibusActionPerformed
        TelaCadastroOnibus telaCadOnibus = new TelaCadastroOnibus();
        telaCadOnibus.setVisible(true);
    }//GEN-LAST:event_opcaoOnibusActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhaLingua().setVisible(true);
                //new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu botaoArquivo;
    private javax.swing.JMenuItem botaoCaminhao;
    private javax.swing.JMenuItem botaoCarro;
    private javax.swing.JMenuItem botaoMoto;
    private javax.swing.JMenu botaoNavegacao;
    private javax.swing.JMenuItem botaoOnibus;
    private javax.swing.JMenuItem botaoPessoa;
    private javax.swing.JMenuItem botaoSair;
    private javax.swing.JMenu botaoSobre;
    private javax.swing.JMenuItem botaoSobreMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JButton opcaoCaminhao;
    private javax.swing.JButton opcaoCarro;
    private javax.swing.JButton opcaoMoto;
    private javax.swing.JButton opcaoOnibus;
    private javax.swing.JButton opcaoPessoa;
    // End of variables declaration//GEN-END:variables
}