import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeticConverter {

	private JFrame frame;
	private JTextField Disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeticConverter window = new MeticConverter();
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
	public MeticConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 39, 401, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LB1 = new JLabel("Select a conversion type:");
		LB1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LB1.setBounds(10, 11, 208, 28);
		panel.add(LB1);
		
		JComboBox CB = new JComboBox();
		CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Formula = " ";
				
				
				if(CB.getSelectedItem().equals("Inches to Centimeters"))
				{
					Formula = "1 inch = 2.54 centimeters";
				}
			
				else if(CB.getSelectedItem().equals("Feet to Meters"))
				{
					Formula = "1 foot = 0.3048 meters";
				}
				
				else if(CB.getSelectedItem().equals("Gallons to Liters"))
				{
					Formula = "1 gallon = 4.5461";
				}
				
				else if(CB.getSelectedItem().equals("Pounds to Kilograms"))
				{
					Formula = "1 pound = 0.4536 kilograms";
				}
				
				
			
				
				Disp.setText(Formula);
				
				
			}
		});
		
		CB.setModel(new DefaultComboBoxModel(new String[] {"", "Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		CB.setBounds(228, 17, 163, 22);
		panel.add(CB);
		
		Disp = new JTextField();
		Disp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Disp.setBounds(72, 84, 241, 87);
		panel.add(Disp);
		Disp.setColumns(10);
	}
}
