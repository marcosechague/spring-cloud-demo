package py.com.springcloud.demo.bean.enums;

public enum TipoOperacion {
	COMPRA("Compra","C"),
	VENTA("Venta","V");
	
	private final String valorDescripcion;
	private final String valorDataBase;
	
	TipoOperacion(String valorDescripcion, String valorDataBase){
		this.valorDescripcion=valorDescripcion;
		this.valorDataBase=valorDataBase;
	}

	public String getValorDescripcion() {
		return valorDescripcion;
	}

	public String getValorDataBase() {
		return valorDataBase;
	}
	
	public static TipoOperacion fromDataBaseValue(String dataBaseValue){
		
		if(dataBaseValue.equals(COMPRA.getValorDataBase())){
			return COMPRA;
		}else if(dataBaseValue.equals(VENTA.getValorDataBase())){
			return VENTA;
		}
		return null;
	}

}
