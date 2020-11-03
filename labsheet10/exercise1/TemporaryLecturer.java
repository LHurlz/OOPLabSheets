package labsheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String StaffID, String[] coursesTaught, GregorianCalendar dateOfAppointment,
                             int hoursWorked){
        super(name,address,dateOfBirth,StaffID,coursesTaught,dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }

    public int getPointOnScale(){
        GregorianCalendar currentDate = new GregorianCalendar();
        Date curDate = currentDate.getTime();
        SimpleDateFormat formatCurrentDate = new SimpleDateFormat("dd-MM-yyyy");
        String curDateString = formatCurrentDate.format(curDate);

        String doaString="";

        if(getDateOfAppointment()!=null){
            Date doa = getDateOfAppointment().getTime();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            doaString+=formatDate.format(doa);
        }

        String curDateYearAsString="";

        for(int i=curDateString.length()-4; i<curDateString.length(); i++){
            curDateYearAsString+=curDateString.charAt(i);
        }

        int curDateYear = Integer.parseInt(curDateYearAsString);

        String doaDateYearAsString="";

        for(int i=doaString.length()-4; i<doaString.length(); i++){
            doaDateYearAsString+=doaString.charAt(i);
        }

        int doaYear = Integer.parseInt(doaDateYearAsString);

        int yearsWorked = curDateYear-doaYear;

        if(yearsWorked>=3 && hoursWorked>1500){
            return 4;
        }
        else if(yearsWorked>=3 && hoursWorked>1000){
            return (int)((hoursWorked*1.33)/700)+1;
        }
        else
            return yearsWorked;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLecturer Hours Worked: "+getHoursWorked();
    }
}
