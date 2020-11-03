package labsheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String StaffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth,String StaffID,String[] coursesTaught,GregorianCalendar dateOfAppointment){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(StaffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        if(coursesTaught!=null)
            this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    @Override
    public String toString() {
        String str = "Lecturer name is: "+getName()+"\nLecturer address is: "+getAddress()+"\nLecturer date of birth is: ";

        if(getDateOfBirth()!=null){
            Date dob = getDateOfBirth().getTime();

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            str+=strDob;
        }
        else
            str+="Undefined";

        str+="\nLecturer Staff ID is: "+getStaffID()+"\nLecturer Courses Taught are: [";

        if(coursesTaught==null){
            str+="Not specified";
        }
        else{
            for(int i=0; i<getCoursesTaught().length; i++){
                if(coursesTaught[i]!=null){
                    str+=coursesTaught[i]+", ";
                }
            }
            str+="]";
        }

        str+="\nLecturer Date of Appointment is: ";

        if(getDateOfAppointment()!=null){
            Date doa = getDateOfAppointment().getTime();

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDoa = formatDate.format(doa);
            str+=strDoa;
        }
        else
            str+="Undefined";

        str+="\nLecturer Status is: "+getStatus()+"\nLecturer Point on Scale is: "+getPointOnScale();

        return str;
    }
}
