package Ebook;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class EmployeesA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeesA frame = new EmployeesA();
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
	public EmployeesA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu HomeMenu = new JMenu("Home");
		menuBar.add(HomeMenu);
		
		JMenuItem HomeMenuItem = new JMenuItem("Home");
		HomeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePageA frame = new HomePageA();
				frame.setVisible(true);
			}
		});
		HomeMenu.add(HomeMenuItem);
		
		JMenu AboutUsMenu = new JMenu("About Us...");
		menuBar.add(AboutUsMenu);
		
		JMenuItem BackgroundMenuItem = new JMenuItem("Background...");
		BackgroundMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EBookEnterprise frame = new EBookEnterprise();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(BackgroundMenuItem);
		
		JMenuItem AdvertisingMenuItem = new JMenuItem("Advertising Board...");
		AdvertisingMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisingA frame = new AdvertisingA();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(AdvertisingMenuItem);
		
		JMenuItem CounsellorMenuItem = new JMenuItem("Counsellor Information...");
		CounsellorMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeesA frame = new EmployeesA();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(CounsellorMenuItem);
		
		JMenu CustomersMenu = new JMenu("Customers...");
		menuBar.add(CustomersMenu);
		
		JMenuItem RegistrationMenuItem = new JMenuItem("Customers Registration...");
		RegistrationMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomersA frame = new CustomersA();
				frame.setVisible(true);
			}
		});
		CustomersMenu.add(RegistrationMenuItem);
		
		JMenuItem PackageMenuItem = new JMenuItem("Package Selection...");
		PackageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book frame = new Book();
				frame.setVisible(true);
			}
		});
		CustomersMenu.add(PackageMenuItem);
		
		JMenu FinanceMenu = new JMenu("Finance...");
		menuBar.add(FinanceMenu);
		
		JMenuItem FinancialMenuItem = new JMenuItem("Financial Statement...");
		FinancialMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinancialA frame = new FinancialA();
				frame.setVisible(true);
			}
		});
		FinanceMenu.add(FinancialMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1.setBounds(126, 11, 543, 65);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employees Details");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 11, 291, 43);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_1.setBounds(10, 87, 379, 163);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\welson.jpg"));
		lblNewLabel_1_1.setBounds(10, 11, 110, 141);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ahmad");
		lblNewLabel_2.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(130, 10, 239, 36);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TECHNICIAN");
		lblNewLabel_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3.setBounds(113, 41, 239, 36);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("ID : 12345");
		lblNewLabel_3_4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4.setBounds(130, 68, 239, 36);
		panel_1_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("SALARY : RM3500");
		lblNewLabel_3_4_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_1.setBounds(97, 99, 239, 36);
		panel_1_1.add(lblNewLabel_3_4_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_1_1.setBounds(405, 87, 379, 163);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\timmy xu.jpg"));
		lblNewLabel_1_2.setBounds(10, 11, 110, 141);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nurul");
		lblNewLabel_2_2.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(140, 11, 239, 36);
		panel_1_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("DIGITAL MARKETER");
		lblNewLabel_3_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(91, 43, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_5 = new JLabel("ID : 67891");
		lblNewLabel_3_5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_5.setBounds(140, 75, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("SALARY : RM2750");
		lblNewLabel_3_4_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_2.setBounds(106, 103, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_4_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_1_2.setBounds(190, 260, 379, 167);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Aini");
		lblNewLabel_2_1.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(151, 10, 239, 36);
		panel_1_1_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("EDITOR");
		lblNewLabel_3_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(140, 42, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_6 = new JLabel("ID : 23456");
		lblNewLabel_3_6.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_6.setBounds(140, 72, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_4_3 = new JLabel("SALARY : RM3100");
		lblNewLabel_3_4_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_3.setBounds(109, 105, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_4_3);
	}
}