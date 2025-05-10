package Hashing;

import Stack.Student;

public class MyHash {
	
	private Record_Info table[];
	private int i,loc;
	
	public MyHash()
	{
		table = new Record_Info[100];
		
		for(i=0; i<100; i++)
		{
			table[i].status = Record_Info.Record_type.EMPTY;
		}
	}
	
	public MyHash(int s)
	{
		table = new Record_Info[s];
		
		for(i=0; i<s; i++)
		{
			table[i].status = Record_Info.Record_type.EMPTY;
		}
	}
	
	public int Hash(int rno)
	{
		return rno % table.length;
	}
	
	public void Insert(Student s)
	{
		int key;
		
		key = Hash(s.getRollNo());
		
		if(table[key].ref.getRollNo() == s.getRollNo())
		{
			System.out.println("Duplicate Data");
			return;
			
		}
		
		if( (table[key].status == Record_Info.Record_type.EMPTY) || (table[key].status == Record_Info.Record_type.DELETED))
		{
			table[key].ref = s;
			table[key].status = Record_Info.Record_type.OCCUPIED;
			return;
		}
		
		for(i=key+1; i<table.length; i++)
		{

			if( (table[i].status == Record_Info.Record_type.EMPTY) || (table[i].status == Record_Info.Record_type.DELETED))
			{
				table[i].ref = s;
				table[i].status = Record_Info.Record_type.OCCUPIED;
				return;
			}
		}
		
		
	} 
	
	public int SearchRecord(int r)
	{
		int pos = Hash(r);
		
		if((table[pos].status == Record_Info.Record_type.EMPTY) || (table[pos].status == Record_Info.Record_type.DELETED) )
		{
			System.out.println("Record Not Found");
			return -1;
		}
		
		if(table[pos].status == Record_Info.Record_type.OCCUPIED);
		{
			if(table[pos].ref.getRollNo() == r)
			{
				return pos;
			}
		}
		for(i=pos; i<table.length; i++)
		{
			if(table[i].ref.getRollNo() == r)
			{
				return i;
			}
		}
		if(table[i].status == Record_Info.Record_type.OCCUPIED )
		{
			return i;
		}
		
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
