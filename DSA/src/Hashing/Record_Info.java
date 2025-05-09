package Hashing;

import Stack.Student;

public class Record_Info {
    public enum Record_type { EMPTY, OCCUPIED, DELETED }

    public Record_type status;
    public Student ref;

    public Record_Info() 
    {
        status = Record_type.EMPTY;
        ref = null;
    }
}
