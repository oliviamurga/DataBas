import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 frame = new Menu2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String createUsername() {
		String username = textField.getText();
		return username;
	}

	public String createPassword() {
		String password = textField_1.getText();
		return password;
	}
	
	/**
	 * Create the frame.
	 */
	public Menu2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(27, 36, 83, 23);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(137, 38, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(27, 80, 60, 13);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 77, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((textField_1.getText().equals("") && textField.getText().equals("")) || (textField_1.getText().equals("")) || (textField.getText().equals("")) )
				{
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,"Please fill correctly all the boxes!");
				}
				
				else {
					
					Options frame = new Options();
					frame.setVisible(true);
					dispose();
					}
			}
		});
		btnSubmit.setBounds(95, 134, 85, 21);
		contentPane.add(btnSubmit);
	}

}
