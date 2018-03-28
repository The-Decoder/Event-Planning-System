package wedding_venue_admin;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Toolkit;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Login_Sys {
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
	private JFrame frmLoginPage;
	private JTextField txtuname;
	private JPasswordField passupassword;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Sys window = new Login_Sys();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login_Sys() {
		initialize();
	}

	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prateek\\Desktop\\project\\iconimage.jpg"));
		frmLoginPage.setForeground(new Color(255, 160, 122));
		frmLoginPage.setBackground(new Color(0, 0, 0));
		frmLoginPage.getContentPane().setBackground(SystemColor.textHighlight);
		frmLoginPage.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		frmLoginPage.setTitle("EVENT PLANNING");
		frmLoginPage.setBounds(100, 100, 450, 300);
		frmLoginPage.setSize(1000,770);
		frmLoginPage.setLocationRelativeTo(null);
		frmLoginPage.setResizable(false);
		frmLoginPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		

		JButton bthome = new JButton("Home");
		bthome.setForeground(new Color(255, 255, 255));
		bthome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		bthome.setFocusPainted(false);
		bthome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginPage.dispose();
				Home.main(null);
				
			}
		});
		bthome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		bthome.setBackground(new Color(0, 0, 153));
		bthome.setBounds(1, 330, 247, 35);
		frmLoginPage.getContentPane().add(bthome);
		
		JButton btncontact = new JButton("Contact Us");
		btncontact.setForeground(new Color(255, 255, 255));
		btncontact.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btncontact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginPage.dispose();
				Contact_Us.main(null);
			}
		});
		btncontact.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btncontact.setBackground(new Color(0, 0, 153));
		btncontact.setBounds(247, 330, 247, 35);
		frmLoginPage.getContentPane().add(btncontact);
		
		JButton btnabout = new JButton("About Us");
		btnabout.setForeground(new Color(255, 255, 255));
		btnabout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginPage.dispose();
				About_Us.main(null);
			}
		});
		btnabout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnabout.setBackground(new Color(0, 0, 153));
		btnabout.setBounds(494, 330, 250, 35);
		frmLoginPage.getContentPane().add(btnabout);
		
		JButton btnlogin0 = new JButton("SignUp");
		btnlogin0.setForeground(new Color(255, 255, 255));
		btnlogin0.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnlogin0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnlogin0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginPage.dispose();
				Sign_Up.main(null);
			}
		});
		btnlogin0.setBackground(new Color(0, 0, 153));
		btnlogin0.setBounds(744, 330, 249, 35);
		frmLoginPage.getContentPane().add(btnlogin0);
		JLabel lbl1 = new JLabel("LOGIN SYSTEM");
		lbl1.setToolTipText("");
		lbl1.setBackground(new Color(240, 240, 240));
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(381, 406, 208, 52);
		frmLoginPage.getContentPane().add(lbl1);
		
		JLabel lblUsername = new JLabel("Email ID");
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblUsername.setBounds(316, 500, 88, 30);
		frmLoginPage.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPassword.setBounds(316, 562, 88, 30);
		frmLoginPage.getContentPane().add(lblPassword);
		
		txtuname = new JTextField();
		txtuname.setToolTipText("");
		txtuname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtuname.setHorizontalAlignment(SwingConstants.CENTER);
		txtuname.setBounds(473, 499, 177, 30);
		frmLoginPage.getContentPane().add(txtuname);
		txtuname.setColumns(10);
		
		passupassword = new JPasswordField();
		passupassword.setToolTipText("");
		passupassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		passupassword.setHorizontalAlignment(SwingConstants.CENTER);
		passupassword.setBounds(473, 561, 177, 30);
		frmLoginPage.getContentPane().add(passupassword);
		
		 final JButton btnSubmit = new JButton("Login");
		 btnSubmit.setBackground(new Color(0, 128, 128));
		 btnSubmit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		 btnSubmit.setFocusPainted(false);
		 btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSubmit.addActionListener(new ActionListener() {
			private JOptionPane progressBar;

			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == btnSubmit){
					String uname=txtuname.getText();
					String upassword=passupassword.getText();
					try{
						Connect cn=new Connect();
						Connection con=cn.conn();
						
						String sql="select * from REGISTRATION where email_id=? and password=?";
						PreparedStatement ps1=con.prepareStatement(sql);
						ps1.setString(1, uname);
						ps1.setString(2, upassword);
						ResultSet rs=ps1.executeQuery();
						if(rs.next())
						{
							frmLoginPage.dispose();
							book_venue.main(null); 
							con.close();
						}
						else{JOptionPane.showMessageDialog(null, "unsuccessful !! Operation");}
						
					}catch(Exception e){
						e.printStackTrace();
					}
			}}
		});
		btnSubmit.setBounds(359, 644, 110, 30);
		frmLoginPage.getContentPane().add(btnSubmit);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(283, 613, 410, 20);
		frmLoginPage.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setToolTipText("");
		separator_1.setBounds(283, 469, 410, 20);
		frmLoginPage.getContentPane().add(separator_1);
		
		JButton btnReset = new JButton("Exit");
		btnReset.setBackground(new Color(0, 128, 128));
		btnReset.setFocusPainted(false);
		btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginPage.dispose();
				Home.main(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnReset.setBounds(504, 644, 110, 30);
		frmLoginPage.getContentPane().add(btnReset);
		
		final JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\icon.png"));
		label.setBackground(new Color(0, 0, 0));
		label.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		label.setBounds(1, 1, 992, 320);
		Timer timer= new Timer(1000, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n= (int) Math.floor( Math.random() * 6);
				String image=images[n];
				label.setIcon(new ImageIcon("src\\images\\"+ image));
			}
			
		});
		timer.start();
		frmLoginPage.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\Webp.net-resizeimage (3).jpg"));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_1.setBounds(25, 389, 938, 329);
		frmLoginPage.getContentPane().add(label_1);
		
	}
}
