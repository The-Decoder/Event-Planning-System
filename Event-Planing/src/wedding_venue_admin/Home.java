package wedding_venue_admin;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Home extends javax.swing.JFrame {
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
    /**
     * Creates new form LoginPage
     */
    public Home() {
    	getContentPane().setBackground(new Color(0, 120, 215));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prateek\\Desktop\\project\\iconimage.jpg"));
    	setTitle("EVENT PLANNING\r\n");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btncustomer = new javax.swing.JButton();
        btncustomer.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        btncus_regis = new javax.swing.JButton();
        btncus_regis.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        btnhome = new javax.swing.JButton();
        btnhome.setFocusPainted(false);
        btnhome.setForeground(new Color(255, 255, 255));
        btnhome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btncontact = new javax.swing.JButton();
        btncontact.setForeground(SystemColor.window);
        btncontact.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btnabout = new javax.swing.JButton();
        btnabout.setForeground(new Color(255, 255, 255));
        btnabout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btnlogin = new javax.swing.JButton();
        btnlogin.setForeground(new Color(255, 255, 255));
        btnlogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btnadmin = new javax.swing.JButton();
        btnadmin.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        btnadmin.setForeground(new Color(0, 0, 0));
        btnadmin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		Admin_Page0.main(null);
        	}
        });
        lbltp = new javax.swing.JLabel();
        lbltp.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\icon.png"));
        lbltp.setOpaque(true);
        
        lbltp.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        Timer timer= new Timer(1000, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n= (int) Math.floor( Math.random() * 6);
				String image=images[n];
				lbltp.setIcon(new ImageIcon("src\\images\\"+ image));
			}
			
		});
		timer.start();
        setSize(1000,770);
        setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 770));
        setSize(new java.awt.Dimension(1000, 770));
        getContentPane().setLayout(null);

        btncustomer.setBackground(new Color(0, 128, 128));
        btncustomer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncustomer.setText("CUSTOMER");
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
                Login_Sys.main(null);
                dispose();
            }
        });
        getContentPane().add(btncustomer);
        btncustomer.setBounds(286, 505, 186, 111);

        btncus_regis.setBackground(new Color(0, 128, 128));
        btncus_regis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncus_regis.setText(" CUSTOMER REGISTRATION");
        btncus_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(btncus_regis);
        btncus_regis.setBounds(552, 505, 379, 111);

        btnhome.setBackground(new Color(0, 0, 153));
        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome);
        btnhome.setBounds(1, 330, 247, 35);

        btncontact.setBackground(new Color(0, 0, 153));
        btncontact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncontact.setText("Contact Us");
        btncontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(btncontact);
        btncontact.setBounds(244, 330, 250, 35);

        btnabout.setBackground(new Color(0, 0, 153));
        btnabout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnabout.setText("About Us");
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnabout);
        btnabout.setBounds(490, 330, 248, 35);

        btnlogin.setBackground(new Color(0, 0, 153));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin.setText("Exit");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(738, 330, 255, 35);

        btnadmin.setBackground(new Color(0, 128, 128));
        btnadmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnadmin.setText("ADMIN");
        getContentPane().add(btnadmin);
        btnadmin.setBounds(53, 505, 136, 111);

        lbltp.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lbltp);
        lbltp.setBounds(1, 1, 992, 320);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\bgpic.jpg"));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(SystemColor.activeCaption);
        lblNewLabel.setBounds(25, 395, 935, 304);
        getContentPane().add(lblNewLabel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      Login_Sys.main(null);
      dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Sign_Up.main(null);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Contact_Us.main(null);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        About_Us.main(null);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btncus_regis;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btncontact;
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnadmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbltp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables
}