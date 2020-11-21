package hospital;

import javax.swing.JOptionPane;

public class DemoTest 
{
	public static void main(String[] args) 
	{
		String str="";
		String str1="";
		String str2;
		 int no;
		 int x;
		 char c,f;
		general.Date k[]=new general.Date[9];
		general.Time t[]=new general.Time[9];
		Doctor d[]=new Doctor[10];
		IndoorPatient i[]=new IndoorPatient[10];
		OutdoorPatient j[]=new OutdoorPatient[10];	
		k[0]=new general.Date(2,4,2020);
		k[1]=new general.Date(13,8,2011);
		k[2]=new general.Date(22,12,2019);		
		t[0]=new general.Time(4,8,"am");
		t[1]=new general.Time(8,12,"pm");
		t[2]=new general.Time(12,45,"pm");
		d[0]=new Doctor("rabia","611014275336","986497","female","gyne","gynecologists");
		d[1]=new Doctor("ahmed","611014275336","986497","male","crdic","cardiologists");		
		i[0]=new IndoorPatient("yusra","61101-865","0314-567381","female","67A",20,2,7,9,d[0],2000,k[1]);
		i[1]=new IndoorPatient("Asadia","7","8999","female","7A",20,2,7,9,d[1],5000,k[0]);			
		j[0]=new OutdoorPatient("fatime","61101-9019856-2","0312-6788888","female","939A",20,5000,d[1],t[1],k[1]);	
		j[1]=new OutdoorPatient("zain","61101-95019856-2","0312-674488","male","93A",21,4000,d[0],t[0],k[1]);	
	do
	{
		JOptionPane.showMessageDialog(null, "1:Add an indoor patient.\n 2:Add an outdoor patient.\n"
			+"3:See the list of all doctors.\n4:Search a doctor by name or department.\n"
			+ "5:See the list of all indoor patients.\n6:See the list of all appointments on a certain day\n"
			+ "7:See the list of appointments of a certain doctor\n8:Change the date or time of appointment of a certain patient,"
			,"OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
		 str2=JOptionPane.showInputDialog("Select a no from 1 to 8:");
		  no=Integer.parseInt(str2);
		if(no==1)
		{
			IndoorPatient y=new IndoorPatient();
			y.addInDoor("sajid","9","80 g-7","male","7A",20,2,7,9,d[1],5000,k[0]);	
		}
		else if(no==2)
		{
			OutdoorPatient z=new OutdoorPatient();
			z.addOutdoorPatient("nabeel", "61101-4375229", "0312-54875271", "male","467A G-7", 23, 2000,d[1] ,t[1],k[2]);	
		}
		else if(no==3)
		{
			Doctor w=new Doctor();
			w.displayDoc(d);
		}
		else if(no==4)
		{
			JOptionPane.showMessageDialog(null, "1:Search doctor by Name.\n 2:Search doctor by Department.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			str2=JOptionPane.showInputDialog("Select a no from 1 and 2");
			  x=Integer.parseInt(str2);
			  Doctor w=new Doctor();
			  if(x==1)
			  {
				  str2=JOptionPane.showInputDialog("Doctor Name plz:");
			      if(w.searchName(str2, d))
			    	  JOptionPane.showMessageDialog(null, "Doctor exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			      else
			    	  JOptionPane.showMessageDialog(null, "Doctor does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
			  else if(x==2)
			  {
				  str2=JOptionPane.showInputDialog("Department Name plz:");
				  if(w.searchDepartment(str2, d)==true)
					  JOptionPane.showMessageDialog(null, "Department exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
				  else
				  JOptionPane.showMessageDialog(null, "Department does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
			  else
				  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==5)
		{
			IndoorPatient y=new IndoorPatient();
			y.displayIP(i);
		}
		else if(no==6)
		{
			IndoorPatient y=new IndoorPatient();
			OutdoorPatient z=new OutdoorPatient();
			str2=JOptionPane.showInputDialog("Day plz:");
			x=Integer.parseInt(str2);
			str=y.appointments(x,i);
			str=str+z.appointments(x, j);
			 JOptionPane.showMessageDialog(null,str,"APPOINTMENT ON CERTAIN DATE",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==7)
		{
			String s;
			IndoorPatient y=new IndoorPatient();
			OutdoorPatient z=new OutdoorPatient();
			str2=JOptionPane.showInputDialog("Doctor name plz:");
			s=y.appointDoctor(str2,i);
			s=s+z.appointDoctor(str2,j);
			 JOptionPane.showMessageDialog(null,s,"APPOINTMENT WITH CERTAIN DOCTOR",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==8)
		{
			IndoorPatient y=new IndoorPatient();
			OutdoorPatient z=new OutdoorPatient();
			JOptionPane.showMessageDialog(null, "i:Change date of indoorPatient.\no:Change date/time of outdoor patient.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			str2=JOptionPane.showInputDialog("Select character from 'i' or 'o'");
			  c=str2.charAt(0);
			  if(c=='i')
			  {
				  str="Original Date:"+i[1].getDatee();
				  y.dChanger(i[1]);
				  str=str+"Updated Date:"+i[1].getDatee();
				  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
			  }
			  else if(c=='o')
			  {
				  JOptionPane.showMessageDialog(null, "d:Change date.\nt:Change time.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
				  str2=JOptionPane.showInputDialog("Select character from 'd' or 't'");
				  f=str2.charAt(0);
				  if(f=='d')
				  {
				  str="Original date:"+j[1].getDatee();
				  z.dChanger(j[1]);
				  str=str+"Updated date:"+j[1].getDatee();
				  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
				  }
				  else if(f=='t')
				  {
					  str="Original Time:"+j[1].getTimee();
					  z.tChanger(j[1]);
					  str=str+"Updated Time:"+j[1].getTimee();
					  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
				  }
				  else
					  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			  }
			  else
				  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);				  
		}
		
	}while(no!=0);	
}
}
