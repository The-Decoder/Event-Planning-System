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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class View_Venue {

	private JFrame frmEventPlanning;
	private JTable Bookingtable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Venue window = new View_Venue();
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
	public View_Venue() {
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
		frmEventPlanning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventPlanning.getContentPane().setLayout(null);
	
		JButton btvenue = new JButton("Add Venue");
		btvenue.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btvenue.setFocusPainted(false);
		btvenue.setForeground(new Color(255, 255, 255));
		btvenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				Admin_Page1.main(null);
			}
		});
		btvenue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btvenue.setBackground(new Color(0, 0, 153));
		btvenue.setBounds(1, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btvenue);
		
		JButton btnNbooking = new JButton("New Bookings");
		btnNbooking.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNbooking.setFocusPainted(false);
		btnNbooking.setForeground(new Color(255, 255, 255));
		btnNbooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				New_Booking.main(null);
			}
		});
		btnNbooking.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNbooking.setBackground(new Color(0, 0, 153));
		btnNbooking.setBounds(166, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btnNbooking);
		
		JButton btnVbooking = new JButton("View Bookings");
		btnVbooking.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnVbooking.setFocusPainted(false);
		btnVbooking.setForeground(new Color(255, 255, 255));
		btnVbooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Booking.main(null);
			}
		});
		btnVbooking.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVbooking.setBackground(new Color(0, 0, 153));
		btnVbooking.setBounds(330, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btnVbooking);
		
		JButton btnVvenue = new JButton("View Venues");
		btnVvenue.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnVvenue.setFocusPainted(false);
		btnVvenue.setForeground(new Color(255, 255, 255));
		btnVvenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Venue.main(null);
			}
		});
		btnVvenue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVvenue.setBackground(new Color(0, 0, 153));
		btnVvenue.setBounds(493, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btnVvenue);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLogout.setFocusPainted(false);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home.main(null);
				frmEventPlanning.dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogout.setBackground(new Color(0, 0, 153));
		btnLogout.setBounds(821, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btnLogout);
		
		JButton btnViewFeedback = new JButton("View Feedback");
		btnViewFeedback.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnViewFeedback.setFocusPainted(false);
		btnViewFeedback.setForeground(new Color(255, 255, 255));
		btnViewFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEventPlanning.dispose();
				View_Feedback.main(null);
			}
		});
		btnViewFeedback.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnViewFeedback.setBackground(new Color(0, 0, 153));
		btnViewFeedback.setBounds(657, 20, 166, 35);
		frmEventPlanning.getContentPane().add(btnViewFeedback);
		
		JLabel lblAddVenue = new JLabel("VIEW VENUE");
		lblAddVenue.setForeground(new Color(0, 0, 0));
		lblAddVenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVenue.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblAddVenue.setBounds(359, 80, 278, 61);
		frmEventPlanning.getContentPane().add(lblAddVenue);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(388, 138, 228, 3);
		frmEventPlanning.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 1, true));
		scrollPane.setBounds(30, 222, 923, 481);
		frmEventPlanning.getContentPane().add(scrollPane);
		
		Bookingtable = new JTable();
		Bookingtable.setVisible(true);
		scrollPane.setViewportView(Bookingtable);
		
		final JButton btnView = new JButton("VIEW");
		btnView.setFocusPainted(false);
		btnView.setBackground(new Color(0, 128, 128));
		btnView.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()== btnView){
					try{
						Connect cn=new Connect();
						Connection con=cn.conn();
						
						String query="select * from ADD_VENUE";
						PreparedStatement ps1=con.prepareStatement(query);
						ResultSet rs=ps1.executeQuery();
						 Bookingtable.setModel(DbUtils.resultSetToTableModel(rs));
					}catch(Exception e){
					          e.printStackTrace();
					}
					}
				
				}
			
		});
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnView.setBounds(30, 172, 132, 31);
		frmEventPlanning.getContentPane().add(btnView);
		
	}
}
