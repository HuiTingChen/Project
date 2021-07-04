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
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvertisingA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisingA frame = new AdvertisingA();
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
	public AdvertisingA() {
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
		
		JMenuItem CounsellorMenuItem = new JMenuItem("Employees Details...");
		CounsellorMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeesA frame = new EmployeesA();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(CounsellorMenuItem);
		
		JMenu CustomersMenu = new JMenu("Customers...");
		menuBar.add(CustomersMenu);
		
		JMenuItem RegistrationMenuItem = new JMenuItem("Customers Details...");
		RegistrationMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomersA frame = new CustomersA();
				frame.setVisible(true);
			}
		});
		CustomersMenu.add(RegistrationMenuItem);
		
		JMenuItem PackageMenuItem = new JMenuItem("Book Selection...");
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
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(10, 11, 774, 64);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Grab the promotion now!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 754, 42);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.PINK);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_1.setBounds(10, 85, 390, 276);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\FACEBOOK ICON.jpg"));
		lblNewLabel_2.setBounds(10, 28, 100, 100);
		panel_2_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("eBook Enterprise");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 28, 260, 39);
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("we have lots of exciting ");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(-13, 61, 437, 87);
		panel_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("promotion to share with you");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_2.setBounds(65, 137, 290, 39);
		panel_2_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("free shipping for");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Spy Agency", Font.BOLD, 35));
		lblNewLabel_4.setBounds(410, 137, 374, 64);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("RM100");
		lblNewLabel_4_1.setForeground(Color.MAGENTA);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Palatino Linotype", Font.BOLD, 60));
		lblNewLabel_4_1.setBounds(420, 243, 374, 95);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("purchased above");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Spy Agency", Font.BOLD, 27));
		lblNewLabel_4_2.setBounds(410, 185, 374, 64);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\MINDWORK LOGO.png"));
		lblNewLabel_5.setBounds(410, 277, 374, 95);
		panel.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(213, 384, 374, 45);
		panel.add(panel_3);
		panel_3.setBackground(Color.PINK);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_3.setLayout(null);
		
		JButton FindMoreButton = new JButton("find out more");
		FindMoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EBookEnterprise frame = new EBookEnterprise();
				frame.setVisible(true);
				
			}
		});
		FindMoreButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		FindMoreButton.setBounds(20, 11, 161, 23);
		panel_3.add(FindMoreButton);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "ADVERTISEMENT BOARD", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setBounds(188, 11, 161, 23);
		panel_3.add(ExitButton);
	}
}