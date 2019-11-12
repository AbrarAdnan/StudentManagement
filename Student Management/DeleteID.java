package ResultManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DeleteID {

	private JFrame frame;
	private JTextField textField;
	private ButtonGroup group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteID window = new DeleteID();
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
	public DeleteID() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 587, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(115, 214, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow.main(new String[] {});
			}
		});
		btnMainMenu.setBounds(374, 230, 165, 41);
		frame.getContentPane().add(btnMainMenu);
		
		JLabel lblNewLabel = new JLabel("Enter ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(24, 214, 81, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1-1");
		rdbtnNewRadioButton.setBounds(94, 65, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("1-2");
		radioButton.setBounds(269, 65, 109, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2-1");
		radioButton_1.setBounds(94, 99, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("2-2");
		radioButton_2.setBounds(269, 99, 109, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("3-1");
		radioButton_3.setBounds(94, 135, 109, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("3-2");
		radioButton_4.setBounds(269, 135, 109, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("4-1");
		radioButton_5.setBounds(94, 169, 109, 23);
		frame.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4-2");
		radioButton_6.setBounds(269, 169, 109, 23);
		frame.getContentPane().add(radioButton_6);
		
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		group.add(radioButton_5);
		group.add(radioButton_6);
		group.add(rdbtnNewRadioButton);
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Statement stmt;
				
				if(radioButton_3.isSelected()) {
					try {
						stmt = DatabaseConnection.getConnection().createStatement();
						stmt.executeUpdate("use kafi");
						ResultSet rs=stmt.executeQuery("select * from studentinfo31 where id = '"+textField.getText()+"'");
						if(rs.next()) {
							stmt.executeUpdate("DELETE from studentinfo where id = '"+textField.getText()+"'");
							JOptionPane.showMessageDialog(null, "Deleted","Alert",JOptionPane.PLAIN_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "No data found","Alert",JOptionPane.PLAIN_MESSAGE);
						}
						
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				else if(radioButton_4.isSelected()) {
					try {
						stmt = DatabaseConnection.getConnection().createStatement();
						stmt.executeUpdate("use kafi");
						ResultSet rs=stmt.executeQuery("select * from studentinfo32 where id = '"+textField.getText()+"'");
						if(rs.next()) {
							stmt.executeUpdate("DELETE from studentinfo32 where id = '"+textField.getText()+"'");
							JOptionPane.showMessageDialog(null, "Deleted","Alert",JOptionPane.PLAIN_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "No data found","Alert",JOptionPane.PLAIN_MESSAGE);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				}
				
		});
		btnDelete.setBounds(241, 211, 97, 25);
		frame.getContentPane().add(btnDelete);
		
		
		JLabel lblSelectSemester = new JLabel("Select Semester");
		lblSelectSemester.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSelectSemester.setBounds(152, 36, 165, 22);
		frame.getContentPane().add(lblSelectSemester);
	}
}
