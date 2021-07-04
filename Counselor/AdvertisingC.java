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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvertisingC extends JFrame {

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
					AdvertisingC frame = new AdvertisingC();
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
	public AdvertisingC() {
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
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 774, 64);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ADVERTISEMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 754, 42);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2.setBounds(56, 86, 288, 41);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FIND US ON FB & IG !");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 35));
		lblNewLabel_1.setBounds(10, 0, 268, 30);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_1.setBounds(10, 138, 390, 290);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\FACEBOOK ICON.jpg"));
		lblNewLabel_2.setBounds(10, 28, 100, 100);
		panel_2_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\INSTAGRAM ICON.jpg"));
		lblNewLabel_2_1.setBounds(10, 155, 100, 100);
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("MINDWORK PSYCHOLOGICAL");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(120, 40, 260, 39);
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("&");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(120, 65, 260, 39);
		panel_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("COUNSELING CENTER");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1_1.setBounds(120, 90, 260, 39);
		panel_2_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("MINDWORK.SINCE.2021");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Impact", Font.PLAIN, 25));
		lblNewLabel_3_2.setBounds(120, 180, 260, 39);
		panel_2_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("VOUCHER UP TO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Spy Agency", Font.BOLD, 35));
		lblNewLabel_4.setBounds(410, 86, 374, 64);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("RM500");
		lblNewLabel_4_1.setForeground(Color.BLUE);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Stencil", Font.BOLD, 99));
		lblNewLabel_4_1.setBounds(410, 148, 374, 95);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("IS WAITING FOR YOU");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Spy Agency", Font.BOLD, 27));
		lblNewLabel_4_2.setBounds(410, 227, 374, 64);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\MINDWORK LOGO.png"));
		lblNewLabel_5.setBounds(410, 277, 374, 95);
		panel.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_3.setBounds(410, 383, 374, 45);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton FindMoreButton = new JButton("FIND OUT MORE");
		FindMoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mindwork frame = new Mindwork();
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