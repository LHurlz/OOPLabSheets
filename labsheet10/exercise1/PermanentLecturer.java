package labsheet10.exercise1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String StaffID, String[] coursesTaught,
                             GregorianCalendar dateOfAppointment, String pensionEntitlements,String status){
        super(name,address,dateOfBirth,StaffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        if(yearsWorked>=20)
            return 20;
        else
            return yearsWorked;

    }

    @Override
    public String toString() {
        return super.toString()+"\nLecturer Pension Entitlements: "+getPensionEntitlements();
    }
}
