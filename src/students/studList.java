package students;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class studList {

	private JFrame frame;
	private JTextField textFieldFio;
	private JTextField textFieldAge;
	private JTextField textFieldMArks;
	private JTextField textFieldGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studList window = new studList();
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
	public studList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 458, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0423\u0447\u0435\u0442 \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(147, 11, 150, 34);
		panel.add(label);
		
		textFieldFio = new JTextField();
		textFieldFio.setBounds(211, 56, 187, 20);
		panel.add(textFieldFio);
		textFieldFio.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(211, 87, 86, 20);
		panel.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldMArks = new JTextField();
		textFieldMArks.setBounds(211, 153, 86, 20);
		panel.add(textFieldMArks);
		textFieldMArks.setColumns(10);
		
		textFieldGroup = new JTextField();
		textFieldGroup.setBounds(211, 118, 86, 20);
		panel.add(textFieldGroup);
		textFieldGroup.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0424\u0418\u041E \u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 59, 139, 20);
		panel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442 \u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 90, 139, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0433\u0440\u0443\u043F\u043F\u044B:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(10, 121, 139, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u041E\u0446\u0435\u043D\u043A\u0438:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(10, 155, 76, 14);
		panel.add(label_3);
		
		JButton button = new JButton("\u0420\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
		button.setBounds(315, 117, 117, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
		button_1.setBounds(328, 152, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C");
		button_2.setBounds(328, 86, 89, 23);
		panel.add(button_2);
	}
}
