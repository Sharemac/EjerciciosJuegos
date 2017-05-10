
package memorando;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Interface extends javax.swing.JFrame {
    private Cartas car = new Cartas();
    private boolean caraArriba= false;
    private ImageIcon m1;
    private ImageIcon m2;
    private JButton[] p = new JButton[2];
    private boolean carta2 = false;
    private int puntaje;
    
    public Interface() {
        initComponents();
        
        setCartas();
     }
    
    private void setCartas(){
            int[] num =  car.getCartasN();
            b1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[0]+".png")));
            b2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[1]+".png")));
            b3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[2]+".png")));
            b4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[3]+".png")));
            b5.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[4]+".png")));
            b6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[5]+".png")));
            b7.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[6]+".png")));
            b8.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[7]+".png")));
            b9.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[8]+".png")));
            b10.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[9]+".png")));
            b11.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[10]+".png")));
            b12.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+num[11]+".png")));
           
        }
    
    
private void habilitarB(JButton b){
    if(!caraArriba){
        b.setEnabled(false);
        m1 = (ImageIcon)b.getDisabledIcon();
        p[0] = b; 
        caraArriba = true;
        carta2= false;
    }else {
        b.setEnabled(false);
        m2 = (ImageIcon) b.getDisabledIcon();
        p[1] = b;
        carta2 = true;
        puntaje += 20;
        ganador();
    }
}

private void compararCartas(){
    
    if(caraArriba & carta2){
        if(m1.getDescription().compareTo(m2.getDescription())!=0){
            p[0].setEnabled(true);
            p[1].setEnabled(true);
            if(puntaje > 10) puntaje -= 10;
        }
        caraArriba =false;
    }
}
private void reinicio(){
    b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(true);
    b6.setEnabled(true);
    b7.setEnabled(true);
    b8.setEnabled(true);
    b9.setEnabled(true);
    b10.setEnabled(true);
    b11.setEnabled(true);
    b12.setEnabled(true);
    carta2 = false;
    caraArriba = false;
    puntaje = 0;
}

private void ganador(){
    if(!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && 
            !b6.isEnabled() &&!b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled() && 
            !b10.isEnabled() && !b11.isEnabled() && !b12.isEnabled()){
        JOptionPane.showMessageDialog(this, "   ¡¡¡ Ganador !!!     \n      Felicidades \n  Su puntaje es:"+ puntaje," " ,JOptionPane.INFORMATION_MESSAGE );
        System.out.println("Ha Ganado");
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        Breinicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setFocusable(false);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setFocusable(false);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setFocusable(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setFocusable(false);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setFocusable(false);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b6.setBorder(null);
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setFocusable(false);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b7.setBorder(null);
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.setFocusable(false);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7MouseExited(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b8.setBorder(null);
        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false);
        b8.setFocusable(false);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b8MouseExited(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b9.setBorder(null);
        b9.setBorderPainted(false);
        b9.setContentAreaFilled(false);
        b9.setFocusable(false);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b9MouseExited(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b10.setBorder(null);
        b10.setBorderPainted(false);
        b10.setContentAreaFilled(false);
        b10.setFocusable(false);
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b10MouseExited(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b11.setBorder(null);
        b11.setBorderPainted(false);
        b11.setContentAreaFilled(false);
        b11.setFocusable(false);
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b11MouseExited(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color.png"))); // NOI18N
        b12.setBorder(null);
        b12.setBorderPainted(false);
        b12.setContentAreaFilled(false);
        b12.setFocusable(false);
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b12MouseExited(evt);
            }
        });
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
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
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10)
                    .addComponent(b11)
                    .addComponent(b12)))
        );

        Breinicio.setText("REINICIO");
        Breinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Breinicio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Breinicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        habilitarB(b1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        habilitarB(b2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        habilitarB(b3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        habilitarB(b4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        habilitarB(b5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        habilitarB(b6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        habilitarB(b7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        habilitarB(b8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        habilitarB(b9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        habilitarB(b10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        habilitarB(b11);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        habilitarB(b12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
       compararCartas();
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        compararCartas();
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
       compararCartas();
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        compararCartas();
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
       compararCartas();
    }//GEN-LAST:event_b5MouseExited

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
       compararCartas();
    }//GEN-LAST:event_b6MouseExited

    private void b7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseExited
        compararCartas();
    }//GEN-LAST:event_b7MouseExited

    private void b8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseExited
        compararCartas();
    }//GEN-LAST:event_b8MouseExited

    private void b9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseExited
        compararCartas();
    }//GEN-LAST:event_b9MouseExited

    private void b10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseExited
        compararCartas();
    }//GEN-LAST:event_b10MouseExited

    private void b11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseExited
        compararCartas();
    }//GEN-LAST:event_b11MouseExited

    private void b12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseExited
        compararCartas();
    }//GEN-LAST:event_b12MouseExited

    private void BreinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreinicioActionPerformed
        reinicio();
    }//GEN-LAST:event_BreinicioActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Breinicio;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
