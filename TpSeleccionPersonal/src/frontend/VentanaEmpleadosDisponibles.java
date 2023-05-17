package frontend;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVentanas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class VentanaEmpleadosDisponibles extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaEmpleadosDisponibles()
	{
		setTitle("EMPLEADOS DISPONIBLES EN RECURSOS HUMANOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		//------------Boton Atras------------//
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				ControladorVentanas.VentanaPrincipal();
			}
		});
		btnAtras.setBounds(32, 317, 89, 23);
		btnAtras.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(btnAtras);
		
		//------------Boton empleado------------//
		JButton btnNewButton = new JButton("Empleado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ControladorVentanas.VentanaEmpleado();
			}
		});
		btnNewButton.setBounds(51, 49, 167, 23);
		contentPane.add(btnNewButton);
	}

}
