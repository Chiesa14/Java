package ser;//Java code for serialization and deserialization
//of a Java object
import java.io.*;
class Student implements java.io.Serializable {
    private static final long serialVersionUID = 7363132668437302432L;
    public int code;
    public String firstName;
    public int age;
    // Constructor
    public Student(int code, String fname, int age) {
        this.code = code;
        this.firstName = fname;
        this.age = age;
    }
}
