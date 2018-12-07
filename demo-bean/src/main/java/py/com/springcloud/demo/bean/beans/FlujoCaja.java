package py.com.springcloud.demo.bean.beans;

import java.math.BigDecimal;
import java.util.Date;

import py.com.springcloud.demo.bean.enums.EstadoCaja;

public class FlujoCaja {
	
	private Integer id;
	private Date fechaApertura;
	private Date fechaCierre;
	private BigDecimal montoApertura;
	private BigDecimal montoCierre;
	private EstadoCaja estado;
	//TODO FALTAN LOS USUARIOS
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public Date getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public BigDecimal getMontoApertura() {
		return montoApertura;
	}
	public void setMontoApertura(BigDecimal montoApertura) {
		this.montoApertura = montoApertura;
	}
	public BigDecimal getMontoCierre() {
		return montoCierre;
	}
	public void setMontoCierre(BigDecimal montoCierre) {
		this.montoCierre = montoCierre;
	}
	public EstadoCaja getEstado() {
		return estado;
	}
	public void setEstado(EstadoCaja estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "FlujoCaja [id=" + id + ", fechaApertura=" + fechaApertura
				+ ", fechaCierre=" + fechaCierre + ", montoApertura="
				+ montoApertura + ", montoCierre=" + montoCierre + ", estado="
				+ estado + "]";
	}
	
	
	
}
