package Repositorio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EjercicioSerieSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField inpIteraciones;
	private JTextArea varSerie;
	private JButton btnLimpiar;

	
	public static void main(String[] args) {

		EjercicioSerieSwing frame = new EjercicioSerieSwing();
		frame.setVisible(true);
		
	}

	
	public EjercicioSerieSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR ");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(276, 227, 89, 23);
		contentPane.add(btnSalir);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(216, 28, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("N\u00DAMERO 1:");
		lblNumero1.setBounds(141, 31, 65, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("N\u00DAMERO 2:");
		lblNumero2.setBounds(141, 71, 65, 14);
		contentPane.add(lblNumero2);
		
		inpNumero2 = new JTextField();
		inpNumero2.setColumns(10);
		inpNumero2.setBounds(216, 68, 86, 20);
		contentPane.add(inpNumero2);
		
		JLabel lblIteraciones = new JLabel("ITERACIONES:");
		lblIteraciones.setBounds(130, 108, 86, 14);
		contentPane.add(lblIteraciones);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setColumns(10);
		inpIteraciones.setBounds(216, 105, 86, 20);
		contentPane.add(inpIteraciones);
		
		JButton btnGenerarSerie = new JButton("Generar Serie");
		btnGenerarSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String varNumero1S=inpNumero1.getText();
				String varNumero2S=inpNumero2.getText();
				String varIteracionesS=inpIteraciones.getText();
				String cadena = "";
				
				int varNumero1I = Integer.parseInt(varNumero1S);
				int varNumero2I = Integer.parseInt(varNumero2S);
				int varIteracionesI = Integer.parseInt(varIteracionesS);
				int Suma = 0;
				int Contador = 1;
				
				cadena = cadena + varNumero1S + " " + varNumero2S;
				 do
				    {
				
				    
				        Contador=Contador+1;
				        Suma=varNumero1I+varNumero2I;
				        cadena = cadena + " " + Suma;
				        varNumero1I=varNumero2I;
				        varNumero2I=Suma;
				    }
				       while(Contador<=varIteracionesI);
				 varSerie.setText(cadena);
				    }
			
		});
		btnGenerarSerie.setBounds(32, 227, 114, 23);
		contentPane.add(btnGenerarSerie);
		
		varSerie = new JTextArea();
		varSerie.setBounds(141, 133, 161, 69);
		contentPane.add(varSerie);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inpNumero1.setText(null);
				inpNumero2.setText(null);
				inpIteraciones.setText(null);
				varSerie.setText(null);
				
			}
		});
		btnLimpiar.setBounds(164, 227, 89, 23);
		contentPane.add(btnLimpiar);
	}
}