package labsheet5.exercise3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer(){
        this(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemp, int maxTemp, int minTemp){
        setCurrentTemp(currentTemp);
        setMaxTemp(maxTemp);
        setMinTemp(minTemp);
    }

    public int getCurrentTemp(){
        return currentTemp;
    }

    public int getMaxTemp(){
        return maxTemp;
    }

    public int getMinTemp(){
        return minTemp;
    }

    public void setCurrentTemp(int currentTemp){
        this.currentTemp=currentTemp;
    }

    public void setMaxTemp(int maxTemp){
        this.maxTemp=maxTemp;
    }

    public void setMinTemp(int minTemp){
        this.minTemp=minTemp;
    }

    public void setTemperature(int currentTemp){
        this.currentTemp=currentTemp;

        if(this.currentTemp>maxTemp)
                maxTemp=this.currentTemp;

        if(this.currentTemp<minTemp)
                minTemp=this.currentTemp;
        }

    public String toString(){
        return "\nCurrent Temperature: " + currentTemp + " \nMax Temperature: " + maxTemp + " \nMin Temperature: " + minTemp;
    }
}
