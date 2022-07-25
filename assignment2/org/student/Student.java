package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{

		System.out.println("Student name :Saranya L");
	}

	public void studentDept()
	{
		System.out.println("Department: ECE");
	}

	public void studentId()
	{
		System.out.println("ID:4627918");
	}

	public static void main(String[] args) {

		Student st=new Student();
		st.collegeName();//Inherits from college
		st.collegeCode();//Inherits from college
		st.collegeRank();//Inherits from college
		st.deptName();//Inherits from department
		st.studentName();
		st.studentDept();
		st.studentId();

	}

}
