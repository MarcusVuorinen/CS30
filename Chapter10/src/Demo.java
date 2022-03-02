import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo {

	private JFrame frame;
	private JTextField TF1;
	private JTextField TF2;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 77, 497, 267);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TF1 = new JTextField();
		TF1.setText("First name");
		TF1.setBounds(121, 39, 162, 20);
		panel.add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.setText("Last name");
		TF2.setColumns(10);
		TF2.setBounds(121, 92, 162, 20);
		panel.add(TF2);
		
		JComboBox GRCB = new JComboBox();
		GRCB.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		GRCB.setBounds(224, 145, 59, 22);
		panel.add(GRCB);
		
		JLabel GRLB = new JLabel("Grade:");
		GRLB.setBounds(131, 149, 46, 14);
		panel.add(GRLB);
		
		JLabel SCLB = new JLabel("School:");
		SCLB.setBounds(131, 190, 46, 14);
		panel.add(SCLB);
		
		JComboBox SCCB = new JComboBox();
		SCCB.setModel(new DefaultComboBoxModel(new String[] {"Crescent Heights", "William Aberheart", "James Fowler"}));
		SCCB.setBounds(174, 186, 109, 22);
		panel.add(SCCB);
		
		JButton SUBT = new JButton("Submit");
		SUBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Grade = " ";
				String School = " ";
				String Fn = TF1.getText();
				String Ln = TF2.getText();
				
				if(GRCB.getSelectedItem().equals("10"))
				{
					Grade = "10";
				}
			
				else if(GRCB.getSelectedItem().equals("11"))
				{
					Grade = "11";
				}
				
				else if(GRCB.getSelectedItem().equals("12"))
				{
					Grade = "12";
				}
				
				
				
				if(SCCB.getSelectedItem().equals("Crescent Heights"))
				{
					School = "Crescent Heights";
				}
			
				else if(SCCB.getSelectedItem().equals("William Aberheart"))
				{
					School = "William Aberheart";
				}
				
				else if(SCCB.getSelectedItem().equals("James Fowler"))
				{
					School = "James Fowler";
				}
				
				disp.setText(Fn + " " + Ln + " " + Grade + " " + School);
			
			
			}
			
		});
		SUBT.setBounds(349, 137, 89, 72);
		panel.add(SUBT);
		
		disp = new JTextField();
		disp.setBounds(62, 215, 278, 41);
		panel.add(disp);
		disp.setColumns(10);
	}
}
