package labsheet5.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static int count;
    private static double interestRate;

    public BankAccount(){
        this("Owner Not Available",0,0);
    }

    public BankAccount(String owner, int number, double interestRate){
        setOwner(owner);
        incrementCount();
        setNumber(count);
        setInterestRate(interestRate);
    }

    public String getOwner(){
        return owner;
    }

    public int getNumber(){
        return number;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public static int getCount(){
        return count;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate=interestRate;
    }

    private static void incrementCount(){
        count++;
    }

    public String toString(){
        return "Owner: " + owner + "  Account Number: " + number + "   Interest Rate: " + interestRate;
    }
}
