package ResultManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class MainWindow {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblf = new JLabel("Student Result Process");
		lblf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblf.setBounds(228, 13, 306, 71);
		frame.getContentPane().add(lblf);
		
		JLabel label = new JLabel("");
		label.setBounds(145, 164, 56, 16);
		frame.getContentPane().add(label);
		
		JButton btninseart = new JButton("Insert");
		btninseart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CourseSelector.main(new String[] {});
				frame.dispose();
			}
		});
		btninseart.setFont(new Font("Tahoma", Font.BOLD, 18));
		btninseart.setBounds(252, 115, 125, 49);
		frame.getContentPane().add(btninseart);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				UpdateSearchSelector.main(new String[]{});
			}
		});
		btnupdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnupdate.setBounds(252, 239, 125, 49);
		frame.getContentPane().add(btnupdate);
		
		JButton btndelect = new JButton("Delete");
		btndelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				DeleteID.main(new String[] {});
			}
		});
		btndelect.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndelect.setBounds(252, 301, 125, 49);
		frame.getContentPane().add(btndelect);
		
		JButton btnsearch = new JButton("Search");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				CourseSearchSelector.main(new String[] {});
			}
		});
		btnsearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsearch.setBounds(252, 177, 125, 49);
		frame.getContentPane().add(btnsearch);
	}
}
