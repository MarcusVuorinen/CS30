import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

import com.sun.net.httpserver.Authenticator.Result;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField TF1;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(55, 101, 479, 197);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LB1 = new JLabel("Divisible by 3?");
		LB1.setBounds(167, 30, 115, 14);
		panel.add(LB1);
		
		TF1 = new JTextField();
		TF1.setBounds(167, 71, 86, 20);
		panel.add(TF1);
		TF1.setColumns(10);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String INT = TF1.getText();
				
				int num = Integer.parseInt(INT);
				
				if (num % 3>= 1)
				{disp.setText("The integer entered is not divisible by 3.");
				
				}
					
				else
				{disp.setText("The integer entered is divisible by 3.");
						
				}
				
				
				
		
			}
			
		});
			
				
				
		Submit.setBounds(26, 112, 89, 23);
		panel.add(Submit);
		
		JLabel LB2 = new JLabel("Enter an integer:");
		LB2.setBounds(21, 74, 115, 14);
		panel.add(LB2);
		
		disp = new JTextField();
		disp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		disp.setBounds(167, 107, 302, 49);
		panel.add(disp);
		disp.setColumns(10);
		
		
	}
}
