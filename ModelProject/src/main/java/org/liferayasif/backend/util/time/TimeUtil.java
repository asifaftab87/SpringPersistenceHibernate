package org.liferayasif.backend.util.time;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {

	public static Timestamp getSqlTimStmp() {
		Calendar cal = Calendar.getInstance();
		Date curr = cal.getTime();
		Timestamp cTimstmp = new java.sql.Timestamp(curr.getTime());
		return cTimstmp;
	}
	
}
