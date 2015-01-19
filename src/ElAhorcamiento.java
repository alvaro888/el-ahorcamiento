
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvaro
 */
public class ElAhorcamiento extends javax.swing.JFrame {
    
    /**
     * Creates new form ElAhorcamiento
     */
    //palabra oculta en el futuro la pondre con un random
    String palabraOculta = "CETYS";
    
    //contador para el numer de fallos 
    int numeroFallos = 0;
    
    
    
    public ElAhorcamiento() {
        initComponents();
    }
    
    private void chequeaBoton (JButton botonPulsado){
    botonPulsado.setVisible(false);
    chequeaLetra(botonPulsado.getText());
    }
    
    private void chequeaLetra(String letra){
        letra = letra.toUpperCase();
        //guardo el texto de la pantalla en un string auxiliar
        String palabraConGuiones = jLabel2.getText();
        
        if (palabraOculta.contains(letra)){
            //desocultar la letra en la pantalla
            //quitar el guion
            for(int i=0; i < palabraOculta.length(); i++) {
               if(palabraOculta.charAt(i)== letra.charAt(0)){
               palabraConGuiones = palabraConGuiones.substring(0,2*i)
                                    + letra
                                    + palabraConGuiones.substring(2*i+1);
               }
               
            }
        jLabel2.setText (palabraConGuiones);
        }
        
        else{ 
            numeroFallos++;
            jLabel3.setText(String.valueOf(numeroFallos));
        }
        
        repaint();
        
    }
    
    @Override
    public void paint (Graphics g){
        super.paintComponents(g);
        g = jPanel1.getGraphics();
        
        Image miImagen = null;
        try {
            
            switch (numeroFallos){
                case 0 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;
                case 1 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;
                case 2 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;        
                case 3 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;
                case 4 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;
                case 5 : miImagen = ImageIO.read ((getClass().getResource("/ahorcado_0.png"))); break;
                case - 100 : miImagen = ImageIO.read((getClass().getResource("/acertasteTodo.png"))); break; 
                default : miImagen = ImageIO.read((getClass().getResource("/ahorcado_fin.png"))); break;
                    
        }
        
    
    
    } catch (IOException ex) {
        
        }
        g.drawImage(miImagen,0,0,jPanel1.getWidth(),jPanel1.getHeight(),null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Harrington", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EL AHORCAMIENTO");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 25, 570, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(376, 376));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 113, -1, -1));

        jButton1.setText("A");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 310, 47, -1));

        jButton2.setText("U");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 427, 47, -1));

        jButton3.setText("V");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 427, 47, -1));

        jButton4.setText("W");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 427, 47, -1));

        jButton5.setText("S");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 390, 47, -1));

        jButton6.setText("X");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 424, 47, -1));

        jButton7.setText("T");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 390, 47, -1));

        jButton8.setText("N");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 351, 47, -1));

        jButton9.setText("Ñ");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 390, 47, -1));

        jButton10.setText("O");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 47, -1));

        jButton11.setText("R");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 390, 47, -1));

        jButton12.setText("D");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 310, 47, -1));

        jButton13.setText("F");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 310, 47, -1));

        jButton14.setText("Q");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 390, 47, -1));

        jButton15.setText("L");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 351, 47, -1));

        jButton16.setText("M");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 351, 47, -1));

        jButton17.setText("Y");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 424, 47, -1));

        jButton18.setText("Z");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 424, 47, -1));

        jButton19.setText("B");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 47, -1));

        jButton20.setText("C");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton20MousePressed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 310, 47, -1));

        jButton21.setText("E");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 310, 47, -1));

        jButton22.setText("G");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 310, 47, -1));

        jButton23.setText("H");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 351, 47, -1));

        jButton24.setText("I");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 351, 47, -1));

        jButton25.setText("J");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton25MousePressed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 351, 47, -1));

        jButton26.setText("K");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton26MousePressed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 351, 47, -1));

        jButton27.setText("P");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton27MousePressed(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 390, 47, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("_ _ _ _ _ ");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 365, 129));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton16MousePressed

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton18MousePressed

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton19MousePressed

    private void jButton20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton20MousePressed

    private void jButton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton21MousePressed

    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton22MousePressed

    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton23MousePressed

    private void jButton24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton24MousePressed

    private void jButton25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton25MousePressed

    private void jButton26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton26MousePressed

    private void jButton27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MousePressed
        chequeaBoton ((JButton) evt.getSource());
    }//GEN-LAST:event_jButton27MousePressed

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
            java.util.logging.Logger.getLogger(ElAhorcamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElAhorcamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElAhorcamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElAhorcamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElAhorcamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
