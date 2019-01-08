import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Question_4 {

	private JFrame frmQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_4 window = new Question_4();
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
	public Question_4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestion = new JFrame();
		frmQuestion.getContentPane().setBackground(new Color(255, 255, 255));
		frmQuestion.setTitle("Question 4");
		frmQuestion.setBounds(100, 100, 450, 300);
		frmQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frmQuestion.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		mnNewMenu.setBackground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ouvrir");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sauver");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("affichage");
		mnNewMenu.add(chckbxNewCheckBox);
		
		JMenu mnNewMenu_1 = new JMenu("Edition");
		mnNewMenu_1.setBackground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Copier");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmColler = new JMenuItem("Coller");
		mnNewMenu_1.add(mntmColler);
	}

}
