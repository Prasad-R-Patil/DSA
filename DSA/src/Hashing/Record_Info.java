package Hashing;

import Stack.Student;

public class Record_Info {
	public enum Record_type {EMPTY,OCCUPIED,DELETED};
	public Record_type status;
	public Student ref;
	
	public Record_type getStatus() {
		return status;
	}
	public void setStatus(Record_type status) {
		this.status = status;
	}
	public Student getRef() {
		return ref;
	}
	public void setRef(Student ref) {
		this.ref = ref;
	}
	
	
	
	
	
}
