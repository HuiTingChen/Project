package Ebook;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePageA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageA frame = new HomePageA();
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
	public HomePageA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(10, 11, 774, 72);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to e-book centre!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Freestyle Script", Font.ITALIC, 50));
		lblNewLabel.setBounds(10, 0, 754, 61);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2.setBounds(10, 94, 246, 158);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\EBook Enterprise Latest.jpg"));
		lblNewLabel_1.setBounds(10, 14, 226, 100);
		panel_2.add(lblNewLabel_1);
		
		JButton BackgroundButton = new JButton("click here");
		BackgroundButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EBookEnterprise frame = new EBookEnterprise();
				frame.setVisible(true);
				
			}
		});
		BackgroundButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		BackgroundButton.setBounds(10, 124, 226, 23);
		panel_2.add(BackgroundButton);
		
		JLabel lblNewLabel_4 = new JLabel("About us");
		lblNewLabel_4.setFont(new Font("Forte", Font.BOLD, 25));
		lblNewLabel_4.setBounds(63, 43, 129, 56);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_1.setBounds(538, 94, 246, 158);
		panel.add(panel_2_1);
		
		JButton RegistrationButton = new JButton("click here");
		RegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomersA frame = new CustomersA();
				frame.setVisible(true);
				
			}
		});
		RegistrationButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		RegistrationButton.setBounds(10, 122, 226, 23);
		panel_2_1.add(RegistrationButton);
		
		JLabel lblNewLabel_4_2 = new JLabel("Customer Info");
		lblNewLabel_4_2.setFont(new Font("Forte", Font.BOLD, 25));
		lblNewLabel_4_2.setBounds(30, 39, 206, 56);
		panel_2_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(10, 12, 226, 100);
		panel_2_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Customer Registration Latest.jpg"));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_2.setBounds(10, 270, 246, 158);
		panel.add(panel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Package Selection Latest.jpg"));
		lblNewLabel_1_1.setBounds(10, 12, 226, 100);
		panel_2_2.add(lblNewLabel_1_1);
		
		JButton PackageButton = new JButton("click here");
		PackageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book frame = new Book();
				frame.setVisible(true);
				
			}
		});
		PackageButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		PackageButton.setBounds(10, 122, 226, 23);
		panel_2_2.add(PackageButton);
		
		JLabel lblNewLabel_4_4 = new JLabel("eBook");
		lblNewLabel_4_4.setFont(new Font("Forte", Font.BOLD, 25));
		lblNewLabel_4_4.setBounds(68, 44, 129, 56);
		panel_2_2.add(lblNewLabel_4_4);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_3.setBounds(538, 270, 246, 158);
		panel.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Employees Information Latest.jpg"));
		lblNewLabel_1_3.setBounds(10, 10, 226, 100);
		panel_2_3.add(lblNewLabel_1_3);
		
		JButton CounsellorButton = new JButton("click here");
		CounsellorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeesA frame = new EmployeesA();
				frame.setVisible(true);
				
			}
		});
		CounsellorButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		CounsellorButton.setBounds(10, 122, 226, 23);
		panel_2_3.add(CounsellorButton);
		
		JLabel lblNewLabel_4_5 = new JLabel("Employees Details");
		lblNewLabel_4_5.setFont(new Font("Forte", Font.BOLD, 25));
		lblNewLabel_4_5.setBounds(10, 43, 226, 56);
		panel_2_3.add(lblNewLabel_4_5);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_4.setBounds(266, 270, 262, 158);
		panel.add(panel_2_4);
		
		JButton FinanceButton = new JButton("click here");
		FinanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinancialA frame = new FinancialA();
				frame.setVisible(true);
				
			}
		});
		FinanceButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		FinanceButton.setBounds(10, 121, 242, 23);
		panel_2_4.add(FinanceButton);
		
		JLabel lblNewLabel_4_3 = new JLabel("Financial Status");
		lblNewLabel_4_3.setFont(new Font("Forte", Font.BOLD, 25));
		lblNewLabel_4_3.setBounds(39, 37, 213, 56);
		panel_2_4.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 12, 242, 99);
		panel_2_4.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Financial Status Latesttt.jpg"));
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_5.setBounds(266, 94, 262, 158);
		panel.add(panel_2_5);
		
		JButton AdvertisingButton = new JButton("click here");
		AdvertisingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisingA frame = new AdvertisingA();
				frame.setVisible(true);
			}
		});
		AdvertisingButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		AdvertisingButton.setBounds(10, 124, 242, 23);
		panel_2_5.add(AdvertisingButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Promotion Latest.jpg"));
		lblNewLabel_3.setBounds(10, 12, 242, 102);
		panel_2_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Promo");
		lblNewLabel_4_1.setBounds(85, 44, 129, 56);
		panel_2_5.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Forte", Font.BOLD, 25));
	}
}