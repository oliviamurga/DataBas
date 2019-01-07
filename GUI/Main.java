import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Scanner s = new Scanner(System.in);
	public String createUsername() {
		System.out.println("Enter a username:");
		String username = s.nextLine();
		return username;
	}

	public String createPassword() {
		System.out.println("Enter a password: ");
		String password = s.nextLine();
		return password;
	}
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatabas = new JLabel("DataBas");
		lblDatabas.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblDatabas.setBounds(191, 31, 112, 47);
		contentPane.add(lblDatabas);
		
		JLabel lblWelcomeToDatabas = new JLabel("Welcome to DataBas!!");
		lblWelcomeToDatabas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWelcomeToDatabas.setBounds(167, 88, 159, 30);
		contentPane.add(lblWelcomeToDatabas);
		
		JLabel lblNewLabel = new JLabel("Have you logged in before?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(151, 128, 191, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Options frame = new Options();
				frame.setVisible(true);
				dispose();
			}
		});
		btnYes.setBounds(151, 174, 85, 21);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu2 frame = new Menu2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNo.setBounds(241, 174, 85, 21);
		contentPane.add(btnNo);
		
		
		
	}

}
