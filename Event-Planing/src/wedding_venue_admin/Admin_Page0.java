package wedding_venue_admin;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Admin_Page0 {

	private JFrame frmEventPlanning;
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
	private JTextField adtext;
	private JPasswordField adpass;
	private JLabel lbltp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Page0 window = new Admin_Page0();
					window.frmEventPlanning.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Page0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventPlanning = new JFrame();
		frmEventPlanning.setTitle("EVENT PLANNING");
		frmEventPlanning.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prateek\\Desktop\\project\\iconimage.jpg"));
		frmEventPlanning.getContentPane().setBackground(SystemColor.textHighlight);
		frmEventPlanning.setBounds(100, 100, 450, 300);
		frmEventPlanning.setSize(1000,770);
		frmEventPlanning.setLocationRelativeTo(null);
		frmEventPlanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEventPlanning.getContentPane().setLayout(null);
		frmEventPlanning.setResizable(false);
	
		JButton bthome = new JButton("Home");
		bthome.setForeground(new Color(255, 255, 255));
		bthome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		bthome.setFocusPainted(false);
		bthome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Home.main(null);
				
			}
		});
		bthome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		bthome.setBackground(new Color(0, 0, 153));
		bthome.setBounds(1, 330, 247, 35);
		frmEventPlanning.getContentPane().add(bthome);
		
		JButton btncontact = new JButton("Contact Us");
		btncontact.setForeground(new Color(255, 255, 255));
		btncontact.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btncontact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Contact_Us.main(null);
			}
		});
		btncontact.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btncontact.setBackground(new Color(0, 0, 153));
		btncontact.setBounds(247, 330, 247, 35);
		frmEventPlanning.getContentPane().add(btncontact);
		
		JButton btnabout = new JButton("About Us");
		btnabout.setForeground(new Color(255, 255, 255));
		btnabout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				About_Us.main(null);
			}
		});
		btnabout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnabout.setBackground(new Color(0, 0, 153));
		btnabout.setBounds(494, 330, 250, 35);
		frmEventPlanning.getContentPane().add(btnabout);
		
		JButton btnlogin0 = new JButton("Login");
		btnlogin0.setForeground(new Color(255, 255, 255));
		btnlogin0.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnlogin0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnlogin0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Admin_Page0.main(null);
			}
		});
		btnlogin0.setBackground(new Color(0, 0, 153));
		btnlogin0.setBounds(745, 330, 247, 35);
		frmEventPlanning.getContentPane().add(btnlogin0);
		
		JLabel lbladmin = new JLabel("ADMIN Login Page");
		lbladmin.setForeground(new Color(0, 0, 0));
		lbladmin.setHorizontalAlignment(SwingConstants.CENTER);
		lbladmin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lbladmin.setBounds(355, 402, 264, 61);
		frmEventPlanning.getContentPane().add(lbladmin);
		
		JLabel adID = new JLabel("Admin ID");
		adID.setFont(new Font("Times New Roman", Font.BOLD, 18));
		adID.setHorizontalAlignment(SwingConstants.LEFT);
		adID.setBounds(297, 508, 121, 23);
		frmEventPlanning.getContentPane().add(adID);
		
		JLabel adpassword = new JLabel("Password");
		adpassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		adpassword.setBounds(297, 565, 85, 23);
		frmEventPlanning.getContentPane().add(adpassword);
		
		adtext = new JTextField();
		adtext.setBounds(455, 507, 226, 29);
		frmEventPlanning.getContentPane().add(adtext);
		adtext.setColumns(10);
		
		final JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(new Color(0, 128, 128));
		btnlogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == btnlogin) {
					if(adtext.getText().equals("VRDCODERS") && adpass.getText().equals("VRDCODERS")) {
						JOptionPane.showMessageDialog(null, "Login Successfully !!");
						frmEventPlanning.dispose();
						Admin_Page1.main(null);
					}
					else{
						JOptionPane.showMessageDialog(null, "Login Unsuccessful !! Do Login First");	
					}
				}}
		});
		btnlogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnlogin.setBounds(337, 652, 126, 35);
		frmEventPlanning.getContentPane().add(btnlogin);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.setBackground(new Color(0, 128, 128));
		btncancel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
			}
		});
		btncancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btncancel.setBounds(505, 652, 126, 35);
		frmEventPlanning.getContentPane().add(btncancel);
		
		adpass = new JPasswordField();
		adpass.setBounds(455, 564, 226, 29);
		frmEventPlanning.getContentPane().add(adpass);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(360, 458, 257, 11);
		frmEventPlanning.getContentPane().add(separator);
		
		JLabel lblbg = new JLabel("");
		lblbg.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblbg.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\bgpic2.jpg"));
		lblbg.setBounds(20, 389, 940, 320);
		frmEventPlanning.getContentPane().add(lblbg);
		lblbg.setOpaque(true);
		lblbg.setBackground(new Color(102, 205, 170));
		
		lbltp = new JLabel("");
		lbltp.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\icon.png"));
		lbltp.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lbltp.setForeground(Color.WHITE);
		lbltp.setHorizontalAlignment(SwingConstants.CENTER);
		lbltp.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltp.setOpaque(true);
		lbltp.setBackground(new Color(0, 0, 0));
		lbltp.setBounds(1, 1, 992, 320);
		Timer timer= new Timer(1000, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n= (int) Math.floor( Math.random() * 6);
				String image=images[n];
				lbltp.setIcon(new ImageIcon("src\\images\\"+ image));
			}
			
		});
		timer.start();
		
		frmEventPlanning.getContentPane().add(lbltp);
	}
}
