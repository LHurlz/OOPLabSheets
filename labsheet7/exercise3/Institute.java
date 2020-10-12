package labsheet7.exercise3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department departments[];

    public Institute(String name, Department departments[]){
        setName(name);
        setDepartments(departments);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDepartments(Department departments[]){
        if(departments!=null)
            this.departments = Arrays.copyOf(departments, departments.length);
    }

    public String getName(){
        return name;
    }

    public Department[] getDepartments(){
        return Arrays.copyOf(departments, departments.length);
    }

    public String toString(){
        String str = "Name: " + getName() + "\n\nDepartments:";

        if(departments==null)
        {
            str+="No department specified";
            return str;
        }

        for(int i=0; i<getDepartments().length; i++)
            if(departments[i]!=null)
                str+=departments[i];

        return str;

    }

    public int getTotalStudents()
    {
        int noOfStudents = 0;
        Student[] students;

        for(int i=0; i< departments.length; i++) {

            if(departments[i] != null) {
                students = departments[i].getStudents();

                for(int j=0; j<students.length; j++) {

                    if(students[j] != null)
                        noOfStudents++;
                }
            }
        }
        return noOfStudents;
    }
}
