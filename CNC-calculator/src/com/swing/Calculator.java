package com.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstNumber, secondNumber, result;
	String operations, answer;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	protected void getInitialize(){
		initialize();
	}
	
	protected void disposeFrame(){
		frmCalculator.dispose();
	}

	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/com/swing/Icons/caculator.jpg")));
		frmCalculator.getContentPane().setForeground(Color.DARK_GRAY);
		frmCalculator.setBackground(Color.DARK_GRAY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setVisible(true);
		frmCalculator.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frmCalculator.setBounds(345, 300, 265, 350);
		frmCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 230, 35);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buttonBackspace = new JButton("\u232B");
		buttonBackspace.setBackground(Color.LIGHT_GRAY);
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length()>0){
					StringBuilder builder = new StringBuilder(textField.getText());
					builder.deleteCharAt(textField.getText().length()-1);
					backspace = builder.toString();
					textField.setText(backspace);
				}
			}
		});
		buttonBackspace.setFont(new Font("SansSerif", Font.BOLD, 12));
		buttonBackspace.setBounds(10, 57, 50, 40);
		frmCalculator.getContentPane().add(buttonBackspace);
		
		JButton buttonClear = new JButton("C");
		buttonClear.setBackground(Color.LIGHT_GRAY);
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClear.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonClear.setBounds(70, 57, 50, 40);
		frmCalculator.getContentPane().add(buttonClear);
		
		JButton buttonPercent = new JButton("\u0025");
		buttonPercent.setBackground(Color.LIGHT_GRAY);
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		buttonPercent.setFont(new Font("SansSerif", Font.BOLD, 16));
		buttonPercent.setBounds(130, 57, 50, 40);
		frmCalculator.getContentPane().add(buttonPercent);
		
		JButton buttonDivision = new JButton("\u00F7");
		buttonDivision.setBackground(Color.LIGHT_GRAY);
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDivision.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonDivision.setBounds(190, 57, 50, 40);
		frmCalculator.getContentPane().add(buttonDivision);
		
		JButton button7 = new JButton("7");
		button7.setBackground(Color.LIGHT_GRAY);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + button7.getText();
				textField.setText(enterNumber);
			}
		});
		button7.setFont(new Font("SansSerif", Font.BOLD, 18));
		button7.setBounds(10, 107, 50, 40);
		frmCalculator.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBackground(Color.LIGHT_GRAY);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button8.getText();
				textField.setText(enterNumber);
			}
		});
		button8.setFont(new Font("SansSerif", Font.BOLD, 18));
		button8.setBounds(70, 107, 50, 40);
		frmCalculator.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBackground(Color.LIGHT_GRAY);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button9.getText();
				textField.setText(enterNumber);
			}
		});
		button9.setFont(new Font("SansSerif", Font.BOLD, 18));
		button9.setBounds(130, 107, 50, 40);
		frmCalculator.getContentPane().add(button9);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.setBackground(Color.LIGHT_GRAY);
		buttonMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		buttonMulti.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonMulti.setBounds(190, 107, 50, 40);
		frmCalculator.getContentPane().add(buttonMulti);
		
		JButton button4 = new JButton("4");
		button4.setBackground(Color.LIGHT_GRAY);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button4.getText();
				textField.setText(enterNumber);
			}
		});
		button4.setFont(new Font("SansSerif", Font.BOLD, 18));
		button4.setBounds(10, 158, 50, 40);
		frmCalculator.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBackground(Color.LIGHT_GRAY);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button5.getText();
				textField.setText(enterNumber);
			}
		});
		button5.setFont(new Font("SansSerif", Font.BOLD, 18));
		button5.setBounds(70, 158, 50, 40);
		frmCalculator.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBackground(Color.LIGHT_GRAY);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button6.getText();
				textField.setText(enterNumber);
			}
		});
		button6.setFont(new Font("SansSerif", Font.BOLD, 18));
		button6.setBounds(130, 158, 50, 40);
		frmCalculator.getContentPane().add(button6);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setBackground(Color.LIGHT_GRAY);
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		buttonMinus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonMinus.setBounds(190, 158, 50, 40);
		frmCalculator.getContentPane().add(buttonMinus);
		
		JButton button1 = new JButton("1");
		button1.setBackground(Color.LIGHT_GRAY);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button1.getText();
				textField.setText(enterNumber);
			}
		});
		button1.setFont(new Font("SansSerif", Font.BOLD, 18));
		button1.setBounds(10, 209, 50, 40);
		frmCalculator.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBackground(Color.LIGHT_GRAY);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button2.getText();
				textField.setText(enterNumber);
			}
		});
		button2.setFont(new Font("SansSerif", Font.BOLD, 18));
		button2.setBounds(70, 209, 50, 40);
		frmCalculator.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBackground(Color.LIGHT_GRAY);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button3.getText();
				textField.setText(enterNumber);
			}
		});
		button3.setFont(new Font("SansSerif", Font.BOLD, 18));
		button3.setBounds(130, 209, 50, 40);
		frmCalculator.getContentPane().add(button3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setBackground(Color.LIGHT_GRAY);
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		buttonPlus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonPlus.setBounds(190, 209, 50, 40);
		frmCalculator.getContentPane().add(buttonPlus);
		
		JButton buttonPlusMinus = new JButton("\u00B1");
		buttonPlusMinus.setBackground(Color.LIGHT_GRAY);
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm = Double.parseDouble(String.valueOf(textField.getText()));
				pm = pm*(-1);
				textField.setText(String.valueOf(pm));
			}
		});
		buttonPlusMinus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonPlusMinus.setBounds(10, 259, 50, 40);
		frmCalculator.getContentPane().add(buttonPlusMinus);
		
		JButton button0 = new JButton("0");
		button0.setBackground(Color.LIGHT_GRAY);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button0.getText();
				textField.setText(enterNumber);
			}
		});
		button0.setFont(new Font("SansSerif", Font.BOLD, 18));
		button0.setBounds(70, 259, 50, 40);
		frmCalculator.getContentPane().add(button0);
		
		JButton buttonDot = new JButton(".");
		buttonDot.setBackground(Color.LIGHT_GRAY);
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + buttonDot.getText());
		          }
			}
		});
		buttonDot.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonDot.setBounds(130, 259, 50, 40);
		frmCalculator.getContentPane().add(buttonDot);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.setBackground(Color.LIGHT_GRAY);
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				
				if (operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.valueOf(result);
					textField.setText(answer);
				} else if (operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.valueOf(result);
					textField.setText(answer);
				} else if (operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.valueOf(result);
					textField.setText(answer);
				} else if (operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.valueOf(result);
					textField.setText(answer);
				} else if (operations == "%") {
					result = (firstNumber/100) * secondNumber;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
			}
		});
		buttonEquals.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonEquals.setBounds(190, 259, 50, 40);
		frmCalculator.getContentPane().add(buttonEquals);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 251, 311);
		frmCalculator.getContentPane().add(panel);
	}
}
