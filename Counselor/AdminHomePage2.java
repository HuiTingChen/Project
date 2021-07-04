package Counselor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class AdminHomePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage2 frame = new AdminHomePage2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminHomePage2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2.setBounds(142, 139, 246, 158);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Counsellor Salary Latest.jpg"));
		lblNewLabel_1.setBounds(10, 11, 226, 100);
		panel_2.add(lblNewLabel_1);
		
		JButton SalaryButton = new JButton("FIND OUT MORE");
		SalaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCounsellorSalary frame = new AdminCounsellorSalary();
				frame.setVisible(true);
			}
		});
		SalaryButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		SalaryButton.setBounds(10, 124, 226, 23);
		panel_2.add(SalaryButton);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_2.setBounds(409, 139, 262, 158);
		panel.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Counsellor Class Price Latest.jpg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(10, 11, 242, 100);
		panel_2_2.add(lblNewLabel_1_2);
		
		JButton ClassPriceButton = new JButton("FIND OUT MORE");
		ClassPriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCounsellorPrice frame = new AdminCounsellorPrice();
				frame.setVisible(true);
			}
		});
		ClassPriceButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		ClassPriceButton.setBounds(10, 124, 242, 23);
		panel_2_2.add(ClassPriceButton);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage frame = new AdminHomePage();
				frame.setVisible(true);
			}
		});
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		BackButton.setBounds(10, 11, 89, 23);
		panel.add(BackButton);
	}

}