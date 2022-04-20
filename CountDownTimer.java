/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CountDownTimer extends javax.swing.JFrame {

    int min = 0, sec = 0, hr = 0, min1, sec1, hr1;
    Timer timer;
    boolean isStop = false;

    public CountDownTimer() {
        initComponents();
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxMin.addItem("0" + i);
            } else {
                cbxMin.addItem("" + i);
            }
        }
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxSec.addItem("0" + i);
            } else {
                cbxSec.addItem("" + i);
            }
        }
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                cbxHr.addItem("0" + i);
            } else {
                cbxHr.addItem("" + i);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSec = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        cbxSec = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn30m = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbxHr = new javax.swing.JComboBox<>();
        cbxMin = new javax.swing.JComboBox<>();
        btn10m = new javax.swing.JButton();
        btn15m = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CountDownTimer By hibree");

        lblHour.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblHour.setText("00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel3.setText(":");

        lblSec.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblSec.setText("00");

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        cbxSec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbxSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSecActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Minute");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Second");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chap4/alarm-4172631_1280.png"))); // NOI18N

        btn30m.setText("30Min");
        btn30m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30mActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Hour");

        cbxHr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbxHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHrActionPerformed(evt);
            }
        });

        cbxMin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMinActionPerformed(evt);
            }
        });

        btn10m.setText("10Min");
        btn10m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10mActionPerformed(evt);
            }
        });

        btn15m.setText("15Min");
        btn15m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15mActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel4.setText(":");

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblMin.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(32, 32, 32))
                                    .addComponent(cbxHr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnStart)
                                    .addGap(22, 22, 22)
                                    .addComponent(btnStop))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHour)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)
                                    .addComponent(lblMin)
                                    .addGap(71, 71, 71))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn10m)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cbxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSec, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn30m))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn15m)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSec)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHour)
                        .addComponent(jLabel3)
                        .addComponent(lblSec)
                        .addComponent(jLabel4)
                        .addComponent(lblMin))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(btn10m)
                    .addComponent(btn30m))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSecActionPerformed
        // TODO add your handling code here:
        lblSec.setText("" + cbxSec.getSelectedItem());
        sec = Integer.parseInt(lblSec.getText());
    }//GEN-LAST:event_cbxSecActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setEnabled(false);
        btn10m.setEnabled(false);
        btn15m.setEnabled(false);
        btn30m.setEnabled(false);
        cbxHr.setEnabled(false);
        cbxMin.setEnabled(false);
        cbxSec.setEnabled(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                btnStart.setEnabled(false);

                if (isStop) {
                    min = min1;
                    sec = sec1;
                    hr = hr1;
                    isStop = false;
                }

                if (sec < 1) {
                    sec = 60;
                    min--;
                }

                if (min < 0) {
                    min = 59;
                    hr--;
                }

                if (hr < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Time Out!");
                    hr = 0;
                    min = 0;
                    sec = 0;
                    timer.stop();
                    btnStart.setEnabled(true);
                } else {
                    sec--;
                }

                if (sec < 10) {
                    lblSec.setText("0" + sec);
                } else {
                    lblSec.setText("" + sec);
                }

                if (min < 10) {
                    lblMin.setText("0" + min);
                } else {
                    lblMin.setText("" + min);
                }

                if (hr < 10) {
                    lblHour.setText("0" + hr);
                } else {
                    lblHour.setText("" + hr);
                }

            }
        });
        timer.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void cbxHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHrActionPerformed
        lblHour.setText("" + cbxHr.getSelectedItem());
        hr = Integer.parseInt(lblHour.getText());

    }//GEN-LAST:event_cbxHrActionPerformed

    private void cbxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMinActionPerformed
        lblMin.setText("" + cbxMin.getSelectedItem());
        min = Integer.parseInt(lblMin.getText());
    }//GEN-LAST:event_cbxMinActionPerformed

    private void btn10mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10mActionPerformed
        min = 10;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btn10mActionPerformed

    private void btn15mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15mActionPerformed
        min = 15;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btn15mActionPerformed

    private void btn30mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30mActionPerformed
        min = 30;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btn30mActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        min1 = min;
        sec1 = sec;
        hr1 = hr;
        isStop = true;
        timer.stop();
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(CountDownTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountDownTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountDownTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountDownTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountDownTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10m;
    private javax.swing.JButton btn15m;
    private javax.swing.JButton btn30m;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> cbxHr;
    private javax.swing.JComboBox<String> cbxMin;
    private javax.swing.JComboBox<String> cbxSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    // End of variables declaration//GEN-END:variables
}
