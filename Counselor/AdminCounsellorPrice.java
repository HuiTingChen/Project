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

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AdminCounsellorPrice extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField WELSON;
	private JTextField JIMMY;
	private JTextField GARY;
	private JTextField JOHNNY;
	private String WELSONobj, JIMMYobj, GARYobj, JOHNNYobj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCounsellorPrice frame = new AdminCounsellorPrice();
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
	public AdminCounsellorPrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(189, 59, 363, 213);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 343, 190);
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
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
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
				
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
			        WELSONobj = String.valueOf(model.getValueAt(i, 0));
			        JIMMYobj = String.valueOf(model.getValueAt(i, 1));
			        GARYobj = String.valueOf(model.getValueAt(i, 2));
			        JOHNNYobj = String.valueOf(model.getValueAt(i, 3));
				}
				
				try {
					Package pck = new Package(WELSONobj, JIMMYobj, GARYobj, JOHNNYobj); //open packagr page using constructor with 4 arguments
					pck.setVisible(true);
					dispose();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				}
			}
		);
		btnNewButton.setBounds(70, 225, 89, 23);
		contentPane.add(btnNewButton);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("COUNSELLOR CLASS PRICE SYSTEM (ADMIN ONLY)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 549, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRm = new JLabel("RM");
		lblRm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRm.setBounds(73, 59, 86, 20);
		contentPane.add(lblRm);
	}
}