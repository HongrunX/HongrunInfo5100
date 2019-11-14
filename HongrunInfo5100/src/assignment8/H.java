package assignment8;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 
public class H implements ItemListener{ 
 
	String sex="";
	private JFrame frame;
	private JTextField textField;
 
    FileWriter w_file;
    BufferedWriter buf_writer;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
  
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					H window = new H();
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
	public H() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("BLACK", Font.PLAIN, 22));
		frame.setBounds(100, 100, 817, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student System");
		lblNewLabel.setBounds(239, 15, 334, 67);
		lblNewLabel.setFont(new Font("BLACK", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("ID");
		label.setBounds(29, 107, 81, 21);
		label.setFont(new Font("BLACK", Font.PLAIN, 24));
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(102, 106, 167, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()== btnNewButton)
				{
					writeFile();
				}
				if(e.getSource()== btnNewButton)
				{
					System.exit(0);
				}
			}
			public void writeFile()
			{
				try
				{
					w_file = new FileWriter("Information.txt");
					buf_writer = new BufferedWriter(w_file);
					String t=" ";
					String number = textField .getText();
					buf_writer.write(number,0,number.length());
					buf_writer.write(t,0,t.length());
					
					String name = textField_1.getText();
					buf_writer.write(name,0,name.length());
					buf_writer.write(t,0,t.length());
					
					buf_writer.write(sex,0,sex.length());//
					buf_writer.write(t,0,t.length());
					
					String nom = textField_2 .getText();
					buf_writer.write(nom,0,nom.length());
					buf_writer.write(t,0,t.length());
					
					String clas= textField_3 .getText();
					buf_writer.write(clas,0,clas.length());
					buf_writer.write(t,0,t.length());
					
					String cell= textField_4 .getText();
					buf_writer.write(cell,0,cell.length());
					buf_writer.write(t,0,t.length());
					buf_writer.flush();
					JOptionPane.showMessageDialog(null, "success");
					
				}
				catch(IOException ew)
				{
					System.out.print(ew);
				}
			}
			
		});
		btnNewButton.setBounds(531, 371, 123, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("BLACK", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(29, 163, 81, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 162, 167, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("Sex");
		label_1.setFont(new Font("BLACK", Font.PLAIN, 24));
		label_1.setBounds(29, 225, 81, 21);
		frame.getContentPane().add(label_1);
		
		JComboBox comboBox = new JComboBox();
		 
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(102, 224, 167, 27);
		comboBox.addItemListener(this);
		frame.getContentPane().add(comboBox);
		
		JLabel label_2 = new JLabel("Dorm");
		label_2.setFont(new Font("BLACK", Font.PLAIN, 24));
		label_2.setBounds(393, 97, 113, 21);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Class");
		label_3.setFont(new Font("BLACK", Font.PLAIN, 24));
		label_3.setBounds(393, 165, 81, 21);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Phone");
		label_4.setFont(new Font("BLACK", Font.PLAIN, 24));
		label_4.setBounds(393, 227, 81, 21);
		frame.getContentPane().add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(521, 97, 147, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(521, 162, 147, 27);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(521, 224, 147, 27);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("Exit");
		button.setBounds(86, 371, 123, 29);
		frame.getContentPane().add(button);
	}
 
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}

