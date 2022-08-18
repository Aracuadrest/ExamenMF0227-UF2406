package vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import funciones.Utilidades;

import net.miginfocom.swing.MigLayout;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txt2404;
	private JTextField txt2405;
	private JTextField txt2406;
	private JLabel lblNota;
	private JLabel lblRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[102.00][grow][][grow][][grow]", "[][14.00][][][][][][]"));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 0 0,alignx trailing");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 1 0 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblUF2404 = new JLabel("UF2404:");
		lblUF2404.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblUF2404, "cell 0 2,alignx trailing");
		
		txt2404 = new JTextField();
		txt2404.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txt2404, "cell 1 2,growx");
		txt2404.setColumns(10);
		
		JLabel lblUF2405 = new JLabel("UF2405:");
		lblUF2405.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblUF2405, "cell 2 2,alignx trailing");
		
		txt2405 = new JTextField();
		txt2405.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txt2405, "cell 3 2,growx");
		txt2405.setColumns(10);
		
		JLabel lblUF2406 = new JLabel("UF2406:");
		lblUF2406.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblUF2406, "cell 4 2,alignx trailing");
		
		txt2406 = new JTextField();
		txt2406.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txt2406, "cell 5 2,growx");
		txt2406.setColumns(10);
		
		JButton btnCalcularNota = new JButton("Calcular Nota");
		btnCalcularNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularNota();
			}
		});
		btnCalcularNota.setFont(new Font("Verdana", Font.PLAIN, 15));
		contentPane.add(btnCalcularNota, "cell 0 4 6 1,alignx center");
		
		JLabel lblNotaMedia = new JLabel("Nota Media:");
		lblNotaMedia.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblNotaMedia, "cell 0 6");
		
		 lblNota = new JLabel();
		 lblNota.setText("0.0");
		lblNota.setFont(new Font("Verdana", Font.PLAIN, 13));
		contentPane.add(lblNota);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Verdana", Font.PLAIN, 13));
		contentPane.add(lblResultado, "cell 0 7");
		
	 lblRes = new JLabel("No calculado aún");
		lblRes.setFont(new Font("Verdana", Font.PLAIN, 13));
		contentPane.add(lblRes, "cell 1 7 4 1");
	}

	protected void calcularNota() {
		
		String nombre = txtNombre.getText();
		double nota2404 = Double.parseDouble(txt2404.getText());
		double nota2405 = Double.parseDouble(txt2405.getText());
		double nota2406 = Double.parseDouble(txt2406.getText());
		
		double media = (nota2404+nota2405+nota2406)/3.0;
		
		lblNota.setText(" "+media);
		lblRes.setText(nombre+" ha sacado un "+Utilidades.devuelveNota(media));
		
		
	}

}
