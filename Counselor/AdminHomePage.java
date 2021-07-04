package Counselor;

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

public class AdminHomePage extends JFrame {

	private JPanel contentPane;
	private static String Welson;
	private static String Jimmy;
	private static String Gary;
	private static String Johnny;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(109, 11, 550, 72);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Minion Pro Cond", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 629, 61);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2.setBounds(10, 94, 246, 158);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Mindworks Background Latest.jpg"));
		lblNewLabel_1.setBounds(10, 11, 226, 100);
		panel_2.add(lblNewLabel_1);
		
		JButton BackgroundButton = new JButton("FIND OUT MORE");
		BackgroundButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mindwork frame = new Mindwork();
				frame.setVisible(true);
				
			}
		});
		BackgroundButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		BackgroundButton.setBounds(10, 124, 226, 23);
		panel_2.add(BackgroundButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_1.setBounds(538, 94, 246, 158);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Customer Registration Latest.jpg"));
		lblNewLabel_1_2.setBounds(10, 11, 226, 100);
		panel_2_1.add(lblNewLabel_1_2);
		
		JButton RegistrationButton = new JButton("FIND OUT MORE");
		RegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomersC frame = new CustomersC();
				frame.setVisible(true);
				
			}
		});
		RegistrationButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		RegistrationButton.setBounds(10, 122, 226, 23);
		panel_2_1.add(RegistrationButton);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_2.setBounds(10, 270, 246, 158);
		panel.add(panel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Package Selection Latest.jpg"));
		lblNewLabel_1_1.setBounds(10, 11, 226, 100);
		panel_2_2.add(lblNewLabel_1_1);
		
		JButton PackageButton = new JButton("FIND OUT MORE");
		PackageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Package frame = new Package(Welson, Jimmy, Gary, Johnny);
				frame.setVisible(true);
				
			}
		});
		PackageButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		PackageButton.setBounds(10, 122, 226, 23);
		panel_2_2.add(PackageButton);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_3.setBounds(538, 270, 246, 158);
		panel.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Counsellor Information Latest.jpg"));
		lblNewLabel_1_3.setBounds(10, 11, 226, 100);
		panel_2_3.add(lblNewLabel_1_3);
		
		JButton CounsellorButton = new JButton("FIND OUT MORE");
		CounsellorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CounsellorsC frame = new CounsellorsC();
				frame.setVisible(true);
				
			}
		});
		CounsellorButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		CounsellorButton.setBounds(10, 122, 226, 23);
		panel_2_3.add(CounsellorButton);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_4.setBounds(266, 270, 262, 158);
		panel.add(panel_2_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Financial Statement Latesttt.jpg"));
		lblNewLabel_2.setBounds(10, 11, 242, 99);
		panel_2_4.add(lblNewLabel_2);
		
		JButton FinanceButton = new JButton("FIND OUT MORE");
		FinanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceC frame = new FinanceC();
				frame.setVisible(true);
				
			}
		});
		FinanceButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		FinanceButton.setBounds(10, 121, 242, 23);
		panel_2_4.add(FinanceButton);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_5.setBounds(266, 94, 262, 158);
		panel.add(panel_2_5);
		
		JButton AdvertisingButton = new JButton("FIND OUT MORE");
		AdvertisingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisingC frame = new AdvertisingC();
				frame.setVisible(true);
			}
		});
		AdvertisingButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		AdvertisingButton.setBounds(10, 124, 242, 23);
		panel_2_5.add(AdvertisingButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Advertising Board Latest.jpg"));
		lblNewLabel_3.setBounds(10, 11, 242, 102);
		panel_2_5.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_3.setBounds(669, 11, 115, 72);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton NextButton = new JButton("NEXT");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage2 frame = new AdminHomePage2();
				frame.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		NextButton.setBounds(10, 11, 95, 50);
		panel_3.add(NextButton);
		
		JButton LOGOUTBUTTON = new JButton("LOG OUT");
		LOGOUTBUTTON.setFont(new Font("Tahoma", Font.BOLD, 11));
		LOGOUTBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInC frame = new LogInC();
				frame.setVisible(true);
				dispose();
			}
		});
		LOGOUTBUTTON.setBounds(10, 28, 89, 32);
		panel.add(LOGOUTBUTTON);
		
		
		
	}
}