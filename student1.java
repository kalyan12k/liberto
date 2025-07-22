package demo;

public class student1{

	private String name;
	private int rollNo;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkResult() {
		if(marks>=40) {
			return "pass";
		}else {
			return "fail";
		}
	}
	public void displayDetails() {
	System.out.println("Roll No:"+" "+getRollNo());
	System.out.println("Name:"+" "+getName());
	System.out.println("Marks:"+" "+getMarks());
	System.out.println("result"+" "+checkResult());
	}
	public static void main(String[] args) {
		student1 s1=new student1();
		s1.setMarks(100);
		s1.setName("Hima");
		s1.setRollNo(324);
		s1.displayDetails();
	}

}