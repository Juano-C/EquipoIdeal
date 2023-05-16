package backend;

public class Empleado {
	private String _nombre;
	private String _rol;
	private String _foto;
	private Integer _desempenio;
	public Empleado(String nombre,String rol,String foto,Integer desempenio) {
		_nombre=nombre;
		_rol=rol;
		_foto=foto;
		_desempenio=desempenio;
	}
	public String getNombre() {
		return _nombre;
	}
	public String getRol() {
		return _rol;
	}
	public String getFoto() {
		return _foto;
	}
	public Integer getDesempenio() {
		return _desempenio;
	}
	
	

}
