import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Options extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame = new Options();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static LinkedList <String> dataBase = new LinkedList<String>();
	
	/**
	 * Create the frame.
	 */
	public Options() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMe = new JLabel("Menu");
		lblMe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMe.setBounds(165, 21, 45, 13);
		contentPane.add(lblMe);
		
		JLabel lblNewLabel = new JLabel("PRESS 1 : INSERT DATA TO DATABASE");
		lblNewLabel.setBounds(85, 44, 253, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblPress = new JLabel("PRESS 2 : PRINT DATABASE");
		lblPress.setBounds(85, 81, 189, 13);
		contentPane.add(lblPress);
		
		JLabel lblPress_1 = new JLabel("PRESS 3 : DELETE DATA");
		lblPress_1.setBounds(85, 117, 189, 13);
		contentPane.add(lblPress_1);
		
		JLabel lblPress_2 = new JLabel("PRESS 4 : CHANGE DATA");
		lblPress_2.setBounds(85, 150, 189, 13);
		contentPane.add(lblPress_2);
		
		JLabel lblNewLabel_1 = new JLabel("PRESS 5 : TECHNICAL REPORT");
		lblNewLabel_1.setBounds(85, 187, 189, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPressAnyOther = new JLabel("PRESS ANY OTHER NUMBER TO EXIT DATABAS");
		lblPressAnyOther.setBounds(85, 225, 240, 13);
		contentPane.add(lblPressAnyOther);
		
		textField = new JTextField();
		textField.setBounds(85, 259, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSubmit.setBounds(204, 258, 85, 21);
		contentPane.add(btnSubmit);
	}

}
