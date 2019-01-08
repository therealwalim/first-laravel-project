import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Label;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Question_3 {

	private JFrame frmQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_3 window = new Question_3();
					window.frmQuestion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Question_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestion = new JFrame();
		frmQuestion.setTitle("Question 3");
		frmQuestion.getContentPane().setForeground(new Color(0, 0, 0));
		frmQuestion.getContentPane().setBackground(new Color(255, 255, 255));
		frmQuestion.setBounds(100, 100, 450, 300);
		frmQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.disabledShadow"));
		frmQuestion.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\award.png"));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\planning.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmQuestion.getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\presentation.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\analysis.png"));
		panel_1.add(btnNewButton_2);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		frmQuestion.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\pie-chart.png"));
		panel_2.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP_Swing\\images\\coins.png"));
		panel_2.add(label, BorderLayout.CENTER);
		
	}

}
