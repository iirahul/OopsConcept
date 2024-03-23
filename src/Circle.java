public class Circle implements Calculations{
    private int radius;
    public Circle(int radius){
        this.radius=radius;

    }
    public double area(){
       double v= Math.PI*radius*radius;

        return v;
    }
    public double perimeter(){
       double e= 2*Math.PI*radius;

        return e;
    }
}
