package hospital;

import javax.swing.JOptionPane;
public class OutdoorPatient extends Patient
{
	private int fee;
	 private Doctor doc;
	 general.Time t;
   general.Date d;
   OutdoorPatient()
   {
  	 super();
  	 fee=0;
  	 doc=null;
  	 t=null;
  	 d=null;
   }
   OutdoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,int fee,Doctor doc,general.Time t,general.Date d)
		{
  	 super(name, cnic, phone_no, gender, address, age);
			this.fee = fee;
			this.doc = doc;
			this.t = t;
			this.d = d;
		}
   public void addOutdoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,int fee,Doctor doc,general.Time t,general.Date d)
	   {
		super.addPatient(name, cnic, phone_no, gender, address, age);
		this.fee=fee;
		this.doc=doc;	
	    this.t=t;
	    this.d=d;
	   }
   public void displayOutDoor()
	{
		JOptionPane.showMessageDialog(null,"Date is:"+d,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Time is:"+t,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Fee is:"+fee,"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Doctor name is:"+doc.getName(),"INDOOR PATIENT INFO",JOptionPane.WARNING_MESSAGE);
	}
   public int getFee()
	{
		return fee;
	}
   public void setFee(int fee)
	{
		this.fee=fee;
	}
   public Doctor getDoctor()
	   {
 return doc;
	   }
   public void setDoctor(Doctor doc)
	{
		this.doc=doc;
	}
	 public general.Time getTime()
	 {
		return t;
	 }
	 public void setTime(general.Time t)
	{
	this.t=t;	
	}
	 public general.Date getDate()
	  {
		return d;
	  }
	 public void setDate(general.Date d)
	{
	this.d=d;	
	}
	 public String toString()
   {
	   super.toString();
	   String str=doc.getName()+"\n"+getFee()+"\n"+getTime()+"\n"+getDate()+"\n";
	   return str;
   }
	 public void displayOP(OutdoorPatient d[])
	   {
	   	for(int i=0;i<d.length;i++)
	   	 {
	   		JOptionPane.showMessageDialog(null,"outdoor Patient "+(i+1)+" is: "+d[i].getName(),"OUTDOOR PATIENT NAMES",JOptionPane.WARNING_MESSAGE);
	   	 }
	   }	 
	 public String appointments(int day,OutdoorPatient j[])
	   {
			   String str="Appointment with patient ";
			   String str1="";
			   String str2="on day:"+day+" .";
		   for(int i=0;i<j.length;i++)
		   {
			   if(j[i]!=null)
			   {
				   if(j[i].d.getDay()==day)
					   str1=str1+str+j[i].getName()+str2+"\n";
				   else
					   str1="";
			   }
		   }
			   if(str1=="")
			  		   str1="No outdoor patient appointments on day:"+day;	 
			    return str1;
	   }
	 public String appointDoctor(String name,OutdoorPatient f[])
	   {
		   String str="Appointment of an outdoor patient ";
		   String str1="";
		   String str2=" with Doctor '"+name+"' .";
	   for(int i=0;i<f.length;i++)
	   {
		   if(f[i]!=null)
		   {
			  if(f[i].doc.getName().compareTo(name) == 0)
				   str1=str1+str+" "+f[i].getName()+str2+"\n";	
			  else
				  str1="";
		   }
	   }
	   if (str1 == "")
			str1 = "No outdoor patient appointment with Doctor '"  + name + "'.\n";
	   return str1;
	   }
	 public void dChanger(OutdoorPatient a)
	   {
		 String l;
			     l=JOptionPane.showInputDialog("Give new day:");
				   int day=Integer.parseInt(l);
				   l=JOptionPane.showInputDialog("Give new month:");
				   int month=Integer.parseInt(l);
				   l =JOptionPane.showInputDialog("Give new year:");
				   int year=Integer.parseInt(l);
				   a.d.setDay(day);
				   a.d.setMonth(month);
				   a.d.setYear(year);
			   
		   }
	 public void tChanger(OutdoorPatient a)
	 {
		 String l;
			     l=JOptionPane.showInputDialog("Give new hour:");
				   int hour=Integer.parseInt(l);
				   l=JOptionPane.showInputDialog("Give new minute:");
				   int minute=Integer.parseInt(l);
				   l =JOptionPane.showInputDialog("Give new period:");
				   a.t.setHours(hour);
				  a.t.setMins(minute);
				   a.t.setPeriod(l);
	 }
	 public void displayDate()
	 {
	 	JOptionPane.showMessageDialog(null,d.getDay()+"-"+d.getMonth()+"-"+d.getYear(),"DATE",JOptionPane.WARNING_MESSAGE);
	 }
	 public void displayTime()
	 {
	 	JOptionPane.showMessageDialog(null,t.getHours()+":"+t.getMins()+" "+t.getPeriod(),"TIME",JOptionPane.WARNING_MESSAGE);
	 
	 }
	 public String getDatee()
	 {
		 String str;
		 str=d.getDay()+"/"+d.getMonth()+"/"+d.getYear()+"\n";
		 return str;
	 }
	 public String getTimee()
	 {
		 String str;
		 str=t.getHours()+":"+t.getMins()+" "+t.getPeriod()+"\n";
		 return str;
	 }
}
