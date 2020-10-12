package labsheet7.exercise3;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department){
        setId(id);
        setName(name);
        setDepartment(department);
    }

    public void setDepartment(String department) {
        this.department=department;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String toString(){
        return "Name: " + getName() + "  ID: " +getId()+ "  Department: "+getDepartment();
    }
}
