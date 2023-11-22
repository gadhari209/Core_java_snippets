public class Student extends Person{

private int prnNo;
private String courseName;
private int graduationYear;

public Student(String firstName,String lastName, int prnNo,String courseName,int graduationYear){

	super(firstName,lastName);
	this.prnNo=prnNo;
	this.courseName=courseName;
	this.graduationYear=graduationYear;
}
	
}