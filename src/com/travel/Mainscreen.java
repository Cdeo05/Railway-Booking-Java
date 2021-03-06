/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;

import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Mainscreen extends javax.swing.JFrame {
String user;
    /**
     * Creates new form Mainscreen
     */
    public Mainscreen() {
        initComponents();
        Color background=new Color(200,204,255);
        this.getContentPane().setBackground(background);
        setVisible(true);
        clockdisplay();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblwelcome = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblseprate = new javax.swing.JLabel();
        panelhotel = new javax.swing.JPanel();
        lblhotelbook = new javax.swing.JLabel();
        lblhistoryimage = new javax.swing.JLabel();
        lblhistory = new javax.swing.JLabel();
        paneltrain = new javax.swing.JPanel();
        lbltrainimg = new javax.swing.JLabel();
        lbltrainbook = new javax.swing.JLabel();
        butlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setLocation(new java.awt.Point(150, 60));
        setPreferredSize(new java.awt.Dimension(1050, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        lblwelcome.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblwelcome.setText("Welcome  ");
        getContentPane().add(lblwelcome);
        lblwelcome.setBounds(10, 20, 320, 28);

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbldate);
        lbldate.setBounds(920, 10, 120, 20);

        lbltime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbltime);
        lbltime.setBounds(940, 30, 100, 30);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 0, 1040, 60);

        lblseprate.setBackground(new java.awt.Color(51, 51, 255));
        lblseprate.setForeground(new java.awt.Color(0, 51, 204));
        lblseprate.setOpaque(true);
        getContentPane().add(lblseprate);
        lblseprate.setBounds(0, 0, 1040, 60);

        panelhotel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelhotel.setPreferredSize(new java.awt.Dimension(306, 347));

        lblhotelbook.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblhotelbook.setText("HISTORY");
        lblhotelbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblhotelbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblhotelbookMouseExited(evt);
            }
        });

        lblhistoryimage.setIcon(new javax.swing.ImageIcon("D:\\history.jpg")); // NOI18N
        lblhistoryimage.setText("jLabel1");
        lblhistoryimage.setPreferredSize(new java.awt.Dimension(280, 280));
        lblhistoryimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhistoryimageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblhistoryimageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblhistoryimageMouseExited(evt);
            }
        });

        lblhistory.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblhistory.setText("HISTORY");
        lblhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblhistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblhistoryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelhotelLayout = new javax.swing.GroupLayout(panelhotel);
        panelhotel.setLayout(panelhotelLayout);
        panelhotelLayout.setHorizontalGroup(
            panelhotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhotelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(panelhotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhistory)
                    .addComponent(lblhotelbook))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(panelhotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhistoryimage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelhotelLayout.setVerticalGroup(
            panelhotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhistoryimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblhistory)
                .addGap(245, 245, 245)
                .addComponent(lblhotelbook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelhotel);
        panelhotel.setBounds(540, 140, 290, 360);

        paneltrain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneltrain.setPreferredSize(new java.awt.Dimension(307, 347));

        lbltrainimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/travel/trainimage.jpg"))); // NOI18N
        lbltrainimg.setText("jLabel4");
        lbltrainimg.setPreferredSize(new java.awt.Dimension(280, 280));
        lbltrainimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltrainimgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltrainimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltrainimgMouseExited(evt);
            }
        });

        lbltrainbook.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbltrainbook.setText("RAILWAY BOOKING");
        lbltrainbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltrainbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltrainbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltrainbookMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneltrainLayout = new javax.swing.GroupLayout(paneltrain);
        paneltrain.setLayout(paneltrainLayout);
        paneltrainLayout.setHorizontalGroup(
            paneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltrainLayout.createSequentialGroup()
                .addGroup(paneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltrainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltrainimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltrainLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbltrainbook)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        paneltrainLayout.setVerticalGroup(
            paneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltrainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltrainimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltrainbook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbltrainimg.getAccessibleContext().setAccessibleName("");

        getContentPane().add(paneltrain);
        paneltrain.setBounds(180, 140, 307, 360);

        butlogout.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        butlogout.setText("LOG OUT");
        butlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(butlogout);
        butlogout.setBounds(40, 520, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblhotelbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhotelbookMouseEntered
        // TODO add your handling code here:
        lblhotelbook.setForeground(Color.RED);
    }//GEN-LAST:event_lblhotelbookMouseEntered

    private void lblhotelbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhotelbookMouseExited
        // TODO add your handling code here:
        lblhotelbook.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblhotelbookMouseExited

    private void lbltrainbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainbookMouseExited
        // TODO add your handling code here:
         lbltrainbook.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbltrainbookMouseExited

    private void lbltrainbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainbookMouseEntered
        // TODO add your handling code here:
         lbltrainbook.setForeground(Color.RED);
    }//GEN-LAST:event_lbltrainbookMouseEntered

    private void lbltrainimgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainimgMouseEntered
        // TODO add your handling code here:
                lbltrainimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0), 5));

    }//GEN-LAST:event_lbltrainimgMouseEntered

    private void lbltrainimgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainimgMouseExited
        // TODO add your handling code here:
                 lbltrainimg.setBorder(null);

    }//GEN-LAST:event_lbltrainimgMouseExited

    private void lbltrainimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainimgMouseClicked
        try {
            // TODO add your handling code here:
            RailwayBooking r=new RailwayBooking();
            r.getusername(user);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }//GEN-LAST:event_lbltrainimgMouseClicked

    private void butlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlogoutActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        this.dispose();
    }//GEN-LAST:event_butlogoutActionPerformed

    private void lbltrainbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrainbookMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            RailwayBooking r=new RailwayBooking();
            r.getusername(user);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbltrainbookMouseClicked

    private void lblhistoryimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryimageMouseClicked
        // TODO add your handling code here:
        bookinghistory h=new bookinghistory();
         
    try {
        h.filltable(user);
    } catch (SQLException ex) {
        Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
    }
        h.getusername(user);
        this.dispose();
    }//GEN-LAST:event_lblhistoryimageMouseClicked

    private void lblhistoryimageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryimageMouseEntered
        // TODO add your handling code here:
        lblhistoryimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0), 5));
    }//GEN-LAST:event_lblhistoryimageMouseEntered

    private void lblhistoryimageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryimageMouseExited
        // TODO add your handling code here:
        lblhistoryimage.setBorder(null);
    }//GEN-LAST:event_lblhistoryimageMouseExited

    private void lblhistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryMouseEntered
        // TODO add your handling code here:
        lblhistory.setForeground(Color.RED);
    }//GEN-LAST:event_lblhistoryMouseEntered

    private void lblhistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryMouseExited
        // TODO add your handling code here:
         lblhistory.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblhistoryMouseExited

    private void lblhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhistoryMouseClicked
        // TODO add your handling code here:
        bookinghistory h=new bookinghistory();
    try {
        h.filltable(user);
    } catch (SQLException ex) {
        Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.dispose();
    }//GEN-LAST:event_lblhistoryMouseClicked

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
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainscreen().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butlogout;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhistory;
    private javax.swing.JLabel lblhistoryimage;
    private javax.swing.JLabel lblhotelbook;
    private javax.swing.JLabel lblseprate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel lbltrainbook;
    private javax.swing.JLabel lbltrainimg;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JPanel panelhotel;
    private javax.swing.JPanel paneltrain;
    // End of variables declaration//GEN-END:variables
 private void clockdisplay() {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int date=cal.get(Calendar.DATE);
        int year=cal.get(Calendar.YEAR);
        lbldate.setText(date+"/"+(month+1)+"/"+year);
        
        Thread clocktime=new Thread()
        {
            public void run()
            {
                while(true)
                {
                    Calendar c=new GregorianCalendar();
        int hour=c.get(Calendar.HOUR);
        int min=c.get(Calendar.MINUTE);
        int sec=c.get(Calendar.SECOND);
        lbltime.setText((hour)+":"+min+":"+sec);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        clocktime.start();
        
    }

    public void lblwel(String username) {
        user=username;
        lblwelcome.setText("Welcome, "+username);
    }
    
    public void getusername(String username)
    {
         user=username;
         lblwelcome.setText("Welcome, "+user);
    }
}


