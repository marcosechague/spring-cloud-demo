package py.com.springcloud.demo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateUtils {

	public static ZonedDateTime parseZonedDateTime(CharSequence text) {
		return ZonedDateTime.parse(text);
	}
	
	public static java.sql.Date getSQLDataFromString (String fechaString) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaUtil = sdf.parse(fechaString);
		java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
		return fechaSQL;
		
	}
	
	
}
