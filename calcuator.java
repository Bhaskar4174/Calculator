/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class calcuator extends javax.swing.JFrame {
    double num1=0 , num2=0 ;
    String operator = null;
    /**
     * Creates new form calcuator
     */
    public calcuator() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        bdot = new javax.swing.JButton();
        b_multilply = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b_backspace = new javax.swing.JButton();
        b_allclear = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        b_divide = new javax.swing.JButton();
        b_plus = new javax.swing.JButton();
        b_minus = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b_equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bdot.setBackground(new java.awt.Color(255, 255, 255));
        bdot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/period.png"))); // NOI18N
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        jPanel1.add(bdot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 70, 70));

        b_multilply.setBackground(new java.awt.Color(255, 255, 255));
        b_multilply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/asterisk.png"))); // NOI18N
        b_multilply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_multilplyActionPerformed(evt);
            }
        });
        jPanel1.add(b_multilply, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 70, 70));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/four.png"))); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, 70));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/five.png"))); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 70, 70));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/six.png"))); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 70, 70));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/number-1.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, 70));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/two.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 70, 70));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/three.png"))); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 70, 70));

        b0.setBackground(new java.awt.Color(255, 255, 255));
        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/zero.png"))); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 70, 70));

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/seven.png"))); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 70));

        b_backspace.setBackground(new java.awt.Color(255, 255, 255));
        b_backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clear (2).png"))); // NOI18N
        b_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backspaceActionPerformed(evt);
            }
        });
        jPanel1.add(b_backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 70, 70));

        b_allclear.setBackground(new java.awt.Color(0, 0, 0));
        b_allclear.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        b_allclear.setForeground(new java.awt.Color(255, 255, 255));
        b_allclear.setText("AC");
        b_allclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_allclearActionPerformed(evt);
            }
        });
        jPanel1.add(b_allclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 70));

        t1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        t1.setToolTipText("");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 80));

        b_divide.setBackground(new java.awt.Color(255, 255, 255));
        b_divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/slash.png"))); // NOI18N
        b_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_divideActionPerformed(evt);
            }
        });
        jPanel1.add(b_divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 70, 70));

        b_plus.setBackground(new java.awt.Color(255, 255, 255));
        b_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/plus.png"))); // NOI18N
        b_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_plusActionPerformed(evt);
            }
        });
        jPanel1.add(b_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 70, 70));

        b_minus.setBackground(new java.awt.Color(255, 255, 255));
        b_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/minus.png"))); // NOI18N
        b_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minusActionPerformed(evt);
            }
        });
        jPanel1.add(b_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 70, 70));

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/nine.png"))); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, 70));

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/eight.png"))); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 70, 70));

        b_equals.setBackground(new java.awt.Color(255, 255, 255));
        b_equals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/equal.png"))); // NOI18N
        b_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_equalsActionPerformed(evt);
            }
        });
        jPanel1.add(b_equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     t1.setText(t1.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        // TODO add your handling code here:
         t1.setText(t1.getText()+".");
    }//GEN-LAST:event_bdotActionPerformed

    private void b_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backspaceActionPerformed
        String str = t1.getText();
        t1.setText(str.substring(0,str.length()-1));
        
    }//GEN-LAST:event_b_backspaceActionPerformed

    private void b_multilplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_multilplyActionPerformed
       num1 = Double.parseDouble(t1.getText());
       t1.setText("");
       operator = "*";
    }//GEN-LAST:event_b_multilplyActionPerformed

    private void b_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_divideActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(t1.getText());
       t1.setText("");
       operator = "/";
    }//GEN-LAST:event_b_divideActionPerformed

    private void b_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_plusActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(t1.getText());
       t1.setText("");
       operator = "+";
    }//GEN-LAST:event_b_plusActionPerformed

    private void b_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minusActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(t1.getText());
       t1.setText("");
       operator = "-";
    }//GEN-LAST:event_b_minusActionPerformed

    private void b_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_equalsActionPerformed
        num2 = Double.parseDouble(t1.getText());
        
        double ans = num1;
        
    
           // num2 = Double.parseDouble(t1.getText());
            if(operator == "+"){
            ans = num1+num2;
        }
        
          if(operator == "-"){
            ans = num1-num2;
        }
          
            if(operator == "*"){
            ans = num1*num2;
        }
            
             if(operator == "/"){
            ans = num1/num2;
        }
        
             t1.setText(""+ans);
             operator = null;
        
        

             
        
        
        
    }//GEN-LAST:event_b_equalsActionPerformed

    private void b_allclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_allclearActionPerformed
        // TODO add your handling code here:
        t1.setText("");
    }//GEN-LAST:event_b_allclearActionPerformed

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
            java.util.logging.Logger.getLogger(calcuator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcuator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcuator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcuator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcuator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton b_allclear;
    private javax.swing.JButton b_backspace;
    private javax.swing.JButton b_divide;
    private javax.swing.JButton b_equals;
    private javax.swing.JButton b_minus;
    private javax.swing.JButton b_multilply;
    private javax.swing.JButton b_plus;
    private javax.swing.JButton bdot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t1;
    // End of variables declaration//GEN-END:variables
}
