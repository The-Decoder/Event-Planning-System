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
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JList;

import net.proteanit.sql.DbUtils;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Admin_Page1 {

	private JFrame frmEventPlanning;
	 private String[] images ={"1.jpg","2.jpg","3.png","4.jpg","5.jpg","6.jpg"};
	private JTextField tfname;
	private JTextField tfphn;
	private JTextField tfcap;
	private JTextField tfrs;
	private JComboBox combobox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Page1 window = new Admin_Page1();
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
	public Admin_Page1() {
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
		frmEventPlanning.setLocationRelativeTo(null);
		frmEventPlanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEventPlanning.getContentPane().setLayout(null);
		frmEventPlanning.setResizable(false);
	
		JButton btvenue = new JButton("Add Venue");
		btvenue.setForeground(new Color(255, 255, 255));
		btvenue.setFocusPainted(false);
		btvenue.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btvenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Admin_Page1.main(null);
				
			}
		});
		btvenue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btvenue.setBackground(new Color(0, 0, 153));
		btvenue.setBounds(1, 330, 166, 35);
		frmEventPlanning.getContentPane().add(btvenue);
		
		final JButton btnNbooking = new JButton("New Bookings");
		btnNbooking.setForeground(new Color(255, 255, 255));
		btnNbooking.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNbooking.setFocusPainted(false);
		btnNbooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frmEventPlanning.dispose();
				New_Booking.main(null);
			
			}});
		btnNbooking.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNbooking.setBackground(new Color(0, 0, 153));
		btnNbooking.setBounds(166, 330, 166, 35);
		frmEventPlanning.getContentPane().add(btnNbooking);
		
		JButton btnVbooking = new JButton("View Bookings");
		btnVbooking.setForeground(new Color(255, 255, 255));
		btnVbooking.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnVbooking.setFocusPainted(false);
		btnVbooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Booking.main(null);
			}
		});
		btnVbooking.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVbooking.setBackground(new Color(0, 0, 153));
		btnVbooking.setBounds(330, 330, 166, 35);
		frmEventPlanning.getContentPane().add(btnVbooking);
		
		JButton btnVvenue = new JButton("View Venues");
		btnVvenue.setForeground(new Color(255, 255, 255));
		btnVvenue.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnVvenue.setFocusPainted(false);
		btnVvenue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVvenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Venue.main(null);
			}
		});
		btnVvenue.setBackground(new Color(0, 0, 153));
		btnVvenue.setBounds(493, 330, 166, 35);
		frmEventPlanning.getContentPane().add(btnVvenue);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLogout.setFocusPainted(false);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home.main(null);
				frmEventPlanning.dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogout.setBackground(new Color(0, 0, 153));
		btnLogout.setBounds(822, 330, 171, 35);
		frmEventPlanning.getContentPane().add(btnLogout);
		
		JButton btnViewFeedback = new JButton("View Feedback");
		btnViewFeedback.setForeground(new Color(255, 255, 255));
		btnViewFeedback.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnViewFeedback.setFocusPainted(false);
		btnViewFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Feedback.main(null);
			}
		});
		btnViewFeedback.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnViewFeedback.setBackground(new Color(0, 0, 153));
		btnViewFeedback.setBounds(657, 330, 166, 35);
		frmEventPlanning.getContentPane().add(btnViewFeedback);
		
		JLabel lblAddVenue = new JLabel("ADD VENUE");
		lblAddVenue.setForeground(new Color(0, 0, 0));
		lblAddVenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVenue.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblAddVenue.setBounds(380, 393, 214, 61);
		frmEventPlanning.getContentPane().add(lblAddVenue);
		
		JLabel lblVenueName = new JLabel("Venue Name");
		lblVenueName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVenueName.setHorizontalAlignment(SwingConstants.LEFT);
		lblVenueName.setBounds(50, 490, 121, 23);
		frmEventPlanning.getContentPane().add(lblVenueName);
		
		JLabel lblVenueAddress = new JLabel("Venue Address");
		lblVenueAddress.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVenueAddress.setBounds(50, 540, 121, 23);
		frmEventPlanning.getContentPane().add(lblVenueAddress);
		
		JLabel lblVenuePhoneNo = new JLabel("Venue Phone No.");
		lblVenuePhoneNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVenuePhoneNo.setBounds(50, 630, 136, 23);
		frmEventPlanning.getContentPane().add(lblVenuePhoneNo);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCapacity.setBounds(520, 490, 85, 23);
		frmEventPlanning.getContentPane().add(lblCapacity);
		
		JLabel lblPreferedFor = new JLabel("Prefered For");
		lblPreferedFor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPreferedFor.setBounds(520, 540, 121, 23);
		frmEventPlanning.getContentPane().add(lblPreferedFor);
		
		JLabel lblRs = new JLabel("Rs");
		lblRs.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblRs.setBounds(520, 590, 85, 23);
		frmEventPlanning.getContentPane().add(lblRs);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(480, 470, 2, 228);
		frmEventPlanning.getContentPane().add(separator);
		
		tfname = new JTextField();
		tfname.setBounds(200, 490, 226, 29);
		frmEventPlanning.getContentPane().add(tfname);
		tfname.setColumns(10);
		
		final JTextArea taadd = new JTextArea();
		taadd.setBounds(200, 540, 226, 61);
		frmEventPlanning.getContentPane().add(taadd);
		
		tfphn = new JTextField();
		tfphn.setColumns(10);
		tfphn.setBounds(200, 625, 226, 29);
		frmEventPlanning.getContentPane().add(tfphn);
		
		tfcap = new JTextField();
		tfcap.setColumns(10);
		tfcap.setBounds(670, 484, 226, 29);
		frmEventPlanning.getContentPane().add(tfcap);
		
		tfrs = new JTextField();
		tfrs.setColumns(10);
		tfrs.setBounds(670, 584, 226, 29);
		frmEventPlanning.getContentPane().add(tfrs);
		
		final JLabel lbltp = new JLabel("");
		lbltp.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\icon.png"));
		lbltp.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lbltp.setForeground(Color.WHITE);
		lbltp.setHorizontalAlignment(SwingConstants.CENTER);
		lbltp.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltp.setOpaque(true);
		lbltp.setBackground(Color.BLACK);
		lbltp.setBounds(1, 1, 990, 320);
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
		
		final JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(0, 128, 128));
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btnAdd){
					try{
						Connect cn=new Connect();
					    Connection con=cn.conn();
					    String vprefer=combobox.getSelectedItem().toString();
					    String vname=tfname.getText();
					    String vaddress=taadd.getText();
					    int vphn=Integer.parseInt(tfphn.getText());
					    int vcap=Integer.parseInt(tfcap.getText());
					    int vrs=Integer.parseInt(tfrs.getText());
					    PreparedStatement ps=con.prepareStatement("insert into ADD_VENUE values(?,?,?,?,?,?)");
						ps.setString(1,vname);
						ps.setString(2,vaddress);
						ps.setInt(3,vphn);
						ps.setInt(4,vcap);
						ps.setString(5,vprefer);
						ps.setInt(6,vrs);
						int i=ps.executeUpdate();
						if(i==1)
						{
							JOptionPane.showMessageDialog(null, "ADDED Venue Successfully !!");
						}
					}catch(Exception e){
						   JOptionPane.showMessageDialog(null, " Unsuccessful Operation !!");
						e.printStackTrace();
					}
				}
				
		}});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBounds(770, 654, 126, 35);
		frmEventPlanning.getContentPane().add(btnAdd);
		
	    combobox = new JComboBox();
		combobox.addItem("All");
		combobox.addItem("Marriage");
		combobox.addItem("Breakup Party");
		combobox.addItem("Family Function");
		combobox.addItem("Birthday Party");
		combobox.addItem("Farewell Party");
		combobox.addItem("Anniversary Party");
		combobox.addItem("College Events");
		combobox.setBounds(670, 534, 226, 29);
		frmEventPlanning.getContentPane().add(combobox);
		
		
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\Prateek\\Desktop\\project\\bgpic2.jpg"));
		lblbg.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblbg.setBounds(20, 391, 940, 320);
		frmEventPlanning.getContentPane().add(lblbg);
		lblbg.setOpaque(true);
		lblbg.setBackground(new Color(102, 205, 170));
	}
}
