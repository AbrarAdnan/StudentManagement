package ResultManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Search41 {

	private JFrame frame;
	private JLabel lblpartb;
	private JTextField txtc1a;
	private JTextField txtc1b;
	private JTextField txtc1m;
	private JTextField txtc1t;
	private JTextField txtc2a;
	private JTextField txtc2b;
	private JTextField txtc2t;
	private JTextField txtc3a;
	private JTextField txtc3b;
	private JTextField txtc3m;
	private JTextField txtc3t;
	private JTextField txtc2m;
	private JTextField txtsc2m;
	private JTextField txtsc3m;
	private JTextField txtsc1m;
	private JTextField txtc4a;
	private JTextField txtc4b;
	private JTextField txtc4m;
	private JTextField txtc4t;
	private JTextField txtname;
	private JTextField txtstudentid;
	private JTextField txtgpa;
	private JTextField txtc1gp;
	private JTextField txtc2gpa;
	private JTextField txtc3gpa;
	private JTextField txtc4gpa;
	private JTextField txtsc1gp;
	private JTextField txtsc2gp;
	private JTextField txtsc3gp;
	private JLabel lblartificialintelligenceandneturalcomputingse;
	private JLabel lblComputerNetworkse;
	private JLabel lbldatabasemanagementsystemse;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search41 window = new Search41();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Search41() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1214, 789);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblstdentresult = new JLabel("Student Result Management System");
		lblstdentresult.setBounds(198, 13, 395, 28);
		lblstdentresult.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblstdentresult);
		
		JLabel lbltranscript = new JLabel("Transcript");
		lbltranscript.setBounds(295, 54, 149, 35);
		lbltranscript.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lbltranscript);
		
		JLabel lblsubject = new JLabel("Subject");
		lblsubject.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsubject.setBounds(28, 102, 74, 22);
		frame.getContentPane().add(lblsubject);
		
		JLabel lblparta = new JLabel("Part A");
		lblparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblparta.setBounds(396, 102, 74, 22);
		frame.getContentPane().add(lblparta);
		
		lblpartb = new JLabel("Part B");
		lblpartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpartb.setBounds(482, 102, 74, 22);
		frame.getContentPane().add(lblpartb);
		
		JLabel lblgivenmark = new JLabel("Given Mark");
		lblgivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgivenmark.setBounds(543, 102, 102, 22);
		frame.getContentPane().add(lblgivenmark);
		
		JLabel lbltotal = new JLabel("Total");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltotal.setBounds(663, 102, 74, 22);
		frame.getContentPane().add(lbltotal);
		
		JLabel lblartificialintelligenceandneturalcomputing = new JLabel("Artificial Intelligence and Netural Computing");
		lblartificialintelligenceandneturalcomputing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblartificialintelligenceandneturalcomputing.setBounds(12, 125, 360, 28);
		frame.getContentPane().add(lblartificialintelligenceandneturalcomputing);
		
		JLabel lblcomputernetwork = new JLabel("Computer Network");
		lblcomputernetwork.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblcomputernetwork.setBounds(12, 162, 360, 32);
		frame.getContentPane().add(lblcomputernetwork);
		
		JLabel lblAddResultFor = new JLabel("Transcript For Sessional");
		lblAddResultFor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddResultFor.setBounds(217, 346, 291, 44);
		frame.getContentPane().add(lblAddResultFor);
		
		JLabel lblsubjects = new JLabel("Subject");
		lblsubjects.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsubjects.setBounds(28, 396, 74, 22);
		frame.getContentPane().add(lblsubjects);
		
		JLabel lblMark = new JLabel("Mark");
		lblMark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMark.setBounds(497, 396, 74, 22);
		frame.getContentPane().add(lblMark);
		
		txtc1a = new JTextField();
		txtc1a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1a.setBounds(384, 122, 79, 35);
		frame.getContentPane().add(txtc1a);
		txtc1a.setColumns(10);
		
		txtc1b = new JTextField();
		txtc1b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1b.setColumns(10);
		txtc1b.setBounds(470, 122, 79, 35);
		frame.getContentPane().add(txtc1b);
		
		txtc1m = new JTextField();
		txtc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1m.setColumns(10);
		txtc1m.setBounds(553, 122, 79, 35);
		frame.getContentPane().add(txtc1m);
		
		txtc1t = new JTextField();
		txtc1t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1t.setColumns(10);
		txtc1t.setBounds(642, 122, 79, 35);
		frame.getContentPane().add(txtc1t);
		
		txtc2a = new JTextField();
		txtc2a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2a.setColumns(10);
		txtc2a.setBounds(384, 161, 79, 35);
		frame.getContentPane().add(txtc2a);
		
		txtc2b = new JTextField();
		txtc2b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2b.setColumns(10);
		txtc2b.setBounds(470, 161, 79, 35);
		frame.getContentPane().add(txtc2b);
		
		txtc2t = new JTextField();
		txtc2t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2t.setColumns(10);
		txtc2t.setBounds(642, 161, 79, 35);
		frame.getContentPane().add(txtc2t);
		
		txtc3a = new JTextField();
		txtc3a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3a.setColumns(10);
		txtc3a.setBounds(384, 204, 79, 35);
		frame.getContentPane().add(txtc3a);
		
		txtc3b = new JTextField();
		txtc3b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3b.setColumns(10);
		txtc3b.setBounds(470, 204, 79, 35);
		frame.getContentPane().add(txtc3b);
		
		txtc3m = new JTextField();
		txtc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3m.setColumns(10);
		txtc3m.setBounds(553, 204, 79, 35);
		frame.getContentPane().add(txtc3m);
		
		txtc3t = new JTextField();
		txtc3t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3t.setColumns(10);
		txtc3t.setBounds(642, 209, 79, 35);
		frame.getContentPane().add(txtc3t);
		
		txtc2m = new JTextField();
		txtc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2m.setColumns(10);
		txtc2m.setBounds(553, 161, 79, 35);
		frame.getContentPane().add(txtc2m);
		
		txtsc2m = new JTextField();
		txtsc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2m.setColumns(10);
		txtsc2m.setBounds(482, 476, 79, 35);
		frame.getContentPane().add(txtsc2m);
		
		txtsc3m = new JTextField();
		txtsc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3m.setColumns(10);
		txtsc3m.setBounds(477, 524, 79, 35);
		frame.getContentPane().add(txtsc3m);
		
		txtsc1m = new JTextField();
		txtsc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1m.setColumns(10);
		txtsc1m.setBounds(482, 428, 79, 35);
		frame.getContentPane().add(txtsc1m);
		
		txtc4a = new JTextField();
		txtc4a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4a.setColumns(10);
		txtc4a.setBounds(384, 252, 79, 35);
		frame.getContentPane().add(txtc4a);
		
		txtc4b = new JTextField();
		txtc4b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4b.setColumns(10);
		txtc4b.setBounds(470, 252, 79, 35);
		frame.getContentPane().add(txtc4b);
		
		txtc4m = new JTextField();
		txtc4m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4m.setColumns(10);
		txtc4m.setBounds(553, 252, 79, 35);
		frame.getContentPane().add(txtc4m);
		
		txtc4t = new JTextField();
		txtc4t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4t.setColumns(10);
		txtc4t.setBounds(642, 257, 79, 35);
		frame.getContentPane().add(txtc4t);
		
		JLabel lblfirstname = new JLabel("Name");
		lblfirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfirstname.setBounds(829, 152, 119, 28);
		frame.getContentPane().add(lblfirstname);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtname.setColumns(10);
		txtname.setBounds(931, 152, 204, 28);
		frame.getContentPane().add(txtname);
		
		JLabel lblstudentid = new JLabel("Student ID");
		lblstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblstudentid.setBounds(702, 427, 122, 36);
		frame.getContentPane().add(lblstudentid);
		
		txtstudentid = new JTextField();
		txtstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtstudentid.setColumns(10);
		txtstudentid.setBounds(829, 431, 204, 28);
		frame.getContentPane().add(txtstudentid);
		
		JLabel lblgpa = new JLabel("GPA");
		lblgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgpa.setBounds(839, 203, 122, 36);
		frame.getContentPane().add(lblgpa);
		
		txtgpa = new JTextField();
		txtgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtgpa.setColumns(10);
		txtgpa.setBounds(931, 207, 204, 28);
		frame.getContentPane().add(txtgpa);
		
		JButton btnexit = new JButton("Main Menu");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnexit.setBounds(1047, 496, 137, 63);
		frame.getContentPane().add(btnexit);
		
		txtc1gp = new JTextField();
		txtc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1gp.setColumns(10);
		txtc1gp.setBounds(733, 122, 79, 35);
		frame.getContentPane().add(txtc1gp);
		
		txtc2gpa = new JTextField();
		txtc2gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2gpa.setColumns(10);
		txtc2gpa.setBounds(733, 161, 79, 35);
		frame.getContentPane().add(txtc2gpa);
		
		txtc3gpa = new JTextField();
		txtc3gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3gpa.setColumns(10);
		txtc3gpa.setBounds(733, 204, 79, 35);
		frame.getContentPane().add(txtc3gpa);
		
		txtc4gpa = new JTextField();
		txtc4gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4gpa.setColumns(10);
		txtc4gpa.setBounds(733, 252, 79, 35);
		frame.getContentPane().add(txtc4gpa);
		
		JLabel lblGpa = new JLabel("Grade Point");
		lblGpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa.setBounds(723, 102, 112, 22);
		frame.getContentPane().add(lblGpa);
		
		JLabel lblGpa_1 = new JLabel("Grade Point");
		lblGpa_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa_1.setBounds(583, 396, 112, 22);
		frame.getContentPane().add(lblGpa_1);
		
		txtsc1gp = new JTextField();
		txtsc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1gp.setColumns(10);
		txtsc1gp.setBounds(611, 431, 79, 35);
		frame.getContentPane().add(txtsc1gp);
		
		txtsc2gp = new JTextField();
		txtsc2gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2gp.setColumns(10);
		txtsc2gp.setBounds(611, 476, 79, 35);
		frame.getContentPane().add(txtsc2gp);
		
		txtsc3gp = new JTextField();
		txtsc3gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3gp.setColumns(10);
		txtsc3gp.setBounds(616, 524, 79, 35);
		frame.getContentPane().add(txtsc3gp);
		
		JLabel lbldatabasemanagementsystem = new JLabel("Database Management System");
		lbldatabasemanagementsystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbldatabasemanagementsystem.setBounds(12, 205, 360, 32);
		frame.getContentPane().add(lbldatabasemanagementsystem);
		
		JLabel lbloptional1 = new JLabel("Optional1");
		lbloptional1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbloptional1.setBounds(12, 253, 360, 32);
		frame.getContentPane().add(lbloptional1);
		
		lblartificialintelligenceandneturalcomputingse = new JLabel("Artificial Intelligence and Netural Computing Se");
		lblartificialintelligenceandneturalcomputingse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblartificialintelligenceandneturalcomputingse.setBounds(12, 431, 458, 28);
		frame.getContentPane().add(lblartificialintelligenceandneturalcomputingse);
		
		lblComputerNetworkse = new JLabel("Computer Network Se");
		lblComputerNetworkse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblComputerNetworkse.setBounds(12, 463, 360, 32);
		frame.getContentPane().add(lblComputerNetworkse);
		
		lbldatabasemanagementsystemse = new JLabel("Database Management System Se");
		lbldatabasemanagementsystemse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbldatabasemanagementsystemse.setBounds(12, 503, 360, 32);
		frame.getContentPane().add(lbldatabasemanagementsystemse);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					
					ResultSet rs=stmt.executeQuery("select * from studentinfo41 where id='"+txtstudentid.getText()+"'");
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Data found","Alert",JOptionPane.PLAIN_MESSAGE);
						txtname.setText(rs.getString("name"));
						txtstudentid.setText(rs.getString("id"));
						txtgpa.setText(rs.getString("gpa"));
						txtc1a.setText(rs.getString("c1a"));
						txtc1b.setText(rs.getString("c1b"));
						txtc1m.setText(rs.getString("c1m"));
						txtc1t.setText(rs.getString("c1t"));
						txtc1gp.setText(rs.getString("c1gp"));
						
						
						txtc2a.setText(rs.getString("c2a"));
						txtc2b.setText(rs.getString("c2b"));
						txtc2m.setText(rs.getString("c2m"));
						txtc2t.setText(rs.getString("c2t"));
						txtc2gpa.setText(rs.getString("c2gp"));
						
						
						txtc3a.setText(rs.getString("c3a"));
						txtc3b.setText(rs.getString("c3b"));
						txtc3m.setText(rs.getString("c3m"));
						txtc3t.setText(rs.getString("c3t"));
						txtc3gpa.setText(rs.getString("c3gp"));
						
						
						txtc4a.setText(rs.getString("c4a"));
						txtc4b.setText(rs.getString("c4b"));
						txtc4m.setText(rs.getString("c4m"));
						txtc4t.setText(rs.getString("c4t"));
						txtc4gpa.setText(rs.getString("c4gp"));
						
						txtsc1m.setText(rs.getString("sc1m"));
						txtsc1gp.setText(rs.getString("sc1gp"));
						txtsc2m.setText(rs.getString("sc2m"));
						txtsc2gp.setText(rs.getString("sc2gp"));
						txtsc3m.setText(rs.getString("sc3m"));
						txtsc3gp.setText(rs.getString("sc3gp"));
					}
					
					else
						JOptionPane.showMessageDialog(null, "Not Found");
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(1045, 414, 137, 63);
		frame.getContentPane().add(btnSearch);
	}
}