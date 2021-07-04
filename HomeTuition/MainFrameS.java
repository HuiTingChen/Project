package HomeTuition;

import javax.swing.*;

import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.border.LineBorder;

import MainPage.MainPage;
import SoftwareTraining.Home;

public class MainFrameS extends JFrame {     //2.1 GUI MainFrame

	private static final long serialVersionUID = 1L;
	private Image img_home = new ImageIcon(Home.class.getResource("home.png")).getImage().getScaledInstance(35,30,Image.SCALE_SMOOTH);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameS frame = new MainFrameS(); //creating new object
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  JPanel loginpanel;


  public MainFrameS(){  //constructor with no argument
    super("SS HOME TUITION");
    loginpanel = new JPanel();
    setLocationRelativeTo(null);
    loginpanel.setBorder(new LineBorder(new Color(0, 0, 0)));
    loginpanel.setBackground(new Color(0, 0, 139));

    setSize(649,468);
    setLocation(500,280);

    getContentPane().add(loginpanel);
    loginpanel.setLayout(null);
    
    JPanel panelMenu = new JPanel();
    panelMenu.setBackground(new Color(224, 255, 255));
    panelMenu.setBounds(27, 22, 581, 382);
    loginpanel.add(panelMenu);
    
    JButton btnNewButton = new JButton("CLOSE");
    btnNewButton.setBounds(500, 11, 77, 45);
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Main Frame", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
    	}
    });
    panelMenu.add(btnNewButton);
    
    JButton AdminLoginBtn = new JButton("ADMIN LOGIN");
    AdminLoginBtn.setBounds(148, 140, 271, 39);
    AdminLoginBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			LoginS l = new LoginS();
			l.setVisible(true);
			dispose();    // close the MainFrame window
    	}
    });
    AdminLoginBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    AdminLoginBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(AdminLoginBtn);
    
    JButton StudentLoginBtn = new JButton("STUDENT LOGIN");
    StudentLoginBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			HomeTuitionCentre H = new HomeTuitionCentre();
			H.setVisible(true);
			dispose();
    	}
    });
    StudentLoginBtn.setBounds(148, 192, 271, 39);
    StudentLoginBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    StudentLoginBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(StudentLoginBtn);
    
    JButton AboutUsBtn = new JButton("ABOUT US");
    AboutUsBtn.setBounds(148, 242, 271, 39);
    AboutUsBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			SubjectsDescriptionS S = new SubjectsDescriptionS ();
			S.setVisible(true);
			dispose();
    	}
    });
    AboutUsBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    AboutUsBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(AboutUsBtn);
    
    JButton StaffDetailsBtn = new JButton("STAFF DETAILS");
    StaffDetailsBtn.setBounds(148, 292, 271, 39);
    StaffDetailsBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			StaffsDetailsS sd = new StaffsDetailsS();
			sd.setVisible(true);
			dispose();
    	}
    });
    StaffDetailsBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    StaffDetailsBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(StaffDetailsBtn);
    
    JLabel lblbackgroundpic = new JLabel("");
    lblbackgroundpic.setBounds(0, -12, 631, 526);
    Image img1 = new ImageIcon(this.getClass().getResource("/SS HOME TUITION1.png")).getImage();  // insert image
    panelMenu.setLayout(null);
    lblbackgroundpic.setIcon(new ImageIcon(img1));
    panelMenu.add(lblbackgroundpic);
    
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
    lblclose_1.setBounds(547, 67, 30, 30);
    lblclose_1.setIcon(new ImageIcon(img_home));
    panelMenu.add(lblclose_1);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
