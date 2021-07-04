package SoftwareTraining;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Finance extends JFrame {
	
	private Image img_close = new ImageIcon(Home.class.getResource("closebtn.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img_return = new ImageIcon(Home.class.getResource("return.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	static JTextField totSly;
	protected JFrame frame;
	private JTextField txtProfit;
	protected String salary;
	private JTextField totProFee;
	private JTextField totEx;
	protected double totalSalary;
	private JLabel lblExpenses;
	private JLabel lblSalary;
	private JLabel lblPromotionFee;
	private JTextField txtSalary;
	private JLabel lblIncome;
	private JLabel lblEx;
	private JLabel lblPs;
	private JTextField txtProFee;
	private JTextField txtEx;
	private JTextField txtPs;
	private JTextField txtPr;
	private JTextField txtTotExpen;
	private JTextField txtTotIn;
	private JTextField totPs;
	private JTextField totPr;
	private JButton btnCalculate;
	private JPanel panel_3;
	protected JComboBox sltType;
	protected JLabel totalclass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
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
					txtProfit.print();
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
				//upload all the information into text file
				try {
				File file = new File("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\SoftwareTraining\\FinanceFile.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
					bw.write("___________Chen Software Training Centre___________\n" +
							String.format("%-20s%9s%15s\n", "","RM","RM") +
							String.format("%-20s\n","Expenses") + 
							String.format("%-20s%15.2f\n","Salary",Double.parseDouble(txtSalary.getText())) +
							String.format("%-20s%15.2f%15.2f\n\n\n","Promotion Fee" , Double.parseDouble(txtProFee.getText()), Double.parseDouble(txtTotExpen.getText())) +
							String.format("%-20s\n","Income") + 
							String.format("%-20s%15.2f\n","Excel",Double.parseDouble(txtEx.getText())) +
							String.format("%-20s%15.2f\n","Photoshop",Double.parseDouble(txtPs.getText())) +
							String.format("%-20s%15.2f%15.2f\n","Premiere Pro" , Double.parseDouble(txtPr.getText()), Double.parseDouble(txtTotIn.getText()))+
							"\n===================================================\n" +
							String.format("%-20s%-15s%15.2f", "" , "Net Profit : RM", Double.parseDouble(txtProfit.getText())));
			
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
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Fee ex = new ExcelFee();
			Fee ps = new PhotoshopFee();
			Fee pr = new PremiereFee();

			//calculate for total expenses
			double sly = Double.parseDouble(totSly.getText());
			double pf = Double.parseDouble(totProFee.getText());
			double Exp = sly + pf;
			
			//set the value of the total expenses into the textfield
			txtSalary.setText(String.valueOf(sly));
			txtProFee.setText(String.valueOf(pf));
			txtTotExpen.setText(String.valueOf(Exp));
	
			
			//calculate for income of each type of software training by the total of participants respectively and the total income
			double Ex = Double.parseDouble(totEx.getText()) * ex.fee();
			double Ps = Double.parseDouble(totPs.getText()) * ps.fee();
			double Pr = Double.parseDouble(totPr.getText()) * pr.fee();
			
			double In = Ex + Ps + Pr;
			
			//set the value of the income for each software training and the total income into the textfield
			txtEx.setText(String.valueOf(Ex));
			txtPs.setText(String.valueOf(Ps));
			txtPr.setText(String.valueOf(Pr));
			txtTotIn.setText(String.valueOf(In));

		    //calculate for the net profit
			double pft = In - Exp;
			
			//set the value of the net profit into the textfield
			txtProfit.setText(String.valueOf(pft));
		}
	});
	
	
		btnCalculate.setBounds(111, 15, 207, 41);
		panel_1_1.add(btnCalculate);
		btnCalculate.setForeground(Color.BLACK);
		btnCalculate.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCalculate.setBackground(new Color(204, 204, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Finance");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(23, 74, 240, 54);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(23, 139, 380, 339);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblS = new JLabel("Total Salary");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblS.setBounds(10, 47, 121, 39);
		panel_2.add(lblS);
		
		totSly = new JTextField();
		totSly.setBackground(new Color(204, 255, 255));
		totSly.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totSly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totSly.setColumns(10);
		totSly.setBounds(196, 53, 176, 35);
		panel_2.add(totSly);
		
		JLabel lblP = new JLabel("Promotion Fee");
		lblP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblP.setBounds(10, 93, 138, 39);
		panel_2.add(lblP);
		
		totProFee = new JTextField();
		totProFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totProFee.setColumns(10);
		totProFee.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totProFee.setBackground(new Color(204, 255, 255));
		totProFee.setBounds(196, 93, 176, 35);
		panel_2.add(totProFee);
		
		JLabel lblE = new JLabel("Excel");
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblE.setBounds(10, 204, 132, 39);
		panel_2.add(lblE);
		
		totEx = new JTextField();
		totEx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totEx.setColumns(10);
		totEx.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totEx.setBackground(new Color(204, 255, 255));
		totEx.setBounds(166, 210, 105, 35);
		panel_2.add(totEx);
		
		JLabel lblRM = new JLabel(":  RM");
		lblRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRM.setBounds(130, 47, 62, 39);
		panel_2.add(lblRM);
		
		JLabel lblRM_1 = new JLabel(":  RM");
		lblRM_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRM_1.setBounds(130, 93, 62, 39);
		panel_2.add(lblRM_1);
		
		JLabel lblRM_1_1 = new JLabel(":  ");
		lblRM_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRM_1_1.setBounds(145, 204, 49, 39);
		panel_2.add(lblRM_1_1);
		
		JLabel lblPS = new JLabel("Photoshop");
		lblPS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPS.setBounds(10, 245, 132, 39);
		panel_2.add(lblPS);
		
		totPs = new JTextField();
		totPs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totPs.setColumns(10);
		totPs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totPs.setBackground(new Color(204, 255, 255));
		totPs.setBounds(166, 251, 105, 35);
		panel_2.add(totPs);
		
		JLabel lblPR = new JLabel("Premiere Pro");
		lblPR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPR.setBounds(10, 287, 132, 39);
		panel_2.add(lblPR);
		
		totPr = new JTextField();
		totPr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totPr.setColumns(10);
		totPr.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		totPr.setBackground(new Color(204, 255, 255));
		totPr.setBounds(166, 293, 105, 35);
		panel_2.add(totPr);
		
		JLabel lblIncome_1 = new JLabel();
		lblIncome_1.setText("Total Participants");
		lblIncome_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblIncome_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblIncome_1.setBounds(10, 170, 227, 26);
		panel_2.add(lblIncome_1);
		
		JLabel lblIncome_1_1 = new JLabel();
		lblIncome_1_1.setText("Expenses");
		lblIncome_1_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblIncome_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblIncome_1_1.setBounds(10, 12, 149, 26);
		panel_2.add(lblIncome_1_1);
		
		JLabel lblRM_1_1_1 = new JLabel(":  ");
		lblRM_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRM_1_1_1.setBounds(145, 245, 49, 39);
		panel_2.add(lblRM_1_1_1);
		
		JLabel lblRM_1_1_2 = new JLabel(":  ");
		lblRM_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRM_1_1_2.setBounds(145, 287, 49, 39);
		panel_2.add(lblRM_1_1_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(301, 306, 71, 25);
		panel_2.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totSly.setText("");
				totProFee.setText("");
				totEx.setText("");	
				totPs.setText("");
				totPr.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClear.setBackground(new Color(204, 204, 255));
		
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
		
		txtProfit = new JTextField();
		txtProfit.setHorizontalAlignment(SwingConstants.TRAILING);
		txtProfit.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtProfit.setColumns(10);
		txtProfit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtProfit.setBackground(Color.WHITE);
		txtProfit.setBounds(789, 443, 174, 35);
		panel.add(txtProfit);
		
		JLabel lblName_1 = new JLabel("Net Profit   : RM");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_1.setBounds(617, 441, 240, 39);
		panel.add(lblName_1);
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(467, 139, 496, 293);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(488, 0, -66, 36);
		panel_3.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("RM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(169, 0, 150, 23);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("RM");
		lblNewLabel_2_1.setBounds(329, 0, 149, 23);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(null);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(169, 26, 150, 256);
		panel_3.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		txtSalary = new JTextField();
		txtSalary.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSalary.setBounds(0, 20, 150, 20);
		panel_4_1.add(txtSalary);
		txtSalary.setForeground(Color.BLACK);
		txtSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtSalary.setColumns(10);
		txtSalary.setBorder(null);
		
		txtProFee = new JTextField();
		txtProFee.setHorizontalAlignment(SwingConstants.TRAILING);
		txtProFee.setForeground(Color.BLACK);
		txtProFee.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtProFee.setColumns(10);
		txtProFee.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtProFee.setBounds(0, 42, 150, 20);
		panel_4_1.add(txtProFee);
		
		txtEx = new JTextField();
		txtEx.setHorizontalAlignment(SwingConstants.TRAILING);
		txtEx.setForeground(Color.BLACK);
		txtEx.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtEx.setColumns(10);
		txtEx.setBorder(null);
		txtEx.setBounds(0, 114, 150, 20);
		panel_4_1.add(txtEx);
		
		txtPs = new JTextField();
		txtPs.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPs.setForeground(Color.BLACK);
		txtPs.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPs.setColumns(10);
		txtPs.setBorder(null);
		txtPs.setBounds(0, 135, 150, 20);
		panel_4_1.add(txtPs);
		
		txtPr = new JTextField();
		txtPr.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPr.setForeground(Color.BLACK);
		txtPr.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPr.setColumns(10);
		txtPr.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtPr.setBounds(0, 157, 150, 20);
		panel_4_1.add(txtPr);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(null);
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setBounds(328, 26, 150, 256);
		panel_3.add(panel_4_1_1);
		panel_4_1_1.setLayout(null);
		
		txtTotExpen = new JTextField();
		txtTotExpen.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTotExpen.setForeground(Color.BLACK);
		txtTotExpen.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtTotExpen.setColumns(10);
		txtTotExpen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtTotExpen.setBounds(0, 41, 150, 20);
		panel_4_1_1.add(txtTotExpen);
		
		txtTotIn = new JTextField();
		txtTotIn.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTotIn.setForeground(Color.BLACK);
		txtTotIn.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtTotIn.setColumns(10);
		txtTotIn.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtTotIn.setBounds(0, 156, 150, 20);
		panel_4_1_1.add(txtTotIn);
		
		lblExpenses = new JLabel();
		lblExpenses.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblExpenses.setFont(new Font("Dialog", Font.BOLD, 15));
		lblExpenses.setText("Expenses");
		lblExpenses.setBounds(10, 26, 149, 20);
		panel_3.add(lblExpenses);
		
		lblSalary = new JLabel();
		lblSalary.setBorder(null);
		lblSalary.setForeground(new Color(0, 0, 0));
		lblSalary.setText("Salary");
		lblSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSalary.setBounds(10, 47, 149, 20);
		panel_3.add(lblSalary);
		
		lblPromotionFee = new JLabel();
		lblPromotionFee.setBorder(null);
		lblPromotionFee.setText("Promotion Fee");
		lblPromotionFee.setForeground(Color.BLACK);
		lblPromotionFee.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPromotionFee.setBounds(10, 67, 149, 20);
		panel_3.add(lblPromotionFee);
		
		lblIncome = new JLabel();
		lblIncome.setText("Income");
		lblIncome.setFont(new Font("Dialog", Font.BOLD, 15));
		lblIncome.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblIncome.setBounds(10, 119, 149, 20);
		panel_3.add(lblIncome);
		
		lblEx = new JLabel();
		lblEx.setText("Excel");
		lblEx.setForeground(Color.BLACK);
		lblEx.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEx.setBorder(null);
		lblEx.setBounds(10, 139, 149, 20);
		panel_3.add(lblEx);
		
		lblPs = new JLabel();
		lblPs.setText("Adobe Photoshop");
		lblPs.setForeground(Color.BLACK);
		lblPs.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPs.setBorder(null);
		lblPs.setBounds(10, 160, 149, 20);
		panel_3.add(lblPs);
		
		JLabel lblPr = new JLabel();
		lblPr.setText("Adobe Premiere Pro");
		lblPr.setForeground(Color.BLACK);
		lblPr.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPr.setBorder(null);
		lblPr.setBounds(10, 181, 149, 20);
		panel_3.add(lblPr);
		
	}
	
}
