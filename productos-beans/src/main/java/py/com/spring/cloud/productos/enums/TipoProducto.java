package py.com.spring.cloud.productos.enums;

public enum TipoProducto {
	KG("KG"),
	UNIDAD("UNIDAD");
	
	private final String valorDataBase;
	
	TipoProducto(String valorDataBase){
		this.valorDataBase=valorDataBase;
	}

	public String getValorDataBase() {
		return valorDataBase;
	}
	
	public static TipoProducto fromDataBaseValue(String dataBaseValue){
		
		if(dataBaseValue.equals(KG.getValorDataBase())){
			return KG;
		}else if(dataBaseValue.equals(UNIDAD.getValorDataBase())){
			return UNIDAD;
		}
		return null;
	}

}
