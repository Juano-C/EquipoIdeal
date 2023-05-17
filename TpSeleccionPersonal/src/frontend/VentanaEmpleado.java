package frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVentanas;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class VentanaEmpleado extends JFrame
{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public VentanaEmpleado()
    {
        setTitle("FICHA DE EMPLEADO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        //------------Boton Atras------------//
        JButton btnAtras = new JButton("Atras");
        btnAtras.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                ControladorVentanas.VentanaEmpleadosDisponibles();
            }
        });
        btnAtras.setBounds(10, 327, 89, 23);
        contentPane.add(btnAtras);
    }

}
