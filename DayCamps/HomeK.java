package DayCamps;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import MainPage.MainPage;
import SoftwareTraining.Home;

public class HomeK extends JFrame {

	private JPanel contentPane;
	private Image img_home = new ImageIcon(Home.class.getResource("home.png")).getImage().getScaledInstance(35,30,Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeK frame = new HomeK();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public HomeK() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		edcMainK edc = new edcMainK();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\DayCamps\\lbluum.png"));
		setTitle("EDC UUM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblclose_1 = new JLabel("");
		lblclose_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPage m = new MainPage();
				m.setVisible(true);
				dispose();
			}
		});
		lblclose_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose_1.setBounds(1001, 53, 30, 30);
		lblclose_1.setIcon(new ImageIcon(img_home));
		contentPane.add(lblclose_1);
		
		JLabel lbluum = new JLabel("");
		lbluum.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\DayCamps\\lbluum.png"));
		lbluum.setBounds(10, 0, 228, 249);
		contentPane.add(lbluum);
		
		JTextPane textPaneEventInfo = new JTextPane();
		textPaneEventInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPaneEventInfo.setBounds(10, 311, 621, 307);
		contentPane.add(textPaneEventInfo);
		
		JComboBox comboBoxEvent = new JComboBox();
		comboBoxEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=String.valueOf(comboBoxEvent.getSelectedItem());
				textPaneEventInfo.setText(edc.printinfo(a));
			}
		});
		comboBoxEvent.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBoxEvent.setMaximumRowCount(4);
		comboBoxEvent.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE AN EVENT", "FITNESS CAMP", "SURVIVALIST CAMP", "LEADERSHIP CAMP"}));
		comboBoxEvent.setForeground(new Color(0, 0, 0));
		comboBoxEvent.setBackground(SystemColor.controlHighlight);
		comboBoxEvent.setBounds(425, 269, 206, 32);
		contentPane.add(comboBoxEvent);
		
		JLabel lblNewLabel_1 = new JLabel("CLICK THE BUTTON BELOW TO REGISTER NOW !");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(652, 421, 487, 85);
		contentPane.add(lblNewLabel_1);
		
		JButton btnRegisterpg = new JButton("REGISTER");
		btnRegisterpg.setForeground(new Color(139, 0, 0));
		btnRegisterpg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//register page //calling another frame/window
				RegisterK frame = new RegisterK();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
	            dispose(); //Home frame will disappear
			}
		});
		btnRegisterpg.setBackground(Color.YELLOW);
		btnRegisterpg.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegisterpg.setBounds(766, 516, 131, 38);
		contentPane.add(btnRegisterpg);
		
		JButton btnLoginpg = new JButton("ADMIN LOGIN");
		btnLoginpg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//login page //calling another frame/window
				LoginK frame = new LoginK();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
	            dispose(); //Home frame will disappear
			}
		});
		btnLoginpg.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLoginpg.setBackground(SystemColor.controlHighlight);
		btnLoginpg.setBounds(878, 10, 153, 32);
		contentPane.add(btnLoginpg);
		
		JLabel lblNewLabel_1_1 = new JLabel("WHAT ARE YOU WAITING FOR?");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(703, 363, 487, 96);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 6));
		panel.setForeground(new Color(255, 165, 0));
		panel.setBounds(0, 259, 642, 374);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 0), 4));
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(248, 51, 666, 134);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWelcomeToEdc = new JLabel("WELCOME TO EDC UUM !");
		lblWelcomeToEdc.setBounds(10, 5, 645, 65);
		panel_1.add(lblWelcomeToEdc);
		lblWelcomeToEdc.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToEdc.setForeground(new Color(0, 0, 0));
		lblWelcomeToEdc.setFont(new Font("Serif", Font.BOLD, 50));
		lblWelcomeToEdc.setBackground(new Color(255, 255, 224));
		
		JLabel lblNewLabel = new JLabel("( EDUCATION DAY CAMP )");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(210, 75, 246, 25);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 19));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 0), 3));
		panel_2.setBackground(new Color(255, 69, 0));
		panel_2.setBounds(652, 363, 379, 249);
		contentPane.add(panel_2);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\DayCamps\\lblBackground.jpg"));
		lblBackground.setBounds(0, 0, 1041, 654);
		contentPane.add(lblBackground);
	}
}

