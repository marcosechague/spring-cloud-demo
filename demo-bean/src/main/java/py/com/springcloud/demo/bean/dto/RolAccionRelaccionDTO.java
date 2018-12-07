package py.com.springcloud.demo.bean.dto;

import java.util.List;

import py.com.springcloud.demo.bean.beans.Accion;

public class RolAccionRelaccionDTO {

	private List<Accion> acciones;

	public List<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(List<Accion> acciones) {
		this.acciones = acciones;
	}

	@Override
	public String toString() {
		return "RolAccionRelaccionDTO [acciones=" + acciones + "]";
	}	
}
