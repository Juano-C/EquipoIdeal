package controlador;

import frontend.VentanaPrincipal;
import frontend.VentanaEquipoIdeal;
import frontend.VentanaEmpleadosDisponibles;
import frontend.VentanaEmpleado;

import javax.swing.JFrame;

public class ControladorVentanas
{

    private static VentanaPrincipal _ventanaPrincipal = new VentanaPrincipal();
    private static VentanaEquipoIdeal _ventanaEquipoIdeal = new VentanaEquipoIdeal();
    private static VentanaEmpleadosDisponibles _ventanaEmpleadosDisponibles = new VentanaEmpleadosDisponibles();
    private static VentanaEmpleado _ventanaEmpleado = new VentanaEmpleado();

    public static void abrirVentana(JFrame ventanaAbrir,JFrame ventanaCerrar)
    {
        ventanaAbrir.setLocationRelativeTo(null);
        ventanaAbrir.setVisible(true);
        ventanaCerrar.setVisible(false);
        ventanaAbrir.setResizable(false);
    }

    public static VentanaPrincipal getVentanaPrincipal()
    {
        return _ventanaPrincipal;
    }

    public static VentanaEquipoIdeal getVentanaEquipoIdeal()
    {
        return _ventanaEquipoIdeal;
    }

    public static VentanaEmpleadosDisponibles getVentanaEmpleadosDisponibles()
    {
        return _ventanaEmpleadosDisponibles;
    }

    public static VentanaEmpleado getVentanaEmpleado()
    {
        return _ventanaEmpleado;
    }

    public static void VentanaPrincipal()
    {
        _ventanaPrincipal.setVisible(true);
        _ventanaPrincipal.setLocationRelativeTo(null);
        
        _ventanaEquipoIdeal.setVisible(false);
        _ventanaEmpleadosDisponibles.setVisible(false);
        _ventanaEmpleado.setVisible(false);
    }

    public static void VentanaEquipoIdeal()
    {
        _ventanaPrincipal.setVisible(false);
        _ventanaEquipoIdeal.setVisible(true);
        _ventanaEquipoIdeal.setLocationRelativeTo(null);
        
        _ventanaEmpleadosDisponibles.setVisible(false);
        _ventanaEmpleado.setVisible(false);
    }

    public static void VentanaEmpleadosDisponibles()
    {
        _ventanaPrincipal.setVisible(false);
        _ventanaEquipoIdeal.setVisible(false);
        _ventanaEmpleadosDisponibles.setVisible(true);
        _ventanaEquipoIdeal.setLocationRelativeTo(null);
        
        _ventanaEmpleado.setVisible(false);
    }

    public static void VentanaEmpleado()
    {
        _ventanaPrincipal.setVisible(false);
        _ventanaEquipoIdeal.setVisible(false);
        _ventanaEmpleadosDisponibles.setVisible(false);
        _ventanaEmpleado.setVisible(true);
        _ventanaEquipoIdeal.setLocationRelativeTo(null);
    }

}
