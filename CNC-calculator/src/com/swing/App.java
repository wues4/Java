package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class App {

	private JFrame frmAwesome;
	private JTextField metricField1;
	private JTextField inchField1;
	private JTextField metricField2;
	private JTextField inchField2;
	private JTextField metricSum1;
	private JTextField inchSum1;
	private JTextField metricField3;
	private JTextField inchField3;
	private JTextField metricField4;
	private JTextField inchField4;
	private JTextField metricSum2;
	private JTextField inchSum2;
	private final JPanel errorPanel = new JPanel();
	private JTextField mmUnit;
	private JTextField mmUnitResult;
	private JTextField inchUnit;
	private JTextField inchUnitResult;
	Calculator calculator = new Calculator();
	Info info = new Info();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmAwesome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	private void initialize() {
		frmAwesome = new JFrame();
		frmAwesome.setResizable(false);
		frmAwesome.setIconImage(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/com/swing/Icons/caculator.jpg")));
		frmAwesome.getContentPane().setBackground(Color.WHITE);
		frmAwesome.setBackground(Color.WHITE);
		frmAwesome.setVisible(true);
		frmAwesome.setTitle("CNC Calculator");
		frmAwesome.setBounds(600, 300, 650, 350);
//		frmAwesome.setBounds(600, 300, 650, 450);
		frmAwesome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAwesome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 200, 311);
		panel.setBackground(Color.DARK_GRAY);
		frmAwesome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCncCuttingSpeed = new JLabel("CNC Calculator");
		lblCncCuttingSpeed.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblCncCuttingSpeed.setForeground(Color.WHITE);
		lblCncCuttingSpeed.setBounds(10, 11, 180, 29);
		panel.add(lblCncCuttingSpeed);
		
		JButton btnCalculator = new JButton("");
		btnCalculator.setBounds(0, 271, 40, 40);
		panel.add(btnCalculator);
		btnCalculator.setBackground(Color.GRAY);
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.getInitialize();
			}
			});
		btnCalculator.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/Icon_Calculator.jpg")));
		
		JButton btnInfo = new JButton("");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info.getInitialize();
				}
		});
		btnInfo.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/infoBtn.jpg")));
		btnInfo.setBounds(41, 271, 40, 40);
		panel.add(btnInfo);
		
		JToggleButton btnUnit = new JToggleButton("");
		btnUnit.setForeground(Color.LIGHT_GRAY);
		btnUnit.setBackground(Color.LIGHT_GRAY);
		btnUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnUnit.isSelected()){
					frmAwesome.setBounds(600, 300, 650, 450);
				} else {
					frmAwesome.setBounds(600, 300, 650, 350);
				}
			}
		});
		btnUnit.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/unitIcon.jpg")));
		btnUnit.setBounds(160, 271, 40, 40);
		panel.add(btnUnit);
		
		JLabel lblTool = new JLabel("");
		lblTool.setBounds(0, 0, 200, 311);
		lblTool.setHorizontalAlignment(SwingConstants.CENTER);
		lblTool.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/Tool.jpg")));
		panel.add(lblTool);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(199, 0, 435, 36);
		frmAwesome.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCalculateCuttingSpeed = new JLabel("Calculate Cutting Speed");
		lblCalculateCuttingSpeed.setBounds(92, 7, 169, 18);
		lblCalculateCuttingSpeed.setForeground(Color.WHITE);
		lblCalculateCuttingSpeed.setFont(new Font("Rockwell", Font.BOLD, 14));
		panel_1.add(lblCalculateCuttingSpeed);
		
		JButton btnCalcCutting = new JButton("Calculate");
		btnCalcCutting.setBounds(266, 5, 90, 23);
		btnCalcCutting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if ((metricField1.getText() != null) && (metricField2.getText() != null)) {
						double metricNumber1 = Double.parseDouble(metricField1.getText());
						double metricNumber2 = Double.parseDouble(metricField2.getText());
						double result = ((Math.PI*metricNumber1*metricNumber2)/1000);
						metricSum1.setText(String.format("%.1f", result));
					} 
					if ((inchField1.getText() != null) && (inchField2.getText() != null)) {
						double inchNumber1 = Double.parseDouble(inchField1.getText());
						double inchNumber2 = Double.parseDouble(inchField2.getText());
						double result = (int)((Math.PI*inchNumber1*inchNumber2)/12);
						inchSum1.setText(String.format("%.1f", result));
					}
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(errorPanel, "You cannot calculate it ! Something's wrong :(", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			}	
		});
		btnCalcCutting.setBackground(Color.WHITE);
		panel_1.add(btnCalcCutting);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/bar.jpg")));
		label_2.setBounds(0, 0, 435, 36);
		panel_1.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(199, 155, 435, 36);
		frmAwesome.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCalculateSpindleSpeed = new JLabel("Calculate Spindle Speed");
		lblCalculateSpindleSpeed.setBounds(92, 7, 168, 18);
		panel_2.add(lblCalculateSpindleSpeed);
		lblCalculateSpindleSpeed.setForeground(Color.WHITE);
		lblCalculateSpindleSpeed.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JButton btnCalcSpindle = new JButton("Calculate");
		btnCalcSpindle.setBounds(265, 5, 90, 23);
		btnCalcSpindle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if ((metricField3.getText() != null) && (metricField4.getText() != null)) {
						double metricNumber3 = Double.parseDouble(metricField3.getText());
						double metricNumber4 = Double.parseDouble(metricField4.getText());
						double result = (int)((metricNumber3/Math.PI/metricNumber4)*1000);
						metricSum2.setText(String.format("%.1f", result));
					} 
					if ((inchField3.getText() != null) && (inchField4.getText() != null)) {
						double inchNumber3 = Double.parseDouble(inchField3.getText());
						double inchNumber4 = Double.parseDouble(inchField4.getText());
						double result = ((inchNumber3/Math.PI/inchNumber4)*12);
						inchSum2.setText(String.format("%.1f", result));
					}
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(errorPanel, "You cannot calculate it ! Something's wrong :(", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			}	
		});
		btnCalcSpindle.setBackground(Color.WHITE);
		panel_2.add(btnCalcSpindle);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/bar.jpg")));
		label_1.setBounds(0, 0, 435, 36);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(199, 36, 435, 120);
		frmAwesome.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblSpindleSpeedRpm = new JLabel("Spindle Speed rpm (m/min or rpm) :");
		lblSpindleSpeedRpm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSpindleSpeedRpm.setForeground(Color.BLACK);
		lblSpindleSpeedRpm.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblSpindleSpeedRpm.setBounds(10, 33, 240, 18);
		panel_3.add(lblSpindleSpeedRpm);
		
		JLabel lblDiameterDmm = new JLabel("Diameter D (mm or inches) :");
		lblDiameterDmm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiameterDmm.setForeground(Color.BLACK);
		lblDiameterDmm.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblDiameterDmm.setBounds(10, 62, 240, 18);
		panel_3.add(lblDiameterDmm);
		
		JLabel lblCuttingSpeedV = new JLabel("Cutting speed V (m/min or fpm) :");
		lblCuttingSpeedV.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuttingSpeedV.setForeground(Color.BLACK);
		lblCuttingSpeedV.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblCuttingSpeedV.setBounds(10, 91, 240, 18);
		panel_3.add(lblCuttingSpeedV);
		
		JLabel lblUnits = new JLabel("Units :");
		lblUnits.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnits.setForeground(Color.BLACK);
		lblUnits.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblUnits.setBounds(200, 4, 50, 18);
		panel_3.add(lblUnits);
		
		JLabel lblMetric = new JLabel("metric");
		lblMetric.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetric.setForeground(Color.BLACK);
		lblMetric.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblMetric.setBounds(260, 4, 75, 18);
		panel_3.add(lblMetric);
		
		JLabel lblInches_1 = new JLabel("inches");
		lblInches_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInches_1.setForeground(Color.BLACK);
		lblInches_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblInches_1.setBounds(350, 4, 75, 18);
		panel_3.add(lblInches_1);
		
		metricField1 = new JTextField();
		metricField1.setText("100");
		metricField1.setHorizontalAlignment(SwingConstants.RIGHT);
		metricField1.setBounds(260, 33, 75, 20);
		panel_3.add(metricField1);
		metricField1.setColumns(10);
		
		inchField1 = new JTextField();
		inchField1.setText("100");
		inchField1.setHorizontalAlignment(SwingConstants.RIGHT);
		inchField1.setBounds(350, 33, 75, 20);
		panel_3.add(inchField1);
		inchField1.setColumns(10);
		
		metricField2 = new JTextField();
		metricField2.setText("100");
		metricField2.setHorizontalAlignment(SwingConstants.RIGHT);
		metricField2.setColumns(10);
		metricField2.setBounds(260, 62, 75, 20);
		panel_3.add(metricField2);
		
		inchField2 = new JTextField();
		inchField2.setText("100");
		inchField2.setHorizontalAlignment(SwingConstants.RIGHT);
		inchField2.setColumns(10);
		inchField2.setBounds(350, 62, 75, 20);
		panel_3.add(inchField2);
		
		metricSum1 = new JTextField();
		metricSum1.setHorizontalAlignment(SwingConstants.RIGHT);
		metricSum1.setBackground(Color.WHITE);
		metricSum1.setForeground(Color.BLACK);
		metricSum1.setEditable(false);
		metricSum1.setColumns(10);
		metricSum1.setBounds(260, 89, 75, 20);
		panel_3.add(metricSum1);
		
		inchSum1 = new JTextField();
		inchSum1.setHorizontalAlignment(SwingConstants.RIGHT);
		inchSum1.setBackground(Color.WHITE);
		inchSum1.setForeground(Color.BLACK);
		inchSum1.setEditable(false);
		inchSum1.setColumns(10);
		inchSum1.setBounds(350, 89, 75, 20);
		panel_3.add(inchSum1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(199, 191, 435, 120);
		frmAwesome.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblUnits_1 = new JLabel("Units :");
		lblUnits_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnits_1.setForeground(Color.BLACK);
		lblUnits_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblUnits_1.setBounds(200, 4, 50, 18);
		panel_4.add(lblUnits_1);
		
		JLabel lblMetric_1 = new JLabel("metric");
		lblMetric_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetric_1.setForeground(Color.BLACK);
		lblMetric_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblMetric_1.setBounds(260, 4, 74, 18);
		panel_4.add(lblMetric_1);
		
		JLabel lblInches = new JLabel("inches");
		lblInches.setHorizontalAlignment(SwingConstants.CENTER);
		lblInches.setForeground(Color.BLACK);
		lblInches.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblInches.setBounds(350, 4, 75, 18);
		panel_4.add(lblInches);
		
		JLabel lblCuttingSpeedV_1 = new JLabel("Cutting Speed V (m/min or fpm) :");
		lblCuttingSpeedV_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuttingSpeedV_1.setForeground(Color.BLACK);
		lblCuttingSpeedV_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblCuttingSpeedV_1.setBounds(10, 33, 240, 18);
		panel_4.add(lblCuttingSpeedV_1);
		
		JLabel lblDiameterDmm_1 = new JLabel("Diameter D (mm or inches) :");
		lblDiameterDmm_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiameterDmm_1.setForeground(Color.BLACK);
		lblDiameterDmm_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblDiameterDmm_1.setBounds(10, 62, 240, 18);
		panel_4.add(lblDiameterDmm_1);
		
		JLabel lblSpindleSpeedRpm_1 = new JLabel("Spindle Speed rpm (m/min or rpm) :");
		lblSpindleSpeedRpm_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSpindleSpeedRpm_1.setForeground(Color.BLACK);
		lblSpindleSpeedRpm_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblSpindleSpeedRpm_1.setBounds(10, 91, 240, 18);
		panel_4.add(lblSpindleSpeedRpm_1);
		
		metricField3 = new JTextField();
		metricField3.setText("100");
		metricField3.setHorizontalAlignment(SwingConstants.RIGHT);
		metricField3.setColumns(10);
		metricField3.setBounds(260, 33, 75, 20);
		panel_4.add(metricField3);
		
		inchField3 = new JTextField();
		inchField3.setText("100");
		inchField3.setHorizontalAlignment(SwingConstants.RIGHT);
		inchField3.setColumns(10);
		inchField3.setBounds(350, 33, 75, 20);
		panel_4.add(inchField3);
		
		metricField4 = new JTextField();
		metricField4.setText("100");
		metricField4.setHorizontalAlignment(SwingConstants.RIGHT);
		metricField4.setColumns(10);
		metricField4.setBounds(260, 62, 75, 20);
		panel_4.add(metricField4);
		
		inchField4 = new JTextField();
		inchField4.setText("100");
		inchField4.setHorizontalAlignment(SwingConstants.RIGHT);
		inchField4.setColumns(10);
		inchField4.setBounds(350, 62, 75, 20);
		panel_4.add(inchField4);
		
		metricSum2 = new JTextField();
		metricSum2.setHorizontalAlignment(SwingConstants.RIGHT);
		metricSum2.setBackground(Color.WHITE);
		metricSum2.setForeground(Color.BLACK);
		metricSum2.setEditable(false);
		metricSum2.setColumns(10);
		metricSum2.setBounds(260, 91, 75, 20);
		panel_4.add(metricSum2);
		
		inchSum2 = new JTextField();
		inchSum2.setHorizontalAlignment(SwingConstants.RIGHT);
		inchSum2.setBackground(Color.WHITE);
		inchSum2.setForeground(Color.BLACK);
		inchSum2.setEditable(false);
		inchSum2.setColumns(10);
		inchSum2.setBounds(350, 91, 75, 20);
		panel_4.add(inchSum2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(0, 311, 634, 100);
		frmAwesome.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblMminchConverter = new JLabel("mm/inch Converter");
		lblMminchConverter.setForeground(Color.WHITE);
		lblMminchConverter.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblMminchConverter.setBounds(10, 11, 180, 29);
		panel_5.add(lblMminchConverter);
		
		JLabel lblInch = new JLabel("1 inch = 25.4 mm");
		lblInch.setForeground(Color.WHITE);
		lblInch.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblInch.setBounds(10, 36, 180, 29);
		panel_5.add(lblInch);
		
		JLabel lblMm = new JLabel("1 mm = 0.039 inch");
		lblMm.setForeground(Color.WHITE);
		lblMm.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblMm.setBounds(10, 60, 180, 29);
		panel_5.add(lblMm);
		
		JLabel lblMm_1 = new JLabel("mm to inches");
		lblMm_1.setForeground(Color.WHITE);
		lblMm_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblMm_1.setBounds(291, 11, 85, 29);
		panel_5.add(lblMm_1);
		
		mmUnit = new JTextField();
		mmUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		mmUnit.setColumns(10);
		mmUnit.setBounds(200, 16, 85, 20);
		panel_5.add(mmUnit);
		
		mmUnitResult = new JTextField();
		mmUnitResult.setHorizontalAlignment(SwingConstants.RIGHT);
		mmUnitResult.setForeground(Color.BLACK);
		mmUnitResult.setEditable(false);
		mmUnitResult.setColumns(10);
		mmUnitResult.setBackground(Color.WHITE);
		mmUnitResult.setBounds(386, 16, 85, 20);
		panel_5.add(mmUnitResult);
		
		inchUnit = new JTextField();
		inchUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		inchUnit.setColumns(10);
		inchUnit.setBounds(200, 56, 85, 20);
		panel_5.add(inchUnit);
		
		JLabel lblInchesToMm = new JLabel("inches to mm");
		lblInchesToMm.setForeground(Color.WHITE);
		lblInchesToMm.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblInchesToMm.setBounds(291, 51, 85, 29);
		panel_5.add(lblInchesToMm);
		
		inchUnitResult = new JTextField();
		inchUnitResult.setHorizontalAlignment(SwingConstants.RIGHT);
		inchUnitResult.setForeground(Color.BLACK);
		inchUnitResult.setEditable(false);
		inchUnitResult.setColumns(10);
		inchUnitResult.setBackground(Color.WHITE);
		inchUnitResult.setBounds(386, 56, 85, 20);
		panel_5.add(inchUnitResult);
		
		JButton btnConvertMm = new JButton("Convert");
		btnConvertMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (mmUnit.getText() != null) {
						double mmUnitValue = Double.parseDouble(mmUnit.getText());
						double result = mmUnitValue/25.4;
						mmUnitResult.setText(String.format("%.1f", result));
					} 
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(errorPanel, "You cannot calculate it ! You left empty boxes or use ',' instead of '.' :(", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			}
		});
		btnConvertMm.setBackground(Color.WHITE);
		btnConvertMm.setBounds(534, 15, 90, 23);
		panel_5.add(btnConvertMm);
		
		JButton btnConvertInch = new JButton("Convert");
		btnConvertInch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (inchUnit.getText() != null) {
						double inchUnitValue = Double.parseDouble(inchUnit.getText());
						double result = inchUnitValue*25.4;
						inchUnitResult.setText(String.format("%.1f", result));
					} 
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(errorPanel, "You cannot calculate it ! You left empty boxes or use ',' instead of '.' :(", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			}
		});
		btnConvertInch.setBackground(Color.WHITE);
		btnConvertInch.setBounds(534, 55, 90, 23);
		panel_5.add(btnConvertInch);
		
		JLabel lblMm_2 = new JLabel("inch");
		lblMm_2.setForeground(Color.WHITE);
		lblMm_2.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblMm_2.setBounds(481, 11, 31, 29);
		panel_5.add(lblMm_2);
		
		JLabel lblInch_1 = new JLabel("mm");
		lblInch_1.setForeground(Color.WHITE);
		lblInch_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblInch_1.setBounds(481, 51, 31, 29);
		panel_5.add(lblInch_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(App.class.getResource("/com/swing/Icons/bar.jpg")));
		label.setBounds(0, 0, 634, 100);
		panel_5.add(label);
	}
}
