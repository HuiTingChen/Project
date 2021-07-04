package Ebook;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import MainPage.MainPage;
import SoftwareTraining.Home;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LogInA extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JTextField PasswordTextField;
	private Image img_home = new ImageIcon(Home.class.getResource("home.png")).getImage().getScaledInstance(35,30,Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInA frame = new LogInA();
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
	public LogInA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		panel.setBounds(10, 11, 794, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(132, 139, 189, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel NameLabel = new JLabel("USERNAME");
		NameLabel.setBounds(10, 10, 169, 23);
		panel_1.add(NameLabel);
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_1_2.setBackground(Color.LIGHT_GRAY);
		panel_1_2.setBounds(132, 209, 189, 45);
		panel.add(panel_1_2);
		
		JLabel PasswordLabel = new JLabel("PASSWORD");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasswordLabel.setBounds(10, 11, 169, 23);
		panel_1_2.add(PasswordLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.ORANGE));
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(99, 23, 600, 68);
		panel.add(panel_2);
		
		JLabel lblWelcomeToLogin = new JLabel("Welcome to login site!");
		lblWelcomeToLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		panel_2.add(lblWelcomeToLogin);
		
		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\slche\\eclipse-workspace\\EducationBusinessProject\\src\\Ebook\\Mindworks Logo.png"));
		
		UsernameTextField = new JTextField();
		UsernameTextField.setBounds(372, 139, 291, 45);
		panel.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setColumns(10);
		PasswordTextField.setBounds(372, 209, 291, 45);
		panel.add(PasswordTextField);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(UsernameTextField.getText().equals("admin") && PasswordTextField.getText().equals("abc12345")) {
						JOptionPane.showMessageDialog(null, "Login Successful.");
						HomePageA frame = new HomePageA();
						frame.setVisible(true);
					}
					else if(UsernameTextField.getText().equals("user") && PasswordTextField.getText().equals("12345abc")) {
						JOptionPane.showMessageDialog(null, "Login Successful.");
						HomePageA frame = new HomePageA();
							frame.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null, "Login Unsuccessful.");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password.");
				}
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		LoginButton.setBounds(447, 311, 216, 45);
		panel.add(LoginButton);
		
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
		lblclose_1.setBounds(754, 11, 30, 30);
		lblclose_1.setIcon(new ImageIcon(img_home));
		panel.add(lblclose_1);
	}

}
