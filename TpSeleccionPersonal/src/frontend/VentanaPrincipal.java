package frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVentanas;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JFrame
{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public VentanaPrincipal()
    {
        setTitle("VENTANA PRINCIPAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 522, 438);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        //------------Boton Armar Equipo------------//
        JButton btnArmarEquipo = new JButton("Armar Equipo");
        btnArmarEquipo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                ControladorVentanas.VentanaEquipoIdeal();
            }
        });
        btnArmarEquipo.setFont(new Font("Times New Roman", Font.BOLD, 26));
        btnArmarEquipo.setBounds(145, 156, 210, 78);
        contentPane.add(btnArmarEquipo);

        //------------Boton Empleados disponibles------------//
        JButton btnEmpleadosDisponibles = new JButton("Empleados disponibles");
        btnEmpleadosDisponibles.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                ControladorVentanas.VentanaEmpleadosDisponibles();
            }
        });
        btnEmpleadosDisponibles.setFont(new Font("Times New Roman", Font.BOLD, 26));
        btnEmpleadosDisponibles.setBounds(99, 35, 304, 78);
        contentPane.add(btnEmpleadosDisponibles);

        //------------Boton salir------------//
        JButton btnSalir = new JButton("Salir");
        btnSalir.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.exit(0);
            }
        });
        btnSalir.setFont(new Font("Times New Roman", Font.BOLD, 11));
        btnSalir.setBounds(425, 374, 77, 21);
        contentPane.add(btnSalir);
    }

}
