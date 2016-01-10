package students;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class studList {

	private JFrame frame;
	private JTextField textFieldFio;
	private JFormattedTextField textFieldAge;
	private JFormattedTextField textFieldMark;
	private JFormattedTextField textFieldGroup;
	private JFormattedTextField textFieldMark2;
	private JFormattedTextField textFieldMark3;
	private JFormattedTextField textFieldMark4;
	private JFormattedTextField textFieldMark5;
	Students[] massStud = new Students[5];
	int count = 0;
	int curStud = 0;

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
		frame.setTitle("Учет студентов");
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(studList.class.getResource("/com/sun/javafx/scene/web/skin/AlignJustified_16x16_JFX.png")));
		frame.setBounds(100, 100, 458, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0423\u0447\u0435\u0442 \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(157, 29, 150, 34);
		panel.add(label);
		
		
		
		JLabel lblNewLabel = new JLabel("\u0424\u0418\u041E \u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(19, 74, 139, 20);
		panel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442 \u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(19, 105, 139, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0433\u0440\u0443\u043F\u043F\u044B:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(19, 136, 139, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u041E\u0446\u0435\u043D\u043A\u0438:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(19, 170, 76, 14);
		panel.add(label_3);
		
		JButton button = new JButton("Редактировать");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				massStud[curStud] = null;
				String fio=textFieldFio.getText();
				int age = Integer.parseInt(textFieldAge.getText());
				int numGroup = Integer.parseInt(textFieldGroup.getText());
				int[] mark = {Integer.parseInt(textFieldMark.getText()), Integer.parseInt(textFieldMark2.getText()), Integer.parseInt(textFieldMark3.getText()), Integer.parseInt(textFieldMark4.getText()), Integer.parseInt(textFieldMark5.getText())};
				massStud[curStud] = new Students(fio, age, numGroup, mark);
			}
		});
		button.setBounds(324, 132, 117, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Удалить");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				massStud[curStud] = null;
			}
		});
		button_1.setBounds(337, 167, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Создать");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fio=textFieldFio.getText();
				int age = Integer.parseInt(textFieldAge.getText());
				int numGroup = Integer.parseInt(textFieldGroup.getText());
				int[] mark = {Integer.parseInt(textFieldMark.getText()), Integer.parseInt(textFieldMark2.getText()), Integer.parseInt(textFieldMark3.getText()), Integer.parseInt(textFieldMark4.getText()), Integer.parseInt(textFieldMark5.getText())};
				massStud[count] = new Students(fio, age, numGroup, mark);
				curStud = count;
				count++;
			}
		});
		button_2.setBounds(337, 101, 89, 23);
		panel.add(button_2);
		
		JButton buttonLeft = new JButton("<<");
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(curStud>0){
					if (massStud[curStud-1] != null){
						curStud--;}
					if(massStud[curStud] != null){
						textFieldFio.setText(massStud[curStud].getFio());
						textFieldAge.setText(Integer.toString(massStud[curStud].getAge()));
						textFieldGroup.setText(Integer.toString(massStud[curStud].getGroup()));
						textFieldMark.setText(Integer.toString(massStud[curStud].getMarks()[0]));
						textFieldMark2.setText(Integer.toString(massStud[curStud].getMarks()[1]));
						textFieldMark3.setText(Integer.toString(massStud[curStud].getMarks()[2]));
						textFieldMark4.setText(Integer.toString(massStud[curStud].getMarks()[3]));
						textFieldMark5.setText(Integer.toString(massStud[curStud].getMarks()[4]));
					}
					
									
				}
			}
		});
		buttonLeft.setBounds(19, 215, 89, 23);
		panel.add(buttonLeft);
		
		JButton buttonRight = new JButton(">>");
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(curStud<=count){
					if (massStud[curStud+1] != null){
					curStud++;}
					if(massStud[curStud] != null){
						textFieldFio.setText(massStud[curStud].getFio());
						textFieldAge.setText(Integer.toString(massStud[curStud].getAge()));
						textFieldGroup.setText(Integer.toString(massStud[curStud].getGroup()));
						textFieldMark.setText(Integer.toString(massStud[curStud].getMarks()[0]));
						textFieldMark2.setText(Integer.toString(massStud[curStud].getMarks()[1]));
						textFieldMark3.setText(Integer.toString(massStud[curStud].getMarks()[2]));
						textFieldMark4.setText(Integer.toString(massStud[curStud].getMarks()[3]));
						textFieldMark5.setText(Integer.toString(massStud[curStud].getMarks()[4]));
					}
					
									
				}
			}
		});
		buttonRight.setBounds(118, 215, 89, 23);
		panel.add(buttonRight);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 249, 431, 106);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 15));
		textArea.setEditable(false);
		JButton buttonAll = new JButton("Показать всех");
		buttonAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				
				for (int j = 0; j < massStud.length; j++) {
					if (massStud[j] != null){
					textArea.setText(textArea.getText()+"\n"+massStud[j].toString());}
				}
			}
		});
		buttonAll.setBounds(266, 215, 124, 23);
		panel.add(buttonAll);
		textFieldFio = new JTextField();
		textFieldFio.setBounds(168, 71, 187, 20);
		panel.add(textFieldFio);
		textFieldFio.setColumns(10);
		
		textFieldAge = new JFormattedTextField();
		textFieldAge.setBounds(168, 102, 86, 20);
		textFieldAge.setValue(new Integer(0));
		panel.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldMark = new JFormattedTextField();
		textFieldMark.setBounds(168, 168, 23, 20);
		textFieldMark.setValue(new Integer(0));
		panel.add(textFieldMark);
		textFieldMark.setColumns(10);
		
		textFieldGroup = new JFormattedTextField();
		textFieldGroup.setBounds(168, 133, 86, 20);
		textFieldGroup.setValue(new Integer(0));
		panel.add(textFieldGroup);
		textFieldGroup.setColumns(10);
		
		textFieldMark2 = new JFormattedTextField();
		textFieldMark2.setColumns(10);
		textFieldMark2.setValue(new Integer(0));
		textFieldMark2.setBounds(201, 168, 23, 20);
		panel.add(textFieldMark2);
		
		textFieldMark3 = new JFormattedTextField();
		textFieldMark3.setColumns(10);
		textFieldMark3.setValue(new Integer(0));
		textFieldMark3.setBounds(231, 168, 23, 20);
		panel.add(textFieldMark3);
		
		textFieldMark4 = new JFormattedTextField();
		textFieldMark4.setColumns(10);
		textFieldMark4.setValue(new Integer(0));
		textFieldMark4.setBounds(266, 168, 23, 20);
		panel.add(textFieldMark4);
		
		textFieldMark5 = new JFormattedTextField();
		textFieldMark5.setColumns(10);
		textFieldMark5.setValue(new Integer(0));
		textFieldMark5.setBounds(299, 168, 23, 20);
		panel.add(textFieldMark5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		menuBar.setBounds(0, 0, 452, 21);
		panel.add(menuBar);
		
		JMenu menu = new JMenu("Файл");
		menu.setIcon(new ImageIcon(studList.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Сохранить");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		menuItem.setIcon(new ImageIcon(studList.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Открыть");
		menuItem_1.setIcon(new ImageIcon(studList.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Выход");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuItem_2.setIcon(new ImageIcon(studList.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		menuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
		menu.add(menuItem_2);
	}
	
}
