package labsheet8.exercise2;

public class Validator {
    public static boolean isValidRegistrationNumber(String reg){
        if(reg.length()>=6 && reg.length()<=12)
            if(Character.isDigit(reg.charAt(0)) || Character.isDigit(reg.charAt(1)))
                if(reg.charAt(2)=='-')
                    if((reg.charAt(3)>='A' && reg.charAt(3)<='Z') && (reg.charAt(4)>='A' && reg.charAt(4)<='Z')){
                        if(reg.charAt(5)=='-')
                            for(int i=6; i<reg.length(); i++)
                                if(!Character.isDigit(reg.charAt(i)))
                                    return false;
                                else if(i<=11)
                                    return true;
                    }
                    else if((reg.charAt(3)>='A' && reg.charAt(3)<='Z') && reg.charAt(4)=='-'){
                        for(int i=5; i<reg.length(); i++)
                            if(!Character.isDigit(reg.charAt(i)))
                                return false;
                            else if(i<=10)
                                return true;
                    }

                    return false;

    }
}
