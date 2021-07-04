package Counselor;

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

public class CounsellorsC extends JFrame {

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
					CounsellorsC frame = new CounsellorsC();
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
	public CounsellorsC() {
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
				HomePageC frame = new HomePageC();
				frame.setVisible(true);
			}
		});
		HomeMenu.add(HomeMenuItem);
		
		JMenu AboutUsMenu = new JMenu("About Us...");
		menuBar.add(AboutUsMenu);
		
		JMenuItem BackgroundMenuItem = new JMenuItem("Background...");
		BackgroundMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mindwork frame = new Mindwork();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(BackgroundMenuItem);
		
		JMenuItem AdvertisingMenuItem = new JMenuItem("Advertising Board...");
		AdvertisingMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisingC frame = new AdvertisingC();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(AdvertisingMenuItem);
		
		JMenuItem CounsellorMenuItem = new JMenuItem("Counsellor Information...");
		CounsellorMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CounsellorsC frame = new CounsellorsC();
				frame.setVisible(true);
			}
		});
		AboutUsMenu.add(CounsellorMenuItem);
		
		JMenu CustomersMenu = new JMenu("Customers...");
		menuBar.add(CustomersMenu);
		
		JMenuItem RegistrationMenuItem = new JMenuItem("Customers Registration...");
		RegistrationMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomersC frame = new CustomersC();
				frame.setVisible(true);
			}
		});
		CustomersMenu.add(RegistrationMenuItem);
		
		JMenuItem PackageMenuItem = new JMenuItem("Package Selection...");
		PackageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Package frame = new Package(Welson, Jimmy, Gary, Johnny);
				frame.setVisible(true);
			}
		});
		CustomersMenu.add(PackageMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1.setBounds(126, 11, 543, 65);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COUNSELLOR LIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 11, 291, 43);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1.setBounds(10, 87, 379, 163);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\welson.jpg"));
		lblNewLabel_1_1.setBounds(10, 11, 110, 141);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELSON CHUA");
		lblNewLabel_2.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(130, 11, 239, 36);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SENIOR COUNSELLOR");
		lblNewLabel_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3.setBounds(130, 44, 239, 36);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("COUNSELLOR ID : 271948");
		lblNewLabel_3_4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4.setBounds(130, 74, 239, 36);
		panel_1_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("CONTACT : 0166351616");
		lblNewLabel_3_4_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_1.setBounds(130, 103, 239, 36);
		panel_1_1.add(lblNewLabel_3_4_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1_1.setBounds(405, 87, 379, 163);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\timmy xu.jpg"));
		lblNewLabel_1_2.setBounds(10, 11, 110, 141);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("JIMMY CHU");
		lblNewLabel_2_2.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(130, 11, 239, 36);
		panel_1_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("SENIOR COUNSELLOR");
		lblNewLabel_3_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(130, 45, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_5 = new JLabel("COUNSELLOR ID : 271949");
		lblNewLabel_3_5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_5.setBounds(130, 74, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("CONTACT : 0163797605");
		lblNewLabel_3_4_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_2.setBounds(130, 102, 239, 36);
		panel_1_1_1.add(lblNewLabel_3_4_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1_2.setBounds(10, 261, 379, 167);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\husky.jpg"));
		lblNewLabel_1_3.setBounds(10, 11, 110, 141);
		panel_1_1_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("GARY NG");
		lblNewLabel_2_1.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(130, 11, 239, 36);
		panel_1_1_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("JUNIOR COUNSELLOR");
		lblNewLabel_3_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(130, 43, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_6 = new JLabel("COUNSELLOR ID : 271950");
		lblNewLabel_3_6.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_6.setBounds(130, 74, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_4_3 = new JLabel("CONTACT : 0162746819");
		lblNewLabel_3_4_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_3.setBounds(130, 103, 239, 36);
		panel_1_1_2.add(lblNewLabel_3_4_3);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1_2_1.setBounds(405, 261, 379, 167);
		panel.add(panel_1_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 11, 110, 141);
		panel_1_1_2_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\Johnny-Huang.jpg"));
		
		JLabel lblNewLabel_2_3 = new JLabel("JOHNNY XU");
		lblNewLabel_2_3.setFont(new Font("Britannic Bold", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(130, 11, 239, 36);
		panel_1_1_2_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("JUNIOR COUNSELLOR");
		lblNewLabel_3_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_3.setBounds(130, 41, 239, 36);
		panel_1_1_2_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_7 = new JLabel("COUNSELLOR ID : 271951");
		lblNewLabel_3_7.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_7.setBounds(130, 74, 239, 36);
		panel_1_1_2_1.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_4_4 = new JLabel("CONTACT : 0168981881");
		lblNewLabel_3_4_4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel_3_4_4.setBounds(130, 102, 239, 36);
		panel_1_1_2_1.add(lblNewLabel_3_4_4);
	}
}