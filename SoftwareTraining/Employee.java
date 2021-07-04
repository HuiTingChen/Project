package SoftwareTraining;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Employee extends JFrame {
	
	private Image img_close = new ImageIcon(Home.class.getResource("closebtn.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img_return = new ImageIcon(Home.class.getResource("return.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtName;
	private JTable table;
	private JComboBox sltType;
	private JTextField txtTotal;
	protected String salary;
	private JTextField totalstudent;
	private JTextField totalclass;
	protected double totalSalary;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 986, 563);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(0, 0, 986, 74);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Chen Software Training Centre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 966, 52);
		panel_1.add(lblNewLabel);
		
		JLabel lblclose = new JLabel("");
		lblclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you confirm to exit", "Software Training Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setBounds(955, 3, 30, 30);
		lblclose.setIcon(new ImageIcon(img_close));
		panel_1.add(lblclose);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 0, 102));
		panel_1_1.setBounds(0, 489, 986, 74);
		panel.add(panel_1_1);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 20));
		btnPrint.setBackground(new Color(204, 204, 255));
		btnPrint.setBounds(652, 15, 118, 41);
		panel_1_1.add(btnPrint);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\SoftwareTraining\\EmployeeFile.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n____________________________________________________________________________\n");
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
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Dialog", Font.BOLD, 20));
		btnUpload.setBackground(new Color(204, 204, 255));
		btnUpload.setBounds(841, 15, 118, 41);
		panel_1_1.add(btnUpload);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDelete.setBackground(new Color(204, 204, 255));
		btnDelete.setBounds(462, 15, 106, 41);
		panel_1_1.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(334, 15, 118, 41);
		panel_1_1.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	
			    	model.setValueAt(txtName.getText(), i, 0);
			    	model.setValueAt(sltType.getSelectedItem(), i, 1);
			    	model.setValueAt(totalstudent.getText(), i, 2);
					model.setValueAt(totalclass.getText(), i, 3);
					model.setValueAt(totalSalary, i, 4);
					
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			
			}
		});
		btnUpdate.setForeground(new Color(0, 0, 0));
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(204, 204, 255));
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Finance fin = new Finance();
				fin.setVisible(true);
				Finance.totSly.setText(Double.toString(totalSalary));
				dispose();
			}
		});
		btnFinance.setForeground(Color.BLACK);
		btnFinance.setFont(new Font("Dialog", Font.BOLD, 20));
		btnFinance.setBackground(new Color(204, 204, 255));
		btnFinance.setBounds(23, 15, 207, 41);
		panel_1_1.add(btnFinance);
		
		JLabel lblNewLabel_1 = new JLabel("Employee");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(23, 74, 240, 54);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(SystemColor.controlHighlight));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(23, 139, 380, 239);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(10, 11, 132, 39);
		panel_2.add(lblName);
		
		txtName = new JTextField();
		txtName.setBackground(new Color(204, 255, 255));
		txtName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(154, 17, 218, 35);
		panel_2.add(txtName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblType.setBounds(10, 61, 132, 39);
		panel_2.add(lblType);
		
		sltType = new JComboBox();
		sltType.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Excel", "Adobe Photoshop", "Adobe Premiere Pro"}));
		sltType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sltType.setBackground(Color.WHITE);
		sltType.setBounds(152, 63, 218, 35);
		panel_2.add(sltType);
		
		JLabel lblStudent = new JLabel("Total Students");
		lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudent.setBounds(10, 111, 132, 39);
		panel_2.add(lblStudent);
		
		totalstudent = new JTextField();
		totalstudent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalstudent.setColumns(10);
		totalstudent.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totalstudent.setBackground(new Color(204, 255, 255));
		totalstudent.setBounds(153, 111, 219, 35);
		panel_2.add(totalstudent);
		
		JLabel lblClass = new JLabel("Total Classes");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClass.setBounds(10, 152, 132, 39);
		panel_2.add(lblClass);
		
		totalclass = new JTextField();
		totalclass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalclass.setColumns(10);
		totalclass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totalclass.setBackground(new Color(204, 255, 255));
		totalclass.setBounds(153, 158, 219, 35);
		panel_2.add(totalclass);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(299, 204, 71, 25);
		panel_2.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				sltType.setSelectedItem("Select Type");
				totalstudent.setText("");
				totalclass.setText("");	
			}
		});
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClear.setBackground(SystemColor.controlHighlight);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(428, 139, 535, 293);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Type", "Total Students", "Classes", "Total Salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblreturn = new JLabel("");
		lblreturn.setBounds(931, 74, 55, 55);
		panel.add(lblreturn);
		lblreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminMain am = new AdminMain();
				am.setVisible(true);
				dispose();
			}
		});
		lblreturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblreturn.setBorder(new LineBorder(Color.WHITE, 1, true));
		lblreturn.setBackground(Color.WHITE);
		lblreturn.setIcon(new ImageIcon(img_return));
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTotal.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		txtTotal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtTotal.setBackground(Color.WHITE);
		txtTotal.setBounds(844, 443, 119, 35);
		panel.add(txtTotal);
		
		JLabel lblName_1 = new JLabel("Total   : RM");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_1.setBounds(719, 441, 138, 39);
		panel.add(lblName_1);
		
		JButton btnNewButton = new JButton("Add Records");
		btnNewButton.setBorder(new LineBorder(new Color(102, 204, 204), 4, true));
		btnNewButton.setBounds(112, 411, 196, 48);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				//for select type and fee
				double fee = 0;
				Payment s = new TotalSalary(); // create a new object 
				Fee ex = new ExcelFee();
				Fee ps = new PhotoshopFee();
				Fee pr = new PremiereFee();

				if (sltType.getSelectedItem().equals("Excel")) { 
					fee = ex.fee();
				}
				else if (sltType.getSelectedItem().equals("Adobe Photoshop")) { 
					fee = ps.fee();
				}
				else if (sltType.getSelectedItem().equals("Adobe Premiere Pro")) { 
					fee = pr.fee();
				}
				
				//for calculate total salary
				int n = Integer.parseInt(totalclass.getText());
				salary = (String.format("%.2f", s.getPayment(fee,n)));
				
				//Display information in table
				model.addRow(new Object[]{
						txtName.getText(),
						sltType.getSelectedItem(),
						totalstudent.getText(),
						totalclass.getText(),	
						salary,
					});
				
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String slr = String.valueOf(model.getValueAt(i, 4));
			        
			        totalSalary += Double.parseDouble(slr);
			    }
			    
			    txtTotal.setText(String.valueOf(totalSalary));
			    
				JOptionPane.showMessageDialog(null, "Add successfully.");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(102, 204, 204));
		
	}
	
}