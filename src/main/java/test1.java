import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/06/30 0030
 * @author jiangwenzhu
 * @version 1.0
 */

public class test1 {

	public static void main(String[] args) {


		String s = "-1d";
		System.out.println(getDataRange("1d"));
	}

	public static String getDataRange(String timeRangFlag){

		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		Date startTime = new Date();
		Date endTime = new Date();
		int timeRangeLength = timeRangFlag.length();
		String unit = timeRangFlag.substring(timeRangeLength- 1, timeRangeLength).toUpperCase();
		String valueStr = timeRangFlag.substring(0, timeRangeLength - 1);
		int value = Integer.parseInt(valueStr);
		boolean isPositiveNum = (value > 0);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int addValue;

		switch (unit){

			case "D":
				if(isPositiveNum){
					addValue = 24 * value;
					startCalendar.setTime(startTime);
					startCalendar.add(Calendar.HOUR, addValue);
					endTime = startCalendar.getTime();
				}else{
					addValue = 24 * value;
					endCalendar.setTime(endTime);
					endCalendar.add(Calendar.HOUR, addValue);
					startTime = endCalendar.getTime();
				}

				break;
			case "M":

				if(isPositiveNum){
					addValue = value;
					startCalendar.setTime(startTime);
					startCalendar.add(Calendar.MONTH, addValue);
					endTime = startCalendar.getTime();
				}else{
					addValue = value;
					endCalendar.setTime(endTime);
					endCalendar.add(Calendar.MONTH, addValue);
					startTime = endCalendar.getTime();
				}
				break;
			case "Y":

				if(isPositiveNum){
					addValue = value;
					startCalendar.setTime(startTime);
					startCalendar.add(Calendar.YEAR, addValue);
					endTime = startCalendar.getTime();
				}else{
					addValue = value;
					endCalendar.setTime(endTime);
					endCalendar.add(Calendar.YEAR, addValue);
					startTime = endCalendar.getTime();
				}
				break;
			default:
				break;
		}
		String result = simpleDateFormat.format(startTime) + "," + simpleDateFormat.format(endTime);
		return result;
	}
}
