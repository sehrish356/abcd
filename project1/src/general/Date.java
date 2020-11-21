package general;

import javax.swing.JOptionPane;

public class Date 
{
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 21;
		month = 3;
		year = 2001;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean checkDay()
//	in checkDay i am making an assumption that the days in a 2nd month feb is 28 and others months have 30 days .
	{
		if ((day <= 30) && (month != 2))
			return true;
		else if ((day <= 28) && (month == 2))
			return true;
		else
			return false;
	}

	public boolean checkMonth() {
		if ((month <= 12) && !(month <= 0))
			return true;
		else
			return false;
	}

	public boolean checkYear() {
		if ((year <= 2020) && !(year <= 0))
			return true;
		else
			return false;
	}

	public void checkDisplay() {
		if (checkDay() == true)
			JOptionPane.showMessageDialog(null,"Day is correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Day is incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
		if (checkMonth() == true)
			JOptionPane.showMessageDialog(null,"Month is correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Month is incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
		if (checkYear() == true)
			JOptionPane.showMessageDialog(null,"Year is correct","CHECKER",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Year is incorrect","CHECKER",JOptionPane.WARNING_MESSAGE);
	}

	public void display() {
		JOptionPane.showMessageDialog(null,"Day is:"+getDay()+"\nMonth is:"+getMonth()+"Year is:"+getYear(),"DATE DISPLAYER",JOptionPane.WARNING_MESSAGE);
	}

	public String toString() {
		String str = "" + getDay() + "-" + getMonth() + "-" + getYear() + "\n";
		return str;
	}

}
