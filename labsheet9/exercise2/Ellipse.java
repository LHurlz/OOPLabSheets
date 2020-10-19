package labsheet9.exercise2;

public class Ellipse extends Shape {
    private double minorAxis;
    private double majorAxis;

    public Ellipse(){
        super("Ellipse");
        setMinorAxis(0);
        setMajorAxis(0);
    }

    public Ellipse(double minorAxis,double majorAxis){
        super("Ellipse");
        setMinorAxis(minorAxis);
        setMajorAxis(majorAxis);
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    @Override
    public double area() {
        return Math.PI*(majorAxis)*(minorAxis);
    }

    @Override
    public double perimeter() {
        return (2*Math.PI)*(Math.sqrt((((majorAxis*majorAxis)+(minorAxis*minorAxis))/2)));
    }

    public String toString(){
        return "Shape type: " + type + "\nArea: " +area()+"\nPerimeter: " +perimeter();
    }

}
