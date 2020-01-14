// Fig. 16.8: TimeComparator.java
// Custom Comparator class that compares two Time2 objects.
import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {
	@Override
	public int compare(Time2 time1, Time2 time2) {
		int hourDifference = time1.getHour() - time2.getHour();
		
		if (hourDifference != 0) // test the hour first
			return hourDifference;
		
		int minuteDifference = time1.getMinute() - time2.getMinute();
		
		if (minuteDifference != 0) // then test the minute
			return minuteDifference;
		
		int secondDifference = time1.getSecond() - time2.getSecond();
		return secondDifference;
	}
} // end class TimeComparator
