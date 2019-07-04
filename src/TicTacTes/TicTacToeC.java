/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre.giacobo
 */
public class TicTacToeC extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    /**
     * Creates new form TicTacToeC
     */
    public TicTacToeC() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }
    
    private void gameScore() {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    
    private void resetGame() {
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton8.setText(null);
        jButton9.setText(null);
        jButton10.setText(null);
        
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
    }
    
    private void winningGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton10.getText();
        String b5 = jButton9.getText();
        String b6 = jButton8.getText();
        
        String b7 = jButton11.getText();
        String b8 = jButton12.getText();
        String b9 = jButton13.getText();
        
        // Line one
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } 
        
            if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line two
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            jButton10.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            jButton10.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line three
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line four
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            jButton11.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line five
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton10.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton10.setBackground(Color.GREEN);
            jButton11.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line six
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            jButton2.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            jButton2.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton12.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line seven
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            jButton3.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            jButton3.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line eight
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            jButton1.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            jButton1.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton13.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        // Line nine
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            jButton11.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetGame();
        } else if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            jButton11.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetGame();
        }
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTacToe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player X:");
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel8.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Player O:");
        jPanel13.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel15.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel19.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel20.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        resetGame();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you wanna exit.", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton13.setForeground(Color.GREEN);
        } else {
            jButton13.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton12.setForeground(Color.GREEN);
        } else {
            jButton12.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton11.setForeground(Color.GREEN);
        } else {
            jButton11.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton10.setForeground(Color.GREEN);
        } else {
            jButton10.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.GREEN);
        } else {
            jButton9.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.GREEN);
        } else {
            jButton8.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.GREEN);
        } else {
            jButton3.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.GREEN);
        } else {
            jButton2.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.GREEN);
        } else {
            jButton1.setForeground(Color.BLUE);
        }

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
