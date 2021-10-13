package Repositorio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cuestionario extends JFrame {

	private JPanel contentPane;

	String[] arregloPreguntas = {"1-. Si deseamos ejecutar solamente aplicaciones para la plataforma Java, necesitamos instalar el JDK",
			"2-. La plataforma Java se ofrece para descarga en JSE, JEE, JME",
			"3-. Si deseamos desarrollar aplicaciones en Java, debemos instalar el JDK",
			"4-. Java fue desarrollado por Oracle",
			"5-. Además de Java, hay muchos otros lenguajes que pueden compilar a bytecode"
	};
			int ContadorAciertos=0, ContadorCuestionario=0;
	String[] arregloRespuestas1= {"Falso", "Verdadero", "Verdadero", "Falso", "Verdadero"};
	String[] arregloRespuestas2= {"Verdadero", "Falso", "Falso", "Verdadero", "Falso"};
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuestionario frame = new Cuestionario();
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
	public Cuestionario() {
		setTitle("Karime Rosado Hernandez  19100252");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblPregunta = new JLabel("1-. Si deseamos ejecutar solamente aplicaciones para la plataforma Java, necesitamos instalar el JDK.");
		lblPregunta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPregunta.setForeground(Color.BLACK);
		lblPregunta.setBackground(Color.BLACK);
		lblPregunta.setBounds(10, 11, 736, 14);
		contentPane.add(lblPregunta);
		
		JRadioButton radOpc1 = new JRadioButton("Verdadero");
		radOpc1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radOpc1.setBounds(81, 113, 109, 23);
		contentPane.add(radOpc1);
		
		JRadioButton radOpc2 = new JRadioButton("Falso");
		radOpc2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radOpc2.setBounds(81, 139, 109, 23);
		contentPane.add(radOpc2);
		

		ButtonGroup radRespuestas = new ButtonGroup();
		radRespuestas.add(radOpc1);
		radRespuestas.add(radOpc2);
		
		JButton btnRegresar = new JButton("<< Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ContadorCuestionario--;
				switch(ContadorCuestionario)
				{
				case 0:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 1:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 2: 
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 3:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 4: 
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				}
			}
		});
		btnRegresar.setBounds(229, 227, 109, 23);
		contentPane.add(btnRegresar);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(radOpc1.isSelected())
				{
					ContadorAciertos++;
				}
				ContadorCuestionario++;
				switch(ContadorCuestionario)
				{
				case 0:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 1:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 2:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 3: 
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				case 4:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					radOpc1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					radOpc2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					break;
				}
			}
		});
		btnSiguiente.setBounds(348, 227, 109, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				JOptionPane.showMessageDialog(null, "Tu calificación es: " + ContadorAciertos * 2 );
			}
		});
		btnEvaluar.setBounds(467, 227, 89, 23);
		contentPane.add(btnEvaluar);
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(566, 227, 89, 23);
		contentPane.add(btnSalir);
	}
}
