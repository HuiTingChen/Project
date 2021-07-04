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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class CustomersA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField NameTextField;
	private JTextField ContactTextField;
	private JTextField IcTextField;
	private JTable table;
	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomersA frame = new CustomersA();
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
	public CustomersA() {
		setTitle("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
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
		panel_1.setBackground(Color.YELLOW);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1.setBounds(10, 11, 774, 52);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("EBook Enterprise");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 774, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2.setBounds(10, 73, 316, 289);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Corbel", Font.BOLD, 20));
		NameLabel.setBackground(Color.WHITE);
		NameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		NameLabel.setBounds(10, 25, 121, 34);
		panel_2.add(NameLabel);
		
		JLabel ContactLabel = new JLabel("Address");
		ContactLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ContactLabel.setFont(new Font("Corbel", Font.BOLD, 20));
		ContactLabel.setBackground(Color.WHITE);
		ContactLabel.setBounds(10, 62, 121, 34);
		panel_2.add(ContactLabel);
		
		JLabel IcLabel = new JLabel("No. phone");
		IcLabel.setHorizontalAlignment(SwingConstants.LEFT);
		IcLabel.setFont(new Font("Corbel", Font.BOLD, 20));
		IcLabel.setBackground(Color.WHITE);
		IcLabel.setBounds(0, 163, 121, 34);
		panel_2.add(IcLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 39, 53, -1);
		panel_2.add(textField);
		textField.setColumns(10);
		
		NameTextField = new JTextField();
		NameTextField.setBounds(98, 32, 179, 20);
		panel_2.add(NameTextField);
		NameTextField.setColumns(10);
		
		ContactTextField = new JTextField();
		ContactTextField.setColumns(10);
		ContactTextField.setBounds(98, 69, 179, 20);
		panel_2.add(ContactTextField);
		
		IcTextField = new JTextField();
		IcTextField.setColumns(10);
		IcTextField.setBounds(98, 170, 179, 20);
		panel_2.add(IcTextField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(98, 101, 179, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(98, 131, 179, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(98, 207, 179, 20);
		panel_2.add(textField_3);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Corbel", Font.BOLD, 20));
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(10, 207, 121, 34);
		panel_2.add(lblEmail);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(336, 73, 448, 289);
		panel.add(panel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 428, 226);
		panel_2_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "No. Phone", "email"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\CustomerInformation.txt");
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
		UploadButton.setFont(new Font("Corbel", Font.BOLD, 20));
		UploadButton.setBounds(175, 248, 110, 30);
		panel_2_1.add(UploadButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(10, 373, 774, 55);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton AddRecordButton = new JButton("Add Data");
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						NameTextField.getText(),
						ContactTextField.getText(),
						IcTextField.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Update confirmed", "Customer Information System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		AddRecordButton.setBounds(10, 16, 113, 30);
		AddRecordButton.setFont(new Font("Corbel", Font.BOLD, 20));
		panel_3.add(AddRecordButton);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(NameTextField.getText(),i,0);
			    	model.setValueAt(ContactTextField.getText(),i,1);
			    	model.setValueAt(IcTextField.getText(),i,2);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		UpdateButton.setFont(new Font("Corbel", Font.BOLD, 20));
		UpdateButton.setBounds(147, 16, 110, 30);
		panel_3.add(UpdateButton);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameTextField.setText("");
				ContactTextField.setText("");
				IcTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("Corbel", Font.BOLD, 20));
		ResetButton.setBounds(283, 16, 110, 30);
		panel_3.add(ResetButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Information System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Information System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Corbel", Font.BOLD, 20));
		DeleteButton.setBounds(403, 16, 110, 30);
		panel_3.add(DeleteButton);
		
		JButton PrintButton = new JButton("Print");
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		PrintButton.setFont(new Font("Corbel", Font.BOLD, 20));
		PrintButton.setBounds(523, 16, 110, 30);
		panel_3.add(PrintButton);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Information System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Corbel", Font.BOLD, 20));
		ExitButton.setBounds(654, 16, 110, 30);
		panel_3.add(ExitButton);
	}
}