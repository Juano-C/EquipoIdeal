package frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVentanas;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEquipoIdeal extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaEquipoIdeal()
	{
		setTitle("EQUIPO IDEAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//------------Boton Atras------------//
		Button button = new Button("Atras");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ControladorVentanas.VentanaPrincipal();
			}
		});
		button.setBounds(10, 408, 70, 22);
		contentPane.add(button);
	}
}
