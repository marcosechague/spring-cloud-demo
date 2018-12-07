package py.com.springcloud.demo.common.exception;


public class ErrorCode {

	//GENERALES
	public static final String ERROR_DATABASE_REQUEST = "g1000";
	public static final String ERROR_FORMATO_FECHA_INCORRECTO= "g1010";
	public static final String ERROR_ESTADO_DESCONOCIDO= "g1020";
	public static final String ERROR_INVALID_ISO8601_DATE= "g1050";
	
	//APLICACION
	//AUTH
	public static final String ERROR_INVALID_CLIENT_VERSION_TYPE = "au1000";
	public static final String ERROR_CLIENT_VERSION_STATUS_INACTICO = "au1010";
	public static final String ERROR_INVALID_SSIGN = "au1020";
	public static final String ERROR_USUARIO_NO_ENCONTRADO= "au1030";
	public static final String ERROR_ROL_NO_ENCONTRADO= "au1040";
	public static final String ERROR_USUARIO_BLOQUEADO= "au1050";
	public static final String ERROR_USUARIO_INACTIVO= "au1060";
	public static final String ERROR_SESION_ID_NOT_FOUND= "au1070";
	public static final String ERROR_SESION_ACCESS_TOKEN_NOT_FOUND= "au1080";
	public static final String ERROR_NULL_CONTEXT = "au1090";
	public static final String ERROR_MISSING_ACCESS_TOKEN = "au1100";
	public static final String ERROR_SESION_INVALID_STATUS= "au1110";
	public static final String ERROR_SESION_EXPIRED= "au1120";
	public static final String ERROR_INVALID_ACCESS_TOKEN_FORMAT= "au1130";
	public static final String ERROR_INVALID_ACCESS_TOKEN= "au1140";
	public static final String ERROR_INVALID_USER_PERMITS= "au1150";
	public static final String ERROR_USUARIO_DESCONOCIDO="au1160";
	public static final String ERROR_CONTRASNHAS_NO_COINCIDEN="au1170";
	public static final String ERROR_CONTRASNHA_MUY_CORTA="au1170";
	
	
	
	//DATOS GENERALES
	public static final String ERROR_CIUDAD_NO_ENCONTRADA= "dg1000";
	public static final String ERROR_DESCRIPCION_CIUDAD_DUPLICADA= "dg1010";
	
	//CLIENTE
	public static final String ERROR_CLIENTE_NO_ENCONTRADO= "cl1000";
	public static final String ERROR_DOCUMENTO_CLIENTE_DUPLICADO= "cl1010";
	public static final String ERROR_ID_CLIENTE_NO_NUMERICO= "cl1020";
	public static final String ERROR_TIPO_IDENTIFICACION_DESCONOCIDO= "cl1030";
	
	//PRODUCTO
	public static final String ERROR_PRODUCTO_NO_ENCONTRADO= "p1000";
	public static final String ERROR_DESCRIPCION_PRODUCTO_DUPLICADO= "p1010";
	
	//VENTAS
	public static final String ERROR_VENTA_NULL ="v1000";
	public static final String ERROR_CLIENTE_NULL="v1010";
	public static final String ERROR_MONTO_VENTA_NULL="v1020";
	public static final String ERROR_TOTAL_PAGADO_NULL="v1030";
	public static final String ERROR_DETALLE_VENTA_NULL="v1040";
	public static final String ERROR_ANULAR_VENTA_ID_DESCONOCITO="v1050";
	
	//COMPRAS
	public static final String ERROR_COMPRA_NULL ="c1500";
	public static final String ERROR_MONTO_COMPRA_NULL="c1510";
	public static final String ERROR_DETALLE_COMPRA_NULL="c1520";
	public static final String ERROR_ANULAR_COMPRA_ID_DESCONOCIDO="c1530";
	
	//PROVEEDORES
	public static final String ERROR_PROVEEDOR_NO_ENCONTRADO= "pr1500";
	public static final String ERROR_RUC_PROVEEDOR_DUPLICADO= "pr1510";
	
	//CAJA
	public static final String ERROR_CAJA_YA_ABIERTA= "cj1000";
	public static final String ERROR_CAJA_YA_CERRADA= "cj1010";
		
	//MANEJADOR
	public static final String ERROR_MISSING_PARAMETER= "m1000";
	public static final String ERROR_MISSING_INVALID_BODY_PARAMETER="m1010";
	public static final String ERROR_HTTP_INVALID_METHOD="m1030";
	public static final String ERROR_UNEXPECTED_WEB="m1040";
	public static final String ERROR_UNEXPECTED_DB="m1050";
	public static final String ERROR_UNEXPECTED="m2000";
	
	//ADMIN
	public static final String ERROR_ROL_DESCONOCIDO="ad1000";
	public static final String ERROR_ROL_ES_UTULIZADO="ad1010";
	
}
