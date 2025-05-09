package Hashing;

import Stack.Student;

public class MyHash {

    public Record_Info[] table;
    public int i;

    public MyHash() 
    {
        table = new Record_Info[100];
        for (i = 0; i < 100; i++) 
        {
            table[i] = new Record_Info();  
            table[i].status = Record_Info.Record_type.EMPTY;
        }
    }

    public MyHash(int s) {
        table = new Record_Info[s];
        for (i = 0; i < s; i++) {
            table[i] = new Record_Info(); 
            table[i].status = Record_Info.Record_type.EMPTY;
        }
    }

    public int Hash(int rno) 
    {
        return rno % table.length;
    }

    public void InsertRecord(Student s) 
    {
        int key = Hash(s.getRollNo());

        
        if (table[key].status == Record_Info.Record_type.OCCUPIED && table[key].ref != null && table[key].ref.getRollNo() == s.getRollNo())
        {
            System.out.println("Duplicate Data");
            return;
        }

    
        if (table[key].status == Record_Info.Record_type.EMPTY || table[key].status == Record_Info.Record_type.DELETED) 
        {
            table[key].ref = s;
            table[key].status = Record_Info.Record_type.OCCUPIED;
            return;
        }

        
        for (i = (key + 1) % table.length; i != key; i = (i + 1) % table.length) 
        {
            if (table[i].status == Record_Info.Record_type.EMPTY || table[i].status == Record_Info.Record_type.DELETED) 
            {
                table[i].ref = s;
                table[i].status = Record_Info.Record_type.OCCUPIED;
                return;
            }
        }

        System.out.println("Hash table is full. Cannot insert.");
    }

    
    public int SearchRecord(int r) {
        int pos = Hash(r);

        
        if (table[pos].status == Record_Info.Record_type.OCCUPIED &&  table[pos].ref != null && table[pos].ref.getRollNo() == r) 
        {
            return pos;
        }

      
        for (i = (pos + 1) % table.length; i != pos; i = (i + 1) % table.length) 
        {
            if (table[i].status == Record_Info.Record_type.OCCUPIED && table[i].ref != null && table[i].ref.getRollNo() == r) 
            {
                return i;
            }
        }

        System.out.println("Record Not Found");
        return -1;
    }
    
    
    public void DeleteRecord(int r) 
    {
        int pos = SearchRecord(r);  
        
        if (pos != -1) 
        {
            
            table[pos].status = Record_Info.Record_type.DELETED;
            table[pos].ref = null;  
            System.out.println("Record with Roll No " + r + " has been deleted.");
        } 
        else 
        {
            System.out.println("Record not found. Deletion failed.");
        }
    }

    
    
    
    public void DisplayRecord() 
    {
        System.out.println("---- Hash Table Contents ----");
        for (int i = 0; i < table.length; i++) 
        {
            if (table[i].status == Record_Info.Record_type.OCCUPIED && table[i].ref != null) 
            {
                System.out.println("Index " + i + ": " + table[i].ref);
            }
        }
    }

    
    
    
    
    
    
    
}
