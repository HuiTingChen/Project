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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Package extends JFrame {


	
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
	private static String Welson;
	private static String Jimmy;
	private static String Gary;
	private static String Johnny;
	private JTextField totalPriceTextField;

	/**
	 * Launch the application.
	 */

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package frame = new Package(Welson, Jimmy, Gary, Johnny);
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
	//public Package() {}
	public Package(String WELSONobj, String JIMMYobj, String GARYobj, String JOHNNYobj) {
		
		this.Welson = WELSONobj;
		this.Jimmy = JIMMYobj;
		this.Gary = GARYobj;
		this.Johnny = JOHNNYobj;
		
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
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 774, 58);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("PACKAGE SELECTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 754, 36);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(277, 80, 507, 279);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 487, 213);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "CLASS AMOUNT", "COUNSELLOR", "PRICE PER CLASS", "TOTAL PRICE"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(77);
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		table.getColumnModel().getColumn(4).setPreferredWidth(77);
		scrollPane.setViewportView(table);
		
		totalPriceTextField = new JTextField();
		totalPriceTextField.setBounds(370, 235, 127, 33);
		panel_1_1.add(totalPriceTextField);
		totalPriceTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("TOTAL PRICE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int sum = 0;
			        for(int i = 0; i < table.getRowCount(); i++)
			        {
			           double val = Double.valueOf(table.getValueAt(i, 4).toString());
			           sum+=val;
			        }
			        
			        totalPriceTextField.setText(Double.toString(sum));
			        
					String tcp =totalPriceTextField.getText(); // read the totalSalaryTextField data
					
					FinanceC fin2= new FinanceC();// fin created for class Finance()
					fin2.IncomeUpdate(tcp); // Execute the method IncomeUpdate to pass tcp
					fin2.setVisible(true); // Open the Finance.java window
					dispose(); // Close the AdminCounsellorSalary.java window
			        
			}
		});
		btnNewButton.setBounds(233, 240, 127, 23);
		panel_1_1.add(btnNewButton);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(277, 370, 507, 58);
		panel.add(panel_1_2);
		
		UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Counselor\\PackageInformation.txt");
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
		UploadButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		UploadButton.setBounds(10, 11, 240, 36);
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
		ExitButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		ExitButton.setBounds(263, 11, 234, 36);
		panel_1_2.add(ExitButton);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLUE));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(10, 80, 257, 348);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 11, 74, 29);
		panel_1_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PAYMENT METHOD : ");
		lblNewLabel_1_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 51, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		CashRadioButton = new JRadioButton("CASH");
		CashRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CashRadioButton.isSelected()) {
					CardRadioButton.setSelected(false);
				}
			}
		});
		CashRadioButton.setBounds(10, 87, 109, 23);
		panel_1_1_1.add(CashRadioButton);
		
		CardRadioButton = new JRadioButton("CARD");
		CardRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CardRadioButton.isSelected()) {
					CashRadioButton.setSelected(false);
				}
			}
		});
		CardRadioButton.setBounds(129, 87, 109, 23);
		panel_1_1_1.add(CardRadioButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("COUNSELLOR : ");
		lblNewLabel_1_1_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(10, 117, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		WelsonRadioButton = new JRadioButton("Welson Chua");
		WelsonRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(WelsonRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		WelsonRadioButton.setBounds(10, 153, 109, 23);
		panel_1_1_1.add(WelsonRadioButton);
		
		JimmyRadioButton = new JRadioButton("Jimmy Chu");
		JimmyRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JimmyRadioButton.isSelected()) {
					WelsonRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		JimmyRadioButton.setBounds(129, 153, 109, 23);
		panel_1_1_1.add(JimmyRadioButton);
		
		GaryRadioButton = new JRadioButton("Gary Ng");
		GaryRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(GaryRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					WelsonRadioButton.setSelected(false);
					JohnnyRadioButton.setSelected(false);
			}
		}});
		GaryRadioButton.setBounds(10, 179, 109, 23);
		panel_1_1_1.add(GaryRadioButton);
		
		JohnnyRadioButton = new JRadioButton("Johnny Xu");
		JohnnyRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JohnnyRadioButton.isSelected()) {
					JimmyRadioButton.setSelected(false);
					GaryRadioButton.setSelected(false);
					WelsonRadioButton.setSelected(false);
			}
		}});
		JohnnyRadioButton.setBounds(129, 179, 109, 23);
		panel_1_1_1.add(JohnnyRadioButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("CLASS AMOUNT : ");
		lblNewLabel_1_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(10, 209, 180, 29);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		ThreeRadioButton = new JRadioButton("3");
		ThreeRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ThreeRadioButton.isSelected()) {
					SixRadioButton.setSelected(false);
					TwelveRadioButton.setSelected(false);
			}
		}});
		ThreeRadioButton.setBounds(10, 245, 41, 23);
		panel_1_1_1.add(ThreeRadioButton);
		
		SixRadioButton = new JRadioButton("6");
		SixRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(SixRadioButton.isSelected()) {
					ThreeRadioButton.setSelected(false);
					TwelveRadioButton.setSelected(false);
			}
		}});
		SixRadioButton.setBounds(73, 245, 41, 23);
		panel_1_1_1.add(SixRadioButton);
		
		TwelveRadioButton = new JRadioButton("12");
		TwelveRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TwelveRadioButton.isSelected()) {
					SixRadioButton.setSelected(false);
					ThreeRadioButton.setSelected(false);
			}
		}});
		TwelveRadioButton.setBounds(129, 245, 41, 23);
		panel_1_1_1.add(TwelveRadioButton);
		
		JButton ConfirmButton = new JButton("CONFIRM");
		ConfirmButton.setFont(new Font("Angsana New", Font.BOLD, 20));
		ConfirmButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String counsellor = " ";
					String priceC = " ";

					double pWelson = Double.parseDouble(WELSONobj);
					double pJimmy = Double.parseDouble(JIMMYobj);
					double pGary = Double.parseDouble(GARYobj);
					double pJohnny = Double.parseDouble(JOHNNYobj);
									
					if (WelsonRadioButton.isSelected()) {
						counsellor = WelsonRadioButton.getText();
						priceC = Double. toString(pWelson); //convert double into String
					} 
					else if (JimmyRadioButton.isSelected()){
						counsellor = JimmyRadioButton.getText();
						priceC = Double. toString(pJimmy);
					}
					else if (GaryRadioButton.isSelected()){
						counsellor = GaryRadioButton.getText();
						priceC = Double. toString(pGary);
					}
					else if (JohnnyRadioButton.isSelected()){
						counsellor = JohnnyRadioButton.getText();
						priceC = Double. toString(pJohnny);
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
		ConfirmButton.setBounds(10, 292, 228, 29);
		panel_1_1_1.add(ConfirmButton);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Angsana New", Font.BOLD, 25));
		NameTextField.setBounds(88, 11, 150, 35);
		panel_1_1_1.add(NameTextField);
		NameTextField.setColumns(10);
	}
}