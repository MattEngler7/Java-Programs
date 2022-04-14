package Inheritence;

public class Test {
	public static void main(String[] args) 
	{
		//"student" is ref. to the Student class.
		Student student = new Student();
		student.setidNum(9001234);
		student.setStudentGPA(4.0);
		student.setStudentHeight(6.2);
		student.toString();
		
		//and same goes for the Person class.
		Person person = new Person();
		person.setHeight(6.2);
		person.setWeight(160);
		person.toString();
	
		System.out.println(student);
	}
}
