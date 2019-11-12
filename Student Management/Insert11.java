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
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Insert11 {

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
	private JLabel lblfundamentalofinformationandcommunicationse;
	private JLabel lblectronicsse;
	private JLabel lblphysicsse;
	private JLabel lbltechnicalandcommunicativeenglishse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert11 window = new Insert11();
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
	public Insert11() {
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
		
		JLabel lbltranscript11 = new JLabel("Transcript 11");
		lbltranscript11.setBounds(295, 54, 149, 35);
		lbltranscript11.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lbltranscript11);
		
		JLabel lblsubject = new JLabel("Subject");
		lblsubject.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsubject.setBounds(28, 102, 74, 22);
		frame.getContentPane().add(lblsubject);
		
		JLabel lblparta = new JLabel("Part A");
		lblparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblparta.setBounds(462, 102, 74, 22);
		frame.getContentPane().add(lblparta);
		
		lblpartb = new JLabel("Part B");
		lblpartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpartb.setBounds(548, 102, 74, 22);
		frame.getContentPane().add(lblpartb);
		
		JLabel lblgivenmark = new JLabel("Given Mark");
		lblgivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgivenmark.setBounds(622, 102, 102, 22);
		frame.getContentPane().add(lblgivenmark);
		
		JLabel lbltotal = new JLabel("Total");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltotal.setBounds(736, 102, 74, 22);
		frame.getContentPane().add(lbltotal);
		
		JLabel lblfundamentalofinformationandcommunication = new JLabel("Fundamental of Information and Communication ");
		lblfundamentalofinformationandcommunication.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfundamentalofinformationandcommunication.setBounds(12, 125, 441, 28);
		frame.getContentPane().add(lblfundamentalofinformationandcommunication);
		
		JLabel lblelectronics = new JLabel("Electronics");
		lblelectronics.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblelectronics.setBounds(12, 162, 241, 32);
		frame.getContentPane().add(lblelectronics);
		
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
		lblMark.setBounds(586, 396, 74, 22);
		frame.getContentPane().add(lblMark);
		
		txtc1a = new JTextField();
		txtc1a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1a.setBounds(459, 122, 79, 35);
		frame.getContentPane().add(txtc1a);
		txtc1a.setColumns(10);
		
		txtc1b = new JTextField();
		txtc1b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1b.setColumns(10);
		txtc1b.setBounds(548, 122, 79, 35);
		frame.getContentPane().add(txtc1b);
		
		txtc1m = new JTextField();
		txtc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1m.setColumns(10);
		txtc1m.setBounds(632, 122, 79, 35);
		frame.getContentPane().add(txtc1m);
		
		txtc1t = new JTextField();
		txtc1t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1t.setColumns(10);
		txtc1t.setBounds(718, 122, 79, 35);
		frame.getContentPane().add(txtc1t);
		
		txtc2a = new JTextField();
		txtc2a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2a.setColumns(10);
		txtc2a.setBounds(459, 166, 79, 35);
		frame.getContentPane().add(txtc2a);
		
		txtc2b = new JTextField();
		txtc2b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2b.setColumns(10);
		txtc2b.setBounds(548, 161, 79, 35);
		frame.getContentPane().add(txtc2b);
		
		txtc2t = new JTextField();
		txtc2t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2t.setColumns(10);
		txtc2t.setBounds(718, 161, 79, 35);
		frame.getContentPane().add(txtc2t);
		
		txtc3a = new JTextField();
		txtc3a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3a.setColumns(10);
		txtc3a.setBounds(459, 209, 79, 35);
		frame.getContentPane().add(txtc3a);
		
		txtc3b = new JTextField();
		txtc3b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3b.setColumns(10);
		txtc3b.setBounds(548, 209, 79, 35);
		frame.getContentPane().add(txtc3b);
		
		txtc3m = new JTextField();
		txtc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3m.setColumns(10);
		txtc3m.setBounds(632, 209, 79, 35);
		frame.getContentPane().add(txtc3m);
		
		txtc3t = new JTextField();
		txtc3t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3t.setColumns(10);
		txtc3t.setBounds(718, 209, 79, 35);
		frame.getContentPane().add(txtc3t);
		
		txtc2m = new JTextField();
		txtc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2m.setColumns(10);
		txtc2m.setBounds(632, 161, 79, 35);
		frame.getContentPane().add(txtc2m);
		
		txtsc2m = new JTextField();
		txtsc2m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2m.setColumns(10);
		txtsc2m.setBounds(560, 476, 79, 35);
		frame.getContentPane().add(txtsc2m);
		
		txtsc3m = new JTextField();
		txtsc3m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3m.setColumns(10);
		txtsc3m.setBounds(560, 524, 79, 35);
		frame.getContentPane().add(txtsc3m);
		
		txtsc1m = new JTextField();
		txtsc1m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1m.setColumns(10);
		txtsc1m.setBounds(560, 428, 79, 35);
		frame.getContentPane().add(txtsc1m);
		
		txtsc4m = new JTextField();
		txtsc4m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc4m.setColumns(10);
		txtsc4m.setBounds(560, 578, 79, 35);
		frame.getContentPane().add(txtsc4m);
		
		txtc4a = new JTextField();
		txtc4a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4a.setColumns(10);
		txtc4a.setBounds(457, 252, 79, 35);
		frame.getContentPane().add(txtc4a);
		
		txtc4b = new JTextField();
		txtc4b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4b.setColumns(10);
		txtc4b.setBounds(548, 252, 79, 35);
		frame.getContentPane().add(txtc4b);
		
		txtc4m = new JTextField();
		txtc4m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4m.setColumns(10);
		txtc4m.setBounds(632, 252, 79, 35);
		frame.getContentPane().add(txtc4m);
		
		txtc4t = new JTextField();
		txtc4t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4t.setColumns(10);
		txtc4t.setBounds(718, 252, 79, 35);
		frame.getContentPane().add(txtc4t);
		
		JLabel lblfirstname = new JLabel("Name");
		lblfirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfirstname.setBounds(892, 138, 119, 28);
		frame.getContentPane().add(lblfirstname);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtname.setColumns(10);
		txtname.setBounds(992, 138, 204, 28);
		frame.getContentPane().add(txtname);
		
		JLabel lblstudentid = new JLabel("Student ID");
		lblstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblstudentid.setBounds(892, 189, 122, 36);
		frame.getContentPane().add(lblstudentid);
		
		txtstudentid = new JTextField();
		txtstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtstudentid.setColumns(10);
		txtstudentid.setBounds(992, 193, 204, 28);
		frame.getContentPane().add(txtstudentid);
		
		JLabel lblgpa = new JLabel("GPA");
		lblgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgpa.setBounds(912, 251, 122, 36);
		frame.getContentPane().add(lblgpa);
		
		txtgpa = new JTextField();
		txtgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtgpa.setColumns(10);
		txtgpa.setBounds(992, 255, 204, 28);
		frame.getContentPane().add(txtgpa);
		
		JButton btnexit = new JButton("Main Menu");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnexit.setBounds(828, 472, 137, 63);
		frame.getContentPane().add(btnexit);
		
		txtc1gp = new JTextField();
		txtc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc1gp.setColumns(10);
		txtc1gp.setBounds(801, 122, 79, 35);
		frame.getContentPane().add(txtc1gp);
		
		txtc2gpa = new JTextField();
		txtc2gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc2gpa.setColumns(10);
		txtc2gpa.setBounds(801, 161, 79, 35);
		frame.getContentPane().add(txtc2gpa);
		
		txtc3gpa = new JTextField();
		txtc3gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc3gpa.setColumns(10);
		txtc3gpa.setBounds(801, 209, 79, 35);
		frame.getContentPane().add(txtc3gpa);
		
		txtc4gpa = new JTextField();
		txtc4gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc4gpa.setColumns(10);
		txtc4gpa.setBounds(798, 252, 79, 35);
		frame.getContentPane().add(txtc4gpa);
		
		JLabel lblGpa = new JLabel("Grade Point");
		lblGpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa.setBounds(801, 102, 112, 22);
		frame.getContentPane().add(lblGpa);
		
		JLabel lblGpa_1 = new JLabel("Grade Point");
		lblGpa_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa_1.setBounds(672, 396, 112, 22);
		frame.getContentPane().add(lblGpa_1);
		
		txtsc1gp = new JTextField();
		txtsc1gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc1gp.setColumns(10);
		txtsc1gp.setBounds(705, 428, 79, 35);
		frame.getContentPane().add(txtsc1gp);
		
		txtsc2gp = new JTextField();
		txtsc2gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc2gp.setColumns(10);
		txtsc2gp.setBounds(705, 472, 79, 35);
		frame.getContentPane().add(txtsc2gp);
		
		txtsc3gp = new JTextField();
		txtsc3gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc3gp.setColumns(10);
		txtsc3gp.setBounds(705, 524, 79, 35);
		frame.getContentPane().add(txtsc3gp);
		
		txtsc4gp = new JTextField();
		txtsc4gp.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtsc4gp.setColumns(10);
		txtsc4gp.setBounds(705, 578, 79, 35);
		frame.getContentPane().add(txtsc4gp);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Data inserted","Alert",JOptionPane.PLAIN_MESSAGE);
				String c1a,c1b,c1m,c1t,c1gp,c2a,c2b,c2m,c2t,c2gp,c3a,c3b,c3m,c3t,c3gp,c4a,c4b,c4m,c4t,c4gp,c5a,c5b,c5m,c5t,c5gp,sc1m,sc1gp,sc2m,sc2gp,sc3m,sc3gp,sc4m,sc4gp,sc5m="",sc5gp="",id,name,gpa;
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
				
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					stmt.executeUpdate("insert into studentinfo11 values('"+name+"','"+id+"','"+gpa+"'," + 
							"'"+c1a+"','"+c1b+"','"+c1m+"','"+c1t+"','"+c1gp+"','"+c2a+"','"+c2b+"','"+c2m+"','"+c2t+"','"+c2gp+"','"+c3a+"','"+c3b+"','"+c3m+"','"+c3t+"','"+c3gp+"'," + 
							"'"+c4a+"','"+c4b+"','"+c4m+"','"+c4t+"','"+c4gp+"','"+c5a+"','"+c5b+"','"+c5m+"','"+c5t+"','"+c5gp+"','"+sc1m+"','"+sc1gp+"','"+sc2m+"','"+sc2gp+"','"+sc3m+"'," + 
							"'"+sc3gp+"','"+sc4m+"','"+sc4gp+"','"+sc5m+"','"+sc5gp+"')");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnInsert.setBounds(977, 472, 137, 63);
		frame.getContentPane().add(btnInsert);
		
		JLabel lbldifferentialandintegralcalculas = new JLabel("Differential and Integral Calculas");
		lbldifferentialandintegralcalculas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbldifferentialandintegralcalculas.setBounds(12, 205, 441, 32);
		frame.getContentPane().add(lbldifferentialandintegralcalculas);
		
		JLabel lblphysics = new JLabel("Physics");
		lblphysics.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblphysics.setBounds(12, 253, 279, 32);
		frame.getContentPane().add(lblphysics);
		
		JLabel lbltechnicaandcommunicativeenglish = new JLabel("Technical and Communicative English");
		lbltechnicaandcommunicativeenglish.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltechnicaandcommunicativeenglish.setBounds(12, 297, 432, 36);
		frame.getContentPane().add(lbltechnicaandcommunicativeenglish);
		
		txtc5a = new JTextField();
		txtc5a.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5a.setColumns(10);
		txtc5a.setBounds(457, 298, 79, 35);
		frame.getContentPane().add(txtc5a);
		
		txtc5b = new JTextField();
		txtc5b.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5b.setColumns(10);
		txtc5b.setBounds(548, 298, 79, 35);
		frame.getContentPane().add(txtc5b);
		
		txtc5m = new JTextField();
		txtc5m.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5m.setColumns(10);
		txtc5m.setBounds(632, 300, 79, 35);
		frame.getContentPane().add(txtc5m);
		
		txtc5t = new JTextField();
		txtc5t.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5t.setColumns(10);
		txtc5t.setBounds(718, 300, 79, 35);
		frame.getContentPane().add(txtc5t);
		
		txtc5gpa = new JTextField();
		txtc5gpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtc5gpa.setColumns(10);
		txtc5gpa.setBounds(801, 298, 79, 35);
		frame.getContentPane().add(txtc5gpa);
		
		lblfundamentalofinformationandcommunicationse = new JLabel("Fundamental of Information and Communication ");
		lblfundamentalofinformationandcommunicationse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfundamentalofinformationandcommunicationse.setBounds(12, 431, 536, 28);
		frame.getContentPane().add(lblfundamentalofinformationandcommunicationse);
		
		lblectronicsse = new JLabel("Electronics");
		lblectronicsse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblectronicsse.setBounds(12, 477, 241, 32);
		frame.getContentPane().add(lblectronicsse);
		
		lblphysicsse = new JLabel("Physics");
		lblphysicsse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblphysicsse.setBounds(12, 522, 279, 32);
		frame.getContentPane().add(lblphysicsse);
		
		lbltechnicalandcommunicativeenglishse = new JLabel("Technical and Communicative English");
		lbltechnicalandcommunicativeenglishse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltechnicalandcommunicativeenglishse.setBounds(12, 577, 432, 36);
		frame.getContentPane().add(lbltechnicalandcommunicativeenglishse);
	}
}