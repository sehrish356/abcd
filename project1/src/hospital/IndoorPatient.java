package hospital;

import javax.swing.JOptionPane;


public class IndoorPatient extends Patient
{
	private int wardNo;
	private int roomNo;
	private int bedNo;
	private Doctor d;
	private int fee;
	general.Date di;
	IndoorPatient()
	{
	super();
	wardNo=0;
	roomNo=0;
	bedNo=0;
	fee=0;
	di=null;
	d=null;
	}
	IndoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,int wardNo,int roomNo,int bedNo,Doctor d,int fee,general.Date dk)
	{
		super(name, cnic,phone_no,gender,address,age);
		this.d=d;
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.fee=fee;
		this.di=dk;
		this.d=d;
	}
	public void addInDoor(String name, String cnic, String phone_no, String gender, String address, int age,int wardNo,int roomNo,int bedNo,Doctor d,int fee,general.Date dk)
	{
		super.addPatient(name, cnic, phone_no, gender, address, age);
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.fee=fee;
		this.di=dk;
		this.d=d;
	}
	public void displayInDoor()
	{
		JOptionPane.showMessageDialog(null,"Ward number is:"+wardNo,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Room number is:"+roomNo,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Bed number is:"+bedNo,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Fee is:"+fee,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"doctor is:"+d.getName(),"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
	}
	public int getWardNo()
	{
		return wardNo;
	}
	public void setWardNo(int wardNo)
	{
		this.wardNo=wardNo;
	}
	public int getRoomNo()
	{
		return roomNo;
	}
	public void setRoomNo(int roomNo)
	{
		this.roomNo=roomNo;
	}
	public int getBedNo()
{
	return bedNo;
}
	public void setBedNo(int bedNo)
{
	this.bedNo=bedNo;
}
	public Doctor getDoctor()
	{
	return d;
	}
	public void setDoctor(Doctor d)
	{
		this.d=d;
	}
	public int getFee()
	{
		return fee;
	}
	public String getDatee()
	 {
		 String str;
		 str=di.getDay()+"/"+di.getMonth()+"/"+di.getYear()+"\n";
		 return str;
	 }
	public general.Date getDate()
{
	return di;
}
   public void setDate(general.Date di)
   {
	   this.di=di;	

   }
   public void setFee(int fee)
	{
		this.fee=fee;
	}
   public String toString()
	   {
		super.toString();
		   String str="Room no is:"+d.getName()+"\nFee is"+
	   getFee()+"\nAppointment date is:"+getDate()+"\n,Ward no:"+getWardNo()+",Room No:"+getRoomNo()+",Bed No:"+getBedNo();
		   return str;
	   }
   public void displayIP(IndoorPatient d[])
   {
	   String str="";
	   String str2="Indoor Patient ";
   	for(int i=0;i<d.length;i++)
   	{
   		if(d[i]!=null)
   		str=str+str2+(i+1)+":::::"+d[i].getName()+"\n";
   	}
   	
   		JOptionPane.showMessageDialog(null,"" +str,"INDOOR PATIENT NAMES",JOptionPane.WARNING_MESSAGE);
   }
   public String appointments(int day,IndoorPatient d[])
   {
		   String str="Appointment of patient ";
		   String str1="";
		   String str2=" on day:"+day+" .";
	   for(int i=0;i<d.length;i++)
	   {
		   if(d[i]!=null)
		   {
			   if(d[i].di.getDay()==day)
				   str1=str1+str+" "+d[i].getName()+str2+"\n";
			   else
				   str1="";
		   }
	   }
		   if(str1=="")
		      str1="No indoor patient appointments on day:"+day;	 
	   return str1;
   }

	public String appointDoctor(String name, IndoorPatient f[]) {
		String str = "Appointment of an indoor patient ";
		String str1 = "";
		String str2 = " with Doctor '" + name +"'.";
		for (int i = 0; i < f.length; i++) {
			if (f[i] != null) {
				if (f[i].d.getName().compareTo(name) == 0)
					str1 = str1 + str + str2 + "\n";
				else
					str1 = "";
			}
		}
		if (str1 == "")
			str1 = "No indoor patient appointment with Doctor '" + name + "'.\n";
		return str1;
	}
   public void dChanger(IndoorPatient a)
   {
	   String l;
		     l=JOptionPane.showInputDialog("Give new day:");
			   int day=Integer.parseInt(l);
			   l=JOptionPane.showInputDialog("Give new month:");
			   int month=Integer.parseInt(l);
			   l =JOptionPane.showInputDialog("Give new year:");
			   int year=Integer.parseInt(l);
			   a.di.setDay(day);
			   a.di.setMonth(month);
			   a.di.setYear(year);
		
		       }

public void displayDate()
{
	JOptionPane.showMessageDialog(null,di.getDay()+"-"+di.getMonth()+"-"+di.getYear(),"DATE",JOptionPane.WARNING_MESSAGE);
}
}
