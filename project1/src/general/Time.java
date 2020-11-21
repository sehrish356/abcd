package general;

import javax.swing.JOptionPane;

public class Time 
{
	private int hours;
	private int mins;
	private String period;

	public Time() {
		hours = 0;
		mins = 0;
		period = "";
	}

	public Time(int hours, int mins, String period) {
		this.hours = hours;
		this.mins = mins;
		this.period = period;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public boolean checkHours() {
//i am making an assumption that the time lies in 12 hours format not in 24 hours format so 13 is considered as incorrect
		if ((hours <= 12) && !(hours <= 0))
			return true;
		else
			return false;
	}

	public boolean checkMins() {
		if ((mins <= 60) && !(mins < 0))
			return true;
		else
			return false;
	}

	public boolean checkPeriod() {
		if ((((period == "am") || (period == "pm") || (period == "AM") || (period == "PM"))))
			return true;
		else
			return false;
	}

	public void checkDisplay() {
		if (checkHours() == true)
			JOptionPane.showMessageDialog(null,"Hours are correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Hours are incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
		if (checkMins() == true)
			JOptionPane.showMessageDialog(null,"Minutes are correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Minutes are incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
		if (checkPeriod() == true)
			JOptionPane.showMessageDialog(null,"Period is correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Period is incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
	}

	public void display() {
		System.out.print("Hour is " + getHours() + "\n");
		int length = String.valueOf(mins).length();
		if (length == 1)
			JOptionPane.showMessageDialog(null,"Hours is :"+getHours()+"\nMinutes are:0"+getMins()+"\nPeriod is"+getPeriod(),"CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Hours is :"+getHours()+"\nMinutes are:"+getMins()+"\nPeriod is"+getPeriod(),"CHECKER",JOptionPane.WARNING_MESSAGE);
	}

	public String toString() {
		String str;
		int length = String.valueOf(mins).length();
		if (length == 1)
			str = "0";
		else
			str = "";
		str = getHours() + ":" + str + getMins() + " " + getPeriod() + "\n";
		return str;
	}
}
