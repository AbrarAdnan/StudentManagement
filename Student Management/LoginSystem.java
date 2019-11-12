package ResultManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginSystem {

	private JFrame frame;
	private JTextField txtusername;
	private String username="Kafi",password="1234";
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
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
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentResultManagement = new JLabel("Student Result Management");
		lblStudentResultManagement.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentResultManagement.setBounds(162, 13, 306, 71);
		frame.getContentPane().add(lblStudentResultManagement);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblusername.setBounds(53, 97, 162, 71);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpassword.setBounds(53, 211, 162, 71);
		frame.getContentPane().add(lblpassword);
		
		txtusername = new JTextField();
		txtusername.setColumns(10);
		txtusername.setBounds(176, 97, 232, 53);
		frame.getContentPane().add(txtusername);
		
		JButton btnlog = new JButton("Login");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtusername.getText().equals(username)&&txtpassword.getText().equals(password)) {
					frame.dispose();
					MainWindow mw=new MainWindow();
					mw.frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong usesrname or password");
					
				}
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnlog.setBounds(53, 339, 124, 53);
		frame.getContentPane().add(btnlog);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnexit.setBounds(379, 339, 124, 53);
		frame.getContentPane().add(btnexit);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(176, 227, 232, 43);
		frame.getContentPane().add(txtpassword);
		
	}
}
