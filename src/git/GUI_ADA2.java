package git;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI_ADA2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<fruta> listaFrutas = new ArrayList<>();
	

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
		setBounds(100, 100, 657, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField textNombre = new JTextField();
		textNombre.setBounds(266, 95, 179, 26);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(148, 95, 78, 25);
		contentPane.add(lblNombre);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPeso.setBounds(148, 155, 49, 25);
		contentPane.add(lblPeso);
		
		JTextField textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(266, 155, 179, 26);
		contentPane.add(textPeso);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColor.setBounds(148, 223, 54, 25);
		contentPane.add(lblColor);
		
		JTextField textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(266, 223, 179, 26);
		contentPane.add(textColor);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				String peso = textPeso.getText();
				String color = textColor.getText();
				fruta nuevaFruta = new fruta(nombre, peso, color);
				listaFrutas.add(nuevaFruta);
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGuardar.setBounds(23, 315, 137, 40);
		contentPane.add(btnGuardar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado = false;
				String nombreBuscar = JOptionPane.showInputDialog("Fruta a buscar");
				for (int i=0; i<listaFrutas.size(); i++) {
					if (listaFrutas.get(i).getNombre().equals(nombreBuscar)) {
						encontrado = true;
					} //if
					}
				if (encontrado == true) {
					JOptionPane.showMessageDialog(null, "La fruta " + nombreBuscar + " sí se encuentra en la lista");
				}
				else {
					JOptionPane.showMessageDialog(null, "La fruta " + nombreBuscar + " no se encontró");
					}
				}	
			}
		);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setBounds(181, 315, 128, 40);
		contentPane.add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado = false;
				String nombreEliminar = JOptionPane.showInputDialog("Fruta a buscar");
				for (int i=0; i<listaFrutas.size(); i++) {
					if (listaFrutas.get(i).getNombre().equals(nombreEliminar)) {
						encontrado = true;
						if(encontrado == true) { 
						listaFrutas.remove(i);
						JOptionPane.showMessageDialog(null, "La fruta " + nombreEliminar + " se eliminó la lista");	
						}
				else {
					JOptionPane.showMessageDialog(null, "La fruta " + nombreEliminar + " no se encontró");
					}
			}}}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(329, 315, 128, 40);
		contentPane.add(btnEliminar);
		
		JLabel lblFrutas = new JLabel("Frutas");
		lblFrutas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutas.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblFrutas.setBounds(148, 10, 298, 40);
		contentPane.add(lblFrutas);
		
		JLabel lblGramos = new JLabel("Gramos (g)");
		lblGramos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGramos.setBounds(455, 156, 89, 24);
		contentPane.add(lblGramos);
		
		JButton btnRecorrido = new JButton("Recorrido");
		btnRecorrido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < listaFrutas.size(); i++) {
					JOptionPane.showMessageDialog(null, "Fruta: " + listaFrutas.get(i).getNombre() + "\nPeso: " + listaFrutas.get(i).getPeso() + "\nColor: " + listaFrutas.get(i).getColor());
				}
			}
		});
		btnRecorrido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRecorrido.setBounds(481, 315, 137, 40);
		contentPane.add(btnRecorrido);	
	}
}
