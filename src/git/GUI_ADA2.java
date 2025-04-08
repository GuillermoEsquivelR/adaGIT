package git;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI_ADA2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ADA2 frame = new GUI_ADA2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_ADA2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(266, 102, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lbl1 = new JLabel("Nombre:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(148, 95, 78, 25);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Peso:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2.setBounds(148, 155, 49, 25);
		contentPane.add(lbl2);
		
		JTextField txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(266, 155, 96, 19);
		contentPane.add(txt2);
		
		JLabel lbl3 = new JLabel("Color:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3.setBounds(148, 223, 54, 25);
		contentPane.add(lbl3);
		
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(266, 223, 96, 19);
		contentPane.add(textField);
		
		JButton btn1 = new JButton("Guardar");
		btn1.setBounds(152, 315, 137, 40);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Buscar");
		btn2.setBounds(317, 315, 128, 40);
		contentPane.add(btn2);
		
		
		
		
		
		
		
		
		
		
	}

}
