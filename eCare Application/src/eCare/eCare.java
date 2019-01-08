package eCare;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eCare {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eCare window = new eCare();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public eCare() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Walim\\Desktop\\Graphic Design\\Behance\\eCare\\favicare.png"));
		frmHome.setTitle("Home");
		frmHome.setSize(375, 668);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 102));
		frmHome.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(-24, 5, 407, 497);
		label.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\Graphic Design\\Behance\\eCare\\Groupe 1.png"));
		panel.add(label);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setBounds(10, 557, 339, 40);
		panel.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frmHome.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewApplication = new JMenuItem("New application");
		mntmNewApplication.setBackground(new Color(255, 255, 255));
		mnFile.add(mntmNewApplication);
		
		JMenuItem mntmOpenFolder = new JMenuItem("Open folder");
		mntmOpenFolder.setBackground(new Color(255, 255, 255));
		mnFile.add(mntmOpenFolder);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.setBackground(new Color(255, 255, 255));
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mntmRedo.setBackground(new Color(255, 255, 255));
		mnEdit.add(mntmRedo);
	}
}
