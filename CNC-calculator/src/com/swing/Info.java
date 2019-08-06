package com.swing;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Info {

	private JFrame frmInfo;

	/**
	 * @wbp.parser.entryPoint
	 */
	protected void getInitialize(){
		initialize();
	}
	
	protected void disposeFrame(){
		frmInfo.dispose();
	}

	private void initialize() {
		frmInfo = new JFrame();
		frmInfo.setResizable(false);
		frmInfo.setIconImage(Toolkit.getDefaultToolkit().getImage(Info.class.getResource("/com/swing/Icons/infoBtn.jpg")));
		frmInfo.setTitle("Info");
		frmInfo.setVisible(true);
		frmInfo.setBackground(Color.WHITE);
		frmInfo.setBounds(620, 350, 616, 400);
		frmInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmInfo.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 191);
		frmInfo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 600, 191);
		label.setIcon(new ImageIcon(Info.class.getResource("/com/swing/Icons/info.jpg")));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 189, 600, 172);
		frmInfo.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Info.class.getResource("/com/swing/Icons/info2.jpg")));
		lblNewLabel.setBounds(0, 0, 600, 172);
		panel_1.add(lblNewLabel);
	}
}
