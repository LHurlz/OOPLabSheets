package labsheet7.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student students[];

    public Department(String name, Student students[]){
        setName(name);
        setStudents(students);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setStudents(Student students[]){
        if(students!=null)
            this.students = Arrays.copyOf(students,students.length);
    }

    public String getName(){
        return name;
    }

    public Student[] getStudents(){
        return Arrays.copyOf(students,students.length);
    }

    public String toString(){
        String str = "\nName: " + getName() + "\nList of Students:\n\n";

        if(students==null){
            str+="No student specified";
            return str;
        }

        for(int i=0; i<getStudents().length; i++)
            if(students[i]!=null)
                str+=students[i]+"\n";

        return str;
    }
}
