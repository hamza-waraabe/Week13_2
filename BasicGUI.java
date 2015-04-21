

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BasicGUI implements ActionListener {
private JFrame frame;
private JPanel panel;
private JTextField text1,text2;
private JLabel label1, label2,result;
private JButton button;

public BasicGUI() {
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(900, 250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setBackground(Color.red);
	
	label1 = new JLabel();
	label1.setText("First Number :");
	label2 = new JLabel();
	label2.setText("Second Number :");
	result = new JLabel();
	result.setText(".....");
	
	text1 = new JTextField(20);
	text2 = new JTextField(20);
	button = new JButton("Add");
	button.addActionListener(this);
	
	panel.add(label1);
	panel.add(text1);
	panel.add(label2);
	panel.add(text2);
	panel.add(button);
	panel.add(result);
	
	frame.add(panel);
	
}
public void actionPerformed(ActionEvent e){
	int n1 = Integer.parseInt(text1.getText());
	int n2 = Integer.parseInt(text2.getText());
	int sum = n1+n2;
	
	result.setText(String.valueOf(sum));
	
}
}
