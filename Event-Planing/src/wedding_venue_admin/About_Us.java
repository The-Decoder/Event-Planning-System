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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class About_Us {

	private JFrame frmEventPlanning;
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
	private JLabel lbltp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Us window = new About_Us();
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
	public About_Us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventPlanning = new JFrame();
		frmEventPlanning.getContentPane().setBackground(SystemColor.textHighlight);
		frmEventPlanning.setTitle("EVENT PLANNING");
		frmEventPlanning.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prateek\\Desktop\\project\\iconimage.jpg"));
		frmEventPlanning.setBounds(100, 100, 450, 300);
		frmEventPlanning.setSize(1000,770);
		frmEventPlanning.setResizable(false);
		frmEventPlanning.setLocationRelativeTo(null);
		frmEventPlanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEventPlanning.getContentPane().setLayout(null);
	
		JButton btnhome = new JButton("Home");
		btnhome.setFocusPainted(false);
		btnhome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnhome.setForeground(new Color(255, 255, 255));
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home.main(null);
				frmEventPlanning.dispose();
			}
		});
		btnhome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnhome.setBackground(new Color(0, 0, 153));
		btnhome.setBounds(1, 330, 247, 35);
		frmEventPlanning.getContentPane().add(btnhome);
		
		JButton btncontact = new JButton("Contact Us");
		btncontact.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btncontact.setForeground(new Color(255, 255, 255));
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
		btnabout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnabout.setForeground(new Color(255, 255, 255));
		btnabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				About_Us.main(null);
			}
		});
		btnabout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnabout.setBackground(new Color(0, 0, 153));
		btnabout.setBounds(494, 330, 246, 35);
		frmEventPlanning.getContentPane().add(btnabout);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnlogin.setForeground(new Color(255, 255, 255));
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Admin_Page0.main(null);
			}
		});
		btnlogin.setBackground(new Color(0, 0, 153));
		btnlogin.setBounds(740, 330, 252, 35);
		frmEventPlanning.getContentPane().add(btnlogin);
		
		JLabel lblcontact = new JLabel("About Us");
		lblcontact.setForeground(new Color(0, 0, 0));
		lblcontact.setHorizontalAlignment(SwingConstants.CENTER);
		lblcontact.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblcontact.setBounds(353, 401, 264, 61);
		frmEventPlanning.getContentPane().add(lblcontact);
		
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
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(421, 458, 125, 11);
		frmEventPlanning.getContentPane().add(separator);
		
		JTextArea txtrThisApplicationIs = new JTextArea();
		txtrThisApplicationIs.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtrThisApplicationIs.setTabSize(5);
		txtrThisApplicationIs.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		txtrThisApplicationIs.setText("            \r\n                   This is an Online event management system software project that serves\r\n                   the functionality of an event manager. The system allows only registered\r\n                   users to login and new users are allowed to resister on the application. \r\n                   This is a web application developed in Asp.net and Sql but desktop\r\n                   application of the same application is also available. The project provides\r\n                   most of the basic functionality required for an event. It allows the user to \r\n                   select from a list of event types. \r\n");
		txtrThisApplicationIs.setBounds(96, 485, 778, 208);
		frmEventPlanning.getContentPane().add(txtrThisApplicationIs);
		
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\bgpic2.jpg"));
		lblbg.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblbg.setBounds(20, 389, 940, 327);
		frmEventPlanning.getContentPane().add(lblbg);
		lblbg.setOpaque(true);
		lblbg.setBackground(new Color(102, 205, 170));
	}
}
