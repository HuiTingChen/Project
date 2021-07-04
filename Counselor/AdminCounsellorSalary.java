package Counselor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


//import Lecturer.Order;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AdminCounsellorSalary extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField WELSON;
	private JTextField JIMMY;
	private JTextField GARY;
	private JTextField JOHNNY;
	private String WELSONobj, JIMMYobj, GARYobj, JOHNNYobj;
	private JTextField totalSalaryTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCounsellorSalary frame = new AdminCounsellorSalary();
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
	public AdminCounsellorSalary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(189, 59, 363, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 343, 96);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"WELSON", "JIMMY", "GARY", "JOHNNY"
			}
		));
		scrollPane.setViewportView(table);
		
		WELSON = new JTextField();
		WELSON.setBounds(73, 83, 86, 20);
		contentPane.add(WELSON);
		WELSON.setColumns(10);
		
		JIMMY = new JTextField();
		JIMMY.setBounds(73, 114, 86, 20);
		contentPane.add(JIMMY);
		JIMMY.setColumns(10);
		
		GARY = new JTextField();
		GARY.setBounds(73, 145, 86, 20);
		contentPane.add(GARY);
		GARY.setColumns(10);
		
		JOHNNY = new JTextField();
		JOHNNY.setBounds(73, 176, 86, 20);
		contentPane.add(JOHNNY);
		JOHNNY.setColumns(10);
		
		JButton uPDATEbUTTON = new JButton("UPDATE");
		uPDATEbUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						WELSON.getText(),
						JIMMY.getText(),
						GARY.getText(),
						JOHNNY.getText(),
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
		uPDATEbUTTON.setBounds(70, 225, 89, 23);
		contentPane.add(uPDATEbUTTON);
		
		JLabel lblNewLabel = new JLabel("WELSON");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 83, 86, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblJimmy = new JLabel("JIMMY");
		lblJimmy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJimmy.setBounds(10, 114, 86, 20);
		contentPane.add(lblJimmy);
		
		JLabel lblGary = new JLabel("GARY");
		lblGary.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGary.setBounds(10, 145, 86, 20);
		contentPane.add(lblGary);
		
		JLabel lblJohnny = new JLabel("JOHNNY");
		lblJohnny.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJohnny.setBounds(10, 176, 86, 20);
		contentPane.add(lblJohnny);
		
		JLabel lblNewLabel_1 = new JLabel("COUNSELLOR SALARY SYSTEM (ADMIN ONLY)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 549, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRm = new JLabel("RM");
		lblRm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRm.setBounds(73, 59, 86, 20);
		contentPane.add(lblRm);
		
		setTotalSalaryTextField(new JTextField());
		getTotalSalaryTextField().setBounds(412, 221, 140, 30);
		contentPane.add(getTotalSalaryTextField());
		getTotalSalaryTextField().setColumns(10);
		
		JButton btnTotalSalary = new JButton("Total Salary");
		btnTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int WelsonSalary, JimmySalary, GarySalary, JohnnySalary, totalSalary;
				try {
					WelsonSalary = Integer.parseInt(WELSON.getText());
					JimmySalary = Integer.parseInt(JIMMY.getText());
					GarySalary = Integer.parseInt(GARY.getText());
					JohnnySalary = Integer.parseInt(GARY.getText());
					totalSalary = WelsonSalary+JimmySalary+GarySalary+JohnnySalary;
					getTotalSalaryTextField().setText(Integer.toString(totalSalary));

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter the valid integer.");
				}
				
				String str=totalSalaryTextField.getText(); // read the totalSalaryTextField data
				
				FinanceC fin= new FinanceC();// fin created for class Finance()
				fin.SalaryUpdate(str); // Execute the method SalaryUpdate to pass str
				fin.setVisible(true); // Open the Finance.java window
				dispose(); // Close the AdminCounsellorSalary.java window
			}
		});
		btnTotalSalary.setBounds(313, 225, 89, 23);
		contentPane.add(btnTotalSalary);
		
		JLabel lblRm_1 = new JLabel("RM");
		lblRm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRm_1.setBounds(438, 201, 86, 20);
		contentPane.add(lblRm_1);
		
//		JButton btnNewButton_2 = new JButton("send to finance");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String str=totalSalaryTextField.getText(); // read the totalSalaryTextField data
//				
//				Finance fin= new Finance();// fin created for class Finance()
//				fin.SalaryUpdate(str); // Execute the method SalaryUpdate to pass str
//				fin.setVisible(true); // Open the Finance.java window
//				dispose(); // Close the AdminCounsellorSalary.java window
//				
////				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
////			        // null or not Integer will throw exception
////			        WELSONobj = String.valueOf(model.getValueAt(i, 0));
////			        JIMMYobj = String.valueOf(model.getValueAt(i, 1));
////			        GARYobj = String.valueOf(model.getValueAt(i, 2));
////			        JOHNNYobj = String.valueOf(model.getValueAt(i, 3));
////				}
////				
////				try {
////					Package pck = new Package(WELSONobj, JIMMYobj, GARYobj, JOHNNYobj); //open customer page using constructor with 5 arguments
////					pck.setVisible(true);
////					dispose();
////				} catch (Exception ee) {
////					ee.printStackTrace();
////				}
//			}
//		});
//		btnNewButton_2.setBounds(313, 425, 245, 23);
//		contentPane.add(btnNewButton_2);
		
		
		
		
	}

	public JTextField getTotalSalaryTextField() {
		return totalSalaryTextField;
	}

	public void setTotalSalaryTextField(JTextField totalSalaryTextField) {
		this.totalSalaryTextField = totalSalaryTextField;
	}
}