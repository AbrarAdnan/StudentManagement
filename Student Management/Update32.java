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

public class Update32 {

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
	private JTextField txtsc4m;
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
	private JTextField txtsc4gp;
	private JTextField txtc5a;
	private JTextField txtc5b;
	private JTextField txtc5m;
	private JTextField txtc5t;
	private JTextField txtc5gpa;
	private JLabel lblswitchingandroutingse;
	private JLabel lblclintservertechnologyse;
	private JLabel lblinformationsystemanalysisse;
	private JLabel lblEcommerceegovernancese;
	private JTextField txtsc5m;
	private JTextField txtsc5gp;
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update32 window = new Update32();
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
	public Update32() {
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
		lblparta.setBounds(295, 102, 74, 22);
		frame.getContentPane().add(lblparta);
		
		lblpartb = new JLabel("Part B");
		lblpartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpartb.setBounds(396, 102, 74, 22);
		frame.getContentPane().add(lblpartb);
		
		JLabel lblgivenmark = new JLabel("Given Mark");
		lblgivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgivenmark.setBounds(472, 102, 102, 22);
		frame.getContentPane().add(lblgivenmark);
		
		JLabel lbltotal = new JLabel("Total");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltotal.setBounds(586, 102, 74, 22);
		frame.getContentPane().add(lbltotal);
		
		JLabel lblcomputerarchitecture = new JLabel("Computer Architecture");
		lblcomputerarchitecture.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblcomputerarchitecture.setBounds(12, 125, 258, 28);
		frame.getContentPane().add(lblcomputerarchitecture);
		
		JLabel lblswitchingandrouting = new JLabel("Switching and Routing");
		lblswitchingandrouting.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblswitchingandrouting.setBounds(12, 162, 241, 32);
		frame.getContentPane().add(lblswitchingandrouting);
		
		JLabel lblopticfiberse = new JLabel("Computer Architecture Se");
		lblopticfiberse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblopticfiberse.setBounds(12, 431, 258, 28);
		frame.getContentPane().add(lblopticfiberse);
		
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
		lblMark.setBounds(358, 396, 74, 22);
		frame.getContentPane().add(lblMark);
		
		txtc1a = new JTextField();
		txtc1a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1a.setBounds(290, 122, 79, 35);
		frame.getContentPane().add(txtc1a);
		txtc1a.setColumns(10);
		
		txtc1b = new JTextField();
		txtc1b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1b.setColumns(10);
		txtc1b.setBounds(396, 122, 79, 35);
		frame.getContentPane().add(txtc1b);
		
		txtc1m = new JTextField();
		txtc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1m.setColumns(10);
		txtc1m.setBounds(495, 122, 79, 35);
		frame.getContentPane().add(txtc1m);
		
		txtc1t = new JTextField();
		txtc1t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1t.setColumns(10);
		txtc1t.setBounds(586, 122, 79, 35);
		frame.getContentPane().add(txtc1t);
		
		txtc2a = new JTextField();
		txtc2a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2a.setColumns(10);
		txtc2a.setBounds(290, 161, 79, 35);
		frame.getContentPane().add(txtc2a);
		
		txtc2b = new JTextField();
		txtc2b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2b.setColumns(10);
		txtc2b.setBounds(396, 161, 79, 35);
		frame.getContentPane().add(txtc2b);
		
		txtc2t = new JTextField();
		txtc2t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2t.setColumns(10);
		txtc2t.setBounds(586, 161, 79, 35);
		frame.getContentPane().add(txtc2t);
		
		txtc3a = new JTextField();
		txtc3a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3a.setColumns(10);
		txtc3a.setBounds(290, 204, 79, 35);
		frame.getContentPane().add(txtc3a);
		
		txtc3b = new JTextField();
		txtc3b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3b.setColumns(10);
		txtc3b.setBounds(396, 204, 79, 35);
		frame.getContentPane().add(txtc3b);
		
		txtc3m = new JTextField();
		txtc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3m.setColumns(10);
		txtc3m.setBounds(495, 204, 79, 35);
		frame.getContentPane().add(txtc3m);
		
		txtc3t = new JTextField();
		txtc3t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3t.setColumns(10);
		txtc3t.setBounds(586, 204, 79, 35);
		frame.getContentPane().add(txtc3t);
		
		txtc2m = new JTextField();
		txtc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2m.setColumns(10);
		txtc2m.setBounds(495, 161, 79, 35);
		frame.getContentPane().add(txtc2m);
		
		txtsc2m = new JTextField();
		txtsc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2m.setColumns(10);
		txtsc2m.setBounds(365, 472, 79, 35);
		frame.getContentPane().add(txtsc2m);
		
		txtsc3m = new JTextField();
		txtsc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3m.setColumns(10);
		txtsc3m.setBounds(365, 520, 79, 35);
		frame.getContentPane().add(txtsc3m);
		
		txtsc1m = new JTextField();
		txtsc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1m.setColumns(10);
		txtsc1m.setBounds(365, 428, 79, 35);
		frame.getContentPane().add(txtsc1m);
		
		txtsc4m = new JTextField();
		txtsc4m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc4m.setColumns(10);
		txtsc4m.setBounds(365, 568, 79, 35);
		frame.getContentPane().add(txtsc4m);
		
		txtc4a = new JTextField();
		txtc4a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4a.setColumns(10);
		txtc4a.setBounds(290, 252, 79, 35);
		frame.getContentPane().add(txtc4a);
		
		txtc4b = new JTextField();
		txtc4b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4b.setColumns(10);
		txtc4b.setBounds(396, 252, 79, 35);
		frame.getContentPane().add(txtc4b);
		
		txtc4m = new JTextField();
		txtc4m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4m.setColumns(10);
		txtc4m.setBounds(495, 252, 79, 35);
		frame.getContentPane().add(txtc4m);
		
		txtc4t = new JTextField();
		txtc4t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4t.setColumns(10);
		txtc4t.setBounds(586, 252, 79, 35);
		frame.getContentPane().add(txtc4t);
		
		JLabel lblfirstname = new JLabel("Name");
		lblfirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfirstname.setBounds(797, 152, 119, 28);
		frame.getContentPane().add(lblfirstname);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtname.setColumns(10);
		txtname.setBounds(909, 152, 204, 28);
		frame.getContentPane().add(txtname);
		
		JLabel lblstudentid = new JLabel("Student ID");
		lblstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblstudentid.setBounds(612, 488, 122, 36);
		frame.getContentPane().add(lblstudentid);
		
		txtstudentid = new JTextField();
		txtstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtstudentid.setColumns(10);
		txtstudentid.setBounds(746, 492, 204, 28);
		frame.getContentPane().add(txtstudentid);
		
		JLabel lblgpa = new JLabel("GPA");
		lblgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgpa.setBounds(825, 297, 122, 36);
		frame.getContentPane().add(lblgpa);
		
		txtgpa = new JTextField();
		txtgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtgpa.setColumns(10);
		txtgpa.setBounds(895, 308, 204, 28);
		frame.getContentPane().add(txtgpa);
		
		JButton btnexit = new JButton("Main Menu");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnexit.setBounds(978, 597, 137, 63);
		frame.getContentPane().add(btnexit);
		
		txtc1gp = new JTextField();
		txtc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1gp.setColumns(10);
		txtc1gp.setBounds(672, 122, 79, 35);
		frame.getContentPane().add(txtc1gp);
		
		txtc2gpa = new JTextField();
		txtc2gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2gpa.setColumns(10);
		txtc2gpa.setBounds(672, 161, 79, 35);
		frame.getContentPane().add(txtc2gpa);
		
		txtc3gpa = new JTextField();
		txtc3gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3gpa.setColumns(10);
		txtc3gpa.setBounds(672, 204, 79, 35);
		frame.getContentPane().add(txtc3gpa);
		
		txtc4gpa = new JTextField();
		txtc4gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4gpa.setColumns(10);
		txtc4gpa.setBounds(672, 252, 79, 35);
		frame.getContentPane().add(txtc4gpa);
		
		JLabel lblGpa = new JLabel("Grade Point");
		lblGpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa.setBounds(657, 102, 112, 22);
		frame.getContentPane().add(lblGpa);
		
		JLabel lblGpa_1 = new JLabel("Grade Point");
		lblGpa_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa_1.setBounds(444, 396, 112, 22);
		frame.getContentPane().add(lblGpa_1);
		
		txtsc1gp = new JTextField();
		txtsc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1gp.setColumns(10);
		txtsc1gp.setBounds(459, 424, 79, 35);
		frame.getContentPane().add(txtsc1gp);
		
		txtsc2gp = new JTextField();
		txtsc2gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2gp.setColumns(10);
		txtsc2gp.setBounds(459, 472, 79, 35);
		frame.getContentPane().add(txtsc2gp);
		
		txtsc3gp = new JTextField();
		txtsc3gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3gp.setColumns(10);
		txtsc3gp.setBounds(459, 520, 79, 35);
		frame.getContentPane().add(txtsc3gp);
		
		txtsc4gp = new JTextField();
		txtsc4gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc4gp.setColumns(10);
		txtsc4gp.setBounds(459, 568, 79, 35);
		frame.getContentPane().add(txtsc4gp);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					
					ResultSet rs=stmt.executeQuery("select * from studentinfo32 where id='"+txtstudentid.getText()+"'");
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
						
				
						txtc5a.setText(rs.getString("c5a"));
						txtc5b.setText(rs.getString("c5b"));
						txtc5m.setText(rs.getString("c5m"));
						txtc5t.setText(rs.getString("c5t"));
						txtc5gpa.setText(rs.getString("c5gp"));
						
						txtsc1m.setText(rs.getString("sc1m"));
						txtsc1gp.setText(rs.getString("sc1gp"));
						txtsc2m.setText(rs.getString("sc2m"));
						txtsc2gp.setText(rs.getString("sc2gp"));
						txtsc3m.setText(rs.getString("sc3m"));
						txtsc3gp.setText(rs.getString("sc3gp"));
						txtsc4m.setText(rs.getString("sc4m"));
						txtsc4gp.setText(rs.getString("sc4gp"));
						txtsc5m.setText(rs.getString("sc5m"));
						txtsc5gp.setText(rs.getString("sc5gp"));
					}
					
					else
						JOptionPane.showMessageDialog(null, "Not Found");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(976, 475, 137, 63);
		frame.getContentPane().add(btnSearch);
		
		JLabel lblclintservertechnology = new JLabel("Clint Server Technology");
		lblclintservertechnology.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblclintservertechnology.setBounds(12, 205, 241, 32);
		frame.getContentPane().add(lblclintservertechnology);
		
		JLabel lblinformationsystemanalysis = new JLabel("Information System Analysis and Design");
		lblinformationsystemanalysis.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblinformationsystemanalysis.setBounds(12, 253, 279, 32);
		frame.getContentPane().add(lblinformationsystemanalysis);
		
		JLabel lblecommerceegovernance = new JLabel("E-commerce & E-governance");
		lblecommerceegovernance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblecommerceegovernance.setBounds(12, 297, 279, 36);
		frame.getContentPane().add(lblecommerceegovernance);
		
		txtc5a = new JTextField();
		txtc5a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5a.setColumns(10);
		txtc5a.setBounds(290, 300, 79, 35);
		frame.getContentPane().add(txtc5a);
		
		txtc5b = new JTextField();
		txtc5b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5b.setColumns(10);
		txtc5b.setBounds(396, 298, 79, 35);
		frame.getContentPane().add(txtc5b);
		
		txtc5m = new JTextField();
		txtc5m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5m.setColumns(10);
		txtc5m.setBounds(495, 300, 79, 35);
		frame.getContentPane().add(txtc5m);
		
		txtc5t = new JTextField();
		txtc5t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5t.setColumns(10);
		txtc5t.setBounds(586, 300, 79, 35);
		frame.getContentPane().add(txtc5t);
		
		txtc5gpa = new JTextField();
		txtc5gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5gpa.setColumns(10);
		txtc5gpa.setBounds(672, 298, 79, 35);
		frame.getContentPane().add(txtc5gpa);
		
		lblswitchingandroutingse = new JLabel("Switching and Routing Se");
		lblswitchingandroutingse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblswitchingandroutingse.setBounds(12, 472, 241, 32);
		frame.getContentPane().add(lblswitchingandroutingse);
		
		lblclintservertechnologyse = new JLabel("Clint Server Technology Se");
		lblclintservertechnologyse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblclintservertechnologyse.setBounds(12, 521, 241, 32);
		frame.getContentPane().add(lblclintservertechnologyse);
		
		lblinformationsystemanalysisse = new JLabel("Information System Analysis and Design Se");
		lblinformationsystemanalysisse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblinformationsystemanalysisse.setBounds(12, 565, 323, 32);
		frame.getContentPane().add(lblinformationsystemanalysisse);
		
		lblEcommerceegovernancese = new JLabel("E-commerce & E-governance Se");
		lblEcommerceegovernancese.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEcommerceegovernancese.setBounds(12, 610, 323, 36);
		frame.getContentPane().add(lblEcommerceegovernancese);
		
		txtsc5m = new JTextField();
		txtsc5m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc5m.setColumns(10);
		txtsc5m.setBounds(365, 616, 79, 35);
		frame.getContentPane().add(txtsc5m);
		
		txtsc5gp = new JTextField();
		txtsc5gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc5gp.setColumns(10);
		txtsc5gp.setBounds(459, 616, 79, 35);
		frame.getContentPane().add(txtsc5gp);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String c1a,c1b,c1m,c1t,c1gp,c2a,c2b,c2m,c2t,c2gp,c3a,c3b,c3m,c3t,c3gp,c4a,c4b,c4m,c4t,c4gp,c5a,c5b,c5m,c5t,c5gp,sc1m,sc1gp,sc2m,sc2gp,sc3m,sc3gp,sc4m,sc4gp,sc5m,sc5gp,id,name,gpa;
				name=txtname.getText();
				id=txtstudentid.getText();
				c1a=txtc1a.getText();
				c1b=txtc1b.getText();
				c1m=txtc1m.getText();
				c1t=txtc1t.getText();
				c1gp=txtc1gp.getText();
				c2a=txtc2a.getText();
				c2b=txtc2b.getText();
				c2m=txtc2m.getText();
				c2t=txtc2t.getText();
				c2gp=txtc2gpa.getText();
				c3a=txtc3a.getText();
				c3b=txtc3b.getText();
				c3m=txtc3m.getText();
				c3t=txtc3t.getText();
				c3gp=txtc3gpa.getText();
				c4a=txtc4a.getText();
				c4b=txtc4b.getText();
				c4m=txtc4m.getText();
				c4t=txtc4t.getText();
				c4gp=txtc4gpa.getText();
				c5a=txtc5a.getText();
				c5b=txtc5b.getText();
				c5m=txtc5m.getText();
				c5t=txtc5t.getText();
				c5gp=txtc5gpa.getText();
				gpa=txtgpa.getText();
				sc1m=txtsc1m.getText();
				sc1gp=txtsc1gp.getText();
				sc2m=txtsc2m.getText();
				sc2gp=txtsc2gp.getText();
				sc3m=txtsc3m.getText();
				sc3gp=txtsc3gp.getText();
				sc4m=txtsc4m.getText();
				sc4gp=txtsc4gp.getText();
				sc5m=txtsc5m.getText();
				sc5gp=txtsc5gp.getText();
				
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					stmt.executeUpdate("DELETE from studentinfo32 where id = '"+txtstudentid.getText()+"'");
					stmt.executeUpdate("insert into studentinfo32 values('"+name+"','"+id+"','"+gpa+"'," + 
							"'"+c1a+"','"+c1b+"','"+c1m+"','"+c1t+"','"+c1gp+"','"+c2a+"','"+c2b+"','"+c2m+"','"+c2t+"','"+c2gp+"','"+c3a+"','"+c3b+"','"+c3m+"','"+c3t+"','"+c3gp+"'," + 
							"'"+c4a+"','"+c4b+"','"+c4m+"','"+c4t+"','"+c4gp+"','"+c5a+"','"+c5b+"','"+c5m+"','"+c5t+"','"+c5gp+"','"+sc1m+"','"+sc1gp+"','"+sc2m+"','"+sc2gp+"','"+sc3m+"'," + 
							"'"+sc3gp+"','"+sc4m+"','"+sc4gp+"','"+sc5m+"','"+sc5gp+"')");
					JOptionPane.showMessageDialog(null, "ID Updated");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(746, 597, 137, 63);
		frame.getContentPane().add(btnUpdate);
	}
}