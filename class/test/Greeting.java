package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Greeting extends JFrame { ////class 이름이 Greeting

	private JPanel contentPane;
	private JTextField textName;
	JLabel lblHello = new JLabel("Hello");
	JLabel lblResult = new JLabel("Result");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Greeting frame = new Greeting();
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
	public Greeting() {///이거는 constructor임 위에 class 이름과 같은 Greeting 이기 때문
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(74, 62, 52, 15);
		contentPane.add(lblNewLabel);
		
		//JLabel lblHello = new JLabel("Hello");
		lblHello.setBounds(227, 62, 145, 15);
		contentPane.add(lblHello);
		
		JButton btnGreeting = new JButton("Greeting");
		btnGreeting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHello.setText(lblHello.getText() + " " +textName.getText());
				///JLabel lblHello = new JLabel("Hello");이걸 위에 써야 에러 않남

			}
		});
		btnGreeting.setBounds(48, 108, 95, 23);
		contentPane.add(btnGreeting);
		
		textName = new JTextField();
		textName.setBounds(197, 109, 106, 21);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String text = textName.getText();
		        int len = text.length();
		        int count = 0;
		        boolean num = true;
		        while(count<len)
		        {
		            if(Character.isDigit(text.charAt(count)))
		                count++;
		            else {
		                num = false;
		                break;
		            }
		        }
		        if(num){
		          System.out.println("It is a number");
		          lblResult.setText("It is a number");
		        }else{
		          System.out.println("It is not a number");  
		          lblResult.setText("It is not a number");
		        }
				
			}
		});
		btnCheck.setBounds(48, 160, 95, 23);
		contentPane.add(btnCheck);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer =
					    JOptionPane.showConfirmDialog(null, 
					    "End program?",
					    "Click Yes or No:", JOptionPane.YES_NO_OPTION);

					    if (answer == JOptionPane.YES_OPTION)
					        System.exit(0);

			}
		});
		btnExit.setBounds(197, 160, 95, 23);
		contentPane.add(btnExit);
		
		
		lblResult.setBounds(48, 210, 129, 15);
		contentPane.add(lblResult);
	}
}
