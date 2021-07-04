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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinanceC extends JFrame {

	private JPanel contentPane;
	private JTextField IncomeTextField;
	private JTextField CounsellorSalaryTextField;
	private JTextField RentalTextField;
	private JTextField GrossTextField;
	private JTextField NetTextField;
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
					FinanceC frame = new FinanceC();
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
	
	public void SalaryUpdate(String str) {
		CounsellorSalaryTextField.setText(str);
	}
	
	public void IncomeUpdate(String tcp) {
		IncomeTextField.setText(tcp);
	}
	
	public FinanceC() {
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
		
		JMenu FinanceMenu = new JMenu("Finance...");
		menuBar.add(FinanceMenu);
		
		JMenuItem FinancialMenuItem = new JMenuItem("Financial Statement...");
		FinancialMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceC frame = new FinanceC();
				frame.setVisible(true);
			}
		});
		FinanceMenu.add(FinancialMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1.setBounds(10, 11, 774, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FINANCIAL STATEMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 754, 33);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(10, 77, 774, 270);
		panel.add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 304, 67);
		panel_1_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("(COUNSELING FEES)");
		lblNewLabel_1_2.setBounds(52, 26, 198, 35);
		panel_2.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Angsana New", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL INCOME");
		lblNewLabel_1.setBounds(67, 0, 155, 35);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 30));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_3.setBounds(10, 101, 304, 67);
		panel_1_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("TOTAL COUNSELLOR SALARY");
		lblNewLabel_1_1.setBounds(10, 11, 284, 45);
		panel_3.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Angsana New", Font.BOLD, 28));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 192, 304, 67);
		panel_1_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("(RENTAL FEES)");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(10, 26, 284, 35);
		panel_2_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("TOTAL OPERATING EXPENSES");
		lblNewLabel_1_3.setFont(new Font("Angsana New", Font.BOLD, 28));
		lblNewLabel_1_3.setBounds(10, 0, 284, 35);
		panel_2_1.add(lblNewLabel_1_3);
		
		IncomeTextField = new JTextField();
		IncomeTextField.setBounds(371, 27, 143, 37);
		panel_1_1.add(IncomeTextField);
		IncomeTextField.setColumns(10);
		
		CounsellorSalaryTextField = new JTextField();
		CounsellorSalaryTextField.setColumns(10);
		CounsellorSalaryTextField.setBounds(371, 117, 143, 37);
		panel_1_1.add(CounsellorSalaryTextField);
		
		RentalTextField = new JTextField();
		RentalTextField.setColumns(10);
		RentalTextField.setBounds(371, 209, 143, 37);
		panel_1_1.add(RentalTextField);
		
		JButton GrossButton = new JButton("GROSS PROFIT");
		GrossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int income, salary, rental, gross;
				try {
					income = Integer.parseInt(IncomeTextField.getText());
					salary = Integer.parseInt(CounsellorSalaryTextField.getText());
					rental = Integer.parseInt(RentalTextField.getText());
					gross = income - salary;
					GrossTextField.setText(Integer.toString(gross));

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter the valid integer.");
				}
			}
		});
		GrossButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		GrossButton.setBounds(545, 41, 219, 37);
		panel_1_1.add(GrossButton);
		
		JButton NetButton = new JButton("NET PROFIT");
		NetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int income, salary, rental, gross, net;
				try {
					income = Integer.parseInt(IncomeTextField.getText());
					salary = Integer.parseInt(CounsellorSalaryTextField.getText());
					rental = Integer.parseInt(RentalTextField.getText());
					gross = income - salary;
					net = gross - rental;
					NetTextField.setText(Integer.toString(net));

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter the valid integer.");
				}
			}
		});
		NetButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		NetButton.setBounds(545, 151, 219, 37);
		panel_1_1.add(NetButton);
		
		GrossTextField = new JTextField();
		GrossTextField.setBounds(592, 84, 143, 37);
		panel_1_1.add(GrossTextField);
		GrossTextField.setColumns(10);
		
		NetTextField = new JTextField();
		NetTextField.setColumns(10);
		NetTextField.setBounds(592, 192, 143, 37);
		panel_1_1.add(NetTextField);
		
		JLabel lblNewLabel_2 = new JLabel("RM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(324, 27, 37, 37);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("RM");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(324, 117, 37, 37);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("RM");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(324, 209, 37, 37);
		panel_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("RM");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(545, 84, 37, 37);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("RM");
		lblNewLabel_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_1.setBounds(545, 192, 37, 37);
		panel_1_1.add(lblNewLabel_2_3_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 358, 774, 70);
		panel.add(panel_1_2);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.setFont(new Font("Angsana New", Font.BOLD, 30));
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncomeTextField.setText("");
				CounsellorSalaryTextField.setText("");
				RentalTextField.setText("");
				GrossTextField.setText("");
				NetTextField.setText("");
			}
		});
		ResetButton.setBounds(23, 11, 357, 48);
		panel_1_2.add(ResetButton);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ExitButton.setFont(new Font("Angsana New", Font.BOLD, 30));
		ExitButton.setBounds(390, 11, 357, 48);
		panel_1_2.add(ExitButton);
	}
}