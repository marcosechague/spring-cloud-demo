package py.com.springcloud.demo.bean.enums;

public enum TipoIdentificacion {
	ID("ID"),
	DOCUMENTO("DOC");
	
	private final String descripcion;
	
	TipoIdentificacion( String descripcion){
		this.descripcion=descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}


	public static TipoIdentificacion fromDescripcion(String descripcion){
		
		if(descripcion.equals(ID.getDescripcion())){
			return ID;
		}else if(descripcion.equals(DOCUMENTO.getDescripcion())){
			return DOCUMENTO;
		}
		return null;
	}
	
}
