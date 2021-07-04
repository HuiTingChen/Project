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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EBookEnterprise extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EBookEnterprise frame = new EBookEnterprise();
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
	public EBookEnterprise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 510);
		
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
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 44, 774, 385);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO");
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		lblNewLabel.setBounds(278, 87, 234, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblMindworkPsychological = new JLabel("EBook Enterprise");
		lblMindworkPsychological.setHorizontalAlignment(SwingConstants.CENTER);
		lblMindworkPsychological.setFont(new Font("Freestyle Script", Font.PLAIN, 50));
		lblMindworkPsychological.setBounds(10, 135, 754, 41);
		panel_1.add(lblMindworkPsychological);
		
		JLabel lblNewLabel_2 = new JLabel("contact us at 04-7126382");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(363, 317, 478, 68);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("e-mail us at ebookenterprise@gmail.com");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(363, 286, 478, 68);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Shah Alam, Selangor");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(374, 263, 478, 68);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("12, Jalan Gangsa, Bagunan Persendirian, 06200");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(363, 239, 478, 68);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblWhereYourImagination = new JLabel("where your imagination comes true!");
		lblWhereYourImagination.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhereYourImagination.setFont(new Font("Freestyle Script", Font.PLAIN, 50));
		lblWhereYourImagination.setBounds(10, 188, 754, 41);
		panel_1.add(lblWhereYourImagination);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePageA frame = new HomePageA();
				frame.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(10, 11, 70, 23);
		panel.add(btnNewButton);
	}
}