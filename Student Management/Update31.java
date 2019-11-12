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

public class Update31 {

	private JFrame frame;
	private JLabel lblpartb;
	private JTextField txtopticfiberparta;
	private JTextField txtopticfiberpartb;
	private JTextField txtopticfibergivenmark;
	private JTextField txtopticfibertotal;
	private JTextField txtantennaparta;
	private JTextField txtantennapartb;
	private JTextField txtantennatotal;
	private JTextField txtjavaparta;
	private JTextField txtjavapartb;
	private JTextField txtjavagivenmark;
	private JTextField txtjavatotal;
	private JTextField txtantennagivenmark;
	private JTextField txtantennase;
	private JTextField txtjavase;
	private JTextField txtopticfiberse;
	private JTextField txtdspse;
	private JTextField txtdspparta;
	private JTextField txtdsppartb;
	private JTextField txtdspgivenmark;
	private JTextField txtdsptotal;
	private JTextField txtname;
	private JTextField txtstudentid;
	private JTextField txtgpa;
	private JTextField txtOpticFiberGPA;
	private JTextField txtAntennaGPA;
	private JTextField txtJavaGPA;
	private JTextField txtDspGPA;
	private JTextField txtOpticFiberSeGPA;
	private JTextField txtAntennaSeGPA;
	private JTextField txtJavaSeGPA;
	private JTextField txtDSPSeGPA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update31 window = new Update31();
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
	public Update31() {
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
		lblsubject.setBounds(28, 127, 74, 22);
		frame.getContentPane().add(lblsubject);
		
		JLabel lblparta = new JLabel("Part A");
		lblparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblparta.setBounds(141, 127, 74, 22);
		frame.getContentPane().add(lblparta);
		
		lblpartb = new JLabel("Part B");
		lblpartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpartb.setBounds(240, 127, 74, 22);
		frame.getContentPane().add(lblpartb);
		
		JLabel lblgivenmark = new JLabel("Given Mark");
		lblgivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgivenmark.setBounds(343, 127, 102, 22);
		frame.getContentPane().add(lblgivenmark);
		
		JLabel lbltotal = new JLabel("Total");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltotal.setBounds(455, 127, 74, 22);
		frame.getContentPane().add(lbltotal);
		
		JLabel lblopticfiber = new JLabel("Optic Fiber");
		lblopticfiber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblopticfiber.setBounds(12, 162, 119, 28);
		frame.getContentPane().add(lblopticfiber);
		
		JLabel lblantenna = new JLabel("Antenna");
		lblantenna.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblantenna.setBounds(12, 211, 119, 28);
		frame.getContentPane().add(lblantenna);
		
		JLabel lbljava = new JLabel("Java");
		lbljava.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbljava.setBounds(12, 256, 119, 28);
		frame.getContentPane().add(lbljava);
		
		JLabel lbldsp = new JLabel("DSP");
		lbldsp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbldsp.setBounds(12, 297, 119, 28);
		frame.getContentPane().add(lbldsp);
		
		JLabel lblopticfiberse = new JLabel("Optic Fiber Se");
		lblopticfiberse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblopticfiberse.setBounds(12, 462, 137, 28);
		frame.getContentPane().add(lblopticfiberse);
		
		JLabel lblantennase = new JLabel("Antenna Se");
		lblantennase.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblantennase.setBounds(12, 511, 119, 28);
		frame.getContentPane().add(lblantennase);
		
		JLabel lbljavase = new JLabel("Java se");
		lbljavase.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbljavase.setBounds(12, 556, 119, 28);
		frame.getContentPane().add(lbljavase);
		
		JLabel lbldspse = new JLabel("DSP Se");
		lbldspse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbldspse.setBounds(12, 604, 119, 28);
		frame.getContentPane().add(lbldspse);
		
		JLabel lblAddResultFor = new JLabel("Transcript For Sessional");
		lblAddResultFor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddResultFor.setBounds(240, 375, 291, 44);
		frame.getContentPane().add(lblAddResultFor);
		
		JLabel lblsubjects = new JLabel("Subject");
		lblsubjects.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsubjects.setBounds(28, 427, 74, 22);
		frame.getContentPane().add(lblsubjects);
		
		JLabel lblMark = new JLabel("Mark");
		lblMark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMark.setBounds(179, 427, 74, 22);
		frame.getContentPane().add(lblMark);
		
		txtopticfiberparta = new JTextField();
		txtopticfiberparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtopticfiberparta.setBounds(141, 160, 79, 35);
		frame.getContentPane().add(txtopticfiberparta);
		txtopticfiberparta.setColumns(10);
		
		txtopticfiberpartb = new JTextField();
		txtopticfiberpartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtopticfiberpartb.setColumns(10);
		txtopticfiberpartb.setBounds(240, 159, 79, 35);
		frame.getContentPane().add(txtopticfiberpartb);
		
		txtopticfibergivenmark = new JTextField();
		txtopticfibergivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtopticfibergivenmark.setColumns(10);
		txtopticfibergivenmark.setBounds(341, 160, 79, 35);
		frame.getContentPane().add(txtopticfibergivenmark);
		
		txtopticfibertotal = new JTextField();
		txtopticfibertotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtopticfibertotal.setColumns(10);
		txtopticfibertotal.setBounds(441, 162, 79, 35);
		frame.getContentPane().add(txtopticfibertotal);
		
		txtantennaparta = new JTextField();
		txtantennaparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtantennaparta.setColumns(10);
		txtantennaparta.setBounds(141, 208, 79, 35);
		frame.getContentPane().add(txtantennaparta);
		
		txtantennapartb = new JTextField();
		txtantennapartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtantennapartb.setColumns(10);
		txtantennapartb.setBounds(240, 208, 79, 35);
		frame.getContentPane().add(txtantennapartb);
		
		txtantennatotal = new JTextField();
		txtantennatotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtantennatotal.setColumns(10);
		txtantennatotal.setBounds(441, 208, 79, 35);
		frame.getContentPane().add(txtantennatotal);
		
		txtjavaparta = new JTextField();
		txtjavaparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtjavaparta.setColumns(10);
		txtjavaparta.setBounds(141, 253, 79, 35);
		frame.getContentPane().add(txtjavaparta);
		
		txtjavapartb = new JTextField();
		txtjavapartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtjavapartb.setColumns(10);
		txtjavapartb.setBounds(240, 253, 79, 35);
		frame.getContentPane().add(txtjavapartb);
		
		txtjavagivenmark = new JTextField();
		txtjavagivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtjavagivenmark.setColumns(10);
		txtjavagivenmark.setBounds(341, 254, 79, 35);
		frame.getContentPane().add(txtjavagivenmark);
		
		txtjavatotal = new JTextField();
		txtjavatotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtjavatotal.setColumns(10);
		txtjavatotal.setBounds(441, 253, 79, 35);
		frame.getContentPane().add(txtjavatotal);
		
		txtantennagivenmark = new JTextField();
		txtantennagivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtantennagivenmark.setColumns(10);
		txtantennagivenmark.setBounds(341, 209, 79, 35);
		frame.getContentPane().add(txtantennagivenmark);
		
		txtantennase = new JTextField();
		txtantennase.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtantennase.setColumns(10);
		txtantennase.setBounds(161, 508, 79, 35);
		frame.getContentPane().add(txtantennase);
		
		txtjavase = new JTextField();
		txtjavase.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtjavase.setColumns(10);
		txtjavase.setBounds(161, 553, 79, 35);
		frame.getContentPane().add(txtjavase);
		
		txtopticfiberse = new JTextField();
		txtopticfiberse.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtopticfiberse.setColumns(10);
		txtopticfiberse.setBounds(161, 459, 79, 35);
		frame.getContentPane().add(txtopticfiberse);
		
		txtdspse = new JTextField();
		txtdspse.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtdspse.setColumns(10);
		txtdspse.setBounds(161, 601, 79, 35);
		frame.getContentPane().add(txtdspse);
		
		txtdspparta = new JTextField();
		txtdspparta.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtdspparta.setColumns(10);
		txtdspparta.setBounds(141, 294, 79, 35);
		frame.getContentPane().add(txtdspparta);
		
		txtdsppartb = new JTextField();
		txtdsppartb.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtdsppartb.setColumns(10);
		txtdsppartb.setBounds(240, 294, 79, 35);
		frame.getContentPane().add(txtdsppartb);
		
		txtdspgivenmark = new JTextField();
		txtdspgivenmark.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtdspgivenmark.setColumns(10);
		txtdspgivenmark.setBounds(341, 295, 79, 35);
		frame.getContentPane().add(txtdspgivenmark);
		
		txtdsptotal = new JTextField();
		txtdsptotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtdsptotal.setColumns(10);
		txtdsptotal.setBounds(441, 294, 79, 35);
		frame.getContentPane().add(txtdsptotal);
		
		JLabel lblfirstname = new JLabel("Name");
		lblfirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblfirstname.setBounds(763, 191, 119, 28);
		frame.getContentPane().add(lblfirstname);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtname.setColumns(10);
		txtname.setBounds(895, 191, 204, 28);
		frame.getContentPane().add(txtname);
		
		JLabel lblstudentid = new JLabel("Student ID");
		lblstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblstudentid.setBounds(522, 476, 122, 36);
		frame.getContentPane().add(lblstudentid);
		
		txtstudentid = new JTextField();
		txtstudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtstudentid.setColumns(10);
		txtstudentid.setBounds(652, 480, 204, 28);
		frame.getContentPane().add(txtstudentid);
		
		JLabel lblgpa = new JLabel("GPA");
		lblgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgpa.setBounds(763, 252, 122, 36);
		frame.getContentPane().add(lblgpa);
		
		txtgpa = new JTextField();
		txtgpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtgpa.setColumns(10);
		txtgpa.setBounds(895, 256, 204, 28);
		frame.getContentPane().add(txtgpa);
		
		txtOpticFiberGPA = new JTextField();
		txtOpticFiberGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtOpticFiberGPA.setColumns(10);
		txtOpticFiberGPA.setBounds(542, 162, 79, 35);
		frame.getContentPane().add(txtOpticFiberGPA);
		
		txtAntennaGPA = new JTextField();
		txtAntennaGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAntennaGPA.setColumns(10);
		txtAntennaGPA.setBounds(542, 208, 79, 35);
		frame.getContentPane().add(txtAntennaGPA);
		
		txtJavaGPA = new JTextField();
		txtJavaGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtJavaGPA.setColumns(10);
		txtJavaGPA.setBounds(542, 253, 79, 35);
		frame.getContentPane().add(txtJavaGPA);
		
		txtDspGPA = new JTextField();
		txtDspGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDspGPA.setColumns(10);
		txtDspGPA.setBounds(542, 294, 79, 35);
		frame.getContentPane().add(txtDspGPA);
		
		JLabel lblGpa = new JLabel("Grade Point");
		lblGpa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa.setBounds(522, 127, 112, 22);
		frame.getContentPane().add(lblGpa);
		
		JLabel lblGpa_1 = new JLabel("Grade Point");
		lblGpa_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGpa_1.setBounds(263, 427, 112, 22);
		frame.getContentPane().add(lblGpa_1);
		
		txtOpticFiberSeGPA = new JTextField();
		txtOpticFiberSeGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtOpticFiberSeGPA.setColumns(10);
		txtOpticFiberSeGPA.setBounds(271, 459, 79, 35);
		frame.getContentPane().add(txtOpticFiberSeGPA);
		
		txtAntennaSeGPA = new JTextField();
		txtAntennaSeGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAntennaSeGPA.setColumns(10);
		txtAntennaSeGPA.setBounds(271, 508, 79, 35);
		frame.getContentPane().add(txtAntennaSeGPA);
		
		txtJavaSeGPA = new JTextField();
		txtJavaSeGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtJavaSeGPA.setColumns(10);
		txtJavaSeGPA.setBounds(271, 556, 79, 35);
		frame.getContentPane().add(txtJavaSeGPA);
		
		txtDSPSeGPA = new JTextField();
		txtDSPSeGPA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDSPSeGPA.setColumns(10);
		txtDSPSeGPA.setBounds(271, 597, 79, 35);
		frame.getContentPane().add(txtDSPSeGPA);
		
		JButton btnInsert = new JButton("Search");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					
					ResultSet rs=stmt.executeQuery("select * from studentinfo31 where id='"+txtstudentid.getText()+"'");
					if(rs.next()) {
						txtname.setText(rs.getString("name"));
						txtstudentid.setText(rs.getString("ID"));
						txtopticfiberparta.setText(rs.getString("OFA"));
						txtopticfiberpartb.setText(rs.getString("OFB"));
						txtopticfibergivenmark.setText(rs.getString("OFmark"));
						txtopticfibertotal.setText(rs.getString("OFtotal"));
						txtOpticFiberGPA.setText(rs.getString("OFGP"));
						txtantennaparta.setText(rs.getString("AA"));
						txtantennapartb.setText(rs.getString("AB"));
						txtantennagivenmark.setText(rs.getString("Amark"));
						txtantennatotal.setText(rs.getString("Atotal"));
						txtAntennaGPA.setText(rs.getString("AGP"));
						txtjavaparta.setText(rs.getString("JA"));
						txtjavapartb.setText(rs.getString("JB"));
						txtjavagivenmark.setText(rs.getString("Jmark"));
						txtjavatotal.setText(rs.getString("Jtotal"));
						txtJavaGPA.setText(rs.getString("JGP"));
						txtdspparta.setText(rs.getString("DSPA"));
						txtdsppartb.setText(rs.getString("DSPB"));
						txtdspgivenmark.setText(rs.getString("DSPmark"));
						txtdsptotal.setText(rs.getString("DSPtotal"));
						txtDspGPA.setText(rs.getString("DSPGP"));
						txtgpa.setText(rs.getString("GPA"));
						txtopticfiberse.setText(rs.getString("OFsem"));
						txtOpticFiberSeGPA.setText(rs.getString("OFsegp"));
						txtantennase.setText(rs.getString("Asem"));
						txtAntennaSeGPA.setText(rs.getString("Asegp"));
						txtjavase.setText(rs.getString("Jsem"));
						txtJavaSeGPA.setText(rs.getString("Jsegp"));
						txtdspse.setText(rs.getString("DSPsem"));
						txtDSPSeGPA.setText(rs.getString("DSPsegp"));
						
						
					}
					
					else
						JOptionPane.showMessageDialog(null, "Not Found");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnInsert.setBounds(888, 476, 137, 63);
		frame.getContentPane().add(btnInsert);
		
		JButton updateBtn = new JButton("Update");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String OFA,OFB,OFmark,OFtotal,OFGP,AA,AB,Amark,Atotal,AGP,JA,JB,Jmark,Jtotal,JGP,DSPA,DSPB,DSPmark,DSPtotal,DSPGP,GPA;
				String ID,name,OFsem,OFsegp,Asem,Asegp,Jsem,Jsegp,DSPsem,DSPsegp;
				name=txtname.getText();
				ID=txtstudentid.getText();
				OFA=txtopticfiberparta.getText();
				OFB=txtopticfiberpartb.getText();
				OFmark=txtopticfibergivenmark.getText();
				OFtotal=txtopticfibertotal.getText();
				OFGP=txtOpticFiberGPA.getText();
				AA=txtantennaparta.getText();
				AB=txtantennapartb.getText();
				Amark=txtantennagivenmark.getText();
				Atotal=txtantennatotal.getText();
				AGP=txtAntennaGPA.getText();
				JA=txtjavaparta.getText();
				JB=txtjavapartb.getText();
				Jmark=txtjavagivenmark.getText();
				Jtotal=txtjavatotal.getText();
				JGP=txtJavaGPA.getText();
				DSPA=txtdspparta.getText();
				DSPB=txtdsppartb.getText();
				DSPmark=txtdspgivenmark.getText();
				DSPtotal=txtdsptotal.getText();
				DSPGP=txtDspGPA.getText();
				OFsem=txtopticfiberse.getText();
				OFsegp=txtOpticFiberSeGPA.getText();
				Asem=txtantennase.getText();
				Asegp=txtAntennaSeGPA.getText();
				Jsem=txtjavase.getText();
				Jsegp=txtJavaSeGPA.getText();
				DSPsem=txtdspse.getText();
				DSPsegp=txtDSPSeGPA.getText();
				GPA=txtgpa.getText();
				try {
					Statement stmt=DatabaseConnection.getConnection().createStatement();
					stmt.executeUpdate("use kafi");
					stmt.executeUpdate("DELETE from studentinfo31 where id = '"+txtstudentid.getText()+"'");
					stmt.executeUpdate("insert into studentinfo31 values('"+name+"','"+ID+"','"+GPA+"','"+OFA+"','"+OFB+"','"+OFmark+"'," + 
							"'"+OFtotal+"','"+OFGP+"','"+AA+"','"+AB+"','"+Amark+"','"+Atotal+"','"+AGP+"'," + 
							"'"+JA+"','"+JB+"','"+Jmark+"','"+Jtotal+"','"+JGP+"','"+DSPA+"','"+DSPB+"'," + 
							"'"+DSPmark+"','"+DSPtotal+"','"+DSPGP+"','"+OFsem+"','"+OFsegp+"','"+Asem+"'," + 
							"'"+Asegp+"','"+Jsem+"','"+Jsegp+"','"+DSPsem+"','"+DSPsegp+"')");
					JOptionPane.showMessageDialog(null, "ID Updated");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		updateBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		updateBtn.setBounds(719, 556, 137, 63);
		frame.getContentPane().add(updateBtn);
		
		JButton btnMainmenu = new JButton("MainMenu");
		btnMainmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnMainmenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMainmenu.setBounds(888, 560, 137, 63);
		frame.getContentPane().add(btnMainmenu);
	}
}