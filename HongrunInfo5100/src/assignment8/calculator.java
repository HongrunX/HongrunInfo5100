package assignment8;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
 
import javax.swing.JFrame;
 
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class calculator extends JFrame implements ActionListener {
	private JLabel leftLabel,rightLabel;
	String input = ""; 
	JTextField textField=new JTextField();
	public calculator(JLabel leftLabel, JLabel rightLabel) throws HeadlessException {
		super();
		this.leftLabel=leftLabel;
		this.rightLabel=rightLabel;
		
	}
 
	public calculator() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public calculator(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
 
	public calculator(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
 
	public calculator(String arg0) throws HeadlessException {
		super(arg0);		
		this.setResizable(false);
		this.setBounds(600,200,230,230);
		Font f=new Font("BLACK",Font.ITALIC,25);
		this.setFont(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel viewPanel=new JPanel();//
		this.add(viewPanel,BorderLayout.NORTH);
		
		textField.setEditable(false);//
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(18);
		viewPanel.add(textField);
		JPanel buttonPanel=new JPanel();
		GridLayout gridLayout=new GridLayout(4,0);
		gridLayout.setHgap(10);
		gridLayout.setVgap(10);
		
		buttonPanel.setLayout(gridLayout);
		this.add(buttonPanel,BorderLayout.CENTER);
		String[][] names= {
				{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","x"},{".","0","=","/"}
		};
		JButton[][] buttons=new JButton[4][4];
		for(int row=0;row<names.length;row++) {
			for(int col=0;col<names.length;col++) {
				buttons[row][col]=new JButton(names[row][col]);
				buttons[row][col].addActionListener(this);
				buttonPanel.add(buttons[row][col]);
			}
		}
		leftLabel=new JLabel();
		leftLabel.setPreferredSize(new Dimension(10,0));
		this.add(leftLabel,BorderLayout.WEST);
		rightLabel=new JLabel();
		rightLabel.setPreferredSize(new Dimension(10,0));
		this.add(rightLabel,BorderLayout.EAST);
		
	}
	private String compute(String input){ 
	String str[]; 		
	str = input.split(" "); 		
	Stack<Double> s = new Stack<Double>(); 		
	double m = Double.parseDouble(str[0]); 	
	s.push(m); 		
	for(int i=1;i<str.length;i++){ 	
	if(i%2==1) { 
	if(str[i].compareTo("+")==0) { 
	double help = Double.parseDouble(str[i+1]); 
	s.push(help);
	 } 
	if(str[i].compareTo("-")==0) { 
	double help = Double.parseDouble(str[i+1]); 
	s.push(-help); 
	} 
	if(str[i].compareTo("x")==0) {
	 double help = Double.parseDouble(str[i+1]); 
	double ans = s.peek();
	s.pop();
	ans*=help; 
	s.push(ans);
	 }
	 if(str[i].compareTo("/")==0) {
	 double help = Double.parseDouble(str[i+1]); 
	double ans = s.peek();
	 s.pop();
	 ans/=help; 
	s.push(ans);
	} } } 
	double ans = 0d;
	 while(!s.isEmpty()) {
	 ans+=s.peek();
	 s.pop();
	 } 
	String result = String.valueOf(ans);
	 return result; 
		} 	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int cnt = 0; 
		String actionCommand =arg0.getActionCommand(); 
		if(actionCommand.equals("+")||actionCommand.equals("-")||actionCommand.equals("x") ||actionCommand.equals("/")) 		
			input +=" "+actionCommand+" ";
			else if(actionCommand.equals("C")) 			
			input = ""; 		
			else if(actionCommand.equals("="))	
			{ 			
				input+= "="+compute(input); 			
				textField.setText(input); 		
				input=""; 			
				cnt = 1; 		
			} 	
				else 		
					input += actionCommand;	
			if(cnt==0) 
				textField.setText(input);
			 	} 	
			
	}

