package Exam;

public class Student {
	

		
		private int rollNo;
		private String name;
		private float marks;
		
		public Student()
		{
			//System.out.println("Default Constructor Invoked!!...");
			
			rollNo=0;
			name=null;
			marks=0.0f;
			
		
		
		}
		
		public Student(int rn,String nm,float mks)
		{
			//System.out.println("Parmeteri2Csed Constructor Called");
			
			rollNo=rn;
			name=nm;
			marks=mks;
		}

		
		
		 
		
		
		
		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getMarks() {
			return marks;
		}

		public void setMarks(float marks) {
			this.marks = marks;
		}

		public String toString() {
			return "Student [RollNo=> " + rollNo + ", Name=> " + name + ", Marks=> " + marks + "]";
		}
		
		

}
