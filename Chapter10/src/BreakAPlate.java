import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon placeholder = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");
		ImageIcon platesallbroken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon platestwobroken = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon plates = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		ImageIcon tigerplush = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		
		
		
		
	
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(27, 11, 350, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel LB1 = new JLabel(plates);
		LB1.setBounds(20, 11, 298, 83);
		panel.add(LB1);
		
		JLabel LB2 = new JLabel(placeholder);
		LB2.setBounds(68, 139, 213, 74);
		panel.add(LB2);
		;
		
		JButton PB = new JButton("Play");
		PB.setBounds(103, 105, 150, 23);
		panel.add(PB);
		PB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Random num = new Random();
				int random = num.nextInt(2);
				
				if (random == 1)
				{
					LB1.setIcon(platesallbroken);
					LB2.setIcon(tigerplush);
					PB.setText("Play Again");
				}
				
				if(random == 0)
				{
					LB1.setIcon(platestwobroken);
					LB2.setIcon(sticker);
					PB.setText("Play Again");
				}
					
					
			}
				});
	}
}
			
		

	

