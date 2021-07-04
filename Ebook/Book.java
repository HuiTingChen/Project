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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Book extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JFrame frame;
	private JTextField NameTextField;
	private JRadioButton CardRadioButton;
	private JRadioButton CashRadioButton;
	private JRadioButton WelsonRadioButton;
	private JRadioButton JimmyRadioButton;
	private JRadioButton GaryRadioButton;
	private JRadioButton JohnnyRadioButton;
	private JRadioButton ThreeRadioButton;
	private JRadioButton SixRadioButton;
	private JRadioButton TwelveRadioButton;
	private JButton UploadButton;
	private JButton ExitButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book frame = new Book();
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
	public Book() {
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
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(277, 80, 507, 279);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 11, 487, 257);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Price", "Genre"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(77);
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		table.getColumnModel().getColumn(4).setPreferredWidth(77);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_2.setBackground(Color.LIGHT_GRAY);
		panel_1_2.setBounds(473, 370, 311, 58);
		panel.add(panel_1_2);
		
		UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\PackageInformation.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		UploadButton.setFont(new Font("Corbel", Font.BOLD, 18));
		UploadButton.setBounds(10, 11, 137, 36);
		panel_1_2.add(UploadButton);
		
		ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Package Selection System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Corbel", Font.BOLD, 18));
		ExitButton.setBounds(176, 11, 125, 36);
		panel_1_2.add(ExitButton);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_1.setBounds(10, 80, 257, 348);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 74, 29);
		panel_1_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Choose Payment Method");
		lblNewLabel_1_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 51, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		CashRadioButton = new JRadioButton("cash");
		CashRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CashRadioButton.isSelected()) {
					CardRadioButton.setSelected(false);
				}
			}
		});
		CashRadioButton.setBounds(10, 87, 109, 23);
		panel_1_1_1.add(CashRadioButton);
		
		CardRadioButton = new JRadioButton("online payment");
		CardRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CardRadioButton.isSelected()) {
					CashRadioButton.setSelected(false);
				}
			}
		});
		CardRadioButton.setBounds(129, 87, 109, 23);
		panel_1_1_1.add(CardRadioButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Genre");
		lblNewLabel_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 117, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		WelsonRadioButton = new JRadioButton("Thriller");
		WelsonRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(WelsonRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		WelsonRadioButton.setBounds(10, 140, 109, 23);
		panel_1_1_1.add(WelsonRadioButton);
		
		JimmyRadioButton = new JRadioButton("Historical");
		JimmyRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JimmyRadioButton.isSelected()) {
					WelsonRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		JimmyRadioButton.setBounds(129, 140, 109, 23);
		panel_1_1_1.add(JimmyRadioButton);
		
		GaryRadioButton = new JRadioButton("Science Fiction");
		GaryRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(GaryRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					WelsonRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		GaryRadioButton.setBounds(10, 165, 109, 23);
		panel_1_1_1.add(GaryRadioButton);
		
		JohnnyRadioButton = new JRadioButton("Non-fiction");
		JohnnyRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JohnnyRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					WelsonRadioButton.setSelected(false);
			}
		}});
		JohnnyRadioButton.setBounds(129, 165, 109, 23);
		panel_1_1_1.add(JohnnyRadioButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price Category");
		lblNewLabel_1_2.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 194, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		ThreeRadioButton = new JRadioButton("RM15");
		ThreeRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ThreeRadioButton.isSelected()) {
					SixRadioButton.setSelected(false);
					TwelveRadioButton.setSelected(false);
			}
		}});
		ThreeRadioButton.setBounds(10, 218, 85, 23);
		panel_1_1_1.add(ThreeRadioButton);
		
		SixRadioButton = new JRadioButton("RM25");
		SixRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(SixRadioButton.isSelected()) {
					ThreeRadioButton.setSelected(false);
					TwelveRadioButton.setSelected(false);
			}
		}});
		SixRadioButton.setBounds(10, 245, 85, 23);
		panel_1_1_1.add(SixRadioButton);
		
		TwelveRadioButton = new JRadioButton("RM30");
		TwelveRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TwelveRadioButton.isSelected()) {
					SixRadioButton.setSelected(false);
					ThreeRadioButton.setSelected(false);
			}
		}});
		TwelveRadioButton.setBounds(10, 270, 85, 23);
		panel_1_1_1.add(TwelveRadioButton);
		
		JButton ConfirmButton = new JButton("CONFIRM");
		ConfirmButton.setFont(new Font("Corbel", Font.BOLD, 18));
		ConfirmButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String counsellor = " ";
					String priceC = " ";
					double Welson = 50;
					double Jimmy = 50;
					double Gary = 45;
					double Johnny= 45;
									
					if (WelsonRadioButton.isSelected()) {
						counsellor = WelsonRadioButton.getText();
						priceC = Double. toString(Welson); //convert double into String
					} 
					else if (JimmyRadioButton.isSelected()){
						counsellor = JimmyRadioButton.getText();
						priceC = Double. toString(Jimmy);
					}
					else if (GaryRadioButton.isSelected()){
						counsellor = GaryRadioButton.getText();
						priceC = Double. toString(Gary);
					}
					else if (JohnnyRadioButton.isSelected()){
						counsellor = JohnnyRadioButton.getText();
						priceC = Double. toString(Johnny);
					}
					
					String classAmount = " ";
					String amount = " ";
					double threeClass = 3;
					double sixClass = 6;
					double twelveClass = 12;
					
					if (ThreeRadioButton.isSelected()) {
						classAmount = ThreeRadioButton.getText();
						amount = Double. toString(threeClass);
					} 
					else if (SixRadioButton.isSelected()) {
						classAmount = SixRadioButton.getText();
						amount = Double. toString(sixClass);
					}
					else if (TwelveRadioButton.isSelected()) {
						classAmount = TwelveRadioButton.getText();
						amount = Double. toString(twelveClass);
					}
					
					double totalPrice = Double.parseDouble(priceC) * Double.parseDouble(amount); //convert String to double
					String totalPriceStr = Double. toString(totalPrice);
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							NameTextField.getText(),
							classAmount,
							counsellor,
							priceC,
							totalPriceStr,
													
					});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Sum With Us Management System",
									JOptionPane.OK_OPTION);
						}
					}
				}
			});
		ConfirmButton.setBounds(127, 309, 111, 29);
		panel_1_1_1.add(ConfirmButton);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Angsana New", Font.BOLD, 25));
		NameTextField.setBounds(69, 11, 169, 23);
		panel_1_1_1.add(NameTextField);
		NameTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Book Selection");
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 50));
		lblNewLabel.setBounds(209, 10, 775, 60);
		panel.add(lblNewLabel);
	}
}