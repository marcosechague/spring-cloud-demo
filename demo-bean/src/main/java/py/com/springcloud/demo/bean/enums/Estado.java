package py.com.springcloud.demo.bean.enums;

public enum Estado {
	
	ACTIVO("ACTIVO"), 
	BLOQUEADO("BLOQUEADO"),
	INACTIVO("INACTIVO") ,
	ANULADO("ANULADO"),
	CONCRETADO("CONCRETADO");
	
	private final String valorDataBase;
	
	Estado(String valorDataBase){
		this.valorDataBase=valorDataBase;
	}

	public String getValorDataBase() {
		return valorDataBase;
	}
	
	public static Estado fromDataBaseValue(String dataBaseValue) {
		
		if(dataBaseValue.equals(ACTIVO.valorDataBase)){
			return ACTIVO;
		}else if (dataBaseValue.equals(INACTIVO.valorDataBase)){
			return INACTIVO;
		}else if (dataBaseValue.equals(BLOQUEADO.valorDataBase)){
			return BLOQUEADO;
		}
		
		return null;
	}
	
}
