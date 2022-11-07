/**
 * 
 */
package com.obsqura.Aggcase1;

/**
 * @author user
 *
 */
public class Student {
	int id;
	String name;
	Address studentAddress;
	public Student(int id, String name, Address studentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.studentAddress = studentAddress;
	}
	void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println("Address: "+studentAddress.city+" "+studentAddress.state+" "+studentAddress.pin+" "+studentAddress.country);
	
	}
	public static void main(String args[])
	{
		Address s1=new Address("Kannur","kerala","India", 670571);
		Address s2=new Address("Kannur","kerala","India", 670571);
		
		Student student1 =new Student(3,"Anju",s1);
		Student student2 =new Student(7,"siva",s2);
		student1.print();
		student2.print();
		
	}

}
