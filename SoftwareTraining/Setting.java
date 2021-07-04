package SoftwareTraining;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;

public class Setting extends JFrame {

	private Image img_close = new ImageIcon(Home.class.getResource("closebtn.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img_return = new ImageIcon(Home.class.getResource("return.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	protected Component frame;
	static JTable tableF;
	static JTable tableCD;
	private JTextField txtEx;
	private JTextField txtPs;
	private JTextField txtPr;
	private JTextField txtCB1;
	private JTextField txtCB2;
	private JTextField txtDis;
	static String ex,ps,pr,cb1,cb2,dis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame = new Setting();
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
	public Setting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 986, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 986, 74);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 102));
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
		panel_1_1.setBounds(0, 489, 986, 74);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 0, 102));
		panel.add(panel_1_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelf = (DefaultTableModel)tableF.getModel();
				DefaultTableModel modelcd = (DefaultTableModel)tableCD.getModel();
				int i = tableF.getSelectedRow();
				int j = tableCD.getSelectedRow();
				
			    if(i>=0 && j>=0) //if single row is selected than update
			    {
			    	
			    	modelf.setValueAt(txtEx.getText(), i, 0);
			    	modelf.setValueAt(txtPs.getText(), i, 1);
			    	modelf.setValueAt(txtPr.getText(), i, 2);
			    
			    	modelcd.setValueAt(txtCB1.getText(), j, 0);
			    	modelcd.setValueAt(txtCB2.getText(), j, 1);
			    	modelcd.setValueAt(txtDis.getText(), j, 2);

					
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row for Fee and Cash back & Discount First!");
			    }
			    
			    //How to read data in table
				
				for (int n = 0 ; n < modelf.getRowCount() ; n++) { //use n - read only the current update of row/data
			        // null or not Integer will throw exception
			        ex = String.valueOf(modelf.getValueAt(n, 0));
			        ps = String.valueOf(modelf.getValueAt(n, 1));
			        pr = String.valueOf(modelf.getValueAt(n, 2));
				}
				
				for (int n = 0 ; n < modelcd.getRowCount() ; n++) { //use n - read only the current update of row/data
			        // null or not Integer will throw exception
			        cb1 = String.valueOf(modelcd.getValueAt(n, 0));
			        cb2 = String.valueOf(modelcd.getValueAt(n, 1));
			        dis = String.valueOf(modelcd.getValueAt(n, 2));  
				}
			    
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(204, 204, 255));
		btnUpdate.setBounds(137, 15, 208, 41);
		panel_1_1.add(btnUpdate);

		JLabel lblManagement = new JLabel("Setting");
		lblManagement.setBounds(23, 74, 240, 54);
		lblManagement.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblManagement.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(lblManagement);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setBounds(508, 170, 456, 120);
		panel.add(scrollPane_1);
		
		tableF = new JTable();
		tableF.setModel(new DefaultTableModel(
			new Object[][] {
				{"600", "1600", "2000"},
			},
			new String[] {
				"Excel", "Adobe Photoshop", "Adobe Premiere Pro"
			}
		));
		tableF.getColumnModel().getColumn(2).setPreferredWidth(108);
		scrollPane_1.setViewportView(tableF);
		
		JLabel lblreturn = new JLabel("");
		lblreturn.setBounds(931, 74, 55, 55);
		panel.add(lblreturn);
		lblreturn.setBorder(null);
		lblreturn.setBackground(Color.WHITE);
		lblreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminMain am = new AdminMain();
				am.setVisible(true);
				dispose();
			}
		});
		lblreturn.setIcon(new ImageIcon(img_return));
		lblreturn.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(23, 139, 456, 339);
		panel.add(panel_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClear.setBackground(new Color(204, 204, 255));
		btnClear.setBounds(380, 308, 71, 25);
		panel_2.add(btnClear);
		
		JLabel lblE = new JLabel("Excel");
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblE.setBounds(10, 38, 132, 39);
		panel_2.add(lblE);
		
		JLabel lblFee = new JLabel();
		lblFee.setText("Fee");
		lblFee.setFont(new Font("Dialog", Font.BOLD, 22));
		lblFee.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblFee.setBounds(10, 11, 154, 26);
		panel_2.add(lblFee);
		
		JLabel lblPS = new JLabel("Photoshop");
		lblPS.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPS.setBounds(10, 79, 132, 39);
		panel_2.add(lblPS);
		
		JLabel lblPR = new JLabel("Premiere Pro");
		lblPR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPR.setBounds(10, 121, 132, 39);
		panel_2.add(lblPR);
		
		txtEx = new JTextField();
		txtEx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEx.setColumns(10);
		txtEx.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtEx.setBackground(new Color(204, 255, 255));
		txtEx.setBounds(168, 42, 105, 35);
		panel_2.add(txtEx);
		
		txtPs = new JTextField();
		txtPs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPs.setColumns(10);
		txtPs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPs.setBackground(new Color(204, 255, 255));
		txtPs.setBounds(168, 83, 105, 35);
		panel_2.add(txtPs);
		
		txtPr = new JTextField();
		txtPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPr.setColumns(10);
		txtPr.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPr.setBackground(new Color(204, 255, 255));
		txtPr.setBounds(168, 125, 105, 35);
		panel_2.add(txtPr);
		
		JLabel lblRM = new JLabel(":  RM");
		lblRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM.setBounds(96, 38, 62, 39);
		panel_2.add(lblRM);
		
		JLabel lblRM_1 = new JLabel(":  RM");
		lblRM_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM_1.setBounds(96, 79, 62, 39);
		panel_2.add(lblRM_1);
		
		JLabel lblRM_1_1 = new JLabel(":  RM");
		lblRM_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM_1_1.setBounds(96, 121, 62, 39);
		panel_2.add(lblRM_1_1);
		
		JLabel lblCashBack_1 = new JLabel();
		lblCashBack_1.setText("Cash Back & Discount");
		lblCashBack_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblCashBack_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblCashBack_1.setBounds(10, 181, 282, 26);
		panel_2.add(lblCashBack_1);
		
		JLabel lblPhotoshopPremiere = new JLabel("Photoshop & Premiere Pro");
		lblPhotoshopPremiere.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhotoshopPremiere.setBounds(10, 206, 208, 39);
		panel_2.add(lblPhotoshopPremiere);
		
		JLabel lblRM_2 = new JLabel(":  RM");
		lblRM_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM_2.setBounds(193, 206, 62, 39);
		panel_2.add(lblRM_2);
		
		txtCB1 = new JTextField();
		txtCB1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCB1.setColumns(10);
		txtCB1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCB1.setBackground(new Color(204, 255, 255));
		txtCB1.setBounds(265, 210, 105, 35);
		panel_2.add(txtCB1);
		
		JLabel lblAllTypes = new JLabel("All 3 types");
		lblAllTypes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAllTypes.setBounds(10, 247, 132, 39);
		panel_2.add(lblAllTypes);
		
		txtCB2 = new JTextField();
		txtCB2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCB2.setColumns(10);
		txtCB2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCB2.setBackground(new Color(204, 255, 255));
		txtCB2.setBounds(265, 251, 105, 35);
		panel_2.add(txtCB2);
		
		JLabel lblRM_1_2 = new JLabel(":  RM");
		lblRM_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM_1_2.setBounds(193, 247, 62, 39);
		panel_2.add(lblRM_1_2);
		
		JLabel lblDiscountRate = new JLabel("Discount Rate (%)\r\n");
		lblDiscountRate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDiscountRate.setBounds(10, 289, 168, 39);
		panel_2.add(lblDiscountRate);
		
		JLabel lblRM_1_1_1 = new JLabel(":");
		lblRM_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRM_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRM_1_1_1.setBounds(203, 289, 29, 39);
		panel_2.add(lblRM_1_1_1);
		
		txtDis = new JTextField();
		txtDis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDis.setColumns(10);
		txtDis.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtDis.setBackground(new Color(204, 255, 255));
		txtDis.setBounds(265, 293, 105, 35);
		panel_2.add(txtDis);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(508, 358, 456, 120);
		panel.add(scrollPane);
		
		tableCD = new JTable();
		tableCD.setModel(new DefaultTableModel(
			new Object[][] {
				{"20", "30", "5"},
			},
			new String[] {
				"Photoshop & Premiere Pro", "All 3 types", "Discount (%)"
			}
		));
		scrollPane.setViewportView(tableCD);
		
		JLabel lblCashBack = new JLabel();
		lblCashBack.setText("Cash Back & Discount");
		lblCashBack.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCashBack.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblCashBack.setBounds(508, 327, 394, 26);
		panel.add(lblCashBack);
		
		JLabel lblFee_1 = new JLabel();
		lblFee_1.setText("Fee");
		lblFee_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFee_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblFee_1.setBounds(508, 139, 394, 26);
		panel.add(lblFee_1);
		
	}
	
}