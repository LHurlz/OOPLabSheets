package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);
    }

    public void setEstimatedIncome(double estimatedIncome) {
        if(estimatedIncome>0)
            this.estimatedIncome = estimatedIncome;
        else
            this.estimatedIncome=0;
    }

    public double earnings(){
        return Math.random()*(900-400)+400;
    }

    public String toString(){
        return "Self-employed worker's name is " + super.toString();
    }
}
