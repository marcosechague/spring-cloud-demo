package py.com.springcloud.demo.bean.dto;

import org.hibernate.validator.constraints.NotBlank;

public class CambioPasswordToUsuarioDTO {

	@NotBlank
	private String nuevoPassword;
	
	@NotBlank
	private String nuevoPasswordRepeticion;

	public String getNuevoPassword() {
		return nuevoPassword;
	}

	public void setNuevoPassword(String nuevoPassword) {
		this.nuevoPassword = nuevoPassword;
	}

	public String getNuevoPasswordRepeticion() {
		return nuevoPasswordRepeticion;
	}

	public void setNuevoPasswordRepeticion(String nuevoPasswordRepeticion) {
		this.nuevoPasswordRepeticion = nuevoPasswordRepeticion;
	}

	
	@Override
	public String toString() {
		return "CambioPasswordToUsuarioDTO [nuevoPassword= ****** , nuevoPasswordRepeticion= ******* ]";
	}
	
}
