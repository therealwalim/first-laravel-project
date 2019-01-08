import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Question_1 {

	private JFrame frmQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_1 window = new Question_1();
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
	public Question_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestion = new JFrame();
		frmQuestion.setTitle("Question 1");
		BorderLayout borderLayout = (BorderLayout) frmQuestion.getContentPane().getLayout();
		borderLayout.setHgap(6);
		
		JPanel panel = new JPanel();
		frmQuestion.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnCoucou = new JButton("Coucou");
		btnCoucou.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				System.out.print("Test");
			}
		});
		btnCoucou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnCoucou, "name_171397066473323");
		frmQuestion.setBounds(10, 40, 300, 200);
		frmQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
