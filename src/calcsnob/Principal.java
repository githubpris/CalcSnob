package calcsnob;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {
    
    Nobre n = Nobre.getInstance();

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setLayout(new BorderLayout());
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/king.png")).getImage());
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Erro no LookAndFell: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProximoNobre = new javax.swing.JLabel();
        lblTotalArmazenamento = new javax.swing.JLabel();
        txtTotalArmazenamento = new javax.swing.JTextField();
        txtProximoNobre = new javax.swing.JTextField();
        lblTextQuantidadeNobres = new javax.swing.JLabel();
        lblQuantidadeNobres = new javax.swing.JLabel();
        lblTextRecursosRestantes = new javax.swing.JLabel();
        lblRecursosRestantes = new javax.swing.JLabel();
        lblTextNecessarioProximoNobre = new javax.swing.JLabel();
        lblNecessarioProximoNobre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mSobre = new javax.swing.JMenu();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalcSnob");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calcular_16.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar_16.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProximoNobre.setText("Custo do próximo nobre:");
        lblProximoNobre.setToolTipText("");

        lblTotalArmazenamento.setText("Recursos armazenados:");

        txtTotalArmazenamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalArmazenamentoKeyTyped(evt);
            }
        });

        txtProximoNobre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProximoNobreKeyTyped(evt);
            }
        });

        lblTextQuantidadeNobres.setText("Quantidade de Nobres:");

        lblQuantidadeNobres.setText("123");
        lblQuantidadeNobres.setToolTipText("");
        lblQuantidadeNobres.setVisible(false);

        lblTextRecursosRestantes.setText("Recursos restantes armazenados:");

        lblRecursosRestantes.setText("456");
        lblRecursosRestantes.setVisible(false);

        lblTextNecessarioProximoNobre.setText("Necessário para o nobre n°:");

        lblNecessarioProximoNobre.setText("789");
        lblNecessarioProximoNobre.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblProximoNobre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTotalArmazenamento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTextQuantidadeNobres))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTextRecursosRestantes)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQuantidadeNobres)
                                    .addComponent(lblRecursosRestantes)
                                    .addComponent(lblNecessarioProximoNobre))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalArmazenamento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProximoNobre)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTextNecessarioProximoNobre)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProximoNobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProximoNobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalArmazenamento))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeNobres)
                    .addComponent(lblTextQuantidadeNobres))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextRecursosRestantes)
                    .addComponent(lblRecursosRestantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextNecessarioProximoNobre)
                    .addComponent(lblNecessarioProximoNobre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblProximoNobre.getAccessibleContext().setAccessibleName("");
        lblTotalArmazenamento.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/king.png"))); // NOI18N

        mSobre.setText("Sobre");
        mSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(mSobre);

        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCalcular))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       try {
            n.setProximoNobre(Integer.parseInt(txtProximoNobre.getText().trim().replaceAll(" ", ""))); //retira espaços q podem vir no Ctrl + V
            txtProximoNobre.setText(Integer.toString(n.getProximoNobre()));
            n.setTotalArmazenamento(Integer.parseInt(txtTotalArmazenamento.getText().trim().replaceAll(" ", ""))); //retira espaços q podem vir no Ctrl + V
            txtTotalArmazenamento.setText(Integer.toString(n.getTotalArmazenamento()));
            n.calcularNobres();            
            
            //Altera label com o número do próximo nobre
            lblTextNecessarioProximoNobre.setText("Necessário para o nobre n° " + Integer.toString(n.getNumeroNobres() +1) + ":");
            n.calcularNecessarioProximoNobre();
            
            //Mostra os 3 rsultados
            lblQuantidadeNobres.setVisible(true);
            lblQuantidadeNobres.setText(Integer.toString(n.getNumeroNobres()));
            lblRecursosRestantes.setVisible(true);
            lblRecursosRestantes.setText(Integer.toString(n.getTotalArmazenamento()));
            lblNecessarioProximoNobre.setVisible(true);
            lblNecessarioProximoNobre.setText(Integer.toString(n.getRestante()));
            
            //Zera as variáveis
            n.setNumeroNobres(0);
            n.setProximoNobre(0);
            n.setTotalArmazenamento(0);
            n.setRestante(0);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira dados válidos em todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtProximoNobre.setText(null);
        txtTotalArmazenamento.setText(null);
        lblQuantidadeNobres.setVisible(false);
        lblRecursosRestantes.setVisible(false);
        lblNecessarioProximoNobre.setVisible(false);
        lblTextNecessarioProximoNobre.setText("Necessário para o nobre n°:");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtProximoNobreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProximoNobreKeyTyped
        String caracteres = "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
        evt.consume();
        }
    }//GEN-LAST:event_txtProximoNobreKeyTyped

    private void txtTotalArmazenamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalArmazenamentoKeyTyped
        String caracteres = "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")) {
        evt.consume();
        }
    }//GEN-LAST:event_txtTotalArmazenamentoKeyTyped

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Sair",  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (opcao == 0) 
                System.exit(0);
    }//GEN-LAST:event_mSairMouseClicked

    private void mSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSobreMouseClicked
        Sobre s = new Sobre();
        s.setVisible(true);
    }//GEN-LAST:event_mSobreMouseClicked

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNecessarioProximoNobre;
    private javax.swing.JLabel lblProximoNobre;
    private javax.swing.JLabel lblQuantidadeNobres;
    private javax.swing.JLabel lblRecursosRestantes;
    private javax.swing.JLabel lblTextNecessarioProximoNobre;
    private javax.swing.JLabel lblTextQuantidadeNobres;
    private javax.swing.JLabel lblTextRecursosRestantes;
    private javax.swing.JLabel lblTotalArmazenamento;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenu mSobre;
    private javax.swing.JTextField txtProximoNobre;
    private javax.swing.JTextField txtTotalArmazenamento;
    // End of variables declaration//GEN-END:variables
}
