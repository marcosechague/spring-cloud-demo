package py.com.springcloud.demo.bean.enums;

public enum TipoDocumento {
	CI(1,"Cédula de identidad"),
	RUC(2,"RUC");
	
	private final Integer id;
	private final String descripcion;
	
	TipoDocumento(Integer id, String descripcion){
		this.id=id;
		this.descripcion=descripcion;
	}

	
	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}


	public static TipoDocumento fromDescripcion(String descripcion){
		
		if(descripcion.equals(CI.getDescripcion())){
			return CI;
		}else if(descripcion.equals(RUC.getDescripcion())){
			return RUC;
		}
		return null;
	}
	
	public static TipoDocumento fromId(Integer idTipoDocumento){
		
		if(idTipoDocumento.equals(CI.getId())){
			return CI;
		}else if(idTipoDocumento.equals(RUC.getId())){
			return RUC;
		}
		return null;
	}

}
