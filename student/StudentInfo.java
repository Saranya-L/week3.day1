package student;

public class StudentInfo {

	//overloading by passing id argument alone
	public static void getStudentInfo(int id){
		System.out.println("My id is "+id);
	}
	
	//overloading by id & name
	public static void getStudentInfo(int id,String name){
		System.out.println("My Name is "+name+" and my ID is"+id);
	}
	
	//overloading by email & phoneNumber
	public static void getStudentInfo(String email,long phonenumber){
		System.out.println("My emailId is "+email+" and my phonenumber is "+phonenumber);
	}
	
	public static void main(String[] args) {
		getStudentInfo(34567);
		getStudentInfo(34567,"Saranya");
		getStudentInfo("saranya2389@gmail.com",9123506724l);
	}
}
