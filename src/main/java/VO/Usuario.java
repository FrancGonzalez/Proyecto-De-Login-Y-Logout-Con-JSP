package VO;

public class Usuario {

	private String nombreapellido;
	private String nombreusuario;
	private String clave;
	
	public Usuario(String nombreapellido, String nombreusuario, String clave) {
		this.nombreapellido = nombreapellido;
		this.nombreusuario = nombreusuario;
		this.clave = clave;
	}

	public String getNombreapellido() {
		return nombreapellido;
	}

	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [nombreapellido=" + nombreapellido + ", nombreusuario=" + nombreusuario + ", clave=" + clave
				+ "]";
	}
	
}
