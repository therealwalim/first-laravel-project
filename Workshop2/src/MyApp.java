import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MyApp {

	private JFrame frmMaFentre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frmMaFentre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaFentre = new JFrame();
		frmMaFentre.setType(Type.POPUP);
		frmMaFentre.setForeground(Color.WHITE);
		frmMaFentre.getContentPane().setBackground(Color.WHITE);
		
		JLabel lblNothing = new JLabel("Nothing");
		frmMaFentre.getContentPane().add(lblNothing, BorderLayout.CENTER);
		lblNothing.setHorizontalAlignment(SwingConstants.CENTER);
		lblNothing.setFont(new Font("Big John", Font.PLAIN, 59));
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setIcon(null);
		btnNewButton.setFont(new Font("Lato", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmMaFentre.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		frmMaFentre.setBackground(Color.DARK_GRAY);
		frmMaFentre.setTitle("Ma fen\u00EAtre");
		frmMaFentre.setBounds(100, 100, 561, 300);
		frmMaFentre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
