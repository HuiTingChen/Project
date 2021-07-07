package MainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SoftwareTraining.Home;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import Counselor.LogInC;
import DayCamps.HomeK;
import Ebook.LogInA;
import HomeTuition.MainFrameS;

import java.awt.Rectangle;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private Image img_b = new ImageIcon(MainPage.class.getResource("b.png")).getImage().getScaledInstance(1000,500,Image.SCALE_SMOOTH);
	private Image img_close = new ImageIcon(Home.class.getResource("closebtn.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 986, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 160, 122));
		panel_1.setBounds(0, 0, 986, 86);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Education Business");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_1.setBounds(0, 0, 986, 86);
		panel_1.add(lblNewLabel_1);
		
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
		
		JButton btnEB = new JButton("E-Book");
		btnEB.setToolTipText("E-book writing");
		btnEB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInA a = new LogInA();
				a.setVisible(true);
				dispose();
			}
		});
		btnEB.setBorder(new LineBorder(Color.BLACK, 2));
		btnEB.setForeground(Color.WHITE);
		btnEB.setBackground(new Color(139, 69, 19));
		btnEB.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEB.setBounds(139, 212, 182, 59);
		panel.add(btnEB);
		
		JButton btnC = new JButton("Counselor");
		btnC.setToolTipText("Career counselor");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInC l = new LogInC();
				l.setVisible(true);
				dispose();
			}
		});
		btnC.setBorder(new LineBorder(Color.BLACK, 2));
		btnC.setForeground(Color.WHITE);
		btnC.setBackground(new Color(139, 69, 19));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.setBounds(407, 212, 182, 59);
		panel.add(btnC);
		
		JButton btnDC = new JButton("DayCamps");
		btnDC.setToolTipText("Education Day Camps");
		btnDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeK hk = new HomeK();
				hk.setVisible(true);
				dispose();
			}
		});
		btnDC.setBorder(new LineBorder(Color.BLACK, 2));
		btnDC.setForeground(Color.WHITE);
		btnDC.setBackground(new Color(139, 69, 19));
		btnDC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDC.setBounds(677, 212, 182, 59);
		panel.add(btnDC);
		
		JButton btnST = new JButton("Software Training");
		btnST.setToolTipText("Software Training");
		btnST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnST.setBorder(new LineBorder(Color.BLACK, 2));
		btnST.setForeground(Color.WHITE);
		btnST.setBackground(new Color(139, 69, 19));
		btnST.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnST.setBounds(176, 347, 294, 59);
		panel.add(btnST);
		
		JButton btnHT = new JButton("Home Tuition");
		btnHT.setToolTipText("Home Tuition");
		btnHT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrameS mf = new MainFrameS();
				mf.setVisible(true);
				dispose();
			}
		});
		btnHT.setBorder(new LineBorder(Color.BLACK, 2));
		btnHT.setForeground(Color.WHITE);
		btnHT.setBackground(new Color(139, 69, 19));
		btnHT.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnHT.setBounds(536, 347, 294, 59);
		panel.add(btnHT);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(143, 216, 182, 59);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(411, 216, 182, 59);
		panel.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(681, 216, 182, 59);
		panel.add(panel_2_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1.setBounds(180, 351, 294, 59);
		panel.add(panel_2_1_1_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2_1_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1_1.setBounds(539, 351, 294, 59);
		panel.add(panel_2_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 102, 1003, 495);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img_b));
	}
}
