import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Kalkulator {

	private JFrame frmKalkulator;
	private JTextField textField;
	
	double firstNumber, secondNumber, result;
	String operations, answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frmKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Kalkulator() {
		initialize();
	}

	private void initialize() {
		frmKalkulator = new JFrame();
		frmKalkulator.setTitle("Kalkulator");
		frmKalkulator.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frmKalkulator.setBounds(100, 100, 265, 350);
		frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 230, 35);
		frmKalkulator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buttonBackspace = new JButton("\u232B");
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
		frmKalkulator.getContentPane().add(buttonBackspace);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClear.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonClear.setBounds(70, 57, 50, 40);
		frmKalkulator.getContentPane().add(buttonClear);
		
		JButton buttonPercent = new JButton("\u0025");
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		buttonPercent.setFont(new Font("SansSerif", Font.BOLD, 16));
		buttonPercent.setBounds(130, 57, 50, 40);
		frmKalkulator.getContentPane().add(buttonPercent);
		
		JButton buttonDivision = new JButton("\u00F7");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDivision.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonDivision.setBounds(190, 57, 50, 40);
		frmKalkulator.getContentPane().add(buttonDivision);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + button7.getText();
				textField.setText(enterNumber);
			}
		});
		button7.setFont(new Font("SansSerif", Font.BOLD, 18));
		button7.setBounds(10, 107, 50, 40);
		frmKalkulator.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button8.getText();
				textField.setText(enterNumber);
			}
		});
		button8.setFont(new Font("SansSerif", Font.BOLD, 18));
		button8.setBounds(70, 107, 50, 40);
		frmKalkulator.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button9.getText();
				textField.setText(enterNumber);
			}
		});
		button9.setFont(new Font("SansSerif", Font.BOLD, 18));
		button9.setBounds(130, 107, 50, 40);
		frmKalkulator.getContentPane().add(button9);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		buttonMulti.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonMulti.setBounds(190, 107, 50, 40);
		frmKalkulator.getContentPane().add(buttonMulti);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button4.getText();
				textField.setText(enterNumber);
			}
		});
		button4.setFont(new Font("SansSerif", Font.BOLD, 18));
		button4.setBounds(10, 158, 50, 40);
		frmKalkulator.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button5.getText();
				textField.setText(enterNumber);
			}
		});
		button5.setFont(new Font("SansSerif", Font.BOLD, 18));
		button5.setBounds(70, 158, 50, 40);
		frmKalkulator.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button6.getText();
				textField.setText(enterNumber);
			}
		});
		button6.setFont(new Font("SansSerif", Font.BOLD, 18));
		button6.setBounds(130, 158, 50, 40);
		frmKalkulator.getContentPane().add(button6);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		buttonMinus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonMinus.setBounds(190, 158, 50, 40);
		frmKalkulator.getContentPane().add(buttonMinus);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button1.getText();
				textField.setText(enterNumber);
			}
		});
		button1.setFont(new Font("SansSerif", Font.BOLD, 18));
		button1.setBounds(10, 209, 50, 40);
		frmKalkulator.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button2.getText();
				textField.setText(enterNumber);
			}
		});
		button2.setFont(new Font("SansSerif", Font.BOLD, 18));
		button2.setBounds(70, 209, 50, 40);
		frmKalkulator.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button3.getText();
				textField.setText(enterNumber);
			}
		});
		button3.setFont(new Font("SansSerif", Font.BOLD, 18));
		button3.setBounds(130, 209, 50, 40);
		frmKalkulator.getContentPane().add(button3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		buttonPlus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonPlus.setBounds(190, 209, 50, 40);
		frmKalkulator.getContentPane().add(buttonPlus);
		
		JButton buttonPlusMinus = new JButton("\u00B1");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm = Double.parseDouble(String.valueOf(textField.getText()));
				pm = pm*(-1);
				textField.setText(String.valueOf(pm));
			}
		});
		buttonPlusMinus.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonPlusMinus.setBounds(10, 259, 50, 40);
		frmKalkulator.getContentPane().add(buttonPlusMinus);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button0.getText();
				textField.setText(enterNumber);
			}
		});
		button0.setFont(new Font("SansSerif", Font.BOLD, 18));
		button0.setBounds(70, 259, 50, 40);
		frmKalkulator.getContentPane().add(button0);
		
		JButton buttonDot = new JButton(".");
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
		frmKalkulator.getContentPane().add(buttonDot);
		
		JButton buttonEquals = new JButton("=");
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
		frmKalkulator.getContentPane().add(buttonEquals);
	}
}
