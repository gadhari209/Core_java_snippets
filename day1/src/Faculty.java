public class Faculty extends Person{
	
	private int yearOfExp;
	private String subjectExp;

	 public Faculty(int yearOfExp,String subjectExp,String firstName, String lastName){
	 	super(firstName,lastName);
	 	this.yearOfExp=yearOfExp;
	 	this.subjectExp=subjectExp;
	 }
}