import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;

public class Question_5 {

	private JFrame frame;
	private final JSpinner spinner = new JSpinner();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JComboBox comboBox = new JComboBox();
	private final JSlider slider = new JSlider();
	private final JPanel panel_3 = new JPanel();
	private final JRadioButton rdbtnNewRadioButton = new JRadioButton("Green");
	private final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Blue");
	private final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Red");
	private final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Magenta");
	private final JRadioButton rdbtnOrange = new JRadioButton("Orange");
	private final JTextField txtTest = new JTextField();
	private final JTextPane txtpnColorNameenglish = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question_5 window = new Question_5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Question_5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtTest.setText("Blanc");
		txtTest.setToolTipText("blanc");
		txtTest.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{266, 100, 0};
		gbl_panel.rowHeights = new int[]{20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		spinner.setModel(new SpinnerListModel(new String[] {"Green", "Blue", "Red", "Magenta", "Orange"}));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.anchor = GridBagConstraints.NORTH;
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 0;
		panel.add(spinner, gbc_spinner);
		
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Green", "Blue", "Red", "Magenta", "Orange"}));
		
		panel_1.add(comboBox);
		
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		txtpnColorNameenglish.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnColorNameenglish.setBackground(UIManager.getColor("Button.background"));
		txtpnColorNameenglish.setEditable(false);
		txtpnColorNameenglish.setText("Color name (English)");
		
		panel_2.add(txtpnColorNameenglish);
		
		panel_2.add(txtTest);
		
		frame.getContentPane().add(slider, BorderLayout.CENTER);
		
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		
		panel_3.add(rdbtnNewRadioButton);
		
		panel_3.add(rdbtnNewRadioButton_1);
		
		panel_3.add(rdbtnNewRadioButton_2);
		
		panel_3.add(rdbtnNewRadioButton_3);
		
		panel_3.add(rdbtnOrange);
	}

}
