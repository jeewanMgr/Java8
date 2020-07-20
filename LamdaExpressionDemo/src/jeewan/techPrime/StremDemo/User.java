package jeewan.techPrime.StremDemo;

import java.util.List;

public  class User {
	private String name;
	private int age=30;
	private List<String> phonenumber;
	User(){}
	
	User(String name)
	{
		this.name = name;
	}
	User(String name, int age, List<String> phonenumber)
	{
		this.name =name;
		this.age = age;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name: "+name + " Age: "+age;
	}
	public List<String> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(List<String> phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
