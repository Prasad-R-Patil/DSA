package Stack;

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

		
		public String toString() {
			return "Student [RollNo=> " + rollNo + ", Name=> " + name + ", Marks=> " + marks + "]";
		}
		
		

}
