package wedding_venue_admin;



import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Contact_Us {

	private JFrame frmEventPlanning;
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
	private JTextField adtext;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lbltp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact_Us window = new Contact_Us();
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
	public Contact_Us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventPlanning = new JFrame();
		frmEventPlanning.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prateek\\Desktop\\project\\iconimage.jpg"));
		frmEventPlanning.setTitle("EVENT PLANNING");
		frmEventPlanning.getContentPane().setBackground(SystemColor.textHighlight);
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
		btnabout.setBounds(494, 330, 249, 35);
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
		
		JLabel lblcontact = new JLabel("Contact Information");
		lblcontact.setForeground(new Color(0, 0, 0));
		lblcontact.setHorizontalAlignment(SwingConstants.CENTER);
		lblcontact.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblcontact.setBounds(351, 408, 264, 61);
		frmEventPlanning.getContentPane().add(lblcontact);
		
		JLabel mob1 = new JLabel("Mobile No. 1");
		mob1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mob1.setHorizontalAlignment(SwingConstants.LEFT);
		mob1.setBounds(60, 529, 121, 23);
		frmEventPlanning.getContentPane().add(mob1);
		
		JLabel mob2 = new JLabel("Mobile No. 2");
		mob2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mob2.setBounds(60, 608, 109, 23);
		frmEventPlanning.getContentPane().add(mob2);
		
		adtext = new JTextField();
		adtext.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		adtext.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		adtext.setHorizontalAlignment(SwingConstants.CENTER);
		adtext.setText("9650399283");
		adtext.setEditable(false);
		adtext.setBounds(196, 528, 226, 29);
		frmEventPlanning.getContentPane().add(adtext);
		adtext.setColumns(10);
		
		lbltp = new JLabel("");
		lbltp.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\icon.png"));
		lbltp.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lbltp.setForeground(Color.WHITE);
		lbltp.setHorizontalAlignment(SwingConstants.CENTER);
		lbltp.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltp.setOpaque(true);
		lbltp.setBackground(Color.BLACK);
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
		separator.setBounds(351, 461, 264, 11);
		frmEventPlanning.getContentPane().add(separator);
		
		JLabel mob3 = new JLabel("Mobile No. 3");
		mob3.setHorizontalAlignment(SwingConstants.LEFT);
		mob3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mob3.setBounds(506, 529, 121, 23);
		frmEventPlanning.getContentPane().add(mob3);
		
		JLabel mob4 = new JLabel("Mobile No. 4");
		mob4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mob4.setBounds(506, 608, 109, 23);
		frmEventPlanning.getContentPane().add(mob4);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("9874563210");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(653, 523, 226, 29);
		frmEventPlanning.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1234567891");
		textField_1.setColumns(10);
		textField_1.setBounds(196, 607, 226, 29);
		frmEventPlanning.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setText("6547893210");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(653, 602, 226, 29);
		frmEventPlanning.getContentPane().add(textField_2);
		
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\bgpic2.jpg"));
		lblbg.setBounds(21, 389, 939, 320);
		frmEventPlanning.getContentPane().add(lblbg);
		lblbg.setOpaque(true);
		lblbg.setBackground(new Color(102, 205, 170));
	}
}
