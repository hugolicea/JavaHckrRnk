package solution;

public class Result {

	/*
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 * 
	 * ex. s=07:05:45PM -> 19:05:45
	 * 
	 * time= "07" "05" "45PM"
	 */

	public static String timeConversion(String s) {
		String time[] = s.split(":");
		String hour = time[0];
		String mins = time[1];
		String secAmPm = time[2];
		String seconds = secAmPm.substring(0, secAmPm.length() - 2);
		String meridian = secAmPm.substring(secAmPm.length()-2);
		int hours = Integer.parseInt(hour);

		String militaryFormat = "";

		if ((hours >= 0 && hours < 12) && meridian.equals("AM")) {
			militaryFormat = String.format("%02d", hours) + ":" + mins + ":" + seconds;

		} else if ((hours >= 0 && hours < 12) && meridian.equals("PM")) {
			militaryFormat = (hours + 12) + ":" + mins + ":" + seconds;
			
		} else if (hours == 12 && meridian.equals("AM")) {
			militaryFormat = "00" + ":" + mins + ":" + seconds;

		} else if (hours == 12 && meridian.equals("PM")) {
			militaryFormat = hours + ":" + mins + ":" + seconds;
		}

		return militaryFormat;
	}

}
