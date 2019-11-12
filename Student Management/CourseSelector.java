package ResultManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseSelector {

	private JFrame frame;
	private ButtonGroup group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseSelector window = new CourseSelector();
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
	public CourseSelector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnSemester = new JRadioButton("1-1 semester");
		rdbtnSemester.setBounds(48, 64, 127, 25);
		frame.getContentPane().add(rdbtnSemester);
		
		JRadioButton rdbtnSemester_1 = new JRadioButton("1-2 semester");
		rdbtnSemester_1.setBounds(219, 64, 127, 25);
		frame.getContentPane().add(rdbtnSemester_1);
		
		JRadioButton rdbtnSemester_2 = new JRadioButton("2-1 semester");
		rdbtnSemester_2.setBounds(48, 124, 127, 25);
		frame.getContentPane().add(rdbtnSemester_2);
		
		JRadioButton rdbtnSemester_3 = new JRadioButton("2-2 semester");
		rdbtnSemester_3.setBounds(219, 124, 127, 25);
		frame.getContentPane().add(rdbtnSemester_3);
		
		JRadioButton rdbtnSemester_4 = new JRadioButton("3-1 semester");
		rdbtnSemester_4.setBounds(48, 182, 127, 25);
		frame.getContentPane().add(rdbtnSemester_4);
		
		JRadioButton rdbtnSemester_5 = new JRadioButton("3-2 semester");
		rdbtnSemester_5.setBounds(219, 182, 127, 25);
		frame.getContentPane().add(rdbtnSemester_5);
		
		JRadioButton rdbtnSemester_6 = new JRadioButton("4-1 semester");
		rdbtnSemester_6.setBounds(48, 229, 127, 25);
		frame.getContentPane().add(rdbtnSemester_6);
		
		JRadioButton rdbtnSemester_7 = new JRadioButton("4-2 semester");
		rdbtnSemester_7.setBounds(219, 229, 127, 25);
		frame.getContentPane().add(rdbtnSemester_7);
		
		group.add(rdbtnSemester_7);
		group.add(rdbtnSemester_6);
		group.add(rdbtnSemester_5);
		group.add(rdbtnSemester_4);
		group.add(rdbtnSemester_3);
		group.add(rdbtnSemester_2);
		group.add(rdbtnSemester_1);
		group.add(rdbtnSemester);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSemester.isSelected()) {
					frame.dispose();
					Insert11.main(new String[] {});
				}
				else if(rdbtnSemester_1.isSelected()) {
					System.out.println("1-2");
				}
				else if(rdbtnSemester_2.isSelected()) {
					frame.dispose();
					Insert21.main(new String[] {});
				}
				else if(rdbtnSemester_3.isSelected()) {
					System.out.println("2-2");
				}
				else if(rdbtnSemester_4.isSelected()) {
					System.out.println("3-1");
					frame.dispose();
					Insert31.main(new String[] {});
				}
				else if(rdbtnSemester_5.isSelected()) {
					frame.dispose();
					Insert32.main(new String[] {});
				}
				else if(rdbtnSemester_6.isSelected()) {
					frame.dispose();
					Insert41.main(new String[] {});
				}
				else if(rdbtnSemester_7.isSelected()) {
					System.out.println("4-2");
				}
			}
		});
		btnEnter.setBounds(140, 315, 97, 25);
		frame.getContentPane().add(btnEnter);
	}
}
