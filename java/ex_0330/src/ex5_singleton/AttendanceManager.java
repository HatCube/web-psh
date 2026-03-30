package ex5_singleton;

public class AttendanceManager {
	
	private static AttendanceManager Adm = new AttendanceManager();
	private int count;
	private AttendanceManager() {
		count = 0;
	}
	
	public static AttendanceManager getInstance() {
		return Adm;
	}
	public void addAttendance() {
		count++;
	}
	public int getAttendance() {
		return count;
	}
	
}
