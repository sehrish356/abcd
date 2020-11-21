package hospital;

import javax.swing.JOptionPane;

public class Patient 
{
	private String name;
	private String cnic;
	private String phone_no;
	private String gender;
	private String address;
	private int age;
	Patient() {
		name = "";
		cnic = "";
		phone_no = "";
		gender = "";
		address = "";
		age = 0;
	}
	Patient(String name, String cnic, String phone_no, String gender, String address, int age) {
		this.name = name;
		this.cnic = cnic;
		this.phone_no = phone_no;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

	String getCnic() {
		return cnic;
	}

	void setCnic(String cnic) {
		this.cnic = cnic;
	}

	String getPhone_no() {
		return phone_no;
	}

	void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setter(String name, String cnic, String phone_no, String gender, String address, int age) {
		this.name = name;
		this.cnic = cnic;
		this.phone_no = phone_no;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
	public void display()
	{
		JOptionPane.showMessageDialog(null,"Name of a patient is "+name ,"PATIENT",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"CNIC of a patient is:" +cnic,"PATIENT",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Phone number of a patient is:" +phone_no,"PATIENT",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Address of a patient is:" +address,"PATIENT",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Age of a patient is:" +age,"PATIENT",JOptionPane.WARNING_MESSAGE);
		
	}
	public String toString()
{
	String str="Patient name:"+getName()+"("+getGender()+")\nAge:"+getAge()+"\nAddress:"+getAddress()+"\nCnic:"+getCnic()+",Phone no:"+getPhone_no()+",";
	return str;
}
	public void addPatient( String name, String cnic, String phone_no, String gender, String address, int age)
	{
	this.name = name;
	this.cnic = cnic;
	this.phone_no = phone_no;
	this.gender = gender;
	this.address = address;
	this.age = age;
	}	
}
