package labsheet8.sampleprogram1;

//Student.java
/*An instantiable Student class that inherits from a Person superclass*/

import java.util.GregorianCalendar;

public class Student extends Person {

    private int id;
    private String dept;

    public Student(){
        setId(0);
        setDept("No department specified");
    }

    public Student(String name, String address, GregorianCalendar dateOfBirth, int id, String dept) {
        super(name,address,dateOfBirth);
        setId(id);
        setDept(dept);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString(){
        return super.toString() + "  ID: " + getId() + "  Department: " + getDept() + "\n";
    }
}
