package py.com.springcloud.demo.bean.enums;

public enum EstadoCaja {
	
	ABIERTO("ABIERTO"), 
	CERRADO("CERRADO") ;
	
	private final String valorDataBase;
	
	EstadoCaja(String valorDataBase){
		this.valorDataBase=valorDataBase;
	}

	public String getValorDataBase() {
		return valorDataBase;
	}
	
	public static EstadoCaja fromDataBaseValue(String dataBaseValue) {
		
		if(dataBaseValue.equals(ABIERTO.valorDataBase)){
			return ABIERTO;
		}else if (dataBaseValue.equals(CERRADO.valorDataBase)){
			return CERRADO;
		}
		
		return null;
	}
	
}
